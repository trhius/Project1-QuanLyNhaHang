package com.example.QuanLyNhaHang.repository;

import com.example.QuanLyNhaHang.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.userName = ?1")
    User findByUserName(String username);


}
