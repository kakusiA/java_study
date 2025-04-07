package ch;

import java.util.SortedMap;

class Times{
    private int hour; //0부터23값을 가져야함
    private int minute;
    private int second;

//    public void sethour(int hour){
//        if(!(hour>=0 && hour<=23)) return;
//        this.hour=hour;
//    }
    //분리
    public void sethour(int hour){
        if (isValuesHour(hour)){
            return;
        }
        this.hour = hour;
    }
    public void setSecond(int second){
        if (isValues(second)){
            return;
        }
        this.second = second;
    }
    public void setMinute(int minute){
        if (isValues(minute)){
            return;
        }
        this.minute = minute;
    }
    //매개변수가 유효한지 확인하는 메서드 private
    private boolean isValuesHour(int hour){
        return hour < 0 || hour > 23;
    }
    private boolean isValues(int value){
        return value < 0 || value > 59;
    }
    public int gethour(){
        return hour;
    }
    public int getsecond(){
        return second;
    }
    public int getminute(){
        return minute;
    }
}
public class Ch07_1 {
    public static void main(String[] args) {
        Times t2 = new Times();
//        t2.hour = 100; //0~23값을 넣어야함
        t2.sethour(24);//유효한 값이어서 넣음
        t2.setSecond(59);
        t2.setMinute(61);
        System.out.println(t2.gethour());
        System.out.println(t2.getsecond());
        System.out.println(t2.getminute());
    }
}

class TV{
    int channel;//기본값 0
    String color;//기본값 null
    boolean power;//기본값 false
    void power(){ power = !power;}
    void channelDown(){ channel --;}
    void channelUp(){ channel++;}
}

class SmartTv extends TV{
    int ss;
    void poweraa(){}
}

class TVTest{
    public static void main(String[] args) {
        // TV는 인스턴스 멤버가 5개 smartTv는 인스턴스가 7개
        //인스턴스가 적은쪽에서 많은쪽에 기능을 덜쓰는건 가능
        //인스턴스가 많은쫏에서 적은쪽을 사용하는건 불가능
        //조상 이 자손 객체선언 가능
        //자손이 조상 객체 선언 불가능 // 노인공경해야지 잉..
        TV tv = new SmartTv();//가능
//        SmartTv tv2 = new TV();//불가능
    }
}

class Ex7_7{
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        fe.color = "red";
        fe.door = 10;
        System.out.println(fe.color + "," + fe.door);
        fe.water();
        Car c = (Car)fe;
        System.out.println(c.color + "," + c.door);
//        c.water();
        FireEngine fe2 = (FireEngine)c;
        System.out.println(fe2.color + "," + fe2.door);
        fe2.water();
        Car car = null;
        FireEngine fe6 = null;

        fe.water();
        car = fe; //(car)fe car타입으로 형변환됨
//        car.water()
        fe6 = (FireEngine)car;//형변환
        fe2.water();
        Car car2 = null;
        FireEngine fe3 = null;
        FireEngine fe4 = (FireEngine)car2;
        Car car3 = (Car)fe3;
        car3.drive();

    }
}

class Ex7_7_1{
    public static void main(String[] args) {
        Car car = new Car();
        FireEngine fe = (FireEngine)car;
        fe.water();
    }
}
class insOf {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        //instanceof연산자는 조상들도 모두 true가나옴
        System.out.println(fe instanceof Object);
        System.out.println(fe instanceof Car);
        System.out.println(fe instanceof FireEngine);
    }
}
class Car{
    String color;
    int door;

    void drive(){
        System.out.println("drive, Brrrr");
    }
    void stop(){
        System.out.println("stop!!!!!");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("water!!!");
    }
}