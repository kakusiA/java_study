package muje;

import java.util.Arrays;

public class test13 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[][] arr2 = {{1,2,3,4},{1,2,3},{1,2},{1}};
        //1치원 배열
        System.out.println(Arrays.toString(arr1));
        //2차원배열,다차원
        System.out.println(Arrays.deepToString(arr2));
        String[][] str2 = {{"1","2"},{"3","4"},{"5","6"},{"7","8"}};
        String[][] str1 = {{"1","2"},{"3","4"},{"5","6"},{"7","8"}};
        System.out.println(Arrays.deepToString(str2));
        System.out.println(Arrays.toString(str1));
        //1차원비교
        System.out.println(Arrays.equals(str2, str1));
        System.out.println(Arrays.equals(str2[1], str1[1]));
        //다차원비교
        System.out.println(Arrays.deepEquals(str1, str2));
        //배열 카피
        //Arrays.copyOf(카피할 변수, 카피할 길이);
        int[] arr3 = Arrays.copyOf(arr1,arr1.length);//전체
        int[] arr4 = Arrays.copyOf(arr1,4);//index 0부터4까지
        int[] arr5 = Arrays.copyOfRange(arr1,2,arr1.length);//index 2에서 끝까지
        int[] arr6 = Arrays.copyOfRange(arr1,2,5);//index 2에서4까지
        int[] arr7 = {3,4,5,345,6,3,635,634,5};
        //정렬
        Arrays.sort(arr7);
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));
    }
}
