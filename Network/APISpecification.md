# API 명세서 작성 방법

프론트엔드와 백엔드가 주고받을 요청과 응답을 정리한 문서입니다.

## 1. 기본 개념

| 용어        | 내가 정리한 의미 | 예시 |
| ----------- | ---------------- | ---- |
| API         | 프로그램끼리 정해진 방식으로 데이터를 주고받기 위한 규칙 | 사용자 정보를 조회하는 API |
| Base URL    | 모든 API 주소 앞에 공통으로 붙는 주소 | `https://api.example.com/api/v1` |
| Endpoint    | 특정 기능에 접근하기 위한 개별 경로 | `/users/1` |
| Request     | 클라이언트가 서버에 보내는 요청 | 사용자 ID가 1인 정보 조회 요청 |
| Response    | 서버가 요청을 처리한 뒤 돌려주는 결과 | 사용자 정보가 담긴 JSON |
| HTTP Status | 요청 처리 결과를 숫자로 나타낸 코드 | `200 OK`, `404 Not Found` |

## 2. HTTP Method

| Method | 주로 사용하는 상황         | 직접 작성한 예시 |
| ------ | -------------------------- | ---------------- |
| GET    | 데이터 조회                | `GET /users/1` |
| POST   | 데이터 생성 또는 작업 요청 | `POST /posts` |
| PATCH  | 데이터 일부 수정           | `PATCH /users/1` |
| DELETE | 데이터 삭제                | `DELETE /posts/10` |

## 3. Endpoint 이름 규칙

- 자원을 나타내는 명사를 사용한다.
- 여러 데이터를 나타낼 때는 복수형을 사용한다.
- 소문자를 사용한다.
- 여러 단어는 하이픈(`-`)으로 구분한다.
- 마지막에 `/`를 붙이지 않는다.

```text
GET /users/{userId}
GET /posts?year=2026&month=8
```

## 4. 요청 데이터의 위치

| 구분            | 사용하는 상황                        | 예시              |
| --------------- | ------------------------------------ | ----------------- |
| Path Parameter  | 특정 자원을 식별할 때                | `/users/{userId}` |
| Query Parameter | 검색, 필터, 정렬할 때                | `/posts?page=1`   |
| Header          | 인증 정보나 요청 부가정보            | `Authorization`   |
| Request Body    | 생성하거나 수정할 데이터를 전달할 때 | JSON 객체         |

## 5. Optional과 Nullable

- Optional: 요청이나 응답에서 해당 필드 자체를 생략할 수 있다는 뜻이다.
- Nullable: 필드는 존재하지만 값으로 `null`을 사용할 수 있다는 뜻이다.
- 차이: Optional은 **필드가 없어도 되는지**, Nullable은 **필드 값으로 null을 쓸 수 있는지**를 나타낸다.

예를 들어 `nickname`이 Optional이면서 Nullable이 아니라면 필드를 아예 보내지 않을 수는 있지만, `"nickname": null`은 허용되지 않는다.

## 6. API 명세 작성 순서

1. IA와 UI에서 서버 데이터가 필요한 기능을 찾는다.
2. 기능을 담당하는 도메인을 정한다.
3. 조회·생성·수정·삭제 중 어떤 동작인지 구분한다.
4. HTTP Method와 Endpoint를 정한다.
5. Path, Query, Header, Body를 작성한다.
6. 성공 응답의 필드와 JSON 예시를 작성한다.
7. 실패 상황과 상태 코드를 작성한다.
8. 프론트엔드와 백엔드가 함께 검토한다.

## 7. API 한 건 작성 예시

### 내 정보 일부 수정

- 설명: 로그인한 사용자의 닉네임을 수정한다.
- Method: `PATCH`
- Endpoint: `/users/me`
- 인증/권한: 로그인 사용자, JWT 필요

### Path Parameter

| Key | 설명 | 타입 | 필수 여부 | 예시 |
| --- | ---- | ---- | --------- | ---- |
| 없음 | 경로로 전달하는 값 없음 | - | - | - |

### Query Parameter

| Key | 설명 | 타입 | 필수 여부 | 예시 |
| --- | ---- | ---- | --------- | ---- |
| 없음 | 쿼리로 전달하는 값 없음 | - | - | - |

### Request Body

| Key | 설명 | 타입 | 필수 여부 | Nullable | 예시 |
| --- | ---- | ---- | --------- | -------- | ---- |
| nickname | 변경할 닉네임 | String | 필수 | 불가 | `backend-student` |

### Response

| Key | 설명 | 타입 | Nullable | 예시 |
| --- | ---- | ---- | -------- | ---- |
| userId | 사용자 ID | Long | 불가 | `1` |
| nickname | 변경된 닉네임 | String | 불가 | `backend-student` |
| updatedAt | 수정 시각 | String (ISO 8601) | 불가 | `2026-08-05T14:30:00Z` |

### Example

요청 Body:

```json
{
  "nickname": "backend-student"
}
```

응답 Body:

```json
{
  "userId": 1,
  "nickname": "backend-student",
  "updatedAt": "2026-08-05T14:30:00Z"
}
```

### Status

| 상태 코드 | 상황                | 응답 내용 |
| --------- | ------------------- | --------- |
| 200       | 요청 성공           | 수정된 사용자 정보 |
| 400       | 잘못된 요청         | 닉네임 형식이 올바르지 않음 |
| 401       | 인증 실패           | 토큰이 없거나 만료됨 |
| 404       | 자원을 찾을 수 없음 | 사용자 정보를 찾을 수 없음 |
| 500       | 서버 오류           | 서버 내부 오류 |
