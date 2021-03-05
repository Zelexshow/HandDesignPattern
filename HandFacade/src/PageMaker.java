import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author Zelex
 * @Date 2021/1/23 21:17
 * @Version 1.0
 */
//Facade角色，使用DataBase和HtmlMaker
public class PageMaker {
    private PageMaker(){};
    public static void makeWelcomePage(String mailAddr,String fileName){
        try {
            Properties mailprop = DataBase.getProperties("maildata");//获取目标配置
            String username = mailprop.getProperty(mailAddr);
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(fileName));
            htmlWriter.title("Welcome to "+username+"'s page!");
            htmlWriter.paragraph("欢迎来到"+username+" 的主页");
            htmlWriter.paragraph("等你的邮件哦！");
            htmlWriter.mailto(mailAddr,username);
            htmlWriter.close();
            System.out.println(fileName+"is created for" + mailAddr+" ("+username+")");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
