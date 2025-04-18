package ch02.Ch09;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test01 {
}
class Exercise9_1 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3,true);
        SutdaCard c2 = new SutdaCard(3,true);
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c1.equals(c2):"+c1.equals(c2));
    }
}
class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public boolean equals(Object obj){
        if(obj instanceof SutdaCard){
            SutdaCard c = (SutdaCard)obj;
            if(this.num == c.num && this.isKwang == c.isKwang){
                return true;
            }
            return false;
        }
        return false;
    }
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

class Exercise9_2 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(1,2,3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2?"+(p1==p2));
        System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
    }
}

class Point3D {
    int x, y, z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Point3D() {
        this(0, 0, 0);
    }

    public boolean equals (Object obj){
        if(obj instanceof Point3D){
            Point3D p = (Point3D)obj;
            if(this.x == p.x && this.y == p.y && this.z == p.z){
                return true;
            }
            return false;
        }
        else return false;
    }
    public String toString(){
        return "[" + x + ", " + y + ", " + z + "]";
    }
}

class Exercise9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";
        int index = fullPath.lastIndexOf("\\");
        path = fullPath.substring(0, index);
        fileName = fullPath.substring(index + 1);
        System.out.println("fullPath:" + fullPath);
        System.out.println("path:" + path);
        System.out.println("fileName:" + fileName);
    }
}

class Exercise9_4 {
    static void printGraph(int[] dataArr, char ch) {
        for(int i : dataArr){
            for(int j = 0; j < i; j++){
                System.out.print(ch);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printGraph(new int[]{3, 7, 1, 4}, '*');
    }
}

class Exercise9_5 {
    public static int count(String src, String target) {
        int count = 0; //
        int pos = 0; //
//        System.out.println(src.indexOf(target));
        while(src.indexOf(target, pos) != -1){
            int s =src.indexOf(target, pos);
            if( s == -1){
                break;
            }
            count++;
            pos = s +1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB","AB"));
        System.out.println(count("12345","AB"));
    }
}

class Exercise9_6 {
    public static String fillZero(String src, int length) {
        if(src == null || src.length() == length){
            return src;
        }
        else if(length <= 0) return "";
        else if (src.length() > length) {
            return src.substring(0, length);
        }
        else {
            char[] charr = new char[length];
            Arrays.fill(charr, '0');
            char[] charr2 = src.toCharArray();
            System.arraycopy(charr2, 0, charr, length-src.length(), src.length());

            return new String(charr);
        }
    }
    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3));
    }
}
class Exercise9_7 {
    static boolean contains(String src, String target) {
        return src.contains(target);
    }
    public static void main(String[] args) {
        System.out.println(contains("12345","23"));
        System.out.println(contains("12345","67"));
    }
}
class Exercise9_8 {
    static double round(double d, int n) {
        return Math.round(d *Math.pow(10, n)) / Math.pow(10, n);
    }
    public static void main(String[] args) {
        System.out.println(round(3.1415,1));
        System.out.println(round(3.1415,2));
        System.out.println(round(3.1415,3));
        System.out.println(round(3.1415,4));
        System.out.println(round(3.1415,5));
    }
}

class Math1{
    public static void main(String[] args) {
        double roundd = Math.round((double)Math.PI *1000)/1000.0;//1000자리 버림 0.001
        System.out.println(roundd);
        double powa = Math.pow(5,2);//제곱 5^2
        System.out.println(powa);
        double powb = Math.sqrt(powa);
        System.out.println(powb);//제곱근
        int absa = -100;
        int absb = Math.abs(absa);//절대값
        System.out.println(absa);
        System.out.println(absb);
    }
}

class Exercise9_9 {
    static String delChar(String src,String delChar){
        StringBuffer sb = new StringBuffer();
        for(int i =0; i<src.length();i++){
            char ch = src.charAt(i);
            if(delChar.indexOf(ch)!= -1){
                sb.append("");
            }
            else sb.append(ch);

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "
                + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> "
                + delChar("(1 2 3 4\t5)"," \t"));
    }
}