package java3;

public class FinalFieldClass {

    //final로 필드를 선언하면 필드는 상수가 된다
    final int ROWS = 10; //상수 선언. 초기값 10 지정

    void f(){
        int[] intArray = new int[ROWS]; //상수 활용
        ROWS = 30; //컴파일 오류. final 필드값은 변경할 수 없다
    }

}

/**
 상수 필드는 한 번 초기화하면 값을 변경할 수 없다. final 키워드를 public static과 함께
 선언하면 프로그램 전체에서 사용할 수 있는 상수가 된다.
 */
