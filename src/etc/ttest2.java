package etc;
import static java.lang.System.out;

public class ttest2{
    public static final int WIth = 50;
    private int prv =1;
    int dft =2;
    protected int prt =3;
    public int pbt =4;

    public void printMember(){
        out.println(prv);
        out.println(dft);
        out.println(prt);
        out.println(pbt);
    }
        }
 class ttest1 {
    public static void main(String[] args) {
        ttest2 t = new ttest2();
//        out.println(t.prv);//private는 같은클래스 내에서만 가능해서 오류발생!!
        out.println(t.dft);
        out.println(t.prt);
        out.println(t.pbt);
        out.println();
        out.println();
        out.println();
        t.printMember();
    }
}