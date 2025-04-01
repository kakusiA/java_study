package classStudy;

public class methord {
    public static void main(String[] args) {
//        int []a = new int[10];
//        printarr(a);
//        System.out.println();
//        for (int i = 0; i < 10; i++) {
//            a[i] = (int) (Math.random() * 100)+1;
//        }
//        printarr(a);//메서드 호출
//        System.out.println();
//        int result = sum(3,5);
//        System.out.println(result);
        Maths mt = new Maths();
        int x = 200;
        int y = 150;
        long result1 = mt.add(x,y);
        long result2 = mt.div(x,y);
        long result3 = mt.mul(x,y);
        long result4 = mt.sub(x,y);
        long result5 = mt.max(x,y);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        mt.printGuGudan(10);
    }
    // void는 반환값이 없음
    static void printarr(int [] numArr){
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
    }
    // 반환값이 있음
    static int  sum(int x, int y){
        int result = x+y;
        return result;
    }
}
class Maths{
    void printGuGudan(int a){
        System.out.println("Gugudan");
        if(!(2<=a && a<=9)){
            return;
        }
        for(int i=1;i<=a;i++){
            for(int j=1;j<=9;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
    long add(long a,long b){return a+b;}
    long sub(long a,long b){return a-b;}
    long mul(long a,long b){return a*b;}
    long div(long a,long b){return a/b;}
    long max(long a,long b){
        if(a>b) return a;//조건식이 참일때나 거짓일때 둘다 return이 필요함
        else return b;
    }

}

