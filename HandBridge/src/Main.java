/**
 * @Author Zelex
 * @Date 2021/1/5 21:03
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello,China."));
        Display d2 = new Display(new StringDisplayImpl("Hello,World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello,Universe."));
        d1.display();
        d2.display();
        d3.multiDisplay(5);
    }
}
