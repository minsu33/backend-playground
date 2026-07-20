# Gradle

## Gradle이란?

Gradle은 프로젝트의 빌드 과정을 관리하는 빌드 도구이다.

소스 코드 컴파일, 외부 라이브러리 관리, 테스트 실행, 결과물 생성 등의 작업을 수행한다.

```text
소스 코드
→ 의존성 준비
→ 컴파일
→ 테스트
→ JAR 생성
```

## 빌드

빌드는 작성한 소스 코드를 실행하거나 배포할 수 있는 결과물로 만드는 과정이다.

Java 프로젝트의 빌드 과정에는 주로 다음 작업이 포함된다.

- 외부 라이브러리 다운로드
- Java 소스 코드 컴파일
- 테스트 실행
- 리소스 파일 복사
- JAR 생성

## `build.gradle`

`build.gradle`은 Gradle이 프로젝트를 어떻게 빌드할지 선언하는 파일이다.

주로 다음 내용을 작성한다.

- Plugin
- Java 버전
- 라이브러리를 가져올 저장소
- 프로젝트에서 사용할 라이브러리
- 테스트 및 빌드 작업 설정

```text
build.gradle → 빌드 설정
Gradle       → 설정을 읽고 작업을 실행하는 도구
```

Gradle은 Groovy 또는 Kotlin 문법으로 빌드 설정을 작성할 수 있다.

```text
build.gradle     → Groovy DSL
build.gradle.kts → Kotlin DSL
```

## Plugin

Plugin은 Gradle에 새로운 빌드 기능과 Task를 추가한다.

```gradle
plugins {
    id 'java'
    id 'org.springframework.boot' version '4.1.0'
    id 'io.spring.dependency-management' version '1.1.7'
}
```

### Java Plugin

```gradle
id 'java'
```

Java 소스 코드 컴파일, 테스트, JAR 생성에 필요한 Task와 프로젝트 구조를 추가한다.

### Spring Boot Plugin

```gradle
id 'org.springframework.boot' version '4.1.0'
```

Spring Boot 애플리케이션 실행과 패키징에 필요한 기능을 추가한다.

대표적인 Task는 다음과 같다.

```text
bootRun
bootJar
```

### Dependency Management Plugin

```gradle
id 'io.spring.dependency-management' version '1.1.7'
```

Spring Boot가 관리하는 의존성 버전 정보를 Gradle에서 사용할 수 있게 한다.

Spring Boot가 관리하는 라이브러리는 버전을 직접 작성하지 않아도 호환되는 버전이 선택된다.

```gradle
implementation 'org.springframework.boot:spring-boot-starter-web'
```

## Repository

Repository는 Gradle이 외부 라이브러리를 검색하고 다운로드할 위치이다.

```gradle
repositories {
    mavenCentral()
}
```

Maven Central은 Java와 JVM 라이브러리가 배포되는 공개 저장소이다.

Gradle이 내려받은 라이브러리는 일반적으로 사용자 홈의 캐시에 저장된다.

```text
~/.gradle/caches
```

## Dependency

Dependency는 프로젝트가 사용하는 외부 라이브러리이다.

```gradle
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
}
```

```text
dependencies → 필요한 라이브러리
repositories → 라이브러리를 가져올 위치
```

의존성은 일반적으로 다음 형식으로 작성한다.

```text
group:name:version
```

예:

```gradle
implementation 'io.jsonwebtoken:jjwt-api:0.12.6'
```

Spring Boot가 버전을 관리하는 의존성은 버전을 생략할 수 있다.

## Spring Boot Starter

Spring Boot Starter는 특정 기능을 구현할 때 함께 사용하는 라이브러리를 묶어 제공한다.

```gradle
implementation 'org.springframework.boot:spring-boot-starter-web'
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
implementation 'org.springframework.boot:spring-boot-starter-security'
implementation 'org.springframework.boot:spring-boot-starter-validation'
```

