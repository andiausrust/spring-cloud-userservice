package com.andi.userservice.service;


import com.andi.userservice.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {

    UserDto createUser(UserDto userDetails);

}
