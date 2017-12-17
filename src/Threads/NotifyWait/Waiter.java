package Threads.NotifyWait;

public class Waiter {

    private MessageResource messageResource;

    Waiter(MessageResource mess){
        this.messageResource = mess;
    }

    Runnable r2 = ()->{
        System.out.println(Thread.currentThread().getName()+" "+" Started from Waiter");

        synchronized (messageResource) {
            try {
                Thread.sleep(2000);

                messageResource.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+" "+" Ended from Waiter");
        }

    };

}
