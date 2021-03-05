package factory;

/**
 * @Author Zelex
 * @Date 2020/12/29 19:55
 * @Version 1.0
 */
/***
 * 抽象工厂类
 */
public abstract class Factory {
    /**通过Class类动态加载工厂*/
    public static  Factory getFactory(String classname){
        Factory factory=null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }
    /**通过Class类动态加载工厂*/
    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);

}
