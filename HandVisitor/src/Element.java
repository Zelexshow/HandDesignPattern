/**
 * @Author Zelex
 * @Date 2021/1/17 15:18
 * @Version 1.0
 */
//表示接受访问者的接口
public interface Element {
    void accept(Visitor visitor);
}
