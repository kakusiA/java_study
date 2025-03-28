package javaTest;

public class JavaTest06 {
    public static void main(String[] args) {
        int a = 4;
        for (int i = 0; i < 5; i++) {
            for(int z = 0 ; z < 5 ; z++) {
                if(z >=a )System.out.print("*");
                else System.out.print(" ");
            }
            a --;
            System.out.println();
        }
    }
}
