# 클래스와 객체

## 클래스(Class)

클래스는 객체를 만들기 위한 설계도이다.
객체가 가질 데이터는 필드로 선언하고, 객체가 할 수 있는 동작은 메서드로 작성한다.

현재 예제의 `Member` 클래스에는 이름, 이메일, 나이가 들어 있다.

```java
public class Member {
    // 필드
    String name;
    String email;
    int age;
}
```

## 객체(Object)

`new`를 사용하면 클래스를 바탕으로 객체를 만들 수 있다.
같은 클래스로 만든 객체라도 각자 다른 값을 가질 수 있다.

```java
Member member1 = new Member();
Member member2 = new Member();
```

## 생성자(Constructor)

생성자는 객체가 생성될 때 호출되어 객체의 초기 상태를 설정한다.
생성자의 이름은 클래스 이름과 같고, 반환 타입을 작성하지 않는다.

```java
public class Member {
    String name;
    String email;
    int age;

    // 생성자
    public Member(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
```

### 생성자 사용 이유

- 객체 생성과 초기화를 한 번에 처리한다.
- 필요한 값이 빠지는 것을 방지한다.
- 객체 생성 코드가 짧아지고 읽기 쉬워진다.

## this

`this`는 현재 객체 자신을 가리키는 참조 변수이다.

```java
public class Member {
    String name;
    String email;
    int age;
    public Member(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
```

- `this.name`: 현재 객체의 `name` 필드
- `name`: 생성자로 전달받은 매개변수

`this.name = name`은 생성자로 전달받은 `name`을 현재 객체의 `name` 필드에 저장한다는 뜻이다.

### this 사용 이유

- `this`를 사용하지 않고 `name = name`이라고 작성하면 양쪽의 `name`이 모두 매개변수를 뜻한다.

## this()

`this()`는 같은 클래스에 있는 다른 생성자를 호출할 때 사용한다.
생성자의 첫 번째 줄에서만 사용할 수 있다.

```java
Member() {
    this("이름 없음", "이메일 없음", 0);
}

Member(String name, String email, int age) {
    this.name = name;
    this.email = email;
    this.age = age;
}
```

`new Member()`를 실행하면 `name`은 `"이름 없음"`, `email`은 `"이메일 없음"`, `age`는 `0`으로 초기화된다.

### this() 사용 이유

- 생성자의 코드 중복을 줄인다

## 생성자 오버로딩(Constructor Overloading)

한 클래스 안에 매개변수가 다른 생성자를 여러 개 만드는 것이다.

```java
public class Member {

    String name;
    String email;
    int age;

    Member() {
        this("이름 없음", "이메일 없음", 0);
    }

    Member(String name, String email) {
        this(name, email, 0);
    }

    Member(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
```

## 예제 실행

```bash
cd src
javac Member.java MemberMain.java
java MemberMain
```

예제에서는 여러 생성자로 회원 객체를 만들고 각 객체의 값을 출력한다.

## 정리

- 클래스는 객체 자체가 아니라 객체를 만들기 위한 틀이다.
- 참조 변수에는 객체 자체가 아니라 객체를 가리키는 참조값이 들어 있다.
- 같은 객체를 두 변수가 가리킬 수도 있다.
