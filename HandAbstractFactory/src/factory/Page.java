package factory;

/**
 * @Author Zelex
 * @Date 2020/12/29 19:34
 * @Version 1.0
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/***
 * 抽象产品类
 * 抽象地表示HTML页面的类；
 * 如果将Link和Tray比喻成抽象的“零件”，那么
 * Page就是抽象的“产品”
 */
public abstract class Page {
    protected  String title;/**页面的标题*/
    protected String author;/**页面的作者*/
    protected ArrayList<Item> content=new ArrayList<>();/**存放页面内容的容器*/

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    /**添加内容*/
    public void add(Item item){
        content.add(item);
    }
    /**将保存的HTML输出到文件*/
    public void output(){
        try {
            String filename=title+".html";
            FileWriter writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename+" 编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public abstract String makeHTML();
}
