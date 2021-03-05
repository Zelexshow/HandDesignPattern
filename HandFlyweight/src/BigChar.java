import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Zelex
 * @Date 2021/2/2 17:14
 * @Version 1.0
 */
//表示大型字符的类
public class BigChar {
    //字符名字
    private char charName;
    //字符对应的字符串
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("big" + charName + ".txt"));
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null){
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontData=buf.toString();
        } catch (IOException e) {
            e.printStackTrace();
            this.fontData=charName+"?";
        }
    }
    //显示大型字符
    public void print(){
        System.out.println(fontData);
    }
}
