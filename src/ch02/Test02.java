package ch02;

import java.awt.*;
import java.awt.event.*;
import java.beans.EventHandler;
import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int a = (int)Math.random();
    }
}
class Tc6_2 {
    public static void main(String[] args) {
        SutdaCard card = new SutdaCard(3,false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card.info());
        System.out.println(card2.info());
    }
}
class SutdaCard{
    int num;
    boolean isKwang;
    SutdaCard(){
        this.num = 1;
        this.isKwang = true;
    }
    SutdaCard(int num, boolean isKwang){
        this.isKwang = isKwang;
        if (num<0 || num>9){
            return;
        }
        this.num = num;
    }
    String info(){
        if (isKwang){
            return num + " " + "k";
        }
        return   num + " " + "";
    }
}
class Tc6_4{
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban =1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름 : "+ s.name);
        System.out.println("총점 : "+ s.getTotal());
        System.out.println("평균 : " +s.getAverage());
    }
}
class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int getTotal(){
        return kor+eng+math;
    }
    float getAverage(){
        return Math.round((float)(getTotal()/3.0)*10)/10.f;
    }
    //6_5
    Student(){}
    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    String info(){
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
    }
}
class Tc6_5{
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);
        System.out.println(s.info());

    }
}
class Tc6_6{
    static double getDistance(int x,int y ,int x1,int y1){
        double result = Math.sqrt((x -x1)*(x -x1) + (y - y1)*(y -y1)); //피타고라스 a^2 + b^2 = c^2
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}
class Tc6_7{
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistance(2,2));
    }
}
class MyPoint{
    int x;
    int y;
    MyPoint(){}
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    double getDistance(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
    }
}
class Tc6_20{
    static int [] shuffle(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int rand = (int)(Math.random()*arr.length);
            int tmp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = tmp;

        }
        return arr;
    }
    public static void main(String[] args) {
        int [] oreiginal = { 1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(oreiginal));

        int[]result = shuffle(oreiginal);
        System.out.println(java.util.Arrays.toString(result));
    }
}
class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;
    final int MaxVolume = 100;
    final int MinVolume = 0;
    final int MaxChannel = 100;
    final int MinChannel = 1;

    void turnOnoff(){
        if (isPowerOn){
            isPowerOn = false;
        }
        else isPowerOn = true;
    }
    void volumeUp(){
        if(volume<MaxVolume){
            volume++;;
        }
        else return;
    }
    void volumeDown(){
        if(volume>MinVolume){
            volume--;
        }
        else return;
    }
    void channeleUp(){
        if(channel>=MaxChannel){
            channel = MinChannel;
        }
        else channel++;
    }
    void channelDown(){
        if(channel<=MinChannel){
            channel = MaxChannel;
        }
        else channel--;
    }
}
class Tc6_21{
    public static void main(String[] args) {
        MyTv tv = new MyTv();
        tv.channel = 100;
        tv.volume = 0;
        System.out.println(tv.channel+","+tv.volume);
        tv.channelDown();
        tv.volumeDown();
        System.out.println(tv.channel+","+tv.volume);
        tv.volume = 100;
        tv.channeleUp();
        tv.volumeUp();
        System.out.println(tv.channel+","+tv.volume);
        tv.channel = 0;
        tv.channelDown();
        System.out.println(tv.channel);
    }
}
class Tc6_22{
    static boolean isNumber(String str){
        boolean result =true;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!(c>='0' && c<='9')){
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? "+ isNumber(str));
        String str2 = "123o";
        System.out.println(str + "는 숫자입니까? "+ isNumber(str2));
    }
}
class Tc6_23{
     static int max(int [] date){
         if(date == null){
             return -99999;
         }
         else if(date.length == 0){
             return -99999;
         }
        int result = date[0];
//        result = Math.max(date[0],date.length);
        for (int i = 0; i < date.length; i++){
            if(result<date[i]){
                result = date[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] date = {3,2,9,4,7};
        System.out.println(Arrays.toString(date));
        System.out.println("최대값 = " + max(date));
        System.out.println("최대값 = " + max(null));
        System.out.println("최대값 = " + max(new int[]{}));

    }
}
class Tc6_24{
    static int abs(int a){
        if (a < 0){
            return -a;
        }
        return a;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 : " + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 : " + abs(value));
    }
}
//6장 끝
class SutdaDeck{
    final int CARD_NUM =20;
    SutdaCard12[] cards = new SutdaCard12[CARD_NUM];

    SutdaDeck(){
        for(int i = 0; i < CARD_NUM; i++){
            boolean isKwang = (i ==0 ||i ==2 || i ==7)?true:false;
            cards[i] = new SutdaCard12((i%10+1),isKwang);
        }
    }
}

class SutdaCard12{
    int num;
    boolean isKwang;

    SutdaCard12(){
        this(1,true);
    }
    SutdaCard12(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    public  String toString(){
        return num +(isKwang? "k":"");
    }
}
class TC7_1{
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++){
            System.out.print(deck.cards[i] + ",");
        }
    }
}
class  outer {
    int value = 10;
    class inner{
        int value =20;

        void method1(){
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(outer.this.value);
        }
    }
}
class SutdaCard1{
    final int num;
    final boolean isKwang;

    SutdaCard1(){
        this(1,true);
    }
    SutdaCard1(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    public  String toString(){
        return num +(isKwang? "k":"");
    }
}
class Tc7_14{
    public static void main(String[] args) {
        SutdaCard1 card = new SutdaCard1(1,true);
        System.out.println(card.num);
        System.out.println(card.isKwang);
        SutdaCard1 card1 = new SutdaCard1(1,true);
    }
}
class Tc7_231{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.calcArea());
    }
}
abstract class Shape{
    Point p;
    Shape() {
        this(new Point(0, 0));
    }
    Shape(Point p ){
        this.p =p;
    }
    abstract double calcArea();

    Point getPosition(){
        return p;
    }
    void setPosition(Point p ){
        this.p = p;
    }
}
class Circle extends Shape{
    double r;
    Circle(){};
    Circle(double r){
        this.r =r;
    }
    double calcArea(){
        return r*r*Math.PI;
    }
}
class Rectangle extends Shape{
    double width;
    double height;
    Rectangle(){}
    Rectangle(int width,int height){
        this.width =width;
        this.height =height;
    }
    double calcArea(){
        return width*width;
    }
    boolean isSquare(){
        if (width == height){
            return true;
        }
        else return false;
    }
}
class Point{
    int x;
    int y;
    Point(){
        this(0,0);
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "[" + x + "," + y + "]";
    }
}

class Tc7_22{
    public static void main(String[] args) {

    }
}
class Tc7_25{
    public static void main(String[] args) {
        outer.inner inner = new outer().new inner();
        inner.method1();
    }
}

class Tc7_28{
    public static void main(String[] args) {
        Frame f = new Frame();
        WindowAdapter e  = new WindowAdapter()
        {
            public void windowClosing(WindowEvent e){
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        };
        f.addWindowFocusListener(e);
    }
}