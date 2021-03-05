/**
 * @Author Zelex
 * @Date 2021/2/10 16:52
 * @Version 1.0
 */
//静态代理类，仅实现接口即可
    //在这里可以添加额外的功能，比如开启日志功能
public class StaticProxyCooker implements Cooker{
    private Cooker cooker;

    public StaticProxyCooker(Cooker cooker) {
        this.cooker = cooker;
    }

    @Override
    public void cook() {
        System.out.println("做菜开始时间："+System.currentTimeMillis());
        cooker.cook();//目标方法
        System.out.println("做菜完成时间："+System.currentTimeMillis());
    }
}
