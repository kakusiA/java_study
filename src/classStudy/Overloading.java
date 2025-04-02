package classStudy;

public class Overloading {
    public static void main(String[] args) {
        test1 t1 = new test1();
//        System.out.println(t1.asd(5,4));
//        System.out.println(t1.asd(5,6));
        Date1 dt1 = new Date1(12,34,56);//()안에 값이 생성자
    }
}
class test1{
    int asd(int a, int b){return a +b;}
//    int asd(int x, int y){return x+y;}//중복 정의
//    long asd(int a, int b){return (long)(a +b);}//중복 정의 반환 타입이 같아도 중복정의이다.
    long asd(int a, long b){return a +b;}
    long asd(long a, int b){return a +b;}
}
class Date1{
    int hour;
    int minute;
    int second;

    public Date1(int i, int i1, int i2) {
        hour = i;
        minute = i1;
        second = i2;
    }
}
