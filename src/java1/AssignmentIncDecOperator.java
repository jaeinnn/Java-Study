package java1;

/*
예제 2-6
대입 연산자와 증감 연산자를 활용하는 사례
 */
public class AssignmentIncDecOperator {
    public static void main(String[] args) {
        int a=3,b=3,c=3;
        //대입 연산자 사례
        a += 3; //a=a+3 = 6
        b *= 3; //b=b*3 = 9
        c %= 2; //c=c%2 = 1
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);

        int d=3;
        //증감 연산자 사례
        a = d++; //a=3, d=4
        System.out.println("a=" + a + ", d=" + d);
        a = ++d; //d=5, a=5
        System.out.println("a=" + a + ", d=" + d);
        a = d--; //a=, d=4
        System.out.println("a=" + a + ", d=" + d);
        a = --d; //d=3, a=3
        System.out.println("a=" + a + ", d=" + d);
    }
}