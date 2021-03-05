/**
 * @Author Zelex
 * @Date 2021/1/5 20:21
 * @Version 1.0
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times){
        open();
        for (int i=0;i<times;i++){
            print();
        }
        close();
    }
}
