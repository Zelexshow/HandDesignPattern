package factory;

/**
 * @Author Zelex
 * @Date 2020/12/29 19:04
 * @Version 1.0
 */
/**抽象零件类*/
/**Link类和Tray类的父类*/
public abstract class Item {
    protected String caption;/**表示项目的标题*/

    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
