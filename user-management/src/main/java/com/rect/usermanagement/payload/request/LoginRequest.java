package com.rect.usermanagement.payload.request;

import javax.validation.constraints.NotBlank;

/**
 * @author Mohamed ouokki on 10/18/22
 * @project user-management
 */
public class LoginRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

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
