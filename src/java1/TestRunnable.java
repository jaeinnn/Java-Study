package java1;

class TimerRunnable implements Runnable{

    int n = 0;

    @Override
    public void run() {
        while(true){
            System.out.println(n);
            n++;
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                return;
            }
        }
    }
}

public class TestRunnable {
    public static void main(String[] args) {
        Thread th = new Thread(new TimerRunnable());
        th.start();
    }
}

/*
th.start()는 생성된 스레드 객체 th를
스케줄링이 가능한 상태로 전환하도록 JVM에게 지시한다
이후 JVM에 의해 이 스레드가 선택되면 이 스레드의
run()메소드가 호출되고 실행된다
 */