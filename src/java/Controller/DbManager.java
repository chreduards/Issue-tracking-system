
package Controller;

import Model.LoginModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;

public class DbManager {
            
    static final String host = "jdbc:sqlserver://localhost:1433;databaseName=Fiktiva_AB";
    static final String username = "sa";
    static final String password = "test";
    
    //private final PreparedStatement getItSupportName;
    private final PreparedStatement getMaxProcessID;
    
    //private final String ITSUPPORTEMPLOYEES = "SELECT suppID FROM IT_support_employee WHERE "
    private final String PROCESS_GETID = "SELECT processID FROM Process WHERE processID = (SELECT max(processID) FROM Process)";
    
    public static LoginModel pm;
    protected Connection con = null;
    
    public DbManager() throws SQLException{
    connectToDb();   
    getMaxProcessID = con.prepareStatement(PROCESS_GETID);
    }
         
    public void connectToDb() throws SQLException{
         if (con == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
                con = DriverManager.getConnection(host, username, password);
            } catch(ClassNotFoundException e) {
                System.out.println("Could not find SQL class");
            }
        }
        
    }
    
    public void closeDbConnection() throws SQLException{
        con.close();
    }
    
    public String getDate(){
        ZoneId zoneId = ZoneId.of("Europe/Stockholm");
        LocalDate today = LocalDate.now(zoneId);
        return today.toString();
    }
    
    public void setpLeadId(int pLeadId){
        String pw = null;
        pm = new LoginModel(pLeadId, pw);
    }
    
    public int getpLeadId(){
        return pm.getpLeadId();
    }
    
    //Metod för att returnera det nuvarande maximala process-id
    public int getMaxProcessID() throws SQLException{
        int ret = 0;
        ResultSet rs = null;
        connectToDb();
        rs = getMaxProcessID.executeQuery();
        while (rs.next()){
         ret = rs.getInt(1);
        }
        closeDbConnection();
        return ret;
    }
    /*
    public String getItSupportName(int taskID){
        String ret = null;
        
        
        
        
        return ret;
    }
    */
    
}
