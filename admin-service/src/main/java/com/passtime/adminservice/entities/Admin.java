package com.passtime.adminservice.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohamed ouokki on 10/27/22
 * @project eureka-server
 */

@Table(name="admin")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="username")
    private String username;

    @Column(name="email_address",length = 200)
    private String emailAddress;

    @Column(name="password")
    private String password;

    @Column(name = "status")
    private Character status;

    @Column(name = "login_attempt")
    private Integer loginAttempt;

    @ElementCollection
    @Builder.Default
    private List<String> roles = new ArrayList<>();

}
