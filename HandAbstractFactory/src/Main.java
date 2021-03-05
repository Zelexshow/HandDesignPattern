import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

/**
 * @Author Zelex
 * @Date 2020/12/29 20:08
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("listfactory.ListFactory");
        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://gmw.com");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");

        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("检索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "老和山拓海");
        page.add(traynews);
        page.add(traysearch);
        page.output();

    }
}

