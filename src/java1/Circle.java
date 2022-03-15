package java1;
/*
예제 4-1
반지름과 이름을 가진 Circle 클래스를 작성하고, Circle 클래스의 객체를 생성하라
 */

/*
예제 4-3
 */

public class Circle {
    int radius; //원의 반지름 필드
    String name; //원의 이름 필드

    //생성자 이름은 클래스 이름과 동일하다
    public Circle() { //매개변수 없는 생성자
        radius = 1; name = ""; //필드 초기화
    }
    /*
    객체가 생성될 때 필드를 초기화하거나 생성 당시에 꼭 필요한 작업을 위해 두는 것이 생성자
     */

    //생성자는 리턴 타입이 없다
    public Circle(int r, String n){ //매개변수를 가진 생성자
        radius = r; name = n; //매개변수로 필드를 초기화. 생성자는 radius와 name 필드 초기화
    }

    public Circle(int radius){
        this.radius = radius;
    }


    public double getArea(){ //원의 면적 계산 메소드
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        Circle pizza = new Circle(10,"자바피자"); //객체 생성. 반지름을 10으로, 이름을 "자바피자"로 초기화

        double area = pizza.getArea(); //피자의 면적 알아내기
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle(); //객체 생성. 반지름을 1, 이름을 ""로 초기화
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}