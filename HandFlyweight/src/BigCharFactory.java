import java.util.HashMap;

/**
 * @Author Zelex
 * @Date 2021/2/2 17:41
 * @Version 1.0
 */
public class BigCharFactory {
    //管理已经生成的BigChar的实例
    private HashMap<String,BigChar> pool=new HashMap<>();
    //单例模式
    private static BigCharFactory singleton=new BigCharFactory();
    private BigCharFactory(){};

    public static BigCharFactory getSingleton(){
        return singleton;
    }

    //生成共享实例
    public synchronized BigChar getBigChar(char charName){
        BigChar po = pool.get("." + charName);
        if (po == null){
            po=new BigChar(charName);
            pool.put("."+charName,po);
        }
        return po;
    }
}
