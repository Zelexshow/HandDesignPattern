import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author Zelex
 * @Date 2021/1/14 15:33
 * @Version 1.0
 */
public class Directory extends Entry{
    private String name;
    private ArrayList<Entry> directory=new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    /***
     * 重写add方法，这一点和File类不同，File类不能添加
     */
    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {//递归获得大小
        int size=0;
        Iterator<Entry> it = directory.iterator();
        while(it.hasNext()){
            Entry entry = it.next();
            size+=entry.getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix+"/"+this);/**首先打印本文件夹的名字*/
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()){
            Entry entry = it.next();
            entry.printList("\t"+prefix+"/"+name);
        }
    }
}
