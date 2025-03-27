package muje;

public class test05 {
    public static void main(String[] args) {
        System.out.printf("%d%n",15);
        //#을 붙이면 접두사도 출력이됨
        System.out.printf("%#o%n",15);
        System.out.printf("%#x%n",15);
        //10진수를 2진수로변환시키는 함수 지시자는 s
        System.out.printf("%s%n",Integer.toBinaryString(15));
        float f = 123.456789f;
        System.out.printf("%f%n",f);
        System.out.printf("%e%n",f);
        System.out.printf("%f%n",f);
        System.out.printf("%5d%n",10);
        System.out.printf("%-5d%n",10);
        System.out.printf("%05d%n",10);
        String s = "www.example.com";
        System.out.printf("[%20s]%n",s);
        System.out.printf("[%-20s]%n",s);
        System.out.printf("[%.10s]%n",s);
    }
}
