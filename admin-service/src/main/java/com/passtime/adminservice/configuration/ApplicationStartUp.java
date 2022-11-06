package com.passtime.adminservice.configuration;

import com.passtime.adminservice.entities.Admin;
import com.passtime.adminservice.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.Arrays;
import java.util.List;

/**
 * @author Mohamed ouokki on 11/5/22
 * @project eureka-server
 */
@Component
public class ApplicationStartUp {

    private final AdminRepository adminRepository;

    private final StartupProperties startupProperties;

    public ApplicationStartUp(AdminRepository adminRepository, StartupProperties startupProperties) {
        this.adminRepository = adminRepository;
        this.startupProperties = startupProperties;
    }

    @Bean
    public CommandLineRunner loadData(){
        return (args -> {
            List<Admin> admins=adminRepository.findAll();
            if(ObjectUtils.isEmpty(admins)){
                this.adminRepository.save(Admin.builder()
                        .username(startupProperties.getUsername())
                        .password(startupProperties.getPassword())
                        .roles(Arrays.asList("ADMIN"))
                        .status(startupProperties.getStatus())
                        .build());
            }
        });
    }

}
