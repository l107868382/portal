package com.code.portal.system.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

//用户表
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;      //id
    private String username; //用户名
    private String password; //密码
    private String realname; //真实姓名
    private String isvalid;  //是否有效
    private Timestamp cratedate;    //创建时间
    private Timestamp updatedate;   //更新时间
    private String createuser;  //创建者用户名
    private String updateuser;  //更新者用户名

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid;
    }

    public Timestamp getCratedate() {
        return cratedate;
    }

    public void setCratedate(Timestamp cratedate) {
        this.cratedate = cratedate;
    }

    public Timestamp getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Timestamp updatedate) {
        this.updatedate = updatedate;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }
}
