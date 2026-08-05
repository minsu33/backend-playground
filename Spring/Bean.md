# Bean

> Spring이 생성하고 관리하는 객체

---

# 한 줄 정의

Spring이 만들고 Spring Container에서 관리하는 객체

---

# 왜 필요한가?

일반적인 Java 코드에서는 `new`로 객체를 직접 만들고 관리한다.

Spring에서는 이 일을 Container에 맡길 수 있다. 이렇게 Spring이 만들고 관리하는 객체를 Bean이라고 한다. 등록된 Bean은 필요한 곳에 의존성 주입(DI)으로 전달할 수 있다.

---

# Bean 등록 예시

## 1. 어노테이션으로 등록 (자동)

`@Component`, `@Service`, `@Repository`, `@Controller`, `@RestController`를 붙이면 Bean을 자동으로 등록할 수 있다.

```java
@Service
public class MemberService {

}

@Repository
public class MemberRepository {

}
```

프로그램이 시작될 때 Spring이 `@Service`와 `@Repository`를 찾아 객체를 만들고, Spring Container에 Bean으로 등록한다.

---

## 2. @Bean으로 등록 (수동)

개발자가 Bean 생성 방법을 직접 정해 Spring Container에 등록하는 방식이다.

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

자동 등록보다 코드는 길지만, 외부 라이브러리의 객체를 등록하거나 생성 과정을 직접 정해야 할 때 유용하다.

---

# 자주 사용하는 어노테이션

## @Component

> 일반적인 객체를 Bean으로 등록하는 가장 기본적인 어노테이션

---

## @Controller

> HTTP 요청을 처리하는 Controller라는 것을 Spring에 알려주는 어노테이션

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

> HTTP 요청을 처리하고 응답 본문을 반환하는 Controller용 어노테이션

```java
@RestController
public class MemberController {

    @GetMapping("/members")
    public List<Member> members() {
        return memberService.findAll();
    }

}
```

메서드의 반환값은 HTTP 응답 본문에 들어간다. 문자열을 반환하면 문자열이 응답되고, Java 객체를 반환하면 일반적으로 JSON으로 변환된다.

`@RestController`가 붙은 클래스도 Spring이 생성하고 관리하는 Bean이다.

---

## @Service

> 비즈니스 로직을 담당하는 클래스라는 것을 Spring에 알려주는 어노테이션

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

> 데이터베이스에 접근하는 클래스라는 것을 Spring에 알려주는 어노테이션

```java
@Repository
public interface MemberRepository {

}
```

회원 정보의 저장, 조회, 수정, 삭제 등의 작업을 수행한다.

---

# Spring Container

> Spring이 만든 Bean을 보관하고 관리하는 공간

동작 과정은 다음과 같다.

```text
프로그램 실행
→ Spring Container 생성
→ Bean 생성 및 등록
→ 필요한 곳에 주입(DI)
→ Bean 생명주기 관리
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
