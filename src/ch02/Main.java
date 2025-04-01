package ch02;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        char [] ch = new char[5];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char)('a' +i);
        }
//        System.out.println(Arrays.toString(ch));
        int [] a1 = new int[5];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int)(Math.random()*50);
        }
//        System.out.println(Arrays.toString(a1));
//        boolean [] a2 = new boolean[5];
//        for (int i = 0; i < a2.length; i++) {
//            System.out.println(a2[i]);
//        }
//        byte [] b1 = new byte[5];
//        for (int i = 0; i < b1.length; i++) {
//            System.out.println(b1[i]);
//        }
        char[] charr = {'A','B','C'};
        System.out.println(Arrays.toString(charr));
        String strr = new String(charr);
        System.out.println(strr);
        char[] charr2 = strr.toCharArray();
        System.out.println(Arrays.toString(charr2));
        for(int i : charr2){
            System.out.println((char)i);
        }
        tes1 t1 = new tes1();
        t1.sum();
    }
}
class tes1{
    void sum(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                if(i==j){
                    System.out.printf("[%d,%d]",i,j);
                }
                else System.out.printf("%5c", ' ');
            }
            System.out.println();
        }
    }
}