package desgin.singleton;

import java.util.concurrent.CountDownLatch;

public class single2 {
    public static void main(String[] args) throws InterruptedException {
        // 두 스레드를 동시에 시작시키기 위한 래치
        CountDownLatch latch = new CountDownLatch(1);

        Runnable task = () -> {
            try {
                latch.await();
            } catch (InterruptedException ignored) { }
            Singleton2 instance = Singleton2.getInstance();
            System.out.println(Thread.currentThread().getName() + " → " + instance);
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        t1.start();
        t2.start();

        // 두 스레드를 동시에 깨운다
        latch.countDown();

        t1.join();
        t2.join();
    }
}
class Singleton2 {
    private static Singleton2 singleton;

    private Singleton2(){
        System.out.println("인스턴스를 생성하였습니다.");
    }
    public static Singleton2 getInstance(){
        if(singleton == null){
            singleton = new Singleton2();
        }
        return singleton;
    }
}