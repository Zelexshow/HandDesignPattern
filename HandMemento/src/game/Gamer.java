package game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Author Zelex
 * @Date 2021/1/28 16:24
 * @Version 1.0
 */
//游戏玩家类
public class Gamer {
    private int money;//所持金钱
    private List<String> fruits=new ArrayList<>();//水果
    private Random random =new Random();
    private static String[] fruitsname={
            "苹果","葡萄","香蕉","橘子"
    };

    public Gamer(int money) {
        this.money = money;
    }
    public int getMoney(){
        return money;
    }
    //游戏主逻辑
    public void bet(){
        int dice = random.nextInt(6) + 1;
        if (dice == 1){
            money+=100;
            System.out.println("所持金钱增加了。");
        }else if (dice == 2){
            money/=2;
            System.out.println("所持金钱减半了。");
        }else if (dice == 6){
            String f = getFruit();
            System.out.println("获得了水果("+f+")。");
            fruits.add(f);
        }else{
            System.out.println("什么也没发生。");
        }
    }
    //拍摄快照，记录状态
    public Memento createMemento(){
        Memento memento = new Memento(money);
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()){
            String f = it.next();
            if (f.startsWith("好吃的"))//注意，只保存好吃的
            memento.addFruit(f);
        }
        return memento;
    }
    public void restoreMemento(Memento memento){//撤销
        this.money = memento.money;
        this.fruits=memento.getFruits();

    }
    private String getFruit(){
        String prefix="";
        if (random.nextBoolean()){
            prefix="好吃的";
        }
        return prefix+fruitsname[random.nextInt(fruitsname.length)];
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
