package game;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Zelex
 * @Date 2021/1/28 16:16
 * @Version 1.0
 */
public class Memento {
    int money;//所持金钱，采用默认权限，是保证同一个包下的Gamer能够访问
    ArrayList<String>fruits;//所持水果
    public int getMoney(){
        return money;
    }
    Memento(int money) {//只有Game能够初始化
        this.money = money;
        fruits=new ArrayList();
    }
    void addFruit(String fruit){
        fruits.add(fruit);
    }
    List getFruits(){//获取当前所有水果
        return (List) fruits.clone();
    }
}
