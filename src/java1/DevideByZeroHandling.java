package java1;
import java.util.Scanner;

/*
예제 3-15
try-catch 블록을 이용하여 예쩨 3-14를 수정하여, 정수를 0으로 나누는 경우에
"0으로 나눌 수 없습니다!"를 출력하고 다시 입력받는 프로그램을 작성하라
 */

public class DevideByZeroHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.print("나뉨수를 입력하시오:");
            int dividend = scanner.nextInt(); //나뉨수 입력
            System.out.print("나눗수를 입력하시오:");
            int divisor = scanner.nextInt(); //나눗수 입력
            try {
                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 "
                        + dividend / divisor + "입니다.");
                break; //정상적인 나누기 완료 후 while 벗어나기
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
            }
        }
            scanner.close();
    }
}