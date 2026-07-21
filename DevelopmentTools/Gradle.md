# Gradle

## 빌드란?

- 빌드의 의미

빌드란 작성한 소스코드를 실행하거나 배포할 수 있는 결과물로 만드는 전체 과정이다.
Java 빌드 과정은 의존성 해결 + 컴파일 + 테스트 + 패키징으로 이뤄진다.

> 의존성 해결 (Dependency Resolution) - 프로젝트에 필요한 라이브러리나 패키지 준비

외부 저장소에서 프로젝트에 필요한 라이브러리나 패키지를 찾아 로컬 Gradle 캐시에 다운로드하여 준비한다.

> 컴파일 (Compilation) - 소스 코드를 JVM이 실행할 수 있는 형태로 만든다

ex. Java는 `javac`(Java 컴파일러)를 사용해서 `.java` 소스 코드를
JVM이 실행할 수 있는 `.class` 바이트코드로 변환한다.

> 테스트 (Testing)

코드가 예상대로 동작하는지 검사한다.

> 패키징 (Packaging)

컴파일된 클래스 파일과 리소스를 모아 JAR이나 WAR 같은 배포 가능한 아카이브로 묶는다.

## Gradle이란?

- Gradle
  Gradle은 개발자가 작성한 빌드 설정을 읽고, 프로젝트에 필요한 라이브러리를 내려받은 뒤 소스코드를 컴파일하고 테스트하여 JAR 같은 결과물을 만드는 도구이다. 이 과정의 각 작업은 Task 단위로 실행된다.

  ex. ./gradlew build, ./gradlew bootRun

## Gradle 프로젝트의 파일 구조

### 전체적인 흐름

./gradlew build
→ settings.gradle
→ 프로젝트 구조 확인
→ build.gradle
→ 각 프로젝트의 빌드 방법 설정
→ Task 실행

### `build.gradle`

> Gradle 프로젝트의 빌드 방법을 정의하는 빌드 스크립트

어떤 Plugin을 사용할지, Java 버전은 무엇인지, 외부 라이브러리를 어디서 찾을지, 어떤게 필요한지 등
이런 정보를 Gradle이 읽고 실행한다.

### `settings.gradle`

> Gradle 빌드에 참여하는 프로젝트의 이름과 구조를 정의하는 파일

어떤 프로젝트를 빌드할지, 루트 프로젝트 이름은 무엇인지, 하위 프로젝트에는 무엇이 있는지 정의

```text
project
├── api
│   └── build.gradle
├── domain
│   └── build.gradle
└── infrastructure
    └── build.gradle
```

```gradle
rootProject.name = 'project'

include 'api'
include 'domain'
include 'infrastructure'
```

### `gradlew`와 `gradlew.bat`

> `gradlew`와 `gradlew.bat`은 프로젝트에 지정된 Gradle 버전으로 빌드를 실행하는 Gradle Wrapper 스크립트이다.

`gradlew`는 macOS와 Linux, `gradlew.bat`은 Windows에서 사용되며 파일 형식만 다르다.

```bash
# macOS/Linux
./gradlew build
# Windows Command Prompt
gradlew.bat build

# Windows PowerShell
.\gradlew.bat build
```

### `gradle/wrapper`

> Gradle Wrapper가 동작하는 데 필요한 실행 코드가 들어있는 폴더

- `gradle-wrapper.jar`

Gradle Wrapper를 실행하는 Java 코드가 들어 있다.
Gradle 전체가 포함된 파일은 아니며, 필요한 Gradle 버전을 확인하고
다운로드한 뒤 실행하는 역할을 한다.

- `gradle-wrapper.properties`

Wrapper가 사용할 Gradle 버전과 다운로드 위치를 설정한다.
`distributionUrl`을 통해 프로젝트의 Gradle 버전을 확인할 수 있다.

```properties
distributionUrl=https\://services.gradle.org/distributions/gradle-9.2.1-bin.zip
```

## `build.gradle` 읽기

### `plugins`

> Gradle에 새로운 기능, 규칙, Task를 추가

Gradle 자체는 범용 빌드 도구이므로, Plugin을 통해 어떤 종류의 프로젝트를 빌드할지 알린다.
Gradle > 휴대폰, Plugin > 앱

```gradle
plugins {
    id 'java'
    id 'org.springframework.boot' version '4.1.0'
    id 'io.spring.dependency-management' version '1.1.7'
}
```

