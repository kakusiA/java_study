package javaTest;

public class JavaTest08 {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 1; i <= a; i++) {
            int s = 0;
            int val = a-i;
            int z = 2*i -1;
//            System.out.println("i = " + i);
            for (int j = 0; j < a*2-1; j++) {
//                System.out.println(j);
//                System.out.println("val = " + val);
                if ( val <= j){
//                    System.out.println(j);
                    if (s < z ){
                        System.out.print("*");
                        s ++;
                    }
                    else System.out.print(" ");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
