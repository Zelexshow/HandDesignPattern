import framework.Product;

public class UnderlinePen implements Product {
    private char ulcochar;//用来作为边框修饰的字符
    public UnderlinePen(char ulcochar) {
        this.ulcochar = ulcochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i=0;i<length;i++){
            System.out.print(ulcochar);
        }
        System.out.println(" ");
    }

    @Override
    public Product createClone() {
        Product p=null;
        try {
            p=(Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}


