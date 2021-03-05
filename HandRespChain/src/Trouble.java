/**
 * @Author Zelex
 * @Date 2021/1/22 21:45
 * @Version 1.0
 */
//表示待解决的问题类
public class Trouble {
    private int number;//问题编号，后续的解决也是依照这个标准

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
