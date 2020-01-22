
package Model;


public class LoginModel {
    private int pLeadId;
    private String pw;
    
    public LoginModel(int pLeadId, String pw){
        setpLeadId(pLeadId);
        setpw(pw);
    }
    
    public int getpLeadId(){
        return pLeadId;
    }
    
    public void setpLeadId(int pLeadId){
        this.pLeadId = pLeadId;
    }
    
    public String getpw(){
        return pw;
    }
    
    public void setpw(String pw){
        this.pw = pw;
    }
    
}
