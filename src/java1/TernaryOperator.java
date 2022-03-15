package java1;/*
예제 2-8
조건 연산자는 3개의 피연산자로 구성되어 삼항(ternary) 연산자라고도 하며 형식은 다음과 같다
condition ? opr2 : opr3
 */

public class TernaryOperator {
    public static void main(String[] args) {
        int a  = 3, b = 5;
        System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));
    }
}
