package desgin.Template;

public class Template01 {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello,World");
        d1.display();
        System.out.println();
        d2.display();

    }
}
abstract class AbstractDisplay{//추상클래스
    void display(){
        open();
        for(int i=0;i<5;i++){
            print();
        }
        close();
    }
    public abstract void open();
    public abstract void print();
    public abstract void close();
}

class CharDisplay extends AbstractDisplay{//구현클래스
    char ch;
    CharDisplay(char ch){
        this.ch = ch;
    }
    @Override
    public void open() {
        System.out.print("<<");
    }
    @Override
    public void print() {
        System.out.print(ch);
    }
    @Override
    public void close() {
        System.out.print(">>");
    }
}
class StringDisplay extends AbstractDisplay{//구현 클래스
    String str;
    int strLen ;
    StringDisplay(String str){
        this.str = str;
        strLen = str.length();
    }
    @Override
    public void open() {
        printline();
    }
    @Override
    public void print() {
        System.out.println("|"+str + "|");
    }
    @Override
    public void close() {
        printline();
    }
    private void printline(){
        System.out.print("+");
        for (int i = 0; i < strLen; i++) {
            System.out.print('-');
        }
        System.out.println("+");
    }
}