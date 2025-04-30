package desgin.FactoryMethod.idcard;

import desgin.FactoryMethod.framework.Product;

public class IDCard extends Product{
    private String owner;

    IDCard(String owner){
        this.owner = owner;
    }
    @Override
    public void use(){
        System.out.println(this + "을 사용합니다.");
    }
    @Override
    public String toString() {
        return "[IDCard : " + owner + "]";
    }
    public String getOwner() {
        return owner;
    }
}
