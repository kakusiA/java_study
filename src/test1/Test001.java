package test1;

import etc.ttest2;

import static java.lang.System.out;

public class Test001 {
    public static void main(String[] args) {
        Test002 t = new Test002();
//        out.println(t.prv);//같은 클래스가 아님
//        out.println(t.dft);//같은 패키지가 아님
//        out.println(t.prt);//패키지와 자손이아님
        out.println(t.pbt);//public은 가능
        out.println();
        t.printMember();
    }
}
class Test002 extends ttest2 {
    public void printMember(){
//        out.println(prv);//같은 클래스가 아님
//        out.println(dft);//같은 패키지가 아님
        out.println(prt);//자손이어서가능
        out.println(pbt);
    }
}

class test123{
    public static void main(String[] args) {
        PointAccount account = new PointAccount(1000);

        // 충전 테스트 (0원 충전 → 예외 발생)
        try {
            account.charge(0);
        } catch (InvalidChargeAmountException e) {
            System.out.println("[충전 실패] " + e.getMessage());
        }

        // 500포인트 구매
        try {
            account.purchase(500);
        } catch (InsufficientPointsException e) {
            System.out.println("[구매 실패] " + e.getMessage());
        }

        // 600포인트 구매 (잔액 부족 예외 발생)
        try {
            account.purchase(600);
        } catch (InsufficientPointsException e) {
            System.out.println("[구매 실패] " + e.getMessage());
        }
    }
}

class PointAccount {
    private int  balance;

    PointAccount(int a){
        balance = a;
    }
    public void charge(int amount) throws InvalidChargeAmountException{
        if (amount <= 0){
            throw new InvalidChargeAmountException("잔액을 입력하지 않았습니다.");
        }
        balance += amount;
    }

    public void purchase(int cost) throws InsufficientPointsException{
        if(cost > balance){
            throw new InsufficientPointsException("잔액이 부족합니다.");
        }
        balance -= cost;
        out.println("남은잔액은 : " + balance);
    }
    public int getBalance(){
        return balance;
    }
}

class InvalidChargeAmountException extends Exception{
    public InvalidChargeAmountException(String str){
        super(str);
    }
}

class InsufficientPointsException extends Exception{
    public InsufficientPointsException(String str){
        super(str);
    }
}