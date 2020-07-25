package com.enigmacamp.audiostore.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class userRequest {

    @NotEmpty(message = "Account may not empty")
    @Size(min = 6, message = "Minimal 6 character")
    private String username;
    @NotEmpty(message = "Password may not empty")
    @Size(min = 6, message = "Minimal 6 character")
    private String password;


    public userRequest() {
        // TODO Auto-generated constructor stub
    }


    public userRequest(
            @NotEmpty(message = "Account may not empty") @Size(min = 6, message = "Minimal 6 character") String username,
            @NotEmpty(message = "Password may not empty") @Size(min = 6, message = "Minimal 6 character") String password) {
        super();
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
