package pojos;
// Generated May 19, 2016 3:27:38 PM by Hibernate Tools 4.3.1



/**
 * Phoneofuser generated by hbm2java
 */
public class Phoneofuser  implements java.io.Serializable {


     private Integer phoneId;
     private Users users;
     private String phoneNumber;
     private String phoneType;

    public Phoneofuser() {
    }

    public Phoneofuser(Users users, String phoneNumber, String phoneType) {
       this.users = users;
       this.phoneNumber = phoneNumber;
       this.phoneType = phoneType;
    }
   
    public Integer getPhoneId() {
        return this.phoneId;
    }
    
    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneType() {
        return this.phoneType;
    }
    
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }




}

