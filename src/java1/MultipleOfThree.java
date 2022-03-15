package java1;

import java.util.Scanner;
/*
예제 2-11
입력된 수가 3의 배수인지 판별하는 프로그램을 작성하라
 */
public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("수를 입력하시오: ");
        int number = scanner.nextInt(); //정수를 입력받는다
        if(number %3 == 0) //3으로 나눈 나머지가 0인지 검사
            System.out.println("3의 배수입니다.");
        else
            System.out.println("3의 배수가 아닙니다");
        scanner.close();
    }
}