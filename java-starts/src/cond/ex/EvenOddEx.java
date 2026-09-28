package cond.ex;
// 문제 7
// 홀수 짝수 찾기
// x가 주어지면 x가 짝수이면 "짝수" 홀수이면 "홀수"라 출력하는 프로그램. 삼항연산자 사용


public class EvenOddEx {

    public static void main(String[] args) {

        int x = 100;

        String result = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + ", " + result);

    }
}
