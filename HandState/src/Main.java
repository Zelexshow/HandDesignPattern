/**
 * @Author Zelex
 * @Date 2021/2/1 17:58
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while(true){
            for (int hour = 0;hour<24;hour++){
                frame.setClock(hour);//设置时间
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
