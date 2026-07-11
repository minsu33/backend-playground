public class MemberMain {

    public static void main(String[] args) {
        Member member1 = new Member("홍길동", "hong@example.com", 22);
        Member member2 = new Member("철수", "chulsoo@example.com", 20);
        Member member3 = new Member();
        Member member4 = new Member("영희", "younghee@example.com");

        printMember(member1);
        printMember(member2);
        printMember(member3);
        printMember(member4);
    }

    private static void printMember(Member member) {
        System.out.println("이름: " + member.name);
        System.out.println("이메일: " + member.email);
        System.out.println("나이: " + member.age);
        System.out.println();
    }
}
