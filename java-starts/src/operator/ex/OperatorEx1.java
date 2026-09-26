package operator.ex;

// 문제1 - int와 평균
// 1. num1, num2, num2라는 이름의 세 개의 int 변수를 선언하고 각각 10, 20 , 30 으로 초기화
// 2. 세 변수의 합을 계산하고 , 그 결과를 sum이라는 이름의 int 변수에 저장하세요
// 3. 세 변수의 평균을 구하고 , 그 결과를 average라는 이름의 int 변수에 저, 소수점 이하는 버림
// 4. sum 과 average변수의 값을 출력해라
public class OperatorEx1 {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println("sum: " + sum + ", average: " + average);

    }
}
