package com.example.Flash_shop.request;

import lombok.Data;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

@Data
// @Getter
// @Setter
// @AllArgsConstructor
// @NoArgsConstructor
public class CreateUserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
