package framework;

public interface Product extends Cloneable {
    /**用于使用，实现交给子类*/
    public abstract void use(String s);
    /**用于复制实例*/
    public abstract Product createClone();
}


