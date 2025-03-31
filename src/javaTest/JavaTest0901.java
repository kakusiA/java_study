package javaTest;

public class JavaTest0901 {
    public static void main(String[] args) {
        int v =51;
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                int a = v-1-i;
                if (a < 0) {
                    a = -a;
                }
                if(i >=v/2 ){
                    if(j <= i && j >= a){
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                else {
                    if (j >= i && j <= a) {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
