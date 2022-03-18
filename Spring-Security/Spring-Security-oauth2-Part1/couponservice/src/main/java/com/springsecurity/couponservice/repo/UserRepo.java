package com.springsecurity.couponservice.repo;

import com.springsecurity.couponservice.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
