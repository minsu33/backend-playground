public class Member {

    String name;
    String email;
    int age;

    public Member(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Member() {
        this("이름 없음", "이메일 없음", 0);
    }

    public Member(String name, String email) {
        this(name, email, 0);
    }
}
