package muje;

public class test03 {
    public static void main(String[] args) {
        final int score = 100;
//        score = 200;
        byte a = 127;
        int b = 010;
        int c = 0x10;
        //1억이 넘을떄 접미사L필수
        long d = 1000000000L;
        //접미사f필수
        float e = 3.14f;
        double f = 3.14d;
        System.out.println(score);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        char ch = 'A';
        int ch1 = 'A';

        String str1 = "";
        String str2 = "abc";
        String str3 = "123";
        String str4 = str2 + str3;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(""+7+7);
        System.out.println(7+7+"");
    }
}
