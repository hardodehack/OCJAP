package threads.DeadLock;

public class BlockingResource {

    private Object o1 = new Object();
    private Object o2 = new Object();

    Runnable r1 = () ->{

        System.out.println("Trying to Hold lock for Object o1 Outside......"+Thread.currentThread().getName());
        synchronized (o1){
            System.out.println("Holding lock for Object o1 Outside........"+Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Trying to Hold lock for Object o2 from Inside Locked o1......"+Thread.currentThread().getName());
            synchronized (o2){
                System.out.println("Holding Lock for Object o2 from inside Locked o1....."+Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Lock Released for Object o2 inside Locked o1........"+Thread.currentThread().getName());
            }

            System.out.println("Lock Released for Object o1 outside........"+Thread.currentThread().getName());
        }
    };

    Runnable r2 = () ->{

        System.out.println("Trying to Hold lock for Object o2 Outside......"+Thread.currentThread().getName());
        synchronized (o2){
            System.out.println("Holding lock for Object o2 Outside........"+Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Trying to Hold lock for Object o1 from Inside Locked o2......"+Thread.currentThread().getName());
            synchronized (o1){
                System.out.println("Holding Lock for Object o1 from inside Locked o2....."+Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Lock Released for Object o1 inside Locked o2........"+Thread.currentThread().getName());
            }

            System.out.println("Lock Released for Object o2 outside........"+Thread.currentThread().getName());
        }
    };


    public static void main(String[] args) {

        BlockingResource bl = new BlockingResource();

        new Thread(bl.r1,"Thread__1").start();

        new Thread(bl.r2,"Thread__2").start();

    }


}
