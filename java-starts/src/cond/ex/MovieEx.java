package cond.ex;
// 문제 4
// 평점에 따른 영화 추천하기 
// 요청한 평점 이상의 영화를 추천하는 프로그램을 작성
// 어바웃타임 - 평점 9
// 토이 스토리 - 평점 8
// 고질라 - 평점 7

public class MovieEx {

    public static void main(String[] args) {
        
        double rating = 7.9;
        
        if (rating <= 9) {
            System.out.println("'어바웃타임' 을 추천합니다");
        }
        if (rating <= 8) {
            System.out.println("'토이스토리' 을 추천합니다");
        }
        if (rating <= 7) {
            System.out.println("'고질라' 을 추천합니다");
        }

    }
}
