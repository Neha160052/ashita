package com.springsecurity.couponservice.repo;

import com.springsecurity.couponservice.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
