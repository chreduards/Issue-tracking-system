
package Model;


public class ProcessModel {

    private int processId;
    private int pLeadId;
    private String startDate;
    private String processCategory;
    private int projectedDuration;
    private String comments;
    private String status;
    
    public ProcessModel (int processId, int pLeadId, String startDate, String processCategory,
            int projectedDuration, String comments, String status){
        
        setProcessId(processId);
        setpLeadId(pLeadId);
        setStartDate(startDate);
        setProcessCategory(processCategory);
        setProjectedDuration(projectedDuration);
        setComments(comments);
        setStatus(status);
        
    }

    public int getProcessId() {
        return processId;
    }

    public int getpLeadId() {
        return pLeadId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getProcessCategory() {
        return processCategory;
    }

    public int getProjectedDuration() {
        return projectedDuration;
    }

    public String getComments() {
        return comments;
    }

    public String getStatus() {
        return status;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public void setpLeadId(int pLeadId) {
        this.pLeadId = pLeadId;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setProcessCategory(String processCategory) {
        this.processCategory = processCategory;
    }

    public void setProjectedDuration(int projectedDuration) {
        this.projectedDuration = projectedDuration;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
