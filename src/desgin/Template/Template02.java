package desgin.Template;

import java.io.InputStream;

//기존
public class Template02 {
    public static void main(String[] args) {
        Brid bridge = new Ostrich();
        bridge.fly();
    }
}

class Brid{
    public  void fly(){
        System.out.println("새는 날아요~");
    }
}
class Sparrow extends Brid{

}

class Ostrich extends Brid{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("타조는 못남 ㅅㄱ");
    }
}
//LSP
class Template021{
    public static void main(String[] args) {

    }
}
class Brid1{

}
interface Flyable{
    public void fly();
}
class Sparrow1 extends Brid implements Flyable{
    @Override
    public void fly() {
        System.out.println("fly fly");
    }
}

class Ostrich1 extends Brid{
}
