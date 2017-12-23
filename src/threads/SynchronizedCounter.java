package threads;

public class SynchronizedCounter {

    int counter = 0;

    public  void increment(){
        counter++;
        System.out.println("G C...");
    }

    public void getCount(){
        System.out.println(counter);
    }

    Runnable r1 = ()-> {

        increment();

    };

    public static void main(String[] args) {

        SynchronizedCounter sn = new SynchronizedCounter();

        Thread t1= new Thread(sn.r1);

        try {
            t1.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(sn.r1);

        t2.start();

        Thread t3 = new Thread(sn.r1);


        t3.start();


        try {

            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sn.getCount();
    }

}
