package muje;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test09Etc {
    public static void main(String[] args) {
//        int sum = 0;
//        float avg = 0f;
//        int [] score = new int[7];
//        for (int i = 0; i < score.length; i++) {
//            score[i] = (int)(Math.random()*20)+81;
//        }
//        for (int i = 0; i < score.length; i++) {
//            sum += score[i];
//        }
//        avg = sum/(float)score.length;
//        System.out.println("총합 = " + sum);
//        System.out.println("Average score: " + avg);
        int[] num = new int[50];
        for (int i = 0; i < num.length; i++) {
            num[i] = i+1;
        }
        for (int i = 0; i < num.length; i++) {
            int n = (int)(Math.random()*num.length);
            int temp = num[i];
            num[i] = num[n];
            num[n] = temp;
            System.out.println(Arrays.toString(num));
        }
    }
}
