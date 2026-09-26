package variable;

public class Var6 {
    public static void main(String[] args) {
//        int a;
        int a = 1;
        System.out.println(a);
        // 변수를 선언하고 초기화 하지않는다면 오류 발생
        // java: variable a might not have been initialized
        // 현재 배우는 변수는 지역변수이고 컴파일 오류이다.
        // 번외) 컴파일 오류는 즉각적으로 발견하고 해결할수있기에 좋은 버그이다
    }
}
