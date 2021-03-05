/**
 * @Author Zelex
 * @Date 2021/1/5 20:18
 * @Version 1.0
 */
/**基准类*/
public class Display {
    private DisplayImpl impl;
    public Display(DisplayImpl impl) {
        this.impl = impl;
    }
    public void open(){
        impl.rawOpen();
    }
    public void print(){
        impl.rawPrint();
    }
    public void close(){
        impl.rawClose();
    }
    public final void display(){
        open();
        print();
        close();
    }
}
