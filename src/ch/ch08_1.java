package ch;

import javax.transaction.xa.XAException;

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
//    static void startInstall() throws SpaceException, MemoryException{
//        if(!enoughSpace())
//            throw new SpaceException("1");
//        if(!enoughMemory())
//            throw new MemoryException("2");
//    }
//
//    static void startInstall1() throws SpaceException{
//        if(!enoughSpace())
//            throw new SpaceException("1");
//        if(!enoughMemory())
//            throw new RuntimeException( new MemoryException("2"));//checked -> unckecked로 변환
//    }
}
class Test132{
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        int c = a+b;
        int d =10 +20;

    }
}
class ss{
    String a = "10";
    int b =20;
}
class bb{
    String a = "10";
}

class e2{
    public static void main(String[] args) {
        ss s1 = new ss();
        bb s2 = new bb();
        if (s1.a.equals(s2.a)){
            System.out.printf("성공");
        }
        else System.out.printf("실패");

        if(s1.a.contains(s2.a)){
            System.out.printf("성공");
        }
        else System.out.printf("실패");
        int [] a = new int[10];
        StringBuffer ss = new StringBuffer("2314");
        ss.append("e2");
        System.out.println(ss);

    }
}