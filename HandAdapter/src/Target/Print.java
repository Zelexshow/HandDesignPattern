package Target;
/*类适配器目标类*/
//本类负责定义所需要的方法，后面的适配器需要实现本接口
public interface Print {
    public abstract void printWeak();
    public abstract void printStrong();
}
