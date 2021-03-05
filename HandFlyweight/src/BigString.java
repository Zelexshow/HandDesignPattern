/**
 * @Author Zelex
 * @Date 2021/2/2 17:54
 * @Version 1.0
 */
//生成大型字符串
public class BigString {
    private BigChar[] bigChars;
    //构造函数
    public BigString(String string){
        bigChars=new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getSingleton();
        for (int i=0;i<bigChars.length;i++){
            bigChars[i]=factory.getBigChar(string.charAt(i));
        }
    }
    //显示
    public void print(){
        for (int i=0;i<bigChars.length;i++){
            bigChars[i].print();
        }
    }
}
