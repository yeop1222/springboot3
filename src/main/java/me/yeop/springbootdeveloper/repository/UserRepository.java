package me.yeop.springbootdeveloper.repository;

import me.yeop.springbootdeveloper.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    
    // email 로 사용자 정보를 가져옴
    Optional<User> findByEmail(String email);
}
