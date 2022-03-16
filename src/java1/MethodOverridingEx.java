package java1;
/*
예제 5-5
*/

class Shape{ //슈퍼클래스
    public Shape next;
    public Shape(){ next = null; }

    public void draw(){
        System.out.println("Shape");
    }
}

class Line extends Shape{
    public void draw(){
        System.out.println("Line");
    }
}

class Rect extends Shape{
    public void draw(){
        System.out.println("Rect");
    }
}

class Circle2 extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}

public class MethodOverridingEx {

    //shape를 상속받은 모든 객체들이 매개변수 p로 넘어올 수 있음
    static void paint(Shape p){
        p.draw(); //p가 가리키는 객체 내에 오버라이딩된 draw() 호출. 동적 바인딩
    }

    public static void main(String[] args) {
        Line line = new Line();

        //다음 호출들은 모두 paint() 메소드 내에서 Shape에 대한 레퍼런스 p로 업캐스팅됨
        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle2());
    }
}
