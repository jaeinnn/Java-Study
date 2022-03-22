package java1;
import java.awt.*;
import javax.swing.*;

/*
예제 13-2
Runnable 이넡페이스를 구현하여 1초 단위로
카운팅하여 출력하는 스레드를 만들고,
레이블을 이용하여 카운트 값을 출력하라
 */

class TimerRunnable2 implements Runnable{

    private JLabel timerLabel; //타이머 값이 출력된 레이블

    public TimerRunnable2(JLabel timerLabel){
        this.timerLabel = timerLabel; //초 카운트를 출력할 레이브르
    }

    //스레드 코드. run()이 종료하면 스레드 종료
    @Override
    public void run() {
        int n = 0; //타이머 카운트 값
        while(true){
            while(true){
                timerLabel.setText(Integer.toString(n));
                n++;
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    return;
                }
            }
        }
    }
}

public class RunnableTimerEx extends JFrame {
    public RunnableTimerEx(){
        setTitle("Runnable을 구현한 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
        c.add(timerLabel); //레이블을 컨텐트팬에 부착

        TimerRunnable2 runnable = new TimerRunnable2(timerLabel);
        Thread th = new Thread(runnable);

        setSize(250,150);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new RunnableTimerEx();
    }
}