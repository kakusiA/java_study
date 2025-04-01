package classStudy;
public class PrimateMethord {
    public static void main(String[] args) {
    }
}
class Date{int x;}
class Date2{int x;}
class Ex6_6{//기본형 매개변수
    public static void main(String[] args) {
        Date dt = new Date();
        dt.x = 10;
        System.out.println(dt.x);
        change(dt.x);
        System.out.println(dt.x);

    }
    static void change(int x){
        x = 1000;
        System.out.println("x = " +x);
    }
}
class Ex6_7{//참조 매개변수
    public static void main(String[] args) {
        Date2 dt = new Date2();
        dt.x = 10;
        System.out.println(dt.x);
        change2(dt.x);
        System.out.println();
        System.out.println(dt.x);
    }
    static void change(Date2 dt){//dt의 참조변수의 주소를 들고옴
        dt.x = 1000;
        System.out.printf("x = " +dt.x);
    }
    static void change2(int x){
        x = 1000;
        System.out.println("x = " +x);
        Date2 dt = new Date2();
        dt.x = x;
        System.out.printf("x = " +dt.x);
    }
}
class Date3{ int x;}
class Ex6_8{
    public static void main(String[] args) {
        Date3 dt = new Date3(); //0x100
        dt.x = 10;
        Date3 dt2 = copy(dt);//0x200
        System.out.println(dt.x);//0x100
        System.out.println(dt2.x);//0x200
    }
    static Date3 copy(Date3 dt){//반환타입이 참조형일 경우 주소를 반환함
        Date3 tmp = new Date3();
        tmp.x = dt.x;
        return tmp;
    }
}
class ab{
    public static void main(String[] args) {
        //1
        System.out.println(ab2.c);
        long a = ab2.add(5,6);
        System.out.println(a);
        ab2 ab = new ab2();
        long sum = ab.add(5,9);
        System.out.println(sum);
    }
}
class ab2{
    //class에 변수를  사용하면 인스턴스 메서드 사용하지않으면static메서드!! 중요
    int a;
    int b;
    static int c = 9;
    long add(){//인스턴스 메서드는 객체 호출을 해야함 iv 사용
        return a+b;
    }
    static long add(int a, int b){//static메서드 class이름을 이용해서 만듬
        // X iv 사용불가
        return a+b;
    }
}
class TestClass2{
    int a;
    static int b;

    void print01(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static void print02(){
//        System.out.println(a);//iv여서 오류발생
        System.out.println(b);
    }
}
class TestClass3{
    int a;
    void print03(){}
    static void print05(){}
    void print04(){
        print03();//인스턴스
        print05();//static
    }
    static void print06(){
//        print03();//인스턴스 메서드 불가
        print05();
    }
}