/**
 * @Author Zelex
 * @Date 2021/1/16 15:51
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello,Java");
        Display b1 = new SideBorder(d1, '#');
        Display b2 = new FullBorder(b1);
        System.out.println("------无修饰符-------");
        d1.show();
        System.out.println("------采用了边框修饰后-------");
        b1.show();
        System.out.println("------再次添加四周框修饰后-------");
        b2.show();
    }
}
