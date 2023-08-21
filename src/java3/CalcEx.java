package java3;

/**
 static 멤버는 객체를 생성하지 않고도 사용할 수 있는 멤버이다.
 static 멤버는 클래스당 하나만 생성되는 멤버로서 동일한 클래스의 모든 객체들이 공유한다
 그리고 main()메소드가 실행되기 전에 이미 생성된다
 static 멤버는 static 멤버가 포함된 객체를 생성하기 전에도 사용할 수 있다

 non-static 멤버는 객체가 생길 때 객체마다 생기며, 다른 객체들과 공유하지 않는다
 객체가 사라지면 non-static 멤버도 함께 사라지고 더이상 접근할 수 없다

 static 멤버는 클래스당 하나씩 생긴다고 해서 클래스 멤버라고도 부르며,
 non-static 멤버는 각 객체마다 하나씩 생긴다고 해서 인스턴스 멤버라고 부른다


 */

    class Calc{
        public static int abc(int a){return a>0?a:-a;}
        public static int max(int a,int b) {return (a>b)?a:b;}
        public static int min(int a, int b){return (a>b)?b:a;}
    }
    
public class CalcEx {
    public static void main(String[] args) {
        System.out.println(Calc.abc(-5));
        System.out.println(Calc.max(10,8));
        System.out.println(Calc.min(-3,-8));
    }
}
