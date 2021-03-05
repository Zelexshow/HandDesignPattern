/**
 * @Author Zelex
 * @Date 2021/2/1 16:57
 * @Version 1.0
 */
//负责状态管理和联系警报中心的接口
public interface Context {
    void setClock(int hour);//设置时间
    void changeState(State state);//改变状态
    void recordLog(String s);//联系警报中心
    void callSecurityCenter(String s);//在警报中心留下记录
}
