/***
 * 这个方法用来调用Builder构建文档
 */
public class Director {
    private Builder builder;//作为构造参数传入
    public Director(Builder builder){
        this.builder=builder;
    }
    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("早上至下午");
        builder.makeItem(new String[]{
                "早上好。",
                "下午好。",
        });
        builder.makeString("晚上");
        builder.makeItem(new String[]{
                "晚上好。",
                "晚安。",
                "再见。",
        });
        builder.close();
    }
}


