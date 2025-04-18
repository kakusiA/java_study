package ch02.Ch08;
import java.util.*;
public class Test01 {
}
class Exercise8_8
{
    public static void main(String[] args)
    {
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0; //
        int count = 0; //
        do {
            count++;
            System.out.print("1 100 사이값:");
            try {
                input = new Scanner(System.in).nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("유효하지 않은 값입니다 다시 값을 입력해주세요. ");
                continue;
            }
            if(answer > input) {
                System.out.println(" 더큰수.");
            } else if(answer < input) {
                System.out.println(" 더작은수.");
            } else {
                System.out.println(" 맞췄습니다.");
                System.out.println("시도횟수는 "+count+" 번입니다.");
                  break; // do-while
            }
        } while(true); //

    } // end of main
} // end of class HighLow

class UnsupportedFuctionException extends RuntimeException{
    private final int ERR_CODE;
    UnsupportedFuctionException(String msg){
        this(msg, 100);
    }
    UnsupportedFuctionException( String msg,int errCode) {
        super(msg);
        this.ERR_CODE = errCode;

    }
    int getErrCode() {return ERR_CODE;}

    public String getMessage(){
        return "[" + getErrCode() + "]"+super.getMessage();
    }
}

class Exercise8_9{
    public static void main(String[] args) {
        throw new UnsupportedFuctionException("에바쎼바참치",200);
    }
}