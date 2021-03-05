/**
 * @Author Zelex
 * @Date 2021/1/17 15:19
 * @Version 1.0
 */
//表示访问者的抽象类
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
