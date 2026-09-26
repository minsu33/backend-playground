package operator;

public class Operator4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3); // sum3 과 같다.
        // 하지만 괄호를 명시적으로 사용하면 가독성차원에서 좋다

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

    }
}
