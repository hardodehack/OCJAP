package threads;

public class Thread_Join {

    static Runnable r1  = ()->{
        System.out.println(Thread.currentThread().getName()+" Thread Started");

        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try{
                Thread.sleep(3000);
            }catch (Exception e ){}
        }

        System.out.println(Thread.currentThread().getName()+" Thread Ended");
    };


    public static void main(String[] args) {

        Thread_Join th1 = new Thread_Join();

        Thread t1 = new Thread(r1);

        Thread t2 = new Thread(r1);

        Thread t3 = new Thread(r1);

        t1.start();

        try {

            t1.join(30);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();


        try {

            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();

        try {

            t3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            t1.join();t2.join();t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
