# Member API

Spring Boot로 간단한 API를 만들어 보는 연습 프로젝트입니다.

## 실행

```bash
./gradlew bootRun
```

```text
http://localhost:8081
```

## 구현

### Hello API

```http
GET /hello
```

### 회원 정보 조회

```http
GET /member
```

```json
{
  "name": "홍길동",
  "email": "hong@example.com",
  "age": 30
}
```

## 정리

### `@RestController`

Controller 클래스 위에 붙여 이 클래스가 HTTP 요청을 처리한다는 것을 Spring에 알려준다.
메서드가 객체를 반환하면 Spring이 JSON으로 바꿔 응답한다.

### `@GetMapping`

GET 요청을 처리할 메서드 위에 붙인다. 괄호 안에는 요청받을 주소를 적는다.

```java
@GetMapping("/member")
```

`/member`로 GET 요청이 오면 바로 아래의 메서드가 실행된다.

### `MemberResponse`

클라이언트에 보낼 회원 정보를 담는 클래스이다.
필드가 `private`이므로 getter를 통해 값을 읽도록 했다.
Spring도 이 getter로 값을 읽어 JSON으로 변환한다.

### JSON

서버와 클라이언트가 데이터를 주고받을 때 사용하는 형식이다.
`키: 값` 형태로 데이터를 표현한다.

```json
{
  "name": "홍길동",
  "age": 30
}
```
