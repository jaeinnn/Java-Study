package java1;

class TimerThread extends Thread{ //스레드 클래스 정의

    int n = 0;

    @Override
    public void run(){ //스레드 코드 작성
        //1초에 한 번씩 n을 증가시켜 콘솔에 출력한다
        while(true){
            System.out.println(n);
            n++;
            try{
                sleep(1000); //1초동안 잠을 잔 후 깨어난다
            }catch(InterruptedException e){
                return;
            }
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        TimerThread th = new TimerThread(); //스레드 객체 생성
        th.start(); //스레드 시작
    }
}
