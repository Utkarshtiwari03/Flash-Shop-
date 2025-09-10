package com.example.Flash_shop.security.config;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.Flash_shop.model.User;
import com.example.Flash_shop.repository.UserRepository;
import com.example.Flash_shop.security.user.ShopUserDetails;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ShopUserDetailsService implements UserDetailsService{

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user=Optional.ofNullable(userRepository.findByEmail(email))
                .orElseThrow(() ->new UsernameNotFoundException("User not found with email: " + email));
        return ShopUserDetails.buildUserDetails(user);
    }
    
}
