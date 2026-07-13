# Member API

Spring Boot API 연습 프로젝트

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

Controller 클래스 위에 붙여서 이 클래스가 HTTP 요청을 처리한다고 Spring에게 알려준다.
메서드에서 객체를 반환하면 JSON으로 바꿔서 응답해준다.

### `@GetMapping`

GET 요청이 들어왔을 때 실행할 메서드 위에 붙인다.
괄호 안에는 요청을 받을 주소를 작성한다.

```java
@GetMapping("/member")
```

`/member`로 GET 요청이 들어오면 바로 아래에 있는 메서드가 실행된다.

### `MemberResponse`

클라이언트에게 보낼 회원 정보를 담아두는 클래스이다.
필드를 `private`으로 만들었기 때문에 getter를 통해 값을 읽을 수 있게 했다.
Spring도 getter로 값을 읽어서 JSON으로 바꿔준다.

### JSON

서버와 클라이언트가 데이터를 주고받을 때 사용하는 형식이다.
`키: 값` 형태로 데이터를 표현한다.

```json
{
  "name": "홍길동",
  "age": 30
}
```
