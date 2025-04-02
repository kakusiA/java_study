package classStudy;

public class JavaClassTest01 {
    public static void main(String[] args) {
        Test01.method( Test01.a,Test01.b);
        Test01 t1 = new Test01();
        Test01.a = 20;
        Test01.b = 20;
        t1.method();
        Test01 t2 = new Test01();
        t2.method();
    }
}
class Test01 {
    int x ;
    int y ;
    static int a = 1;//final 상수
    static int b = 2;
    void method(){
        System.out.println(a+b);
    }
    static void method(int a, int b) {
        System.out.println(a+b);
    }
}

class star{
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5; j++) {
                if(i+j ==6 || i==j){
                    System.out.printf("[%d,%d]",i,j);
                }
                else System.out.printf("%5c", ' ');
            }
            System.out.println();
        }
    }
}