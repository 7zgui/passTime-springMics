package com.rect.usermanagement.payload.response;

/**
 * @author Mohamed ouokki on 10/18/22
 * @project user-management
 */
public class MessageResponse {
    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
