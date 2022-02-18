package com.example.attendancemanager;

public class Login_Modal {

    private String username;
    private String password;

    Login_Modal(){}
    Login_Modal(String username, String password){
        this.username = username;
        this.password = password;
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
}
