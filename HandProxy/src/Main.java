import cglib.CgCooker;
import cglib.CglibProxyFactory;

/**
 * @Author Zelex
 * @Date 2021/2/10 16:59
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        TargetCooker targetCooker = new TargetCooker();
        System.out.println("------------开始测试静态代理---------------");
        /***
         * 静态代理测试
         */
        StaticProxyCooker staticProxyCooker = new StaticProxyCooker(targetCooker);
        staticProxyCooker.cook();

        /***
         * Java原生动态代理
         */
        System.out.println("------------开始测试原生动态代理---------------");
        DynamicProxyFactory dynamicProxyFactory = new DynamicProxyFactory(targetCooker);
        Cooker dynamicProxyCooker = (Cooker)dynamicProxyFactory.getInstance();//class com.sun.proxy.$Proxy0
        dynamicProxyCooker.cook();

        /***
         * Cglib动态代理
         */
        System.out.println("------------开始测试Cglib动态代理---------------");
        CgCooker cgCooker = new CgCooker();//创建目标对象
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(cgCooker);
        CgCooker proxyCgCooker = (CgCooker)cglibProxyFactory.getProxyInstance();
        proxyCgCooker.cook();
    }
}
