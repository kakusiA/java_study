package ch.Thread;

public class Thread04 {
}

class a04{
    int balance = 1000;
    public synchronized void a1(int mon){//메서드 임계영역 설정
        if(balance >=mon){
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){}
            balance -= mon;
        }
    }
    public void a2(int mon){
        synchronized (this){//this -> 객체 자기자신
            if(balance >=mon){
                try {
                    Thread.sleep(1000);
                }
                catch (Exception e){}
                balance -= mon;
            }
        }
    }
}
