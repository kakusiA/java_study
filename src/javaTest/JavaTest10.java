package javaTest;

public class JavaTest10 {
    public static void main(String[] args) {
        int a =100;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i <a/2){
                    if(j>i && j < a-1-i){
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                else{
                    if(j<i && j > a-1-i){
                        System.out.print(" ");
                    }
                    else System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
