package factory;

/**
 * @Author Zelex
 * @Date 2020/12/29 19:30
 * @Version 1.0
 */

import java.util.ArrayList;

/**表示的是一个含有多个Link类和Tray类的容器*/
public abstract class Tray extends Item{
    protected ArrayList<Item> tray=new ArrayList();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item){
        tray.add(item);
    }
}
