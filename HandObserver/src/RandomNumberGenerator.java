import java.util.Random;

/**
 * @Author Zelex
 * @Date 2021/1/28 15:32
 * @Version 1.0
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random random=new Random();//随机数生成器
    private int number;//当前数值
    @Override
    public int getNum() {
        return number;
    }

    @Override
    public void execute() {
        for (int i=0;i<10;i++){
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
