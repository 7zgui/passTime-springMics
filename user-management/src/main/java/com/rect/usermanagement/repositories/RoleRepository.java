package com.rect.usermanagement.repositories;

import com.rect.usermanagement.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Mohamed ouokki on 10/17/22
 * @project user-management
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(String name);
    
}
