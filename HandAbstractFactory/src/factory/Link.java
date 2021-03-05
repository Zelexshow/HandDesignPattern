package factory;

/**
 * @Author Zelex
 * @Date 2020/12/29 19:08
 * @Version 1.0
 */
/**抽象地表示HTML的超链接的类*/
public abstract class Link extends Item{
    /***
     * 尽管没有抽象方法，但是因为其未实现Item类中的makeItem方法，
     * 所以依然是抽象类
     */
    protected String url;
    public Link(String caption,String url) {
        super(caption);
        this.url=url;
    }
}
