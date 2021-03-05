/**
 * @Author Zelex
 * @Date 2021/1/16 15:19
 * @Version 1.0
 */

/***
 * 边框修饰类，为字符串左右两侧添加修饰符
 */
public class SideBorder extends Border {
    private char borderchar;//边框修饰的字符
    public SideBorder(Display display,char borderchar) {
        super(display);
        this.borderchar=borderchar;
    }

    @Override
    public int getColumns() {
        return display.getColumns()+2;//原来的字符串加上边框两个字符

    }

    @Override
    public int getRows() {
        return display.getRows();//被修饰字符串的行数
    }

    @Override
    public String getRowText(int row) {
        return borderchar+display.getRowText(row)+borderchar;//原来的字符串加上边框两个字符
    }
}
