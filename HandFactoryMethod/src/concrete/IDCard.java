package concrete;

import framework.MyProduct;

public class IDCard extends MyProduct {
    private String owner;
    public IDCard (String owner){
        this.owner=owner;
    }
    @Override
    public void use() {
        System.out.println("使用"+owner+"的IDCard");
    }
    public String getOwner(){
        return owner;
    }
}
