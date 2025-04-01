package etc;

import static java.util.Arrays.sort;

public class study1 {
    public static void main(String[] args) {
        boolean a1 = true;
        char ch = 'A';
        byte b1 = 127;
        short a2 = 12341;
        int i = 123;
        int oct = 0100;
        int hex = 0x100;
        float f1 = 100f;
        long l = 10123124L;
        int zs = '1' + '2';
        int sum = b1 + a2;
        String s1 = "hellox";
        int sf = 123%4;
//        System.out.println(a1);
//        System.out.println(ch);
//        System.out.println(b1);
//        System.out.println(a2);
//        System.out.println(i);
//        System.out.println(oct);
//        System.out.println(hex);
//        System.out.println(s1);
//        System.out.println(f1);
//        System.out.println(l);
//        System.out.println(""+sum);
//        System.out.printf("age:%d",14);
        System.out.println(zs);
        System.out.println(sf);
        int a = 5;
        int b = 2;
        float c = a/b;
        float d = a/(float)b;
        float f = a/2f;
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        a ++;
        b +=1;
        d = a/(float)b;
        System.out.println(d);
        int j =0;
        i =0;
        j = i++;
        System.out.println(j);
        i = 0;
        j = 0;
        j = ++i;
        System.out.println(j);
        j = 0;
        j = j++ - ++j;
        System.out.println(j);
//        System.out.println(3/0);//오류
        System.out.println(3/0.0);//Infinity 무한대
        a = 1_000_000;
        b = 2_000_000;
        int result1 = a *a /a;
        int result2 = a/a*a;
        System.out.println(result1);
        System.out.println(result2);
        c = (long)a *b;
        System.out.println(c);
        System.out.println('2'-'0');
        char c1 = 'a'+1;
        System.out.println(c1);
        System.out.println("ㅁ" + 'a'*100);

        final int hour = 24;
        final int minute = 60;
        final int second = 60;
        int ss = hour * minute * second;
        int ss2 = 60 *60*24;
//        System.out.println(hour%(float)minute);
        float ff =0.1f;
        double d1 = 0.1;
        double d2 = ff;
        System.out.println(ff == d1); //double타입일떈 float타입이 double타입으로 변경되서 false가
        System.out.println(ff == (float)d1);//flaot로 타입 변경하면 ture
        System.out.println(d2);
        int[] sd = {1,2,3,4,5,6,1234,8,9};
        sort(sd);
//        System.out.println(sd[-1]);
        System.out.println(Math.max(0,sd[0]));
        System.out.println(Math.min(0,sd.length));
        System.out.println('A'+'B');
        System.out.println((int)'1');
        Long as1 = 1L;
        for (int k = 0; k<16; k++){
            as1 *=2;
        }
        System.out.println(as1-1);
    }
}
