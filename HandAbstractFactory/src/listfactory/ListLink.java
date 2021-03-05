package listfactory;

import factory.Link;

/**
 * @Author Zelex
 * @Date 2020/12/29 20:11
 * @Version 1.0
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\""+ url +"\">" + caption + "</a></li>\n";
    }
}
