# Bean

> Spring이 생성하고 관리하는 객체

---

# 한 줄 정의

Spring Container가 관리하는 Java 객체

---

# 왜 필요한가?

기존 Java는 객체를 생성할때 new 연산자를 통해 만들고 의존성 주입, 코드 유지보수모두 직접해야함.
효율적으로 개발하기 위해 Spring으로 객체를 생성하고 관리하는데 그때 생성된 인스턴스 객체를 Bean이라고 함.

---

# Bean 등록 예시

1. 어노테이션으로 생성 (자동)

@Component, @Service, @Repository, @Controller를 이용해서 자동으로 Bean 생성

```java
@Service
public class MemberService {

}

@Repository
public class MemberRepository {

}
```

프로그램이 시작되면 @Service 발견 > 객체 생성 > Spring Container에 저장

2. @Bean으로 등록 (수동)
   개발자가 직접 객체중에 어떤 걸 Bean으로 저장할지 정하는 것
   Configuration 클래스안에 @Bean을 매서드에 넣어서 생성

```java
@Configuration // 설정 클래스
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService();
    }

}
```

개발자가 직접 등록해야하는 것이기에 코드가 길어지고, 자동생성보다 할 일이 많아짐.

---

## 자주 사용하는 어노테이션

### @Conponent

> 일반 객체를 Baen으로 등록하는 어노테이션

### @Controller

> 사용자의 HTTP요청을 처리하는 클래스라고 Spring에게 알려주는 어노테이션

```java
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
```

HTML(View)로 반환

### @RestController

> REST API 요청을 처리하고 데이터를 JSON 형태로 반환하는 클래스를 Spring에게 알려주는 어노테이션

```java
@RestController
public class MemberController {

    @GetMapping("/members")
    public List<Member> members() {
        return memberService.findAll();
    }

}
```

### @Service

> 비지니스 로직을 담당하는 클래스라고 Spring에게 알려주는 어노테이션

실제 기능을 하는 곳에 붙여준다.

```java
@Service
public class MemberService {

    public void signup(MemberRequest request) {
        // 회원가입 로직
    }

}
```

### @Repository

> 데이터베이스와 직접 통신하는 클래스라고 Spring에게 알려주는 어노테이션

```java
@Repository
public class MemberRepository {

}
```

Repository를 통해 저장, 조회, 수정, 삭제 기능을 수행한다.

# Spring Container

(직접 작성)

---

# 장점

(직접 작성)

---

# 참고 자료

- 멋쟁이사자처럼 14기 백엔드 1주차
- Spring 공식 문서
