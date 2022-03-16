package java1;

/*
예제 5-8
 */
class SamsungPhone implements PhoneInterface {

    //PhoneInterface의 모든 추상메소드 구현
    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    //메소드 추가 작성
    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}