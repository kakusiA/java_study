package test1;

import etc.ttest2;

import static java.lang.System.out;

public class Test001 {
    public static void main(String[] args) {
        Test002 t = new Test002();
//        out.println(t.prv);//같은 클래스가 아님
//        out.println(t.dft);//같은 패키지가 아님
//        out.println(t.prt);//패키지와 자손이아님
        out.println(t.pbt);//public은 가능
        out.println();
        t.printMember();
    }
}
class Test002 extends ttest2 {
    public void printMember(){
//        out.println(prv);//같은 클래스가 아님
//        out.println(dft);//같은 패키지가 아님
        out.println(prt);//자손이어서가능
        out.println(pbt);
    }
}
