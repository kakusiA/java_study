package etc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it
        child child1 = new child();
        child1.x = 10;
        child1.y = 20;
        System.out.println(child1.x);
        System.out.println(child1.y);
        child1.play();
    }
}
class parent{ //부모클래스 변수 1개
    int x;
}
class child extends parent{//자식 클래스 변수2개
    int y;
    void play(){
        System.out.println("hello");
    }
}
class point{//부모
    int x;
    int y;
}
class Point3D extends point{//자식
    int z;
}
class Point3D2{ //일반
    int x;
    int y;
    int z;
}