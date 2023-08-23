package java3;

public class Ex {

    public static void main(String[] args) {

        StaticSample.m = 10; //클래스명.static멤버로 호출
        StaticSample.f();

        StaticSample s1;
        s1 = new StaticSample();
        System.out.println(s1.m);
        s1.f(); //객체 레퍼런스로 static 멤버 f() 호출
        StaticSample.f(); //클래스명을 이용하여 static 멤버 f() 호출

        //h(),G()는 non-static메소드이므로 클래스 이름으로 접근할 수 없다
//        StaticSample.h();
//        StaticSample.g();

    }
}

/**
 실제 static 멤버의 생성 시점은 자바 가상 기계에 따라 다를 수 있다.
 그러나 일반적으로 static멤버가 포함된 클래스가 로딩될 때 static 멤버의 메모리가 할당된다
 PC처럼 메모리가 풍부한 컴퓨터에서 자바 가상 기계는 처음부터 대부분의 클래스를 로딩하기 때문에
 static 멤버의 생성시점은 자바 가상 기계가 시작되는 시점이라고 할 수 있다
 */

/**
 자바에서는 캡슐화의 원칙 때문에 어떤 변수나 함수도 클래스 바깥에 존재할 수 없으며 클래스의 멤버로 존재해야 한다
 한편, 응용프로그램 작성시에 모든 클래스에서 공유하는 전역 변수(global variable)나 모든 클래스에서 호출할 수 있는
 전역 함수(global function)가 필요한 경우가 있다. static은 이런 문제에 대한 해결책이다.
 static 멤버를 가진 대표적인 클래스로는 java.lang.Math 클래스가 있다
 */
