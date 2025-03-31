package classStudy;

class TV{
    int channel;//기본값 0
    String color;//기본값 null
    boolean power;//기본값 false
    void power(){ power = !power;}
    void channelDown(){ channel --;}
    void channelUp(){ channel++;}
}

public class ClassTv {
    public static void main(String[] args) {
        TV tv1 = new TV();//변수 선언및 객체 생성
        TV tv2 = new TV();
        tv1.channel = 10; //tv1에 channel변수의 값을 넣어라
        tv2.channel = 20;//변수
        tv1.channelDown();//메서드
        System.out.println(tv1.channel);
        System.out.println(tv2.color);
        System.out.println(tv1.power);
        System.out.println(tv2.channel);
        //tv1객체의 변수를 tv2변수에 넣어라 tv1주소로 변경 기존 tv2참조 주소는 삭제됨
        tv2 = tv1;
        System.out.println(tv2.channel);
       TV[] a3 = new TV[3];
       a3[0] = new TV();
       a3[1] = new TV();
       a3[2] = new TV();
       a3[0].color = "red";
        System.out.println(a3[0].color);
    }

}
