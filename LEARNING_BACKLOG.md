# Learning Backlog

## 1. Computer Science

### 자료구조와 알고리즘

- [ ] 시간 복잡도와 공간 복잡도
  - Big-O
  - 시간과 메모리의 trade-off
- [ ] 배열과 연결 리스트
- [ ] Stack과 Queue
- [ ] Hash Table
  - Hash Function
  - Hash Collision
- [ ] Tree
  - Binary Tree
  - Binary Search Tree
  - B-Tree와 B+Tree
- [ ] Heap과 Priority Queue
- [ ] Graph
  - BFS
  - DFS
- [ ] 정렬과 탐색
  - Binary Search
  - Stable Sort

### 운영체제

- [ ] Process와 Thread
- [ ] 동시성과 병렬성
- [ ] Context Switching
- [ ] CPU, Memory, Disk
- [ ] Stack Memory와 Heap Memory
- [ ] Virtual Memory
- [ ] System Call
- [ ] File Descriptor
- [ ] 동기와 비동기
- [ ] Blocking과 Non-blocking
- [ ] Race Condition
- [ ] Deadlock
- [ ] Lock과 Semaphore

## 2. Java

### 기본 문법

- [ ] 변수와 자료형
- [ ] 연산자와 제어문
- [ ] Method
- [ ] Array
- [ ] Package와 Import
- [ ] 접근 제어자
- [ ] `static`
- [ ] `final`

### 객체지향

- [x] [Class와 Object](./Java/ClassAndObject/README.md)
- [ ] Encapsulation
- [ ] Inheritance
- [ ] Polymorphism
- [ ] Abstraction
- [ ] Interface와 Abstract Class
- [ ] Overloading과 Overriding
- [ ] Composition
- [ ] SOLID

### Java 핵심 기능

- [ ] Primitive Type과 Reference Type
- [ ] `equals()`와 `hashCode()`
- [ ] Immutable Object
- [ ] Exception
  - Checked Exception
  - Unchecked Exception
  - 예외 전파
  - Custom Exception
- [ ] Generic
- [ ] Collection Framework
  - List
  - Set
  - Map
- [ ] Iterator
- [ ] Lambda
- [ ] Stream
- [ ] Optional
- [ ] Annotation
- [ ] Reflection
- [ ] Date와 Time API

### JVM

- [ ] Java 컴파일 과정
  - `.java`
  - `.class`
  - Bytecode
- [ ] JVM, JRE, JDK
- [ ] Class Loader
- [ ] Runtime Data Area
- [ ] Garbage Collection
- [ ] JIT Compiler
- [ ] Java Memory Model
- [ ] Java Thread
- [ ] Virtual Thread

## 3. Development Tools

### Git

- [ ] Version Control
- [ ] Working Tree, Staging Area, Repository
- [ ] Commit
- [ ] Branch
- [ ] `HEAD`
- [ ] Merge
- [ ] Rebase
- [ ] Merge Conflict
- [ ] Remote, Fetch, Pull, Push
- [ ] `.gitignore`
- [ ] Conventional Commits
- [ ] Issue와 Pull Request
- [ ] Code Review

### Gradle

- [x] [Gradle](./SpringBoot/Gradle.md)
  - Build
  - `build.gradle`
  - Plugin
  - Repository
  - Dependency
  - Dependency Configuration
  - Spring Boot Starter
  - Gradle Wrapper
  - Java Toolchain
  - Task
  - `bootRun`
  - `bootJar`
  - JAR
  - SNAPSHOT
  - Lombok
  - Annotation Processor
- [ ] Gradle Build Lifecycle
  - Initialization
  - Configuration
  - Execution
- [ ] Dependency Graph
- [ ] Transitive Dependency
- [ ] Version Conflict
- [ ] Multi-project Build
- [ ] Build Cache

## 4. Network

### 네트워크 기초

- [ ] OSI 7 Layer
- [ ] TCP/IP Model
- [ ] IP와 Port
- [ ] TCP와 UDP
- [ ] TCP 3-way Handshake
- [ ] DNS
- [ ] URI, URL, URN
- [ ] Domain
- [ ] Proxy와 Reverse Proxy
- [ ] Load Balancer
- [ ] Socket
- [ ] TLS와 HTTPS

### HTTP

- [ ] HTTP 요청과 응답
- [ ] HTTP Method
  - GET
  - POST
  - PUT
  - PATCH
  - DELETE
- [ ] HTTP Status Code
- [ ] HTTP Header
- [ ] Request Body와 Response Body
- [ ] Content-Type
- [ ] Stateless
- [ ] Keep-Alive
- [ ] HTTP/1.1, HTTP/2, HTTP/3
- [ ] Cookie
- [ ] Session
- [ ] Cache-Control
- [ ] CORS
  - Origin
  - Same-Origin Policy
  - Preflight Request
