package com.example.Flash_shop.data;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Flash_shop.model.Role;
public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String role);

}
