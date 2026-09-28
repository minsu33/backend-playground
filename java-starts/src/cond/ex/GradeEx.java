package cond.ex;
// 문제 5
// 학점에 따른 성취도 출력하기
// String grade 문자열을 만들고 학점에 따라 성취도를 출력하는 프로그램을 작성

public class GradeEx {

    public static void main(String[] args) {
        String grade = "C";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다");
                break;
            case "B":
                System.out.println("좋은 성과입니다");
                break;
            case "C":
                System.out.println("준수한 성과입니다");
                break;
            case "D":
                System.out.println("노력 해야합니다");
                break;
            case "F":
                System.out.println("불합격입니다");
                break;
            default:
                System.out.println("잘못된 학점입니다");
                break;
        }

    }
}
