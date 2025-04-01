package javaTest;

public class javaTestArray01 {
    public static void main(String[] args) {
        int [] a = new int[3];
        int [] b = new int[3];
        int s = 0;
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*10) +1;
            b[i] = (int)(Math.random()*10) +1;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] == b[i]){
                s ++;
                System.out.print("스트라이크 ");
            }
            else {
                c ++;
                System.out.print("볼 ");
            }
        }
        System.out.println();
        System.out.println("[스트라이크:" + s + "] [볼:" +c +"]");
    }
}
