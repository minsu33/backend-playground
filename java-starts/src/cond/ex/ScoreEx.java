package cond.ex;

// 문제 1 학점 계싼하기
// 학생 점수 기반 학점 출력하는 프로그램작성
// 90 이상 A, 80이상, 90미만 B ~~~~
// 변수명은 int score로 지정

public class ScoreEx {

    public static void main(String[] args) {

        int score = 20;
        String grade;

        if (score >= 90) {
            grade = "A";
            System.out.println("학점은 " + grade + "입니다");
        } else if (score >= 80 ) {
            grade = "B";
            System.out.println("학점은 " + grade + "입니다");
        } else if (score >= 70 ) {
            grade = "C";
            System.out.println("학점은 " + grade + "입니다");
        } else if (score >= 60 ) {
            grade = "D";
            System.out.println("학점은 " + grade + "입니다");
        } else {
            grade = "F";
            System.out.println("학점은 " + grade + "입니다");
        }

    }
}
