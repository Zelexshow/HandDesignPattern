/**
 * @Author Zelex
 * @Date 2021/1/28 15:38
 * @Version 1.0
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {//根据数字生成指定个数的字符
        System.out.print("GraphObserver:");
        int num = generator.getNum();
        for (int i=0;i<num;i++){
            System.out.print('*');
        }
        System.out.println("");
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
