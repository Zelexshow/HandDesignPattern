/**
 *      这是一个构建文档的接口
 *     这个接口带有构建文档三部分的三个方法，以此构建一个文档
 */
public abstract class Builder {
    public abstract void makeTitle(String title);/**创建标题*/
    public abstract void makeString(String str);/**创建字符串*/
    public abstract void makeItem(String[] items);/**创建几个条目*/
    public abstract void close();/**关闭文档*/
}
