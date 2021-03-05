/**
 * @Author Zelex
 * @Date 2021/1/22 22:07
 * @Version 1.0
 */
public class SpecialSupport extends Support {
    private int number;

    public SpecialSupport(String name,int number) {
        super(name);
        this.number=number;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number){
            return true;
        }else{
            return false;
        }
    }
}
