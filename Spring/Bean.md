# Bean

> Spring이 생성하고 관리하는 객체

---

# 한 줄 정의

Spring이 생성하여 Spring Container에서 관리하는 객체

---

# 왜 필요한가?

기존 Java에서는 객체를 생성할 때 `new` 연산자를 사용하여 직접 생성하고 관리해야 했다.

Spring은 객체의 생성과 관리를 대신 수행하며, 이렇게 Spring이 생성하고 관리하는 객체를 Bean이라고 한다.

Bean을 사용하면 객체를 효율적으로 관리하고 필요한 곳에 의존성 주입(DI)을 할 수 있다.

---

# Bean 등록 예시

## 1. 어노테이션으로 등록 (자동)

`@Component`, `@Service`, `@Repository`, `@Controller`, `@RestController`를 이용하여 자동으로 Bean을 등록한다.

```java
@Service
public class MemberService {

}

@Repository
public class MemberRepository {

}
```

프로그램이 시작되면 Spring이 `@Service`와 `@Repository`를 발견하여 객체를 생성하고 Spring Container에 Bean으로 등록한다.

---

## 2. @Bean으로 등록 (수동)

개발자가 직접 Bean을 생성하여 Spring Container에 등록하는 방법이다.

`@Configuration` 클래스 안에서 `@Bean`을 메서드에 붙여 등록한다.

```java
@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService();
    }

}
```

직접 Bean을 등록해야 하기 때문에 자동 등록보다 코드가 길어질 수 있다.

---

# 자주 사용하는 어노테이션

## @Component

> 일반적인 객체를 Bean으로 등록하는 가장 기본적인 어노테이션

---

## @Controller

> 사용자의 HTTP 요청을 처리하는 Controller임을 Spring에게 알려주는 어노테이션

```java
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

}
```

주로 HTML(View)을 반환한다.

---

## @RestController

> REST API 요청을 처리하고 JSON 형태의 데이터를 반환하는 Controller임을 Spring에게 알려주는 어노테이션

```java
@RestController
public class MemberController {

    @GetMapping("/members")
    public List<Member> members() {
        return memberService.findAll();
    }

}
```

주로 JSON 형태의 데이터를 반환한다.

---

## @Service

> 비즈니스 로직을 담당하는 클래스임을 Spring에게 알려주는 어노테이션

실제 기능(비즈니스 로직)을 구현하는 곳에 사용한다.

```java
@Service
public class MemberService {

    public void signup(MemberRequest request) {
        // 회원가입 로직
    }

}
```

---

## @Repository

> 데이터베이스에 접근하여 CRUD를 수행하는 클래스임을 Spring에게 알려주는 어노테이션

```java
@Repository
public interface MemberRepository {

}
```

회원 정보의 저장, 조회, 수정, 삭제 등의 작업을 수행한다.

---

# Spring Container

> Spring이 생성한 Bean을 저장하고 관리하는 공간

동작 과정


프로그램 실행

↓

Spring Container 생성

↓

Bean 생성

↓

Spring Container에 저장

↓

필요한 곳에 주입(DI)

↓

Bean 생명주기 관리
```

---

# 장점

- 객체를 효율적으로 관리할 수 있다.
- 객체를 재사용할 수 있다.
- 의존성 주입(DI)을 사용할 수 있다.
- 유지보수가 쉬워진다.
- 테스트하기 쉬워진다.

---


# 참고 자료

- 멋쟁이사자처럼 14기 백엔드 1주차 세션
- Spring 공식 문서