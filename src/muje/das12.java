package muje;

public class das12 {
    public static void main(String[] args) {
        //int -> float -> int 변환과정에서 오차발생할수있음
        int x = 512;
        int y = 91234567;
        float y1 = y;
        double y2 = y;
        int y3 = (int)y1;
        int y4 = (int)y2;
        System.out.println(y);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);
//        System.out.println((byte)x);
    }
}
