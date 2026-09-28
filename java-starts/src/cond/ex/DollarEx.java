package cond.ex;
// 문제 3 환율 계산하기
// 특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램 환율은 1달러당 1300원이라고 가정
// 달러가 0 미만이면, "잘못된 금액입니다"
// 달러가 0일때 "환전할 금액이 없습니다"
// 달러가 0 초과일때 "환전금액은 00 원입니다.

public class DollarEx {

    public static void main(String[] args) {
        int dollar = 100;
        int won;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다");
        } else {
            won = 1300 * dollar;
            System.out.println("환전금액은 " + won + "입니다");
        }

    }
}
