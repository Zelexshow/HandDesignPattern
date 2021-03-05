/**
 * @Author Zelex
 * @Date 2021/1/22 22:00
 * @Version 1.0
 */
//本类不处理任何方法，直接返回false
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return false;
    }
}
