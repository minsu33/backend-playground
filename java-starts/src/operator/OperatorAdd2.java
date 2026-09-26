package operator;

public class OperatorAdd2 {

    static void main() {

        int a = 1;
        int b = 0;

        b = ++a; //a의 값을 먼저 증가시키고, 그 결과를 b에 넣어라
        System.out.println("a = " + a + ", b = " + b);
        // a = 2, b = 2

        a = 1;
        b = 0;

        b = a++; // a의 값을 b에 대입하고, 그 이후 a값을 증감시킨다
        System.out.println("a = " + a + ", b = " + b);
        // a = 2, b = 1
    }
}