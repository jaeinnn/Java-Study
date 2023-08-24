package java3;

final class FinalClass { //이 클래스는 상속 불가

    /**
     final이 클래스 이름 앞에 사용되면 클래스를 상속받을 수 없음을 지정한다
     */

}

class SubClass extends FinalClass{ //컴파일 오류 발생. FinalClass 상속 불가

}
