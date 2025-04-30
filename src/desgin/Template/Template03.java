package desgin.Template;

public class Template03 {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello,World");
        d1.display();
        System.out.println();
        d2.display();

    }
}
interface AbstractDisplay1{
    void display();
    void open();
    void print();
    void close();
}

class CharDisplay1 implements AbstractDisplay1 {//구현클래스
    char ch;
    @Override
    public void display(){
        open();
        for(int i=0;i<5;i++){
            print();
        }
        close();
    }


    CharDisplay1(char ch){
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
class StringDisplay1 implements AbstractDisplay1 {//구현 클래스
    String str;
    int strLen ;
    public void display(){
        open();
        for(int i=0;i<5;i++){
            print();
        }
        close();
    }
    StringDisplay1(String str){
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
