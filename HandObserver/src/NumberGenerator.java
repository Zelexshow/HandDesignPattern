import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author Zelex
 * @Date 2021/1/28 15:20
 * @Version 1.0
 */
public abstract class NumberGenerator {
    private ArrayList<Observer> observers=new ArrayList<>();
    public void addObserver(Observer observer){//注册Observer
        observers.add(observer);
    }
    public void deleteObserver(Observer observer){//删除Observer
        observers.remove(observer);
    }
    public void notifyObservers(){//向观察者发通知
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer o = iterator.next();
            o.update(this);
        }
    }
    public abstract int getNum();//获取数值
    public abstract void execute();//生成数值
}
