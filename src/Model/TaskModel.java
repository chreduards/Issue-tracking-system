
package Model;

public class TaskModel {
    
private int taskID;
private int processID;
private int suppID;
private int competenceID;
private String taskName;
private String startDate;
private String endDate;
private int budgetedTime;
private int duration;
private int costPerHour;
private String status;
private String comments;

    
public TaskModel (int taskID, int processID, int suppID, int competenceID, String taskName, String startDate,
        String endDate, int budgetedTime, int duration, int costPerHour, String status, String comments){
    
    setTaskID(taskID);
    setProcessID(processID);
    setSuppID(suppID);
    setCompetenceID(competenceID);
    setTaskName(taskName);
    setStartDate(startDate);
    setEndDate(endDate);
    setBudgetedTime(budgetedTime);
    setDuration(duration);
    setCostPerHour(costPerHour);
    setStatus(status);
    setComments(comments);  
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getCompetenceID() {
        return competenceID;
    }

    public void setCompetenceID(int competenceID) {
        this.competenceID = competenceID;
    }

    public int getSuppID() {
        return suppID;
    }

    public void setSuppID(int suppID) {
        this.suppID = suppID;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public int getProcessID() {
        return processID;
    }

    public void setProcessID(int processID) {
        this.processID = processID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getBudgetedTime() {
        return budgetedTime;
    }

    public void setBudgetedTime(int budgetedTime) {
        this.budgetedTime = budgetedTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(int costPerHour) {
        this.costPerHour = costPerHour;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
