package ch.ch09;

import java.util.Arrays;
import java.util.Objects;

public class ch09_1 {
    public static void main(String[] args) {
        Value va1 = new Value(10);
        Value va2 = new Value(10);
        System.out.println(va1.equals(va2));//참조 변수의 주소 값이 달라서 false
    }
}

class Value{
    int val;
    Value(int val){
        this.val =val;
    }
    public int hashCode(){//해쉬코드 오버라이딩
        return Objects.hash(val);
    }
    public boolean equals(Object obj) {
        if (obj instanceof Value) {
            return this.val == ((Value) obj).val;
        }
        else return false; // false로해도 상관없음
    }
}
class Hashs{
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        System.out.println(v1.equals(v2));
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
    }
}
class Str1{
    public static void main(String[] args) {
        String str = new String("abc");//String생성
        System.out.println(str);
        char [] ch ={ 'a', 'b','d'};
        String str1 = new String(ch);//char -> String으로 변경
        System.out.println(str1);
        StringBuffer buf = new StringBuffer("1234");
        String str2 = new String(buf);//버퍼 -> String변환
        System.out.println(str2);
        char ch1 = str.charAt(1);//index 1값 반환
        System.out.println(ch1);
        int i = str.compareTo(str1);//사전에딸라  == 0, > 1, < -1반환
        System.out.println(i);
        String str3 = str.concat(str2);//합치기
        System.out.println(str3);
        boolean bol = str1.contains("bd");//특정 문자열있는지 확인
        System.out.println(bol);
        boolean bol1 = str2.endsWith("34");//로 끝나는 문자열 확인
        System.out.println(bol1);
        String str4 = "abd";
        boolean bol2 = str1.equals(str4);//비교
        System.out.println(bol2);
        String str5 = "ABD";
        boolean bol3 = str4.equalsIgnoreCase(str5);//대소문자 없이 비교
        System.out.println(bol3);
        int i2 = str4.indexOf('b');//문자열에 b의 인덱스값 반환
        System.out.println(i2);
        int i3 = str3.length();//문자열의 길이
        System.out.println(i3);
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");//정규식으로 짜름
        System.out.println(Arrays.toString(arr));
        boolean bol4 = animals.startsWith("dog");//해당문자로 시작하는지
        System.out.println(bol4);
        String str6 = animals.substring(4,7);//4에서7까지 문자가져오기
        System.out.println(str6);
        String str7 = "ABCD";
        String str8 = str7.toLowerCase();//소문자 변환
        System.out.println(str8);
        String str9 = str8.toUpperCase();//대문자변환
        System.out.println(str9);
        String str10 = "     apple banana       ";
        String str11 = str10.trim();//앞뒤공백제거
        System.out.println(str10);
        System.out.println(str11);
        int a = 10;
        String b = String.valueOf(a);//형변환
        System.out.println(b);
    }
}