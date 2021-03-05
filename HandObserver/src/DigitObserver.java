/**
 * @Author Zelex
 * @Date 2021/1/28 15:35
 * @Version 1.0
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:"+generator.getNum());//输出观察到的数字
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
