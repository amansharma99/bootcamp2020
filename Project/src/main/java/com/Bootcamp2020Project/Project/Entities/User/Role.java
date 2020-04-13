package com.Bootcamp2020Project.Project.Entities.User;

import javax.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue
    private Integer roleId;
    private String authority;
    @OneToOne(mappedBy = "roleId",cascade = CascadeType.ALL)
    private User_Role user_role;

    public User_Role getUser_role() {
        return user_role;
    }

    public void setUser_role(User_Role user_role) {
        this.user_role = user_role;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
