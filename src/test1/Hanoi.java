package test1;

public class Hanoi {
    public static void main(String[] args) {
        int tray =4;
        Hanoiii ha =  new Hanoiii(tray);
        ha.moveHanoi(tray,'a','b','c');
    }
}

class Hanoiii{
    private int tray;
    public Hanoiii(int tray){
        this.tray = tray;
    }
    public void moveHanoi(int tray,char a,char b,char c){

    }

}
