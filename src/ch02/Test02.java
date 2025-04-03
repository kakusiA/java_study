package ch02;

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
