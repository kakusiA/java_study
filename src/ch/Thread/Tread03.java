package ch.Thread;

import javax.swing.*;
import java.io.IOException;

public class Tread03 {
    public static void main(String[] args) {
        Thread032 t3 = new Thread032();
        t3.start();
        System.out.println(t3.isInterrupted());//인터렙트 상태값 반환
        String input = JOptionPane.showInputDialog("아무값이나 입력");
        System.out.println(input);
        t3.interrupt();// 값이 true로 변경
        System.out.println(t3.isInterrupted());
        System.out.println(Thread.interrupted());//자기 자신을 인터럽트되었는지확인(여기선 main 쓰레드)하고 변수 초기화함
    }
//    static void sleep(long millis){}
    static void delay(long i){
        try {
            Thread.sleep(i);//천분의 1초단위 1000 -> 1초
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Thread031 implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread( new Thread031());
        thread.start();
        try {
            thread.join();//작업이 끝날때까지
            thread.join(1000);//1초기다림
            thread.join(1000, 123);//1초기다림 +123나노초까지

        }
        catch (InterruptedException e){}//필수
        System.out.println("끝");
    }
    @Override
    public void run() {
        for(int i = 0; i <=100; i++){
            System.out.println(i);
            if(i%10 == 0){
                delay(1000);
            }
            else if (i == 99){
                try {
                    Thread.sleep(1,500000);//천분 의 1초 + 나노초
                } catch (InterruptedException e) {//예외가아님 sleep을 깨우기위해 사용
                    throw new RuntimeException(e);
                }
            }
        }
    }
    static void delay(long i){
        try {
            Thread.sleep(i);//천분의 1초단위 1000 -> 1초
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Thread032 extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (i!=0 && !isInterrupted()){
            System.out.println(i++);
            for(long x = 0;x<2500000000L; x++);
//            Tread03.delay(1000);
        }
        System.out.println("end");
    }
}