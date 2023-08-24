package java3;

public class SuperClass {
    protected final int finalMethod(){ //finalMethod()는 자식이 오버라이딩 불가
        return 0;
    }
}

class subClass extends SuperClass{ //subClass가 SuperClass 상속
    protected int finalMethod(){} //컴파일오류 : finalMethod() 오버라이딩 안 됨

}
