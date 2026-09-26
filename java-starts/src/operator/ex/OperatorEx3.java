package operator.ex;

// 문제3 - 합격 범위

//1. int형 변수 score 선언
//2. score가 80점 이상이고 100점 이하면 true 출력하고 아니면 false 출력

public class OperatorEx3 {

    public static void main(String[] args) {
        int score = 80;
        boolean result = 80 <= score && score <= 100;
        System.out.println(result);
    }
}
