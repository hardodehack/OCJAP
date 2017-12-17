package Threads.NotifyWait;

public class Notifier {

    private MessageResource messageResource;

    Notifier(MessageResource mess){
        this.messageResource = mess;
    }

    Runnable r1 = ()-> {
        System.out.println(Thread.currentThread().getName()+" "+" Starting a Thread");

        synchronized (messageResource) {
            System.out.println("Notifier Started.......");

            try {
                Thread.sleep(2000);

                messageResource.notify();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+" "+" Notifier Ended");
        }



    };


}
