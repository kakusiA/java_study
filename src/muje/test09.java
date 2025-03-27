package muje;

import java.util.Arrays;

public class test09 {
    public static void main(String[] args) {
        int [] score; //배열 선언
        score = new int[5]; // 배열 생성
        score[0] = 1;
        score[1] = 2;
        score[2] = 3;
        score[3] = 4;
        score[4] = 5;
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);
        int[] arr = new int[10];
        arr[5] = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] = "+ +arr[i]);
        }
        int [] score1 = {1,2,3,4,5,6,7,8};
        int [] score2;
        score2 = new int[]{1,2,3,4,5,6,7,8};
        int[] arr2 = {1,3,4,5,6,7};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2["+i+"] = "+ +arr2[i]);
        }
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[20];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int)(Math.random()*500) +1;
        }
        System.out.println(Arrays.toString(arr3));
        char[] arr4 = {'A','B','C','D','E','F'};
        System.out.println(arr4);
        System.out.println(Arrays.toString(arr4));
    }
}
