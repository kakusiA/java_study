package javaTest;

public class JavaTest0901 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j>=i && j < 5-i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
