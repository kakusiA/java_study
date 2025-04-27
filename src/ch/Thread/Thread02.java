package ch.Thread;

public class Thread02 implements Runnable{
    static boolean autoSave = false;
    public static void main(String[] args) {//메인
        Thread t =new Thread(new Thread02());
        t.setDaemon(true);//데몬쓰레드 선언
        t.start();
        for(int i =0; i<=10; i++){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {}
            System.out.println(i);

            if(i ==5) autoSave = true;//5초일때 자동저장 true
        }
        System.out.println("exit");

    }


    public void run(){//데몬
        while(true){
            try {
                Thread.sleep(3*1000);//3초마다 저장
            }
            catch (InterruptedException e) {}

            if(autoSave){ autoSave();}
        }
    }
    public static void autoSave(){
        System.out.println("저장완료");
    }
}