/**
 * @Author Zelex
 * @Date 2021/1/22 22:07
 * @Version 1.0
 */
public class OddlSupport extends Support {

    public OddlSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1){
            return true;
        }else{
            return false;
        }
    }
}
