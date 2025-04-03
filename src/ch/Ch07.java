package ch;

public class Ch07 {
}
class Point {
    int x;
    int y;
}
class CircleExtend extends Point {
    int r;
}
class Circle{
    Point c = new Point();
    int r;
}
class t1{
    public static void main(String[] args) {
        //1상속
        CircleExtend c = new CircleExtend();
        c.x = 10;
        c.y = 20;
        c.r = 10;
        System.out.println("상속");
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.r);
        System.out.println();
        //2포함
        Circle c1 = new Circle();
        c1.c.x =100;//c1 Circle 참조변수 c -> Point 참조변수 X ->인스터스 변수
        c1.c.y = 200;
        c1.r =100;
        System.out.println("포함");
        System.out.println(c1.c.x);
        System.out.println(c1.c.y);
        System.out.println(c1.r);
    }
}
class OverridingTest{
    public static void main(String[] args) {
        Point2 p = new Point2(10,20,30);
//        p.x = 10;
//        p.y = 20;
//        String pstr = p.getlocation();
//        System.out.println(p.getlocation());
//        System.out.println(p.toString());
        Point4 p4 = new Point4();
        p4.method();
    }
}
class Point1{
    int x;
    int y;
    String getlocation(){
        return "x = " + x +  "," + "y = "+y;
    }
//    @Override
    public String toString() {
        return "x = " + x +  "," + "y = " + y;
    }
}
class Point2 extends Point1{
    int z;
    Point2(){}
    Point2(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    String getlocation(){//overriding
        return "x = " + x +  "," + "y = "+ y + "," + "z = " + z;
    }
    //    @Override
    public String toString() {
        return "x = " + x +  "," + "y = "+ y + "," + "z = " + z;
   }
}
class Point3{
    int x = 100;//super.x
}
class Point4 extends Point3{
    int x =10;
    //super 는 조상멤버를 사용할때 사용
    void method(){
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);//조상 변수
        System.out.println("this.x = " + this.x);//iv변수
    }
}