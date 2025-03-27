package muje;

import java.util.*;

public class scannerTest {
    public static void main(String[] args) {
        //System.in ->화면입력
        Scanner s = new Scanner(System.in);
        int N1 = s.nextInt();
        int N2 = s.nextInt();
        String input = s.nextLine();
        //인트형으로 바꾸는 함수
        int num = Integer.parseInt(input);
        System.out.println(N1);
        System.out.println(N2);
        System.out.println(num);
    }
}
