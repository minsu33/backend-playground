package assignment01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner을 사용하기 위해 호출
        StudentManage sm = new StudentManage(); // StudentMange에서 만든 메서드를 사용하기 위해 호출
        boolean running = true;

        while (running) {

            System.out.println("1. 추가 2. 조회 3. 삭제 4. 점수 입력 5. 종료");
            int num = sc.nextInt(); // nextInt는 숫자 부분만 읽기에 \n이은 버퍼로 남아있음
            sc.nextLine(); // nextLine으로 대신 읽고 버려줌


            switch (num){
                case 1: // 학생 추가
                    System.out.print("학생 이름: ");
                    String name = sc.nextLine();
                    System.out.print("학번: ");
                    String studentId = sc.nextLine();
                    Student newStudent = new Student(name, studentId);
                    sm.addStudent(newStudent);
                    break;
                case 2: // 학생 조회
                    break;

                case 3: // 학생 삭제
                    System.out.println("삭제할 학번: ");
                    String targetId = sc.nextLine();
                    Student found = sm.findStudent(targetId);
                    if (found != null) {
                        sm.deleteStudent(found);
                    } else {
                        System.out.println("삭제할 학생이 없습니다.");
                    }

                    break;
                case 4: // 점수 입력
                    break;

                case 5: // 종료
                    System.out.println("시스템을 종료합니다.");
                    condition = false; // boolean flag을 통해 반복문 탈출
            }
        }

    }
}
