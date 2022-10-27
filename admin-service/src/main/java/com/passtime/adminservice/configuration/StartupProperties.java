package com.passtime.adminservice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mohamed ouokki on 10/27/22
 * @project eureka-server
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "admin")
public class StartupProperties {

    private String username;
    private String password;
    private Character status;
}
