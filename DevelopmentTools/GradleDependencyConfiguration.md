# Gradle Dependency Configuration

## Configuration이란?

- Dependency Configuration의 의미
- 의존성을 사용 목적에 따라 구분하는 이유

## Classpath

### Compile Classpath

- 컴파일할 때 필요한 클래스와 라이브러리

### Runtime Classpath

- 애플리케이션을 실행할 때 필요한 클래스와 라이브러리

### Test Classpath

- 테스트를 컴파일하고 실행할 때 필요한 클래스와 라이브러리

## `implementation`

- 사용하는 시점
- Compile Classpath와 Runtime Classpath 포함 여부
- 사용 예시

## `runtimeOnly`

- 사용하는 시점
- 컴파일할 때 필요하지 않은 이유
- MariaDB Driver 사용 예시

## `compileOnly`

- 사용하는 시점
- 실행 결과물에 포함하지 않는 이유
- Lombok 사용 예시

## `annotationProcessor`

- Annotation Processor란?
- 컴파일 과정에서 하는 일
- Lombok이 코드를 생성하는 과정

## `testImplementation`

- 테스트 코드에서만 사용하는 이유
- JUnit과 Spring Boot Test 사용 예시

## `testRuntimeOnly`

- 테스트 실행 시점에만 필요한 이유
- JUnit Platform Launcher 사용 예시

## Configuration 비교

| Configuration | Compile | Runtime | Test | 사용 예시 |
|---|---|---|---|---|
| `implementation` |  |  |  |  |
| `runtimeOnly` |  |  |  |  |
| `compileOnly` |  |  |  |  |
| `annotationProcessor` |  |  |  |  |
| `testImplementation` |  |  |  |  |
| `testRuntimeOnly` |  |  |  |  |

## 의존성 분류하기

```gradle
dependencies {
    // 직접 분류하고 이유 작성
}
```

## 직접 확인

### 전체 Dependency

```bash
./gradlew dependencies
```

### Compile Classpath

```bash
./gradlew dependencies --configuration compileClasspath
```

### Runtime Classpath

```bash
./gradlew dependencies --configuration runtimeClasspath
```

### Test Runtime Classpath

```bash
./gradlew dependencies --configuration testRuntimeClasspath
```

## 헷갈렸던 부분

-

## 정리

-

## 참고 자료

-
