package me.yeop.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User implements UserDetails { // UserDetails 구현해서 인증 객체로 사용

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Builder
    public User(String email, String password, String auth) {
        this.email = email;
        this.password = password;
    }

    // 권한 반환
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("user"));
    }
    
    // 사용자의 id를 반환 (unique)
    @Override
    public String getUsername() {
        return email;
    }
    
    // 사용자의 pw 반환
    @Override
    public String getPassword() {
        return password;
    }
    
    // 계정 만료 여부 반환
    @Override
    public boolean isAccountNonExpired() {
        // TODO 만료되었는지 확인하는 로직
        return true; // true = 만료되지 않았음
    }

    // 계정 잠금 여부 반환
    @Override
    public boolean isAccountNonLocked() {
        // TODO 계정 잠금되었는지 확인하는 로직
        return true; // true = 잠기지 않음
    }
    
    // 패스워드 만료 여부 반환
    @Override
    public boolean isCredentialsNonExpired() {
        // TODO 패스워드 만료되었는지 확인하는 로직
        return true; // true = 만료 안됨
    }
    
    // 계정 사용 가능 여부 반환
    @Override
    public boolean isEnabled() {
        // TODO 계정 사용 가능한지 확인하는 로직
        return true; // true = 사용 가능
    }
}
