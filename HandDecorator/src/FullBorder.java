/**
 * @Author Zelex
 * @Date 2021/1/16 15:26
 * @Version 1.0
 */

/***
 * 修饰类，为字符串四周都添加修饰符
 */
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns()+2;
    }

    @Override
    public int getRows() {
        return display.getRows()+2;
    }

    @Override
    public String getRowText(int row) {//边框修饰符使用 *
        if (row == 0){//第一行修饰，即上外边框
            return "+"+makeLine('*',display.getColumns())+"+";
        }else if (row == display.getRows()+1){//最后一行修饰，即下外边框
            return "+"+makeLine('*',display.getColumns())+"+";
        }else{
            return "|"+ display.getRowText(row-1)+"|";//指定行修饰
        }

    }
    //生成一个具有count次字符ch的字符串
    private String makeLine(char ch,int count){
        StringBuffer buf = new StringBuffer();
        for (int i=0;i<count;i++){
            buf.append(ch);
        }
        return buf.toString();
    }
}
