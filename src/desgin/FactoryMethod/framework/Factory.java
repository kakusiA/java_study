package desgin.FactoryMethod.framework;

public abstract class Factory {
    public final Product create(String owner){
        Product p =  createProduct(owner);//추상메서드로 제품을 생성
        registerProduct(p);//추상메서드 제품 등록
        return p;
    }
    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product p);
}
