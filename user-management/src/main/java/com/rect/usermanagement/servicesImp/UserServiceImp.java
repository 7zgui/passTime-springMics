package com.rect.usermanagement.servicesImp;


import com.rect.usermanagement.models.User;
import com.rect.usermanagement.repositories.UserRepository;
import com.rect.usermanagement.services.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Mohamed ouokki on 10/18/22
 * @project user-management
 */
public class UserServiceImp implements UserService {

    UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return UserDetailsImpl.build(user);
    }
}
