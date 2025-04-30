package desgin.Adapter;

public class Adapter03 {
    public static void main(String[] args) {
        A adapter = new B();
        adapter.a();
        adapter.b();
    }
}

interface A{
    void a();
    void b();
}
class B extends C implements A{
    D d = new D();
    public void b(){
        d.d();
    }
    @Override
    public void a(){
        c();
    }
}

class C{
    void c(){
        System.out.println("나는 상속으로 재포장되었다.");
    }
}
class D{
    void d(){
        System.out.println("난 위임(포함)으로 재포장 되었다!");
    }
}