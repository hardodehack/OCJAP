package threads;

import java.util.Timer;
import java.util.TimerTask;

class TimeTaskerToRun extends TimerTask{

    @Override
    public void run() {
        System.out.println("Printed At :- "+System.currentTimeMillis());
    };
}

public class TimerTask_Thread{

    public static void main(String[] args) throws InterruptedException {

        TimeTaskerToRun timeTasker  = new TimeTaskerToRun();

        TimerTask tt = new TimeTaskerToRun();


        // Timer timer = new Timer(true);       // Here timer will be considered as Deamon Thread.
        Timer timer = new Timer();

        timer.schedule(timeTasker,1000,2000);

        Thread.sleep(20000);

        // Canceling a timer otherwise it will go in INFINITE Loop.........
        timer.cancel();
    }

}

