package multithreading;

public class MultithreadingMain extends Thread{

    public static void main(String[] args) {
        MultithreadingMain th = new MultithreadingMain();
        th.setName("thread1");
        th.start();
        // System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run(){

        for(int i = 0 ; i < 5 ;i++){
            System.out.println(i);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