`io.spring.dependency-management`는 Spring Boot가 관리하는 호환 의존성 버전을 Gradle에서 사용할 수 있게 한다.

다음 Task가 만들어진다.

- `compileJava` → Java 소스코드 컴파일
- `test` → 테스트 실행
- `jar` → JAR 생성
- `build` → 전체 빌드
- `clean` → 기존 빌드 결과 삭제

- `bootRun` → Spring Boot 애플리케이션 실행
- `bootJar` → 실행 가능한 Spring Boot JAR 생성

### `repositories`

> Gradle이 외부 라이브러리를 가져올 저장소를 지정한다.

`dependencies`에 선언된 라이브러리를 Maven Central에서 찾아 내려받는다.

```gradle
repositories {
    mavenCentral()
}
```

`Maven Central`은 Java와 JVM 생태계에서 사용하는 대표적인 공개 라이브러리 저장소이다.
ex. Spring Boot, Lombok, MariaDB Driver 등

### `dependencies`

> 프로젝트를 컴파일하거나 실행하고 테스트할 때 필요한 외부 라이브러리이다.

ex. `starter-web` → HTTP API 개발, `mariadb-java-client` → MariaDB 통신

문자열 구조는 `group:name:version`이다.

```gradle
implementation 'io.jsonwebtoken:jjwt-api:0.12.6'
```

`dependencies`에서 무엇이 필요한지 확인하고, `repositories`에서 어디서 가져올지 확인한다.

## Gradle Wrapper

> Gradle Wrapper는 프로젝트에 지정된 Gradle 버전으로 빌드를 실행할 수 있게 하는 도구

개발자마다 컴퓨터에 설치된 Gradle 버전이 다를 수 있으므로 Wrapper를 사용하여 `gradle-wrapper.properties`에 지정된 버전을 사용한다.

- `gradle build` → 컴퓨터에 직접 설치된 Gradle 사용
- `./gradlew build` → 현재 프로젝트에 지정된 Gradle 사용

## Task

> Gradle이 수행하는 하나의 작업 단위

- Java 코드 컴파일 → `compileJava`
- 테스트 실행 → `test`
- JAR 생성 → `jar` 또는 `bootJar`
- 전체 빌드 → `build`
- 기존 빌드 결과 삭제 → `clean`

ex. `./gradlew test`, `./gradlew build`

Plugin을 적용하면 해당 프로젝트에 필요한 Task와 설정이 추가된다.

```gradle
plugins {
    id 'java'
}
```

다음과 같이 추가된다.

- `compileJava`
- `processResources`
- `classes`
- `test`
- `jar`
- `build`
- `clean`

따라서 `test`는 Java Plugin이 추가하고, `bootRun`과 `bootJar`는 Spring Boot Plugin이 추가하는 Task이다.

- 주요 Task

> compileJava

`.java`
→ `compileJava`
→ `.class`

> test

`src/test/java`
→ 테스트 코드 컴파일
→ JUnit으로 테스트 실행
→ 결과 보고서 생성

> build

소스코드 컴파일
리소스 처리
테스트 실행
JAR 생성

> clean

`./gradlew clean build` → 이전 빌드 결과를 지우고 새로 빌드할 때 사용

### Gradle과 Java 버전

```bash
java -version
./gradlew --version
```

터미널의 기본 Java 버전이 항상 프로젝트 Toolchain 버전과 같은 것은 아니다.

```bash
./gradlew javaToolchains
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

-> BUILD SUCCESSFUL / FAILED

## 전체 흐름

```text
./gradlew build 실행
→ gradlew가 gradle-wrapper.jar 실행
→ gradle-wrapper.properties에서 Gradle 버전 확인
→ 지정된 Gradle이 없으면 다운로드
→ Gradle 실행
→ settings.gradle 평가
→ 루트 프로젝트와 하위 프로젝트 구성
→ build.gradle 평가
→ Plugin 적용
→ Repository, Dependency, Java 버전, Task 설정
→ build에 필요한 Task Graph 구성
→ 필요한 의존성 확인 및 다운로드
→ Java 소스코드 컴파일
→ 리소스 파일 처리
→ 테스트 코드 컴파일 및 테스트 실행
→ JAR 생성
→ BUILD SUCCESSFUL 또는 BUILD FAILED
```
