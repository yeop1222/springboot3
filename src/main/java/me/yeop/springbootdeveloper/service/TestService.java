package me.yeop.springbootdeveloper.service;

import me.yeop.springbootdeveloper.domain.Member;
import me.yeop.springbootdeveloper.persistence.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
