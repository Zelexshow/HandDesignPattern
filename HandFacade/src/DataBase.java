import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author Zelex
 * @Date 2021/1/23 20:42
 * @Version 1.0
 */
//获取指定数据库名对应的Properties
public class DataBase {
    private DataBase(){};
    public static Properties getProperties(String dbname){//根据数据库名获取配置
        String filename=dbname+".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
