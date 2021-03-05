/**
 * @Author Zelex
 * @Date 2021/1/8 15:41
 * @Version 1.0
 */

/**
 * 表示猜拳游戏中手势的类
 */
public class Hand {
    private static final int HANDVALUE_GUU=0;//表示石头的值
    private static final int HANDVALUE_CHO=1;//表示剪刀的值
    private static final int HANDVALUE_PAA=2;//表示布的值
    public static final Hand[] hand={
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA),
    };
    private static final String[] name={"石头","剪刀","布"};//表示猜拳中手势对应的字符串
    private int handValue;//猜拳中手势的值
    private Hand(int handValue){
        this.handValue=handValue;
    }
    public static Hand getHand(int handValue){//根据手势获得对应的实例，这里借鉴了单例模式
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand h){//如果this 胜了 h就返回true
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h){//如果this 胜了 h就返回true
        return fight(h) == -1;
    }

    public int fight(Hand h){//用来比较手势大小，平0，胜1，负-1
        if (this == h){
            return 0;
        }else if ((this.handValue+1)%3 == h.handValue){
            return 1;
        }else{
            return -1;
        }
    }
    public String toString(){
        return name[handValue];//返回手势对应的字符串
    }
}
