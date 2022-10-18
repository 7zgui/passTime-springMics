package com.rect.usermanagement.services;

import com.rect.usermanagement.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author Mohamed ouokki on 10/18/22
 * @project user-management
 */
public interface UserService {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    // todo implement
}
