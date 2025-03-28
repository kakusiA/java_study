package javaTest;

public class JavaTest10 {
    public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if (i <=2){
                if(j>i && j < 4-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            else{
                if(j<i && j > 4-i){
                    System.out.print(" ");
                }
                else System.out.print("*");
            }
        }
        System.out.println();
    }
    }
}
