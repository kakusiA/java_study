package ch02;

import java.util.Arrays;

public class Test02 {
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
