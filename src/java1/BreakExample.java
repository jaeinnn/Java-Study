package java1;
import java.util.Scanner;

/*
예제 3-6
"exit"이 입력되면 while문을 벗어나도록 break문을 활용하는 프로그램을 작성하라
 */

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exix을 입력하면 종료합니다.");
        while(true){
            System.out.print(">>");
            String text = scanner.nextLine(); //한 라인 읽기
            if(text.equals("exit")) //"exit"이 입력되면 반복 종료
                break; //while문을 벗어남
        }
        System.out.println("종료합니다...");
        scanner.close();
    }
}

/*
문자열 비교시 equals()를 사용해야 하는데 문자열이 같으면 equals()는 true를 리턴한다
 */
