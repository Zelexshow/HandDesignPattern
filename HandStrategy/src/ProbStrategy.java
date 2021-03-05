import java.util.Random;

/**
 * @Author Zelex
 * @Date 2021/1/8 19:52
 * @Version 1.0
 */
public class ProbStrategy implements Strategy {
    /***
     * 这个策略采用的是根绝概率来出手势，采用一个二维数组，
     * 行方向表示上一局出的手势，列方向表示下一局出的手势，
     * history[0][0]两局分别出石头、石头时胜了的次数，
     * history[i][j]的次数越大，表示胜率越高，下面举例：
     * 如果 history[0][0]=3,history[0][1]=5,history[0][2]=7
     * 那么下一局就会以石头、剪刀和布 比率3：5：7去决定出什么手势
     */
    private Random random;
    private int preHandValue=0;
    private int currentHandValue=0;
    private int[][] history={
            {1,1,1},
            {1,1,1},
            {1,1,1},
    };
    public ProbStrategy(int seed){
        random=new Random(seed);
    }
    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handValue=0;
        if (bet < history[currentHandValue][0]){
            handValue=0;
        }else if (bet < history[currentHandValue][0] + history[currentHandValue][1]){
            handValue=1;
        }else{
            handValue=2;
        }
        preHandValue=currentHandValue;
        currentHandValue=handValue;
        return Hand.getHand(handValue);
    }
    //根据nextHand方法返回的手势胜负结果来更新history
    @Override
    public void study(boolean win) {
        if (win){
            history[preHandValue][currentHandValue]++;
        }else{
            history[preHandValue][(currentHandValue+1) % 3]++;
            history[preHandValue][(currentHandValue+2) % 3]++;
        }
    }
    private int getSum(int hv){
        int sum=0;
        for (int i=0;i<3;i++){
            sum+=history[hv][i];
        }
        return sum;
    }
}
