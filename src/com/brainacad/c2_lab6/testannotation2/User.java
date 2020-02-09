package com.brainacad.c2_lab6.testannotation2;


import java.util.List;

/**
 * Created by SHARK on 27.05.2017.
 */
public class User {
    private String name;
    private List<PermissionAction> permission;

    public User(String name) {
        this.name = name;
    }

    public List<PermissionAction> getPermission() {
        return permission;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void addPermission (PermissionAction permissionAction){
        permissionAction.getClass();

    }
}
