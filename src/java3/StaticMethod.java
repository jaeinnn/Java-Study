package java3;

/**
 * static메소드는 static멤버만 접근할 수 있다

 static메소드는 객체 없이도 조재하기 때문에 객체와 함께 생성되는
 non-static멤버를 사용할 수 없고 static 멤버들만 사용 가능하다
 반면 non-static메소드는 static 멤버들을 사용할 수 있다
 */

public class StaticMethod {

    int n;

    void f1(int x){ n = x; } //정상
    void f2(int x){ n = x; } //정상

    static int m ;
    static void s1(int x) { n = x ; } //컴파일 오류 : static 메소드는 non-static필드 사용 불가
    static void s2(int x) { f1(3);} //컴파일 오류 : static 메소드는 non-static 메소드 사용 불가

    static void s3(int x) { m = x; } // 정상 : static 메소드는 static 필드 사용 가능
    static void s4(int x) { s3(3); } // 정상 : static 메소드는 static 메소드 호출 가능

}
