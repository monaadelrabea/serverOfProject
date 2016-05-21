package pojos;
// Generated May 19, 2016 3:27:38 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Skilltable generated by hbm2java
 */
public class Skilltable  implements java.io.Serializable {


     private Integer skillId;
     private String skillName;
     private Set userses = new HashSet(0);
     private Set postforprojectses = new HashSet(0);

    public Skilltable() {
    }

	
    public Skilltable(String skillName) {
        this.skillName = skillName;
    }
    public Skilltable(String skillName, Set userses, Set postforprojectses) {
       this.skillName = skillName;
       this.userses = userses;
       this.postforprojectses = postforprojectses;
    }
   
    public Integer getSkillId() {
        return this.skillId;
    }
    
    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }
    public String getSkillName() {
        return this.skillName;
    }
    
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
    public Set getUserses() {
        return this.userses;
    }
    
    public void setUserses(Set userses) {
        this.userses = userses;
    }
    public Set getPostforprojectses() {
        return this.postforprojectses;
    }
    
    public void setPostforprojectses(Set postforprojectses) {
        this.postforprojectses = postforprojectses;
    }




}

