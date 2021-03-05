import concrete.IDCardFactory;
import framework.MyFactory;
import framework.MyProduct;

public class Main {
    public static void main(String[] args) {

        MyFactory factory=new IDCardFactory();
        MyProduct card1 = factory.create("小明");
        MyProduct card2 = factory.create("NaNa");
        MyProduct card3 = factory.create("java");
        card1.use();
        card2.use();
        card3.use();
    }
}
