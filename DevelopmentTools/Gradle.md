# Gradle

## 학습 목표

- [ ] 빌드가 무엇인지 설명할 수 있다.
- [ ] Gradle이 필요한 이유를 설명할 수 있다.
- [ ] Gradle 프로젝트의 기본 파일을 구분할 수 있다.
- [ ] `build.gradle`의 주요 블록을 읽을 수 있다.
- [ ] Gradle Wrapper로 Task를 실행할 수 있다.

## 빌드란?

- 빌드의 의미
- Java 프로젝트의 기본 빌드 과정
- 컴파일, 테스트, 패키징의 차이

## Gradle이란?

- Gradle의 역할
- Gradle을 사용하는 이유

## Gradle 프로젝트의 파일 구조

### `build.gradle`

- 파일의 역할
- 누가 언제 읽는가?

### `settings.gradle`

- 파일의 역할
- `build.gradle`과의 차이
- 루트 프로젝트와 하위 프로젝트

### `gradlew`와 `gradlew.bat`

- 각 파일의 역할
- 운영체제에 따른 차이

### `gradle/wrapper`

- `gradle-wrapper.jar`
- `gradle-wrapper.properties`

## `build.gradle` 읽기

### `plugins`

- Plugin의 역할
- Plugin이 추가하는 기능

### `repositories`

- Repository의 역할
- Maven Central

### `dependencies`

- Dependency의 의미
- Repository와 Dependency의 차이

## Gradle Wrapper

- Gradle Wrapper를 사용하는 이유
- `gradle`과 `gradlew`의 차이
- `./`의 의미

## Task

- Task의 의미
- Plugin과 Task의 관계
- 주요 Task
  - `compileJava`
  - `test`
  - `build`
  - `clean`

## 직접 확인

### Gradle과 Java 버전

```bash
java -version
./gradlew --version
```

### Task 목록

```bash
./gradlew tasks
```

### Dependency 목록

```bash
./gradlew dependencies
```

### Build

```bash
./gradlew build
```

## 전체 흐름

```text
직접 작성
```

## 헷갈렸던 부분

-

## 정리

-

## 참고 자료

-
