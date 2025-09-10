// package com.example.Flash_shop.data;

// import java.util.Set;

// import org.springframework.boot.context.event.ApplicationReadyEvent;
// import org.springframework.context.ApplicationListener;
// import org.springframework.stereotype.Component;

// import com.example.Flash_shop.model.Role;
// import com.example.Flash_shop.model.User;
// import com.example.Flash_shop.repository.UserRepository;

// import lombok.RequiredArgsConstructor;

// @Component
// @RequiredArgsConstructor
// public class DataInitializer implements ApplicationListener<ApplicationReadyEvent>{

//     private final UserRepository userRepository;
//     private final RoleRepository roleRepository; 

//     @Override
//     public void onApplicationEvent(ApplicationReadyEvent event) {
//         Set<String> defaultRoles=Set.of("ROLE_ADMIN","ROLE_CUSTOMER");
//         createDefaultUserIfNotExists();
//         createDefaultUserIfNotExists(defaultRoles);
//     }

//     private void createDefaultUserIfNotExists() {
//         for(int i=1;i<=5;i++){
//             // System.out.println("User"+i+" Created");
//             String defaultEmail = "user"+i+"@email.com";
//             if(userRepository.existsByEmail(defaultEmail)){
//                 continue;
//             }
            
//             User user = new User();
//             user.setFirstName("User"+i);
//             user.setLastName("Test");
//             user.setEmail(defaultEmail);
//             user.setPassword("123456");
//             userRepository.save(user);
//             System.out.println("Default user "+i+" created succesfully." );
//         }
//     }
//     private void createDefaultUserIfNotExists(Set<String> roles) {
//         roles.stream()
//             .filter(role -> roleRepository.findByName(role).isEmpty())
//             .map(Role::new)
//             .forEach(role -> roleRepository.save(role));
//             // .filter(role ->roleRepository.findByName(role).isEmpty())
//             // .map(Role:: new).forEach(roleRepository::save);
//     }
    
// }