| Starter | 역할 |
|---|---|
| `starter-web` | HTTP 요청과 응답, JSON 변환, 웹 서버 |
| `starter-data-jpa` | 관계형 데이터베이스 접근 |
| `starter-data-redis` | Redis 데이터 접근 |
| `starter-security` | 인증과 권한 검사 |
| `starter-validation` | 요청값 검증 |

Starter를 사용하면 필요한 라이브러리를 하나씩 찾아서 추가하지 않아도 된다.

## Dependency Configuration

Dependency Configuration은 의존성이 필요한 시점과 용도를 구분한다.

### `implementation`

```gradle
implementation 'org.springframework.boot:spring-boot-starter-web'
```

소스 코드 컴파일과 애플리케이션 실행에 필요한 의존성이다.

### `runtimeOnly`

```gradle
runtimeOnly 'org.mariadb.jdbc:mariadb-java-client'
```

컴파일할 때 직접 필요하지 않고, 애플리케이션 실행 시 필요한 의존성이다.

데이터베이스 Driver처럼 실행 중 프레임워크가 사용하는 라이브러리에 적용할 수 있다.

### `compileOnly`

```gradle
compileOnly 'org.projectlombok:lombok'
```

컴파일할 때만 필요하고 실행 결과물에는 포함할 필요가 없는 의존성이다.

### `annotationProcessor`

```gradle
annotationProcessor 'org.projectlombok:lombok'
```

Java 컴파일 과정에서 어노테이션을 분석하고 코드를 생성하는 도구를 등록한다.

### `testImplementation`

```gradle
testImplementation 'org.springframework.boot:spring-boot-starter-test'
```

테스트 코드를 컴파일하고 실행할 때 사용하는 의존성이다.

### `testRuntimeOnly`

```gradle
testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
```

테스트를 실행하는 시점에만 필요한 의존성이다.

## Lombok과 Annotation Processor

Lombok은 컴파일 과정에서 반복적인 Java 코드를 생성한다.

```text
@Getter              → getter
@Setter              → setter
@Builder             → Builder
@NoArgsConstructor   → 기본 생성자
@AllArgsConstructor  → 전체 필드 생성자
@RequiredArgsConstructor
                     → 필요한 필드를 받는 생성자
@Slf4j               → Logger
```

Lombok이 없다면 생성자, getter, setter 등의 코드를 직접 작성해야 한다.

```gradle
compileOnly 'org.projectlombok:lombok'
annotationProcessor 'org.projectlombok:lombok'
```

Lombok 어노테이션은 컴파일 중 처리되므로 `annotationProcessor`에 등록한다. 생성된 코드는 컴파일 결과에 포함되기 때문에 애플리케이션 실행 시 Lombok 자체는 필요하지 않다.

## Configuration

Configuration은 의존성을 사용 목적에 따라 분류한 집합이다.

```gradle
configurations {
    compileOnly {
        extendsFrom annotationProcessor
    }
}
```

`extendsFrom`은 한 Configuration이 다른 Configuration의 의존성을 상속하도록 설정한다.

위 설정은 `annotationProcessor`에 등록된 의존성을 `compileOnly`에서도 사용할 수 있게 한다.

## Java Toolchain

Java Toolchain은 프로젝트를 컴파일할 Java 버전을 지정한다.

```gradle
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}
```

컴퓨터의 기본 Java 버전과 프로젝트가 사용하는 Java 버전은 다를 수 있다.

```text
시스템 기본 Java → Gradle을 실행할 수 있음
Java Toolchain   → 프로젝트 컴파일에 사용할 Java 지정
```

Toolchain을 사용하면 개발자와 빌드 환경에서 동일한 Java 버전을 사용하기 쉽다.

## Gradle Wrapper

Gradle Wrapper는 프로젝트가 지정한 Gradle 버전으로 빌드를 실행하게 한다.

```text
gradlew
gradlew.bat
gradle/wrapper/gradle-wrapper.jar
gradle/wrapper/gradle-wrapper.properties
```

