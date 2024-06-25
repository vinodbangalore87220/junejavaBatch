package multithreading;

public class ThreadInterfaces implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Execution completed = "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadInterfaces inter = new ThreadInterfaces();
        Thread th = new Thread(inter);
        th.start();

        Thread th1 = new Thread(inter);

        th1.start();
        System.out.println(Thread.currentThread().getName());

       // Thread()
       // Thread(String name)
      //  Thread(Runnable r)
      // Thread(Runnable r,String name)

      //  Thread states
       // 1. new
      //  2. Runnable
      //  3. running
      //  4. blocked/ waiting
     //   5. completed

        // wait
        // notify
        // notify all



    }
}
