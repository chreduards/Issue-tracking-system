package Controller;


import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Model.ProcessModel;
import java.util.ArrayList;
import java.util.List;

public class ProcessController extends DbManager{
    
    
    private final PreparedStatement addProcess;
    private final PreparedStatement getProcesses;
    private final PreparedStatement getProcess;
    private final PreparedStatement updateProcess;
    private final PreparedStatement deleteProcess;
    
    private final String PROCESS_DELETEPROCESS = "DELETE FROM Process WHERE processID = ?";
    private final String PROCESS_UPDATEPROCESS = "UPDATE Process SET pLeadId = ?, startDate = ?, processCategory = ?, projectedDuration = ?, comments = ?, status = ? WHERE processID = ?";
    private final String PROCESS_GETPROCESS = "SELECT * FROM Process Where processId = ?";
    private final String PROCESS_GETPROCESSES = "SELECT * FROM Process WHERE pLeadId = ?";
    private final String PROCESS_ADDPROCESS = "INSERT INTO Process (pLeadId, startDate, processCategory, projectedDuration, comments, status) Values(?,?,?,?,?,?)";

    public ProcessController() throws SQLException{
        connectToDb();
        
        getProcesses = con.prepareStatement(PROCESS_GETPROCESSES);
        addProcess = con.prepareStatement(PROCESS_ADDPROCESS);
        getProcess = con.prepareStatement(PROCESS_GETPROCESS);
        updateProcess = con.prepareStatement(PROCESS_UPDATEPROCESS);
        deleteProcess = con.prepareStatement(PROCESS_DELETEPROCESS);
    }
    

    
    public void addProcess(String processCategory, int projectedDuration, String comments) throws SQLException{
        
        System.out.println("hej");
        int pLeadId = getpLeadId();
        connectToDb();
        String startDate = getDate();
        
        
        addProcess.setInt(1, pLeadId);
        addProcess.setString(2, startDate);
        addProcess.setString(3, processCategory);
        addProcess.setInt(4, projectedDuration);
        addProcess.setString(5, comments);
        addProcess.setString(6, "Open");
        addProcess.executeUpdate();
        closeDbConnection();
    
}
    
    public List<ProcessModel> getProcesses(int pLeadId) throws SQLException{
        List<ProcessModel> pLeadProcesses = new ArrayList<>();
        ResultSet rs = null;
        connectToDb();
        getProcesses.setInt(1, pLeadId);
        rs = getProcesses.executeQuery();
        while (rs.next()){
            pLeadProcesses.add(new ProcessModel(rs.getInt("processId"), rs.getInt("pLeadId"), 
            rs.getString("startDate"), rs.getString("processCategory"), rs.getInt("projectedDuration"),
            rs.getString("comments"), rs.getString("status")));
        }
        closeDbConnection();
        return pLeadProcesses;
        
    }
    
    public ProcessModel getProcess(int processID) throws SQLException{
        ProcessModel pm = null;
        ResultSet rs = null;
        connectToDb();
        getProcess.setInt(1, processID);
        rs = getProcess.executeQuery();
        while (rs.next()){
            pm = new ProcessModel(rs.getInt("processId"), rs.getInt("pLeadId"), 
            rs.getString("startDate"), rs.getString("processCategory"), rs.getInt("projectedDuration"),
            rs.getString("comments"), rs.getString("status"));
        }
        closeDbConnection();
        return pm;
    }
    
    public void updateProcess(ProcessModel pm) throws SQLException{
        connectToDb();
        
        updateProcess.setInt(1, pm.getpLeadId());
        updateProcess.setString(2, pm.getStartDate());
        updateProcess.setString(3, pm.getProcessCategory());
        updateProcess.setInt(4, pm.getProjectedDuration());
        updateProcess.setString(5, pm.getComments());
        updateProcess.setString(6, pm.getStatus());
        updateProcess.setInt(7, pm.getProcessId());
        updateProcess.executeUpdate();
        
        closeDbConnection();
    }
    
    public void deleteProcess(int processID) throws SQLException{
        connectToDb();
        
        deleteProcess.setInt(1, processID);
        deleteProcess.executeUpdate();
        
        closeDbConnection();
        
        
    }
}
