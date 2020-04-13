package com.Bootcamp2020Project.Project.Entities.User;

import javax.persistence.*;

@Entity
public class User_Role {
    @Id
    private Integer id;
    @OneToOne
    @JoinColumn
    @MapsId
    private User userID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RoleId")
    private User_Role roleId;

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public User_Role getRoleId() {
        return roleId;
    }

    public void setRoleId(User_Role roleId) {
        this.roleId = roleId;
    }
}
