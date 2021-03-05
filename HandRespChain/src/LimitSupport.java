/**
 * @Author Zelex
 * @Date 2021/1/22 22:02
 * @Version 1.0
 */
//只解决limit以下的问题
public class LimitSupport extends Support{
    private int limit;

    public LimitSupport(String name,int limit) {
        super(name);
        this.limit=limit;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber()<limit){
            return true;
        }else {
            return false;
        }
    }
}
