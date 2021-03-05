package listfactory;

import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

/**
 * @Author Zelex
 * @Date 2020/12/29 20:09
 * @Version 1.0
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}




