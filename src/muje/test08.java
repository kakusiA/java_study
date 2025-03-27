package muje;

import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        //switch문
        int a = 2;
        switch(a) {
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println("정답");
                break;
            case 3:
                System.out.println(a);
                break;
            default:
                System.out.println(a);
                break;
        }
        //random()은 0.0부터 0.999999...값중 임의의 값을 한개줌
        double b = Math.random();
        System.out.println(b);
        //1부터 10까지의 램덤
        int c = (int)(Math.random()*10)+1;
        System.out.println(c);
        //1부터 10까지 램덤으러 10개 숫자 발행
        for(int i =0; i<20; i++){
            int d = (int)(Math.random()*10)+1;
            System.out.println(d);
        }
        //0부터 100까지 2에 배수만 더하기
        //for문
        int sum = 0;
        for(int i = 0; i<=100; i+=2){
            sum += i;
        }
        System.out.println(sum);
        //while문
        int sum2 = 0;
        int a3 = 0;
        while (a3<=100){
            sum2 += a3;
            a3 +=2;
        }
        System.out.println(sum2);
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        int sum3 = 0,num13 = 0;
        //문자열을 int로 변경
        num13 = Integer.parseInt(tmp);
        while (num13 !=0) {
            sum3 += num13%10;
            num13 /= 10;
        }
        System.out.println(sum3);
        //do-while문은 최초 1회는 무조건 실행됨
        int ss = 23;
        System.out.println(ss);
        do{
            int num = sc.nextInt();
            if (num == ss) {
                System.out.println("정딥입니다.");
                break;
            }
            else if (num > ss) {
                System.out.println("값이 더 많습니다.");
            }
            else {
                System.out.println("값이 더 적습니다.");
            }
        //무한반복
        }while(true);
        //break contiue
        sum =0;
        for(int i =0; i<=100;i++){
            if(i%2 ==0){
                continue;
            }
            else{
                sum += i;
            }
            if(sum >= 1234){
                System.out.println(i);
                break;
            }
        }
        System.out.println(sum);
    }
}