- `gradlew`: macOS와 Linux에서 사용하는 실행 스크립트
- `gradlew.bat`: Windows에서 사용하는 실행 스크립트
- `gradle-wrapper.jar`: Wrapper 실행 코드
- `gradle-wrapper.properties`: Gradle 배포 버전과 다운로드 주소

macOS와 Linux에서는 다음처럼 실행한다.

```bash
./gradlew test
```

`./`은 현재 디렉터리에 있는 `gradlew` 파일을 실행한다는 뜻이다.

```text
Gradle Wrapper → Gradle 버전 통일
Java Toolchain → Java 컴파일 버전 통일
```

## Task

Task는 Gradle이 수행하는 작업 단위이다.

| Task | 역할 |
|---|---|
| `compileJava` | Java 소스 코드 컴파일 |
| `test` | 테스트 실행 |
| `build` | 컴파일, 테스트, 결과물 생성 |
| `bootRun` | Spring Boot 애플리케이션 실행 |
| `bootJar` | 실행 가능한 Spring Boot JAR 생성 |
| `clean` | 기존 빌드 결과 삭제 |

### `test`

```gradle
tasks.named('test') {
    useJUnitPlatform()
}
```

기존 `test` Task가 JUnit Platform을 사용하여 테스트를 실행하도록 설정한다.

```bash
./gradlew test
```

### `bootRun`

```bash
./gradlew bootRun
```

소스 프로젝트를 컴파일한 뒤 Spring Boot 애플리케이션의 `main()`을 실행한다.

개발 중 서버를 바로 실행할 때 사용할 수 있다.

### `bootJar`

```bash
./gradlew bootJar
```

Spring Boot 애플리케이션과 실행에 필요한 파일을 JAR로 패키징한다.

생성된 JAR은 다음처럼 실행할 수 있다.

```bash
java -jar build/libs/application.jar
```

## JAR

JAR은 Java Archive의 줄임말이다.

컴파일된 Java 클래스와 리소스 등을 하나의 파일로 묶은 결과물이다.

```text
.java 소스 코드
→ 컴파일
→ .class 바이트코드
→ JAR 패키징
```

Spring Boot의 `bootJar` Task는 실행 가능한 JAR을 생성한다.

## SNAPSHOT

```gradle
version = '0.0.1-SNAPSHOT'
```

`SNAPSHOT`은 아직 개발 중이며 변경될 수 있는 버전을 나타낸다.

```text
0.0.1-SNAPSHOT → 개발 중인 버전
0.0.1          → 정식 버전
```

## 실행 흐름

```text
./gradlew build
→ Gradle Wrapper 실행
→ 지정된 Gradle 버전 준비
→ build.gradle 읽기
→ 의존성 다운로드
→ Java 소스 코드 컴파일
→ 리소스 복사
→ 테스트 실행
→ JAR 생성
```

```text
./gradlew bootRun
→ Gradle Wrapper 실행
→ 소스 코드 컴파일
→ Spring Boot main() 실행
→ 웹 서버 시작
```

## 확인 명령어

```bash
java -version
./gradlew --version
./gradlew tasks
./gradlew test
./gradlew build
./gradlew bootRun
./gradlew bootJar
```

## 정리

- Gradle은 프로젝트의 빌드 과정을 관리한다.
- `build.gradle`에는 Plugin, Repository, Dependency, Task 설정 등을 선언한다.
- Repository는 라이브러리를 가져올 위치이고, Dependency는 필요한 라이브러리이다.
- Gradle Wrapper는 프로젝트의 Gradle 버전을 맞춘다.
- Java Toolchain은 프로젝트를 컴파일할 Java 버전을 맞춘다.
- Task는 Gradle이 수행하는 작업 단위이다.
- `bootRun`은 Spring Boot 애플리케이션을 실행하고, `bootJar`는 실행 가능한 JAR을 생성한다.
