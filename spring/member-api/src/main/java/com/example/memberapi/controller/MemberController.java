package com.example.memberapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
// ResponseBody(return 값을 데이터 그 자체로 응답해라) + Controller = RestController
public class MemberController {

    @GetMapping("/members")
    // GET/members로 오면 매서드를 실행하라
    public String members() {
        return "회원 목록입니다.";
    }
}
