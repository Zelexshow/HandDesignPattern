import java.util.stream.IntStream;
public class TextBuilder  extends Builder{
    private StringBuffer buffer=new StringBuffer();
    @Override
    public void makeTitle(String title) {
        buffer.append("===============================\n");
        buffer.append("【"+title+"】\n");//为标题添加【】
        buffer.append("\n");//换行
    }

    @Override
    public void makeString(String str) {
        buffer.append('■'+str+"\n");//为字符串添加■
        buffer.append("\n");
    }

    @Override
    public void makeItem(String[] items) {//为纯文本条目添加.
        //采用Java8流式循环，替代for循环尝试
        IntStream.range(0,items.length).forEach(i -> buffer.append(" ·"+items[i]+"\n"));
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("=====================\n");
    }
    public String getResult(){
        return buffer.toString();
    }
}
