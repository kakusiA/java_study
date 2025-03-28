package javaTest;

public class JavaTest04 {
    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 5; j++) {
//                System.out.println(5 -j);
                if(j == i){
                    System.out.print("*");
                }
                else if( 4-j == i){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
