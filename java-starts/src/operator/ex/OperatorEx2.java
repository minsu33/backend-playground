package operator.ex;

//문제 2 - double과 평균
// 1. val1, val2, val3을 double 변수로 선언하고 그 합과 평균을 출력하시오:
// 2. 변수 값은 각각 1.5, 2.5. 3.5
public class OperatorEx2 {

    public static void main(String[] args) {

        double var1 = 1.5;
        double var2 = 2.5;
        double var3 = 3.5;

        double sum = var1 + var2 + var3;
        double average = sum / 3;

        System.out.println("sum: " + sum + ", average: " + average);
    }
}
