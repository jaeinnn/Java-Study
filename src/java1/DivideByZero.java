package java1;
import java.util.Scanner;

/*
예제 3-14
두 정수를 입력받아 나눗셈을 하고 몫을 구하는 프로그램 코드이다
사용자가 나 누는 수에 0을 입력하면 ArithmeticException예외가 발생하여
프로그램이 강제 종료된다
 */

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend; //나뉨수
        int divisor; //나눗수

        System.out.print("나뉨수를 입력하시오:");
        dividend = scanner.nextInt(); //나뉨수 입력
        System.out.print("나눗수를 입력하시오:");
        divisor = scanner.nextInt(); //나눗수 입력
        System.out.println(dividend+"를 "+ divisor+"로 나누면 몫은 "
                + dividend/divisor + "입니다.");
        scanner.close();
    }
}
