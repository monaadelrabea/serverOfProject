package pojos;
// Generated Jun 2, 2016 7:43:06 PM by Hibernate Tools 4.3.1

import com.google.gson.annotations.Expose;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Phoneofuser generated by hbm2java
 */
@Entity
@Table(name = "phoneofuser", catalog = "itiproject"
)
public class Phoneofuser implements java.io.Serializable {

    @Expose
    private Integer phoneId;
    private Users users;
    @Expose
    private String phoneNumber;
    @Expose
    private String phoneType;

    public Phoneofuser() {
    }

    public Phoneofuser(Users users, String phoneNumber, String phoneType) {
        this.users = users;
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "phoneId", unique = true, nullable = false)
    public Integer getPhoneId() {
        return this.phoneId;
    }

    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userIdForPhone", nullable = false)
    public Users getUsers() {
        return this.users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Column(name = "phoneNumber", nullable = false, length = 100)
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Column(name = "phoneType", nullable = false, length = 100)
    public String getPhoneType() {
        return this.phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

}
