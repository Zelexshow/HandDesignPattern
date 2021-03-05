//针对Abstract的一种实现，针对每个抽象方法进行了实现
public class CharDisplay extends AbstractDisplay {
    private char ch;
    public CharDisplay(char ch){
        this.ch=ch;
    }
    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
