/**
 * @Author Zelex
 * @Date 2021/1/14 15:20
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("开始创建根目录....");
            Directory rootdir = new Directory("root");
            Directory bin = new Directory("bin");
            Directory tmp = new Directory("tmp");
            Directory usr = new Directory("usr");
            rootdir.add(bin);
            rootdir.add(tmp);
            rootdir.add(usr);
            bin.add(new File("QQ",1000));
            bin.add(new File("WeChat",2000));
            rootdir.printList();

            System.out.println("-------------------------");
            System.out.println("开始创建用户目录.....");
            Directory alibaba= new Directory("Alibaba");
            Directory byteDance = new Directory("ByteDance");
            Directory tencent = new Directory("Tencent");

            usr.add(alibaba);
            usr.add(byteDance);
            usr.add(tencent);

            alibaba.add(new File("taobao",1000));
            alibaba.add(new File("zhifubao",1500));
            byteDance.add(new File("tiktok",2000));
            byteDance.add(new File("toutiao",1000));
            tencent.add(new File("LOL",5000));
            rootdir.printList();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
