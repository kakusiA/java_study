package test1;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(123);
//        list.add(124);
////        list.add("125");//에러발생 인트형만 가능
//        System.out.println(list);
//        ArrayList<String>[] list1 = new ArrayList[0];
//        System.out.println(list1);
        AW<DD> aw = new AW<>(new DB());
        aw.print();
    }
}


interface DD{
    void print();
}

class DB implements DD{
    private int a;
    private int b;
    private String c;
    public DB(){
        a = 1;
        b = 2;
        c = "3";
    }
    @Override
    public void print() {
        System.out.println("a : "+ a + ", b : " + b + ", c : " + c);
        System.out.println("DB");
    }
}
class AW<T extends DD>{
    T a;
    void print(){
        a.print();
    }
    AW(T a){
        this.a = a;
    }
}

class asw412{
    public static void main(String[] args) {
        TV<TZ> Tv = new TV<>();
        Tv.tz = new TZ();
        Tv.print();
    }
}

class TZ{
    int a,b,c,d;
    TZ(){
        a = 1;
        b = 2;
        c = 3;
        d = 4;
    }
    TZ(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public String toString() {
        return "TZ{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
class TV<T>{
    T tz;
    TV(){}
    TV(T tz){
        this.tz = tz;
    }
    void print(){
        System.out.println(tz);
    }
}
class asdknjafh{
    public static void main(String[] args) {
        TTQ<Integer> ttq =new TTQ<>();
        ttq.setQ(5);
        ttq.setV(12);
        Integer a = ttq.getQ();
        Integer b= ttq.getV();
        System.out.println(a +b );
        System.out.println(ttq.sum());
    }
}
class TTQ<T>{
    private T q;
    private T v;
    TTQ(){}
    TTQ(T q, T v){
        this.q = q;
        this.v = v;
    }
    public void setQ(T q){
        this.q = q;
    }

    public void setV(T v){
        this.v = v;
    }
    public T getQ(){
        return q;
    }
    public T getV(){
        return v;
    }
    public int sum(){
        return (int)q +(int)v;
    }

}
class wqekqjeqw{
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product());
        list.add(new SmartTv());
        list.add(new SmartPhone());
    }
}
class Product{
    int a;
}
class SmartTv extends Product{

}

class SmartPhone extends Product{

}