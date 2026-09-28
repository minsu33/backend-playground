package cond.ex;
// 문제 6
// 더 큰 숫자 찾기
// 변수 a, b가 갖고있다, a가 10이고 b 가 20이다. 삼항 연산자를 사용하여
// 더 큰 숫자를 출력하는 코드를 작성하자

public class MaxEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println("더 큰 숫자는 " + max + "입니다");

    }
}
