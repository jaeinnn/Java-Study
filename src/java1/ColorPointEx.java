package java1;

/*
예제 5-1
 */
public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point(); //Point 객체 생성
        p.set(1,2); //Point클래스의 set()호출
        p.showPoint();

        ColorPoint cp = new ColorPoint(); //ColorPoint 객체 생성
        cp.set(3,4); //Point클래스의 set() 호출
        cp.setColor("red");
        cp.showColorPoint(); //컬러와 좌표 출력
    }
}

