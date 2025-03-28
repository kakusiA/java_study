package javaTest;

public class JavaTest05 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a; j++) {
               System.out.print("*");
            }
            a++;
            System.out.println();
        }
    }
}
