package muje;

public class test06 {
    public static void main(String[] args) {
        String str = "3";
        //문자열 -> 숫자로(int)
        int N = Integer.parseInt(str);
        //문자열3 -> 문자형 3
        char ch = str.charAt(0);
        //문자형3 -> 숫자 3
        System.out.println(ch -'0');
        //문자형3 -> 숫자 3 + 1 = 4
        System.out.println('3'-'0'+1);
        //숫자3 +1
        System.out.println(N + 1);
        //문자열 31
        System.out.println("3" +1);
        //문자 0 ->48 48+3 =51
        System.out.println(3 + '0');
    }
}
