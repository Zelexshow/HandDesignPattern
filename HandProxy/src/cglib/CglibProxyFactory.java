package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author Zelex
 * @Date 2021/2/10 18:00
 * @Version 1.0
 */
//代理对象工厂
public class CglibProxyFactory {
    private Object target;//被代理对象

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Enhancer.create(target.getClass(),
                target.getClass().getInterfaces(),
                new MethodInterceptor() {
                    @Override
                    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                        //obj表示代理对象，method表示被加强的方法，args对应方法的参数，
                        System.out.println(obj.getClass());
                        System.out.println(proxy.getClass());
                        Object result =null;//返回对象
                        if ("cook".equals(method.getName())){
                            System.out.println("使用Cglib加强的方法为："+method.getName());
                            System.out.println("做菜开始时间：" + System.currentTimeMillis());
                            result = method.invoke(target, args);
                            System.out.println("做菜完成时间：" + System.currentTimeMillis());
                        }
                        return result;
                    }
                });
    }
}
