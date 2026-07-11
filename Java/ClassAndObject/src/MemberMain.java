public class MemberMain {

    public static void main(String[] args) {
        Member member1 = new Member("홍길동", "hong@example.com", 22);
        // member1.name = "홍길동";
        // member1.email = "hong@example.com";
        // member1.age = 22;

        Member member2 = new Member("철수", "chulsoo@example.com", 20 );
        // member2.name = "철수";
        // member2.email = "chulsoo@example.com";
        // member2.age = 20;

        Member member3 = new Member();
        printMember(member1);
        printMember(member2);
        printMember(member3);
    }

    private static void printMember(Member member) {
        System.out.println("이름: " + member.name);
        System.out.println("이메일: " + member.email);
        System.out.println("나이: " + member.age);
        System.out.println();
    }
}
