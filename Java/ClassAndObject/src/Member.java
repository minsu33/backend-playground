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
        this.name = "이름 없음";
        this.email = "이메일 없음"; 
        this.age = 0;
    }
    
    public Member(String name, String email) {
        this.name = name;
        this.email = email;
        this.age = 0;
    }
}
