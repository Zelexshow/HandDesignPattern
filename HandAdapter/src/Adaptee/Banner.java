package Adaptee;
//被适配的类
public class Banner {
    private String string;
    public Banner(String str){
        this.string=str;
    }
    public void showWithParen(){
        System.out.println("("+string+")");
    }

    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
