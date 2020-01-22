
package Bean;

import Controller.TaskController;
import Model.TaskModel;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Bean implements Serializable{
    
    //En lista med taskmodels, behövs för att skriva ut alla tasks i dataTabeln
    private List<TaskModel> list;
    private TaskModel tm;
    //Variabel som behövs för att kunna editera en task
    private boolean edit;
    //Sparar vilket suppID som är angivet för att få fram tasksen
    private Integer suppID;
  
    public Bean(){   
    }
    //Söker fram de tasks som en viss supportperson har kompetens för och som inte redan är utförda
    public String search(){
        try {
            TaskController tc = new TaskController();
            list = tc.getTasksOnCompetence(suppID);           
        } catch (SQLException ex) {
            System.out.println("Fel vid initieringen: " + ex.getMessage());
        }
       return "viewTable";
    }
    
    public String getSearchPage(){
        return "search";
    }
   
    public void edit(TaskModel tm){
        this.tm = tm;
        edit = true;
    }
    //Metod som uppdaterar arbetsuppgiften i databasen med angivna värden
    public void save(){
        try {
            TaskController tc = new TaskController();
            tc.updateTask(tm);
            edit = false;
        } catch (SQLException ex) {
            System.out.println("Fel vid uppdateringen: " + ex.getMessage());
        }
      
    }
    
    public List<TaskModel> getList(){
        return list;    
    }
    
    public Integer getSuppID(){
        return suppID;
    }

    public void setSuppID(Integer suppID){
        this.suppID = suppID;
    }
      
    public TaskModel getTm(){
        return tm;
    }
    
    public boolean isEdit(){
        return edit;
    }
}
