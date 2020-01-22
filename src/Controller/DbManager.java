
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
    //Databasspecifika uppgifter       
    static final String host = "jdbc:sqlserver://localhost:1433;databaseName=Fiktiva_AB";
    static final String username = "sa";
    static final String password = "test";
    
    private final PreparedStatement getMaxProcessID;
    
    private final String PROCESS_GETID = "SELECT processID FROM Process WHERE processID = (SELECT max(processID) FROM Process)";
    
    public static LoginModel pm;
    protected Connection con = null;
    
    public DbManager() throws SQLException{
    connectToDb();   
    getMaxProcessID = con.prepareStatement(PROCESS_GETID);
    }
    //Metod för att connecta till databasen
    public void connectToDb() throws SQLException{
        con = DriverManager.getConnection(host, username, password);
    }
    //Metod för att avsluta connection till databasen
    public void closeDbConnection() throws SQLException{
        con.close();
    }
    //Metod som hämtar in datumet som en process eller task skapas
    public String getDate(){
        ZoneId zoneId = ZoneId.of("Europe/Stockholm");
        LocalDate today = LocalDate.now(zoneId);
        return today.toString();
    }
    //Metoder som sköter kontakten med LoginModel
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
    //Metod för felhantering av Integer.parseInt
    public Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
}

