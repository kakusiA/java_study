package ch;

public class ch08_1 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }
        catch (RuntimeException e){
            System.out.println("근하하하");
        }
        finally {
            System.out.printf("마지막 막막");
        }
    }

}
class CoustomException extends Exception{//필수
    CoustomException(String msg){//defualt하게 String문자열을 매개변수로 받는 생성자
        super(msg);//조상인 Exception호출
    }
}

class d2312{
    public static void main(String[] args) {
        try {
            method1();
        }
        catch (Exception e){
            System.out.println("2번처리");
        }
    }
    static void method1() throws Exception{
        try {
            throw new Exception();
        }
        catch (Exception e){
            System.out.println("1번처리");
            throw e;
        }

    }
}