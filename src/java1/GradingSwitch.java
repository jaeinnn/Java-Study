package java1;
import java.util.Scanner;

/*
예제 2-14
예제 2-12의 학점 매기는 코드를 swtich문으로 다시 작성하라
 */

public class GradingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char grade;
        System.out.print("점수를 입력하세요(0~100): ");
        int score = scanner.nextInt();
        switch (score/10){
            case 10: //score = 100
            case 9: // score = 90~99
                grade = 'A'; //case 10, case9 의 경우 모두 실행
                break;
            case 8: //score는 80~89
                grade = 'B';
                break;
            case 7: //score는 70~79
                grade = 'C';
                break;
            case 6: //score는 60~69
                grade = 'D';
                break;
            default: //score는 59 이하
                grade = 'F';
        }
        System.out.println("학점은 " + grade + "입니다");
    }
}
