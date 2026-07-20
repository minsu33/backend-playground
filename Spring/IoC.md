# IoC (Inversion of Control)

> 제어의 역전 (Inversion of Control)

---

# 한 줄 정의

객체의 생성과 생명주기 관리를 개발자가 아닌 Spring Container가 담당함.

---

# 왜 필요한가?

- 객체 생성과 관리를 Spring이 대신 수행한다.
- 객체 간의 결합도를 낮출 수 있다.
- 유지보수와 테스트가 쉬워진다.

---

# 핵심 포인트

- 개발자가 직접 `new`로 객체를 생성하지 않는다.
- Spring Container가 객체를 생성하고 관리한다.
- 필요한 곳에 객체를 제공한다.

---

# Spring 사용 전

개발자가 new 연산자로 직접 객체를 생성해야함.

```java
public class AdderTest {

    private Adder adder = new Adder();

    public void add() {
        adder.add(1, 2);
    }

}
```

---

# Spring 사용

Spring이 객체를 생성하고 관리한다.

```java
@Service
public class Adder {

    public int add(int a, int b) {
        return a + b;
    }

}
```

```java
@Service
public class AdderTest {

    private final Adder adder;

    public AdderTest(Adder adder) {
        this.adder = adder;
    }

    public void add() {
        adder.add(1, 2);
    }

}
```

`Adder` 객체는 Spring Container가 생성하고 `AdderTest`에 전달한다.

---

# 장점

- 객체 생성 코드를 줄일 수 있다.
- 객체 관리가 일관된다.
- 코드의 재사용성이 높아진다.
- 테스트가 쉬워진다.
- 유지보수가 편리하다.

---

# 참고 자료

- 멋쟁이사자처럼 14기 백엔드 1주차 세션
- Spring 공식 문서
