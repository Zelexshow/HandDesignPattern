/**
 * @Author Zelex
 * @Date 2021/1/22 21:48
 * @Version 1.0
 */
//解决问题的抽象类
public abstract class Support {
    private String name;//解决类实例名
    private Support next;//要推卸给的实例对象

    public Support(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public final void support(Trouble trouble){
        if (resolve(trouble)){
            done(trouble);
        }else if (next!=null){
            next.support(trouble);
        }else{
            fail(trouble);
        }
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }
    //真正代表解决问题的类，由具体实现类完成，能解决则返回true
    public abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble){//输出解决信息
        System.out.println(trouble+"is resolved by "+this.name);
    }
    protected void fail(Trouble trouble){//输出未解决信息
        System.out.println(trouble+"can't be resolved ");
    }
    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }
}
