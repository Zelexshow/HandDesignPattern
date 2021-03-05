//模板类,定义了一系列的方法
public abstract class AbstractDisplay {
    //待实现的方法
    public abstract void open();
    public abstract void print();
    public abstract void close();

    //具体方法，封装流程
    public final void display(){
        open();
        for (int i=0;i<5;i++){
            print();
        }
        close();
    }
}
