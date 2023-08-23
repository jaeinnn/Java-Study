package java3;

/**
 * static메소드는 this를 사용할 수 없다
 :  static 메소드는 객체 없이도 존재하기 때문에 this를 사용할 수 없다
 */

public class StaticAndThis {

    int n;
    static int m ;
    void f1(int x) {this.n = x; }
    void f2(int x) {this.m = x; } //non-static 메소드에서는 static 멤버 접근 가능

    static void s1(int x) {this.n = x;} //컴파일 오류 : static메소드는 this 사용 불가
    static void s2(int x) {this.m = x;} //컴파일 오류 : static메소드는 this 사용 불가

}
