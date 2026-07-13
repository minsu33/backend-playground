package com.example.memberapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

     @GetMapping("/member")
    public MemberResponse getMember() {
        return new MemberResponse("홍길동", "hong@example.com", 30);
    }
    
}