- [ ] Idempotency

## 5. Web

### 웹 기초

- [ ] Browser와 Web Server
- [ ] Client와 Server
- [ ] HTML, CSS, JavaScript의 역할
- [ ] DOM
- [ ] Browser Rendering
- [ ] `fetch`
- [ ] JSON
- [ ] Form과 Multipart
- [ ] Web Storage
  - Local Storage
  - Session Storage
- [ ] Cookie 보안 속성
  - HttpOnly
  - Secure
  - SameSite

### API

- [ ] API와 Endpoint
- [ ] REST
  - Resource
  - URI 설계
  - HTTP Method
- [ ] RESTful API
- [ ] Request DTO와 Response DTO
- [ ] Validation
- [ ] Error Response
- [ ] Pagination
  - Offset Pagination
  - Cursor Pagination
- [ ] Sorting과 Filtering
- [ ] API Versioning
- [ ] API Documentation
- [ ] OpenAPI와 Swagger
- [ ] Rate Limiting
- [ ] Webhook
- [ ] WebSocket
- [ ] Server-Sent Events

## 6. Spring

### Spring Core

- [x] [IoC](./Spring/IoC.md)
- [ ] [DI](./Spring/DI.md)
- [x] [Bean](./Spring/Bean.md)
- [ ] Spring Container
- [ ] Bean 등록
  - Component Scan
  - `@Bean`
- [ ] Bean Scope
- [ ] Bean Lifecycle
- [ ] 생성자 주입
- [ ] AOP
- [ ] Proxy
- [ ] Spring Expression Language
- [ ] Spring Event

### Spring MVC

- [ ] DispatcherServlet
- [ ] 요청 처리 흐름
- [ ] `@Controller`와 `@RestController`
- [ ] `@RequestMapping`
- [ ] `@GetMapping`과 `@PostMapping`
- [ ] `@RequestBody`
- [ ] `@RequestParam`
- [ ] `@PathVariable`
- [ ] HttpMessageConverter
- [ ] Jackson
- [ ] Validation
  - `@Valid`
  - Bean Validation
- [ ] Exception Handling
  - `@ExceptionHandler`
  - `@ControllerAdvice`
- [ ] Filter와 Interceptor

## 7. Spring Boot

### 기본 구조

- [ ] Spring과 Spring Boot의 차이
- [ ] Auto Configuration
- [ ] Starter
- [ ] Embedded Server
- [ ] `@SpringBootApplication`
- [ ] Application Context
- [ ] Application Lifecycle

### Configuration

- [ ] YAML
- [ ] `application.yml`
- [ ] `application-{profile}.yml`
- [ ] Externalized Configuration
- [ ] Property 우선순위
- [ ] 환경변수
  - 환경변수가 필요한 이유
  - `${환경변수:기본값}`
  - Secret과 설정 분리
- [ ] Spring Profile
  - local
  - test
  - prod
- [ ] Classpath
- [ ] `src/main/java`
- [ ] `src/main/resources`
- [ ] `@Value`
- [ ] `@ConfigurationProperties`
- [ ] Logging Level
- [ ] Spring Boot Actuator
  - Health Check
  - Metrics

## 8. Database

### 관계형 데이터베이스

- [ ] 관계형 데이터베이스
- [ ] Table, Row, Column
- [ ] Primary Key와 Foreign Key
- [ ] 관계
  - 1:1
  - 1:N
  - N:M
- [ ] 정규화
- [ ] 반정규화
- [ ] 무결성 제약조건
- [ ] Schema

### SQL

- [ ] DDL, DML, DCL, TCL
- [ ] SELECT
- [ ] INSERT, UPDATE, DELETE
- [ ] WHERE
- [ ] JOIN
- [ ] GROUP BY와 HAVING
- [ ] Subquery
- [ ] Aggregate Function
- [ ] Index
  - B-Tree Index
  - Composite Index
  - Selectivity
- [ ] Execution Plan
- [ ] Slow Query

### Transaction

- [ ] ACID
- [ ] Commit과 Rollback
- [ ] Transaction Isolation Level
- [ ] Dirty Read
- [ ] Non-repeatable Read
- [ ] Phantom Read
- [ ] Lock
  - Shared Lock
  - Exclusive Lock
  - Optimistic Lock
  - Pessimistic Lock
- [ ] Deadlock

### JDBC와 Connection

