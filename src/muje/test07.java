package muje;
//연산자
public class test07 {
    public static void main(String[] args) {
        int i = 0,j =0;
        //전위형
        j = ++i;
        System.out.println("전위형 = " +j);
        //후위형
        j = 0;
        i = 0;
        j = i++;
        System.out.println("후위형 = " +j);
        //부호연산자
        int x = 10;
        x = -x;
        System.out.println(x);
        x = -x;
        System.out.println(x);
        //형변환 연산자
        double d = 85.4;
        //(타입)피연사자
        int score = (int)d;
        System.out.println(d);
        System.out.println(score);
        char ch = 'A';
        //ch1 = 65
        //(int)생략가능
        int ch1 = (int)ch;
        //ch2 = A
        char ch2 = (char)ch1;
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);
        float a = 1.6f;
        //a1 = 1
        int a1 = (int)a;
        //a2 = 1.0f
//        int a2 = (float)10;
        System.out.println(a);
        System.out.println(a1);
//        System.out.println(a2);
        int c =300;
        //형변환과정에서 값손실있음 4byte보다 크기때문
        byte c1 = (byte)c;
        System.out.println(c1);
        int v = 'a'  + 'v';
        System.out.println(v);
        int i1 = 1_000_000;
        int i2 = 2_000_000;
        //오버플러우 발생
        System.out.println(i1*i2);
        //형변환변환시 long타입으로 변경되기때문에 오버플러우 발생안함
        System.out.println((long)i1*i2);
        //반올림 Math.round()
        long result = Math.round(4.52);
        System.out.println(result);
        double result2 = Math.round(3.141592 *100)/100.0;
        System.out.println(result2);
        //3141.592-> 3141 ->3.141
        System.out.println((int)(3.141592*1000)/1000.0);
        //비교연산자
        int z1 = 10;
        int z2 = 15;
        System.out.println(z1 == 10);
        System.out.println(z1 == 15);
        System.out.println(z2 != 10);
        System.out.println(z2 != 15);
        System.out.println(z1 > z2);
        System.out.println(z1 < z2);
        //문자열 비교 .equals()사용 또는 .equalsIgnoreCase()
        //equals->대소문자 상관 O equalsIgnoreCase ->대소문자 상관 X
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        //new String 사용시 ==는 사용 불가능
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        //논리 연산자 && and ,|| or
        // true or false -> true and true -> true 결과 true
        System.out.println((z1 == 10 ||z2 ==10)&& z2 ==15);
        //문자형 숫자가 진짜 숫자인지 판단하기위한 식
        char strNum1 = '5';
        System.out.println('0'<=strNum1&&strNum1<='9');
        //문자형이 영어인지 판단
        char chEn = 'S';
        //false or true -> true
        System.out.println(('a'<=chEn&&chEn<='z')||('A'<=chEn&&chEn<='Z'));
        //조건 연산자
        //앞에 조건을 판단하여 맞으면 앞에값 아니면 뒤의값
        String da1 = (5>3)? "정답":"틀림";
        System.out.println(da1);
        //z1 = 10 z2 =15이므로 false
        String da2 = (z1>z2)? "true": "false";
        System.out.println(da2);
        //대입연산자 오 ->왼
        int xx;
        // x-> lvalue 3 -> rvalue
        // lvalue 저장공간 -> 배열 or 변수
        xx = 3;
    }
}
