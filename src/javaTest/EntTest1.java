package javaTest;

public class EntTest1 {
    public static void main(String[] args) {
        String s = "122111";
        int count = 1;
        char ch = s.charAt(0);
        String resultstr ="";
        for(int i = 0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            if(!(ch == ch1)){
                resultstr = resultstr + ch + count;
                ch = ch1;
                count = 1;
            }
            else {
                count ++;
            }
        }
        resultstr = resultstr + ch +count;
        System.out.println(resultstr);
    }
}

class MyThread  extends Thread{
    public void run(){

    }
}
