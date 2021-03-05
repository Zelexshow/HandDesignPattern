/**
 * @Author Zelex
 * @Date 2021/1/16 15:14
 * @Version 1.0
 */
public abstract class Border extends Display{
    protected Display display;//被包装的类

    public Border(Display display) {
        this.display = display;
    }
}
