package javaTest;

public class JavaTest10 {
    public static void main(String[] args) {
        int a =5;
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
class B{
    public static void main(String[] args) {
        int a = 101;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i+j <=a+1 && j<=i) {
                    System.out.print("*");
                }
                else if(i+j <a+1 || j<i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
class C2{
    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if(j<i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}