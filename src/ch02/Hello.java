package ch02;
import java.util.*;
public class Hello {
    public static void main(String[] args) {
//        Tc3_3 tc3_3 = new Tc3_3();
//        System.out.println(tc3_3.b);
//        Tc3_4 tc3_4 = new Tc3_4();
//        System.out.println(tc3_4.b);
//        Tc3_5 tc3_5 = new Tc3_5();
//        System.out.println(tc3_5.b);
//        Tc3_6 tc3_6 = new Tc3_6();
//        System.out.println(tc3_6.b);
//        Tc3_7 tc3_7 = new Tc3_7();
//        System.out.println("화씨 = "+ tc3_7.a);
//        System.out.println("섭씨 = " + tc3_7.c);
//        Tc3_8 tc3_8 = new Tc3_8();
//        System.out.println(tc3_8.c);
//        System.out.println(tc3_8.ch);
//        System.out.println(tc3_8.f);
//        System.out.println(tc3_8.l);
//        System.out.println(tc3_8.result);
//        Tc3_9 tc3_9 = new Tc3_9();
//        System.out.println(tc3_9.result);
//        Tc3_10 tc3_10 = new Tc3_10();
//        System.out.println(tc3_10.lowerCase);
//        Tc4_1 tc4_1 = new Tc4_1();
//        System.out.println(tc4_1.intResult);
//        System.out.println(tc4_1.chResult);
//        System.out.println(tc4_1.ch2Result);
//        System.out.println(tc4_1.ch3Result);
//        System.out.println(tc4_1.ch4Result);
//        System.out.println(tc4_1.int2Result);
//        System.out.println(tc4_1.boolResult);
//        System.out.println(tc4_1.strResult);
//        Tc4_2 tc4_2 = new Tc4_2();
//        tc4_2.sum();
//        System.out.println(tc4_2.sumValue);
//        Tc4_3 tc4_3 = new Tc4_3();
//        tc4_3.sum();
//        System.out.println(tc4_3.sumValue);
//        Tc4_4 tc4_4 = new Tc4_4();
//        tc4_4.sum();
//        System.out.println(tc4_4.sumValue);
//        System.out.println(tc4_4.count);
//        Tc4_5 tc4_5 = new Tc4_5();
//        tc4_5.sum();
//        Tc4_6 tc4_6 = new Tc4_6();
//        tc4_6.sum();
//        Tc4_7 tc4_7 = new Tc4_7();
//        System.out.println(tc4_7.value);
//        Tc4_8 tc4_8 = new Tc4_8();
//        tc4_8.sum();
//        Tc4_9 tc4_9 = new Tc4_9();
//        tc4_9.sum();
//        System.out.println(tc4_9.sum);
//        Tc4_10 tc4_10 = new Tc4_10();
//        tc4_10.sum();
//        tc4_10.sum2();
//        System.out.println(tc4_10.sum);
//        Tc4_11 tc4_11 = new Tc4_11();
//        tc4_11.sum();
//        Tc4_12 tc4_12 = new Tc4_12();
//        tc4_12.sum();
//        Tc4_13 tc4_13 = new Tc4_13();
//        tc4_13.sum();
//        Tc4_14 tc4_14 = new Tc4_14();
//        tc4_14.sum();
//        Tc4_15 tc4_15 = new Tc4_15();
//        tc4_15.sum();
//        Tc5_3 tc5_3 = new Tc5_3();
//        tc5_3.sum();
//        Tc5_4 tc5_4 = new Tc5_4();
//        tc5_4.sum();
//        Tc5_5 tc5_5 = new Tc5_5();
//        tc5_5.sum();
//        Tc5_6 tc5_6 = new Tc5_6();
//        tc5_6.sum();
//        Tc5_7 tc5_7 = new Tc5_7();
//        tc5_7.sum();
        Tc5_8 tc5_8 = new Tc5_8();
        tc5_8.sum();
    }
}
class Tc3_2{
    int a = 123;
    int b = 10;
    int c = a/b +(a%b ==0 ? 0 :1);
}
class Tc3_3{
    int a = -10;
    String b = a<0 ? "음수" : "양수";
}
class Tc3_4{
    int a =454;
    int b = a/100*100;
}
class Tc3_5{
    int a = 777;
    int b = a/10*10 +1;
}
class Tc3_6{
    int a = 24;
    int b = (a%10 == 0 ? a/10*10 : (a/10 +1)*10) - a;
}
class Tc3_7{
    int a = 100;
    float b = (float)5/9 * (a-32);
    //소수점 3짜리 반올림
    float c = (int)(b*100 + (b%100 >5 ? 1 : 0))/(float)100;
}
class Tc3_8{
    byte a = 10;
    byte b = 20;
    byte c = (byte)(a + b);
    char ch = 'A' + 2;
    float f = (float)3/2;
    long l = 3000*3000*3000L;
    float f2 = 0.1f;
    double d = 0.1f;
    boolean result = d ==f2;
}
class Tc3_9{
    char ch = 'z';
    boolean result =  (ch >= '0' && ch <='9')||(ch>='A' && ch <='Z')||(ch>='a' && ch <='z');
}
class Tc3_10{
    char ch = 'A';
    char lowerCase = (ch>='A'&& ch<= 'Z') ? (char)((int)ch + 32) :ch;
}
class Tc4_1{
    int x = 15;
    boolean intResult = x >=10 && x <=20;
    char ch = 's';
    boolean chResult = ch != '\t' && ch != ' ';
    char ch2 = 'x';
    boolean ch2Result = ch2 == 'X' || ch2 == 'x';
    char ch3 = '0';
    boolean ch3Result = ch3 >='0' && ch3 <='9';
    char ch4 = 'd';
    boolean ch4Result = (ch4>='a' && ch4 <='z') || (ch4>='A' && ch4 <='Z');
    int y = 2400;
    boolean int2Result = y%400 ==0 || (y%4 == 0 && y%100 != 0);
    boolean powerOn = false;
    boolean boolResult = powerOn == false ? true : false;
    String str = "yes";
    boolean strResult = str.equals("yes");
}
class Tc4_2{
    int a =20;
    int sumValue;
    void sum()
    {
        for(int i = 1; i <=a; i++){
            if(i % 2 != 0 && i%3 !=0){
                sumValue += i;
            }
        }
    }
}
class Tc4_3{
    int a =0;
    int sumValue;
    void sum(){
        for(int i = 1; i <=10; i++){
            a += i;
            sumValue += a;
        }
    }
}
class Tc4_4{
    int count = 0;
    int sumValue;
    void sum() {
        while(true) {
            count++;
            if(count%2 == 0) {
                sumValue -= count;
            }
            else sumValue += count;
            if(sumValue >= 100) {
                break;
            }
        }
    }
}
class Tc4_5{
    int a = 0;
    int b = 0;
    void sum() {
        while(true) {
            loop1:while (true){
                if(a >=b ){
                    System.out.print("*");
                }
                else break;
                b++;
            }
            b = 0;
            if(a >10){
                break;
            }
            a++;
            System.out.println();
        }
    }
}
class Tc4_6{
    void sum() {
        for(int i = 1; i <=6; i++){
            for(int j = 1; j <=6; j++){
                if(i+j == 6){
                    System.out.println("i = " + i + " j = "+ j + "sum = " + (i+j));
                }
            }
        }
    }
}
class Tc4_7{
    int value = (int)(Math.random()*6)+1;
}
class Tc4_8{
    void sum() {
        for(int i = 0; i <=10; i++){
            for (int j = 0; j <=10; j++){
                if(2*i+ 4*j == 10){
                    System.out.println("x = " + i + " y = "+ j + " sum = " + (2*i+ 4*j));
                }
            }
        }
    }
}
class Tc4_9{
    String str = "12345";
    int sum = 0;
    void sum() {
        for(int i = 0; i <str.length(); i++){
            sum += str.charAt(i) - '0';//각 문자열의값를 알려줌
        }
    }
}
class Tc4_10{
    //int 12345 =>15
    int x = 1;
    int value = 12345;
    void sum() {
        int sum = 0;
        for(int i = 5; i >=0; i--){
            for(int j = 1; j <=i; j++){
                x *=10;
            }
            sum += value/x%10;
            x =1;
        }
        System.out.println(sum);
    }
    void sum2(){
        int sum = 0;
        while(value!= 0){
            sum += value%10;
            value /= 10;
        }
        System.out.println(sum);
    }
}
class Tc4_11{
    int a = 1;
    int b =1;
    int c = 0;
    void sum() {
        System.out.print(a + "," + b);
        for (int i = 0; i <8; i++){
            c = a + b;
            System.out.print("," + c);
            b = a;
            a = c;
        }
    }
}
class Tc4_12{
    void sum() {
        for(int i = 0; i <3; i++){
            for(int j = 1; j <4; j++){
                int value = 3*i+2;
                for (int k = 0; k < 3; k++) {
                    if (value+k >9){
                        break;
                    }
                    System.out.print((value +k) + "*" + j + " = " + (value+k)*j +"       ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
class Tc4_13{
    String str = "1ㅁ234";
    char ch = ' ';
    boolean isNumber = true;
    void sum() {
        for(int i = 0; i <str.length(); i++){
            ch = str.charAt(i);
            if(ch>='0' && ch<='9'){
                isNumber = true;
            }
            else {
                isNumber = false;
                break;
            }
        }
        if (isNumber){
            System.out.println(str+"는 숫자입니다.");
        }
        else System.out.println(str + "는 숫자가 아닙니다.");
    }
}
class Tc4_14{
    int answer = (int)(Math.random()*100)+1;
    int input = 0;
    int count = 0;
    Scanner sc = new Scanner(System.in);
    void sum() {
        System.out.println(answer);
        do {
            count ++;
            System.out.println("1과100사이에 값을 입력하세요 : ");
            input = sc.nextInt();
            if(answer == input){
                System.out.println("맞췄습니다.");
                break;
            }
            else if(answer < input){
                System.out.println("더 작은수를 입력하세요");
            }
            else System.out.println("더 큰수를 입력하세요");
        }while(true);
        System.out.println("시도 횟수는 " +count + "입니다.");
    }
}
class Tc4_15{
    int number = 12321;
    int tmp = number;
    int result = 0;
    void sum() {
        while(tmp != 0){
            result *=10;
            result += tmp%10;
            tmp = tmp/10;
        }
        System.out.println(result);
        if(number ==result){
            System.out.println(number + "는 회문수입니다.");
        }
        else System.out.println(number + "는 회문수가 아닙니다.");
    }
}
class Tc5_3{
    int[] arr = {10,20,30,40,50};
    int sum = 0;
    void sum() {
        for(int i = 0; i <arr.length; i++){
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
    }
}
class Tc5_4{
    int[][] arr = {
            {5,5,5,5,5},
            {10,10,10,10,10},
            {20,20,20,20,20},
            {30,30,30,30,30}
    };
    int total = 0;
    float average = 0;
    int count = 0;
    void sum() {
        for(int i = 0; i <arr.length; i++){
            for(int j = 0; j <arr[i].length; j++){
                total += arr[i][j];
                count ++;
            }
        }
        average =(float)total/count;
        System.out.println("총합 = " + total);
        System.out.println("평균 = " + average);
    }
}
class Tc5_5{
    int [] ballArr = {1,2,3,4,5,6,7,8,9};
    int [] ball3 = new int[3];
    void sum() {
        for(int i = 0; i <ballArr.length; i++){
            int j = (int)(Math.random()*ballArr.length);
            int tmp = 0;
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        for(int i = 0; i <ball3.length; i++){
            ball3[i] = ballArr[i];
        }
        for(int i = 0; i <ball3.length; i++){
            System.out.print(ball3[i]);
        }
    }
}
class Tc5_6{
    int[] coinUnit = {500,100,50,10};
    int money = 2680;
    void sum() {
        System.out.println("돈 = " + money);
        for(int i = 0; i <coinUnit.length; i++){
            System.out.println(coinUnit[i]+"원 :" +(money/coinUnit[i]));
            money = money%coinUnit[i];
        }
    }
}
class Tc5_7{
    void sum() {
//        if(args.length != 1){
//            System.out.println("Usage: java -jar etc.jar Tc5_7");
//            System.exit(0);
//        }
//        int money = Integer.parseInt(args[0]);
        int money = 3170;
        System.out.println("money: " + money);
        int[] coinUnit = {500,100,50,10};
        int[] coin = {5,5,5,5};
        for(int i = 0; i<coinUnit.length; i++){
            int coinNum = 0;
            coinNum = money/coinUnit[i];
            if(coinNum >=5){
                money = money-coinUnit[i]*coin[i];
                coinNum = 5;
                coin[i] = coin[i] -coinNum;
            }
            else{
                money = money%coinUnit[i];
                coin[i] = coin[i] - coinNum;
            }
            System.out.println(coinUnit[i] + "원 :" + coinNum);
//            System.out.println("money: " + money);
        }
        if(money > 0){
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0);
        }
        System.out.println("=남은 동전의 개수 =");
        for(int i = 0; i<coinUnit.length; i++){
            System.out.println(coinUnit[i] + "원:" + coin[i]);
        }
    }
}
class Tc5_8{
    int []answer = {1,4,4,3,1,4,4,2,1,3,2};
    int []counter = new int[4];
    void sum() {
        for(int i = 0; i <answer.length; i++){
//            if(answer[i] == 1){
//                counter[0]++;
//            }
//            else if(answer[i] == 2){
//                counter[1]++;
//            }
//            else if(answer[i] == 3){
//                counter[2]++;
//            }
//            else counter[3]++;
            switch (answer[i]){
                case 1:
                    counter[0]++;
                    break;
                case 2:
                    counter[1]++;
                    break;
                case 3:
                    counter[2]++;
                    break;
                case 4:
                    counter[3]++;
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i<counter.length; i++){
            System.out.print(counter[i]);
            for(int j = 0; j<counter[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}