/**
 * @Author Zelex
 * @Date 2021/1/16 13:52
 * @Version 1.0
 */
public class StringDisplay extends Display {
    private String string;//待显示的字符串

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row==0){//仅当row为0时返回
            return string;
        }else{
            return null;
        }
    }
}
