package ch;

import etc.array_study;

import java.awt.*;

public class Ch06 {
}
class Time{
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
}
class Factorial{
    static long fact(int n){
        if(n ==1 ){
            return 1;
        }
        return n*fact(n-1);
    }
}
class Main{
    public static void main(String[] args) {
//        int v = 20;
//        for(int i=v;i>=1;i--){
//            long a = Factorial.fact(i);
//            System.out.println(i+ " = " + a);
//        }
//        Test.result("apple","asp","aqweq","Daseqe");
//        System.out.println();
//        System.out.println(Test.s);
        Test2 t2 = new Test2();
        System.out.println(t2.a);
        System.out.println(t2.b);
        System.out.println(t2.c);
        System.out.println(t2.d);
        Test2 t3 = new Test2(5,3,"dasfg",false);
        t2 = new Test2(t3);
        System.out.println(t2.a);
        System.out.println(t2.b);
        System.out.println(t2.c);
        System.out.println(t2.d);
    }
}
//가변인자
class Test{
    static String s;
    static void  result(String ssa ,String... ss){//String... -> 배열
        s = ssa;
        for(int i=0;i< ss.length;i++){
            System.out.println(ss[i]);
        }
    }
}
//생성자
class Test2{
    int a;
    int b;
    String c;
    boolean d;
    Test2(){
        this(1,2,"adf",true);//this()
    }
    Test2(Test2 t){//복사를 위한 생성자
        this(t.a,t.b,t.c,t.d);
//        a = t.a;
//        b = t.b;
//        c = t.c;
//        d = t.d;
    }
    Test2(int a,int b,String c,boolean d){
        this.a = a;//this.
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
class Document{
    static int count;
    int val;
    String name;
    static {
        count = 0;
    }
//    {
//    }
    Document(){
        this.name = "제목없음" + ++count;
    }
    Document(String name){
        this.name = name + val;
    }
    void print(){
        System.out.println(name);
    }

}
class t123{
    public static void main(String[] args) {
        Document d = new Document();
        d.print();
        Document d1 = new Document();
        d1.print();
        Document d2 = new Document("직박구리");
        d2.print();
        t1ww a = new t1ww("red",123);
        System.out.println(a.color);
        System.out.println(a.num);
    }
}
class t1ww{
    String color;
    int num;

    t1ww(String color,int num){
        this.color = color;
        this.num = num;
    }
}
class a123{
    public static void main(String[] args) {
        array_study t = new array_study();

    }
}