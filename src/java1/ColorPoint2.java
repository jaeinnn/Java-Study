package java1;

class ColorPoint2 extends Point2 { // Point2를 상속받은 ColorPoint2 선언
    private String color; //점의 색

   public ColorPoint2(int x, int y, String color){
       super(x,y); //Point2의 생성자 Point(x,y) 호출
       this.color = color;
   }

    public void showColorPoint() { //컬러 점의 좌표 출력
        System.out.print(color);
        showPoint(); //Point 클래스의 showPoint() 호출
    }
}