package Controller;


import Model.TaskModel;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TaskController extends DbManager {
    
    private final PreparedStatement addTask;
    private final PreparedStatement getElapsedTime;
    private final PreparedStatement getTasks;
    private final PreparedStatement updateTask;
    private final PreparedStatement getTask;
    private final PreparedStatement deleteTask;
    private final PreparedStatement getTasksOnCompetence;
    
    private final String TASK_GETTASKSONCOMPETENCE = "SELECT Task.* FROM Task "
            + "JOIN Competence ON Task.competenceID = Competence.competenceID "
            + "JOIN CompetenceRow ON Competence.competenceID = CompetenceRow.competenceID "
            + "WHERE CompetenceRow.suppID = ? AND Task.status <> 'Finished'";
    private final String TASK_DELETETASK = "DELETE FROM Task WHERE taskID = ?";
    private final String TASK_GETTASK = "SELECT * FROM Task WHERE taskID = ?";
    private final String TASK_UPDATETASK = "UPDATE Task SET processID = ?, suppID = ?, competenceID = ?, "
            + "taskName = ?, startDate = ?, endDate = ?, budgetedTime = ?, duration = ?, costPerHour = ?, status = ?, comments = ? "
            + "WHERE taskID = ?";
    private final String TASK_GETTASKS = "SELECT * FROM Task WHERE processID = ?";
    private final String TASK_ADDTASK = "INSERT INTO Task(processID, taskName, budgeted_time, status) Values(?,?,?,?)";
    private final String TASK_ELAPSEDTIME = "SELECT SUM(duration) FROM Task WHERE processID = ?";
    
    public TaskController() throws SQLException{
        connectToDb();
        addTask = con.prepareStatement(TASK_ADDTASK);
        getElapsedTime = con.prepareStatement(TASK_ELAPSEDTIME);
        getTasks = con.prepareStatement(TASK_GETTASKS);
        updateTask = con.prepareStatement(TASK_UPDATETASK);
        getTask = con.prepareStatement(TASK_GETTASK);
        deleteTask = con.prepareStatement(TASK_DELETETASK);
        getTasksOnCompetence = con.prepareStatement(TASK_GETTASKSONCOMPETENCE);
    }
    
    public void addTask(String taskName, int budgetedTime) throws SQLException{
        
        connectToDb();
        String startDate = getDate();
        int processId = getMaxProcessID();
        
        addTask.setInt(1, processId);
        addTask.setString(2, taskName);
        addTask.setInt(3, budgetedTime);
        addTask.setString(4, "Pending");
        addTask.executeUpdate();
        closeDbConnection();
    }
    
    public List<TaskModel> getTasks(int processID) throws SQLException{
        List<TaskModel> tasksInProcess = new ArrayList<>();
        ResultSet rs = null;
        connectToDb();
        
        getTasks.setInt(1, processID);
        rs = getTasks.executeQuery();
        while (rs.next()){
            tasksInProcess.add(new TaskModel(rs.getInt("taskID"), rs.getInt("processID"), rs.getInt("suppID"),
            rs.getInt("competenceID"), rs.getString("taskName"), rs.getString("startDate"), rs.getString("endDate"),
            rs.getInt("budgetedTime"), rs.getInt("duration"), rs.getInt("costPerHour"), rs.getString("status"), rs.getString("comments")));
        }
        closeDbConnection();
        return tasksInProcess;
        
    }
    
        
    public int getElapsedTime(int processID) throws SQLException{
        int ret = 0;
        ResultSet rs = null;
        connectToDb();
        getElapsedTime.setInt(1, processID);
        rs = getElapsedTime.executeQuery();
        while (rs.next()){
         ret = rs.getInt(1);
        }
        closeDbConnection();
        return ret;
    }
    
    public int updateTask(TaskModel tm) throws SQLException{
        int ret = 0;
        connectToDb();
        
        updateTask.setInt(1, tm.getProcessID());
        updateTask.setInt(2, tm.getSuppID());
        updateTask.setInt(3, tm.getCompetenceID());
        updateTask.setString(4, tm.getTaskName());
        updateTask.setString(5, tm.getStartDate());
        updateTask.setString(6, tm.getEndDate());
        updateTask.setInt(7, tm.getBudgetedTime());
        updateTask.setInt(8, tm.getDuration());
        updateTask.setInt(9, tm.getCostPerHour());
        updateTask.setString(10, tm.getStatus());
        updateTask.setString(11, tm.getComments());
        updateTask.setInt(12, tm.getTaskID());
        updateTask.executeUpdate();
        
        closeDbConnection();
        return ret;
    }
     
    public TaskModel getTask(int taskID) throws SQLException{
        TaskModel tm = null;
        ResultSet rs = null;
        connectToDb();
        getTask.setInt(1, taskID);
        rs = getTask.executeQuery();
        while (rs.next()){
            tm = new TaskModel(rs.getInt("taskID"), rs.getInt("processID"), 
            rs.getInt("suppID"), rs.getInt("competenceID"), rs.getString("taskName"), rs.getString("startDate"),
            rs.getString("endDate"), rs.getInt("budgetedTime"), rs.getInt("duration"),
            rs.getInt("costPerHour"), rs.getString("status"), rs.getString("comments"));
        }
        closeDbConnection();
        return tm;
    }
   
    public void deleteTask(int taskID) throws SQLException{
        connectToDb();
        
        deleteTask.setInt(1, taskID);
        deleteTask.executeUpdate();
        
        closeDbConnection();
    }
    
    public List<TaskModel> getTasksOnCompetence(int suppID) throws SQLException{
        List<TaskModel> tasksOnCompetence = new ArrayList<>();
        TaskModel tm = null;
        ResultSet rs = null;
        connectToDb();
        getTasksOnCompetence.setInt(1, suppID);
        rs = getTasksOnCompetence.executeQuery();
        while (rs.next()){
            tasksOnCompetence.add(new TaskModel(rs.getInt("taskID"), rs.getInt("processID"), 
            rs.getInt("suppID"), rs.getInt("competenceID"), rs.getString("taskName"), rs.getString("startDate"),
            rs.getString("endDate"), rs.getInt("budgetedTime"), rs.getInt("duration"),
            rs.getInt("costPerHour"), rs.getString("status"), rs.getString("comments")));
        }
        
        return tasksOnCompetence;
    }
    
}
