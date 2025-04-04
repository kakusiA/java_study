package javaTest;

import java.util.Arrays;

public class JavaTest0701 {
    //배열 정렬
    static int min1(int a,int b,int c){
        int [ ] arr = {a,b,c};
        Arrays.sort(arr);
        int result = arr[1];
        return result;
    }
    //if문
    static int min2(int a,int b,int c){
        int result = 0;
        if (a>=b&&a<=c||a<=b&&a>=c){
            result = a;
        }
        else if (b>=a&&b<=c||b<=a&&b>=c){
            result = b;
        }
        else {
            result = c;
        }
        return result;
    }
    static int min(int a,int b,int c){
        return a;
    }
    public static void main(String[] args) {
        System.out.println(min(1,2,3));
        System.out.println(min(2,1,3));
        System.out.println(min(1,2,2));
        System.out.println(min(1,1,2));
    }
}
