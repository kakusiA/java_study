package desgin.FactoryMethod;

import desgin.FactoryMethod.framework.Factory;
import desgin.FactoryMethod.framework.Product;
import desgin.FactoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p1 = factory.create("a");
        Product p2 = factory.create("b");
        Product p3 = factory.create("c");
        p1.use();
        p2.use();
        p3.use();
    }
}
