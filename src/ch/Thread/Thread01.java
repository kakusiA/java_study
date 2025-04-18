package ch.Thread;
class MyThread extends Thread{
    public void run(){
        for(int i = 0; i<300; i++){
            System.out.println(this.getName());//Thread-0
        }
    }
}
class MyThread2 implements Runnable{
    public void run(){
        for(int i = 0; i<300; i++){
            System.out.println(Thread.currentThread().getName());//Thread-1
        }
    }
}
public class Thread01 {
    static long start = System.currentTimeMillis();
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        MyThread2 t2 = new MyThread2();
        Thread t21 = new Thread(t2);
        t21.start();
        try{
            t1.join();
            t21.join();//해당 쓰레드가 끝날때까지 main메서드가 기다림
        }
        catch(InterruptedException e){}
        System.out.println(System.currentTimeMillis()-start);
    }
}

class Thread02{
    static long start = System.currentTimeMillis();
    public static void main(String[] args) {
        for(int i = 0; i<300; i++){
            System.out.println("a");
        }
        for (int i = 0; i < 300; i++) {
            System.out.println("b");
        }
        System.out.println(System.currentTimeMillis()-start);
    }
}