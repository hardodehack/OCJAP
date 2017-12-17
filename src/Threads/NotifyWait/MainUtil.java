package Threads.NotifyWait;

public class MainUtil {


    public static void main(String[] args) {
        MessageResource messageResource = new MessageResource("New Message from Main Starting...");

        Waiter waiter1 = new Waiter(messageResource);

        new Thread(waiter1.r2,"waiter1").start();


        Waiter waiter2 = new Waiter(messageResource);

        new Thread(waiter2.r2,"waiter2").start();


        Notifier notifier = new Notifier(messageResource);

        new Thread(notifier.r1,"Notifier").start();


        System.out.println("All Thread Ended............");

    }

}
