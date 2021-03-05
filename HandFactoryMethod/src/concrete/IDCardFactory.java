package concrete;

import framework.MyFactory;
import framework.MyProduct;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends MyFactory {
    private List<String> productList ;
    public IDCardFactory(){
        productList= new ArrayList<>();
    }

    @Override
    public MyProduct createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(MyProduct product) {
        productList.add(((IDCard)product).getOwner());
    }
}
