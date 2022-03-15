package java1;

/*
예제3-3
do-while문을 이용하여 'a'부터 'z'까지 출력하는 프로그램을 작성하라
 */

public class DoWhileSample {
    public static void main(String[] args) {

        char c = 'a';

        do{
            System.out.print(c);
            c = (char) (c+1); // 영문의 경우 1을 더하면 다음 문자의 코드 값
        }while (c <= 'z');
    }
}
