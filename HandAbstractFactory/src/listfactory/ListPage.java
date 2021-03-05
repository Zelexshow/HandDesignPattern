package listfactory;

import factory.Item;
import factory.Page;

import java.util.Iterator;

/**
 * @Author Zelex
 * @Date 2020/12/29 20:11
 * @Version 1.0
 */
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+ title +"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<ul>\n");
        Iterator<Item> it = content.iterator();
        while (it.hasNext()){
            buffer.append(it.next().makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author +"</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}

