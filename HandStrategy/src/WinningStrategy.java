import java.util.Random;

/**
 * @Author Zelex
 * @Date 2021/1/8 19:21
 * @Version 1.0
 */
public class WinningStrategy implements Strategy {
    /***
     * 策略：如果上一局的手势胜了，下一局就与上一局相同；
     * 如果上一句手势输了，则下一局随机出手势
     */
    private Random random;//用来生成随机手势
    private boolean won=false;//保存上一局的输赢，赢就是true
    private Hand preHand;//保存上一局的手势
    public WinningStrategy(int seed){
        random=new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won){
            preHand=Hand.getHand(random.nextInt(3));//随机出一个手势
        }
        return preHand;
    }

    @Override
    public void study(boolean win) {//更新猜拳结果
        won=win;
    }
}
