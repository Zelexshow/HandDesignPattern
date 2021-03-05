/**
 * @Author Zelex
 * @Date 2021/1/28 15:41
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator gen = new RandomNumberGenerator();
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        gen.addObserver(digitObserver);
        gen.addObserver(graphObserver);
        gen.execute();//执行，观察效果
    }
}
