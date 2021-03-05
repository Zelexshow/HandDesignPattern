/**
 * @Author Zelex
 * @Date 2021/2/1 16:56
 * @Version 1.0
 */

/***
 * 表示状态的接口
 */
public interface State {
    public void doClock(Context context,int hour);//设置时间
    public void doUse(Context context);//使用金库
    public void doAlarm(Context context);//按下警铃
    public void doPhone(Context context);//正常通话
}