- [ ] JDBC
- [ ] JDBC Driver
- [ ] DataSource
- [ ] Connection Pool
- [ ] HikariCP
- [ ] Prepared Statement
- [ ] SQL Injection

## 9. JPA

- [ ] ORM
- [ ] JPA와 Hibernate
- [ ] Entity
- [ ] Entity Lifecycle
- [ ] Persistence Context
- [ ] EntityManager
- [ ] 1차 Cache
- [ ] Dirty Checking
- [ ] Flush
- [ ] 영속성 전이
- [ ] 연관관계 매핑
  - `@OneToOne`
  - `@OneToMany`
  - `@ManyToOne`
  - `@ManyToMany`
- [ ] 연관관계 주인
- [ ] Lazy Loading과 Eager Loading
- [ ] Proxy
- [ ] Open Session in View
- [ ] JPQL
- [ ] Query Method
- [ ] `@Query`
- [ ] N+1 문제
- [ ] Fetch Join
- [ ] EntityGraph
- [ ] Projection
- [ ] Pagination
- [ ] Auditing
- [ ] `@Transactional`
  - Transaction Boundary
  - `readOnly`
  - 전파
  - 격리 수준
- [ ] Entity와 DTO 분리
- [ ] Database Migration
  - Flyway
  - Liquibase

## 10. Redis와 Messaging

### Redis

- [ ] Redis
- [ ] In-memory Database
- [ ] Key-Value
- [ ] Redis Data Type
  - String
  - Hash
  - List
  - Set
  - Sorted Set
  - Stream
- [ ] TTL과 Expiration
- [ ] Cache
  - Cache Hit와 Cache Miss
  - Cache Aside
  - Write Through
  - Write Back
- [ ] Cache Invalidation
- [ ] Eviction Policy
- [ ] RDB와 AOF
- [ ] 분산 Lock
- [ ] Session과 Token 저장
- [ ] Pub/Sub

### Message Broker

- [ ] Message Queue
- [ ] Producer와 Consumer
- [ ] Kafka
- [ ] RabbitMQ
- [ ] Topic, Partition, Offset
- [ ] Consumer Group
- [ ] Message Ordering
- [ ] 중복 처리와 멱등성
- [ ] At-most-once, At-least-once, Exactly-once
- [ ] Dead Letter Queue

## 11. Security

### 인증과 권한

- [ ] Authentication과 Authorization
- [ ] Password Hashing
  - Salt
  - BCrypt
- [ ] Session 기반 인증
- [ ] Token 기반 인증
- [ ] JWT
  - Header
  - Payload
  - Signature
  - Claim
  - Expiration
- [ ] Access Token과 Refresh Token
- [ ] Token Rotation
- [ ] Logout과 Token 무효화
- [ ] Spring Security
  - SecurityFilterChain
  - Authentication
  - SecurityContext
  - AuthenticationProvider
  - UserDetails
  - 401과 403
- [ ] OAuth 2.0
- [ ] OpenID Connect

### 웹 보안

- [ ] OWASP Top 10
- [ ] OWASP API Security Top 10
- [ ] Broken Access Control
- [ ] Injection
- [ ] XSS
- [ ] CSRF
- [ ] SSRF
- [ ] Security Misconfiguration
- [ ] CORS 설정
- [ ] 입력값 검증
- [ ] Secret 관리
- [ ] 민감 정보 Logging 금지
- [ ] Dependency 취약점
- [ ] Rate Limiting

## 12. Test와 Code Quality

### Test

- [ ] 테스트 목적
- [ ] Unit Test
- [ ] Integration Test
- [ ] End-to-End Test
- [ ] Test Pyramid
- [ ] JUnit
- [ ] JUnit Platform
- [ ] Assertion
- [ ] Test Fixture
- [ ] Test Double
  - Dummy
  - Stub
  - Fake
  - Mock
  - Spy
- [ ] Mockito
- [ ] `@SpringBootTest`
- [ ] Test Slice
  - `@WebMvcTest`
  - `@DataJpaTest`
- [ ] MockMvc
- [ ] RestAssured
- [ ] Testcontainers
- [ ] 테스트용 Database
- [ ] 테스트 격리
- [ ] 테스트 이름과 Given-When-Then

### Code Quality

- [ ] Clean Code
- [ ] Refactoring
- [ ] Code Smell
- [ ] Static Analysis
- [ ] Checkstyle
- [ ] SpotBugs
- [ ] Code Coverage
- [ ] SonarQube
- [ ] Dependency Update

## 13. Architecture

### 애플리케이션 구조

- [ ] Layered Architecture
- [ ] Controller, Service, Repository
- [ ] Domain과 Infrastructure 분리
- [ ] Package 구조
  - Layer 기준
  - Feature 기준
