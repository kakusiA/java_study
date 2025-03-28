package etc;

import java.util.*;

//반복문과 조건식 샘플
public class if_for {
    public static void main(String[] args) {
        //if문
        int a = 100;
        int b = 100;
        int sum = a +b;
        if(sum == 300){
            System.out.println("a+b=" + sum);
        }
        else if (sum > 300){
            System.out.println("정답이 아닙니다.");
        }
        else{
            System.out.println("정답이 없습니다.");
        }
        //switch문
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("4");
                break;
        }
        //random 0.0에서 1.0사이에 값을 줌
        int a2 = (int)(Math.random() *10 +1);
        System.out.println(a2);
        //for문 무한
        int iz = 1;
        for(;;){
            System.out.println(iz);
            if(iz == 101){
                break;
            }
            iz++;
        }
        //for문 변수만 선정
        for(int i = 0;;){
            System.out.println(i);
            if(i == 100){
                break;
            }
            i++;
        }
        //for문
        for(int i = 0; i <10; i++){
            System.out.println(i);
        }
        //for 변수 2개 조건 for문
        for(int i =1,j=1; i<10 && i*j<50; i++,j+=2){
            System.out.println("a = " + i + ", b = " + j);
            System.out.println("sum = " + i*j);
        }
        //while문 조건식이 true일떄 반복
        int z1 = 10;
        while(z1>0){
            System.out.println(z1);
            z1 --;
        }
        //do-while문
        do{
            System.out.println("hello");
            z1 --;
        }while (z1>0);
        //무한반복문+break문+continue문
        while (true) {
            if(z1 == 100){
                break;
            }
            if (z1%2 == 0){
                z1++;
                continue;
            }
            System.out.println(z1);
            z1 ++;
        }
        //for이나while문에 이름을 부여하여 break를 지정할수있다.
        loop1 :for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.println(i+j);
                if(i+j == 60) {
                    break loop1;
                }
            }
        }
    }
}
