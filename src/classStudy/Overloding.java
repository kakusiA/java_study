package classStudy;

public class Overloding {
    public static void main(String[] args) {

    }
}
class Car{
    Car(){

    }
    Car(String color){

    }
}
class Date_1{
    int value;
}
class Date_2{
    int value;
    Date_2(){}
    Date_2(int x){
        value = x;
    }
}
class Dat1{
    public static void main(String[] args) {
        Date_1 d1 = new Date_1();
        Date_2 d2 = new Date_2();// 컴파일러 에러 발생
    }
}
class Date12{
    int hour;
    int minute;
    int second;
    Date12(){
        this(0,0,0);//생성자 this()
    }
    Date12(int hour, int minute, int second){
        this.hour = hour;//this.hour -> IV hour -> LV
        this.minute = minute;//this 참조변수의 주소가 들어가있음 객체자신을 지칭함
        this.second = second;
    }
}
class Date13{
    public static void main(String[] args) {
        Date12 d1 = new Date12(12,32,56);
        rand12 rnd = new rand12();
        int[] arr1 = rnd.arr;
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
class rand12{
    static int [] arr = new int[10];

    static {//클래스 초기화 블럭
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*10)+1;
        }
    }
}
class teq{
    static int cv =1;//명시적 초기화
    int cz = 1;//명시적 초기화
    static
    {cv =2;}//클래스 초기화 블럭
    {cz =3;}//인스턴스 초기화 블럭

    teq(){
        cz =4;//생성자
    }
}