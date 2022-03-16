package java1;

/*
예제 5-2

Person클래스의 private 필드인 weight은 Student 클래스에서는
접근이 불가능하여 슈퍼클래스인 Person의 get,set메소드를 통해서만 조작이 가능
 */

public class InheritanceEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.set();
    }
}
