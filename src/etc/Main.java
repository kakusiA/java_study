package etc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it
        if(args.length != 1){
            System.out.println("Usage: java -jar etc.jar Tc5_7");
            System.exit(0);
        }
        int money = Integer.parseInt(args[0]);
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