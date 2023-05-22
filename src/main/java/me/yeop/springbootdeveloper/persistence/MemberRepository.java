package me.yeop.springbootdeveloper.persistence;

import me.yeop.springbootdeveloper.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
