package desgin.Adapter;

public class Adapter01 {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}

interface Print{
    void printWeak();
    void printStrong();
}

class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);//조상 생성자 호출
    }

    @Override
    public void printWeak(){
        showWithParen();//메서드를 숨겨서 Banner메서드를 병경해둬 main메서드는 변경안되도록 함
    }

    @Override
    public void printStrong(){
        showWithAster();//메서드를 숨김
    }
}

class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
class Adapter011 {
    public static void main(String[] args) {
        Print1 print = new PrintBanner1("Hello");
        print.printWeak();
        print.printStrong();
    }
}

abstract class Print1{
    abstract void printWeak();
    abstract void printStrong();
}

class PrintBanner1 extends Print1{
    private Banner1 banner;
    public PrintBanner1(String string) {
        this.banner = new Banner1(string);//조상 생성자 호출
    }

    @Override
    public void printWeak(){
        banner.showWithParen();//객체를 생성한후 메서드를 호출함 이또한 메서드를 재포장해서 숨김
    }

    @Override
    public void printStrong(){
        banner.showWithAster();//메서드를 숨김
    }
}

class Banner1 {
    private String string;

    public Banner1(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}