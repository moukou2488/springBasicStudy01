package com.yurim.yurimkumumom;

import com.yurim.yurimkumumom.aop.TimeTraceAop;
import com.yurim.yurimkumumom.repository.JpaMemberRepository;
import com.yurim.yurimkumumom.repository.MemberRepository;
import com.yurim.yurimkumumom.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }



}
