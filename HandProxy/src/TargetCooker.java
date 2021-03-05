/**
 * @Author Zelex
 * @Date 2021/2/10 16:49
 * @Version 1.0
 */
//被代理的目标类
public class TargetCooker implements Cooker{
    @Override
    public void cook(){
        System.out.println("大厨正在做菜...");
        try {
            Thread.sleep(500);//稍微休眠，用以耗时
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
