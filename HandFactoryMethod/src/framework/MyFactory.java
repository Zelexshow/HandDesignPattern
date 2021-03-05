package framework;
//顶级抽象类，定义需要的方法，本质上来讲是用来创造实例的模板方法
public abstract class MyFactory {
    public abstract MyProduct createProduct(String owner);
    public abstract void registerProduct(MyProduct product);
    public MyProduct create(String owner){
        MyProduct product = createProduct(owner);
        registerProduct(product);
        return product;
    }
}
