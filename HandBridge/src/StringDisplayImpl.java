/**
 * @Author Zelex
 * @Date 2021/1/5 20:33
 * @Version 1.0
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;    //要显示的字符串
    private int width;  //字符串的宽度

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|"+string+"|");
    }

    @Override
    public void rawClose() {
        printLine();
    }
    private void printLine(){
        System.out.print("+"); //显示用来表示方框的角的"+"
        for (int i=0;i<width;i++){ //显示 width 个 "-"
            System.out.print("-");//将其用作方框的边框
        }
        System.out.println("+");//显示用来表示方框的角的"+"
    }
}
