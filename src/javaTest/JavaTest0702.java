package javaTest;

public class JavaTest0702 {
    static int biggoCnt(int[][] arr){
        int count = 0;
//        int []b = new int[arr.length+2];
        int [] c = new int[2];
        int c1 = 0;
        int c2 = 0;
        int a =0;
        int b1 = 0;
        for (int i = 0; i < arr.length; i++) {
            a= 0;
            b1 = 0;
            for (int j = 0; j < arr[i].length; j++) {
                // 행 and 행
                if(arr[i][j] == 1){
                    a ++;
//                    b[j]++;
                }
                if(arr[j][i] == 1){
                    b1++;
                }
                if(i == j && arr[i][j] == 1){
                    c[0]++;
                }
                if(i+j == arr.length -1 && arr[i][j] == 1){
                    c[1]++;
                }
            }
            if(arr[i][i] == 1){
                c1++;
            }
            if(arr[i][arr[i].length-1-i] == 1){
                c2++;
            }
            if(a ==5){
                count++;
            }
            if(b1==5){
                count++;
            }
            if(c1==5){
                count++;
            }
            if(c2==5){
                count++;
            }
        }
//        for (int i = 0; i < b.length; i++) {
//            if(b[i] == 5){
//                count++;
//            }
//        }
//        if(c[0] == 5){
//            count++;
//        }
//        if(c[1] == 5){
//            count++;
//        }
        return count;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,0,0,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {0,1,0,1,1},
                {1,1,1,0,1}
        };
        System.out.println(biggoCnt(arr));
    }
}