- [ ] Modular Monolith
- [ ] Hexagonal Architecture
- [ ] Clean Architecture
- [ ] Dependency Rule
- [ ] DTO와 Domain Model
- [ ] Design Pattern
  - Strategy
  - Factory
  - Adapter
  - Facade
  - Template Method

### 분산 시스템

- [ ] Monolith와 Microservices
- [ ] Scale Up과 Scale Out
- [ ] Stateless Server
- [ ] Load Balancing
- [ ] CAP Theorem
- [ ] Consistency
  - Strong Consistency
  - Eventual Consistency
- [ ] Timeout
- [ ] Retry와 Exponential Backoff
- [ ] Circuit Breaker
- [ ] Bulkhead
- [ ] Distributed Transaction
- [ ] Saga Pattern
- [ ] Event-driven Architecture
- [ ] Idempotency
- [ ] Distributed Lock

## 14. Linux와 Deployment

### Linux

- [ ] File과 Directory
- [ ] Permission
- [ ] Process
- [ ] Environment Variable
- [ ] Standard Input, Output, Error
- [ ] Pipe와 Redirection
- [ ] Shell
- [ ] SSH
- [ ] Port 확인
- [ ] Process와 Log 확인

### Docker

- [ ] Container와 Virtual Machine
- [ ] Image와 Container
- [ ] Dockerfile
- [ ] Layer
- [ ] Build Context
- [ ] Port Mapping
- [ ] Volume
- [ ] Network
- [ ] Environment Variable
- [ ] Docker Compose
- [ ] Multi-stage Build
- [ ] Container Registry

### CI/CD

- [ ] Continuous Integration
- [ ] Continuous Delivery와 Deployment
- [ ] GitHub Actions
- [ ] Build, Test, Deploy Pipeline
- [ ] Artifact
- [ ] Environment
  - Development
  - Staging
  - Production
- [ ] Rolling Deployment
- [ ] Blue-Green Deployment
- [ ] Canary Deployment
- [ ] Rollback

### Cloud

- [ ] Cloud 기본 개념
- [ ] Region과 Availability Zone
- [ ] Virtual Machine
- [ ] VPC
- [ ] Subnet
- [ ] Security Group
- [ ] Load Balancer
- [ ] Managed Database
- [ ] Object Storage
- [ ] DNS
- [ ] CDN
- [ ] IAM
- [ ] Kubernetes 기초
  - Pod
  - Deployment
  - Service
  - Ingress
  - ConfigMap
  - Secret

## 15. Observability와 Performance

### Observability

- [ ] Logging
  - Log Level
  - Structured Logging
  - Correlation ID
  - 개인정보와 Secret 제외
- [ ] Metrics
  - Request Count
  - Error Rate
  - Latency
  - CPU와 Memory
- [ ] Trace
- [ ] Log, Metric, Trace의 차이
- [ ] OpenTelemetry
- [ ] Health Check
- [ ] Alert
- [ ] SLI, SLO, SLA

### Performance

- [ ] Latency와 Throughput
- [ ] Bottleneck
- [ ] Profiling
- [ ] Benchmark
- [ ] Load Test
- [ ] Stress Test
- [ ] Connection Pool
- [ ] Thread Pool
- [ ] Database Query 최적화
- [ ] Cache
- [ ] JVM Memory와 GC 확인

## 16. 협업

- [ ] 요구사항 분석
- [ ] API 명세
- [ ] ERD
- [ ] Issue 작성
- [ ] 작업 단위 나누기
- [ ] Branch 전략
- [ ] Commit 단위
- [ ] Pull Request
- [ ] Code Review
- [ ] 기술 선택 기록
- [ ] 장애 기록
- [ ] 문서화

## 참고 문서

- [Java Documentation](https://dev.java/learn/)
- [Spring Boot Reference](https://docs.spring.io/spring-boot/reference/)
- [Spring Data JPA Reference](https://docs.spring.io/spring-data/jpa/reference/)
- [Gradle User Manual](https://docs.gradle.org/current/userguide/)
- [MDN Web Docs](https://developer.mozilla.org/)
- [MariaDB Documentation](https://mariadb.com/docs/)
- [Redis Documentation](https://redis.io/docs/latest/)
- [Git Book](https://git-scm.com/book/en/v2)
- [Docker Documentation](https://docs.docker.com/)
- [OWASP Top 10](https://owasp.org/Top10/)
- [OWASP API Security](https://owasp.org/www-project-api-security/)
- [OpenTelemetry Documentation](https://opentelemetry.io/docs/)
- [Kubernetes Documentation](https://kubernetes.io/docs/)
