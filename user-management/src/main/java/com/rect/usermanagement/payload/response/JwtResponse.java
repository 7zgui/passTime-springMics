package com.rect.usermanagement.payload.response;

import lombok.*;

import java.util.List;

/**
 * @author Mohamed ouokki on 10/18/22
 * @project user-management
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtResponse {

    private String token;
    private String type;
    private Long id;
    private String username;
    private String email;
    private List<String> roles;

    public JwtResponse(String accessToken, Long id, String username, String email, List<String> roles,String type) {
        this.token = accessToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.type=type;
    }

}
