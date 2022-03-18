package java1;
import java.util.Vector;

/*
예제 7-2
점(x,y)를 표현하는 Point3클래스를 만들고, Point의 객체만 다루는 벡터를 작성하라
 */

public class PointVectorEx {
    public static void main(String[] args) {
        Vector<Point3> v = new Vector<>();

        //3개의 Point3 객체 삽입
        v.add(new Point3(2,3));
        v.add(new Point3(-5,20));
        v.add(new Point3(30,-8));

        v.remove(1);

        for(int i=0; i<v.size(); i++){
            Point3 p = v.get(i);
            System.out.println(p);
        }
    }
}