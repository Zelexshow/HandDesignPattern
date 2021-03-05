import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author Zelex
 * @Date 2021/2/10 17:15
 * @Version 1.0
 */
public class DynamicProxyFactory {
    private Object cooker;//被代理对象
    public DynamicProxyFactory(Object cooker) {
        this.cooker = cooker;
    }

    //生成代理对象
    public Object getInstance() {
        //1、首先获得得里对象(调用官方方法)
        return  Proxy.newProxyInstance(cooker.getClass().getClassLoader(),
                cooker.getClass().getInterfaces(),
                new InvocationHandler() {
                    //这个方法就是执行动态代理的本质方法
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //proxy表示代理对象，method表示被代理实例的方法，args表示被代理类方法的参数
                        System.out.println(proxy.getClass());
                        Object result = null;//返回值
                        //由于这里是针对cook类加强，所以需要判断
                        if ("cook".equals(method.getName())) {
                            System.out.println("被加强的方法为：" + method.getName());
                            System.out.println("做菜开始时间：" + System.currentTimeMillis());
                            result = method.invoke(cooker, args);
                            System.out.println("做菜完成时间：" + System.currentTimeMillis());
                        }
                        return result;
                    }
                });
    }
}
