package javaTest;

import java.util.Arrays;

public class JavaTestArray03 {
    public static void main(String[] args) {
        int[][] a = new int[6][9];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                if(i == 0){
                    a[i][j] = 9-j;
                }
                else if (i == 1) {
                    a[i][j] = 2*(j+1);
                }
                else if(i == 2){
                    a[i][j] = 2*(j+1);
                }
                else if(i == 3){
                    a[i][j] = (j+1)*(j+1);
                }
                else if(i == 4){
                    a[i][j] = j%3 +1;
                }
                else if(i == 5){
                    a[i][j] = (j)/3+1;
                }
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
