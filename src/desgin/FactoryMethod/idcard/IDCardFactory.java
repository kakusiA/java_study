package desgin.FactoryMethod.idcard;

import desgin.FactoryMethod.framework.Factory;
import desgin.FactoryMethod.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner){
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product p){
        System.out.println(p + "을 등록헀습니다.");
    }
}
