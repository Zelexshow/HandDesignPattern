/**
 * @Author Zelex
 * @Date 2021/1/17 16:02
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("开始创建根目录....");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");

            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);

            bindir.add(new File("vi",10000));
            bindir.add(new File("latex",20000));
            rootdir.accept(new ListVisitor());

            System.out.println("----------------------");
            System.out.println("创建用户目录....");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomure = new Directory("tomure");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomure);
            yuki.add(new File("diary.html",100));
            yuki.add(new File("composite.java",200));
            hanako.add(new File("memo.tex",300));
            tomure.add(new File("game.doc",400));
            tomure.add(new File("junk.mail",500));
            rootdir.accept(new ListVisitor());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
