package java3;

/**
 * 조건 연산
:조건 연산자는 3개의 피연산자로 구성되어 삼항(ternary)연산자라고도 하며 형식은 다음과 같다
 condition ? opr2 : opr3
 조건문(condition)이 true면 식의 결과값은 opr2의 값이 되고, false면 opr3의 값이 된다
 opr2나 opr3은 식이 될 수도 있고 값이 될 수도 있다
 */

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3 , b = 5;

        System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));
    }
}
