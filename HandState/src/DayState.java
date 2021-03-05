/**
 * @Author Zelex
 * @Date 2021/2/1 17:00
 * @Version 1.0
 */
//表示白天的状态
public class DayState implements State{
    private static DayState state=new DayState();
    private DayState(){};
    public static State getInstance(){
        return state;
    }
    @Override
    public void doClock(Context context, int hour) {//设置时间
        if (hour<9 || 17<=hour){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {//使用金库
        context.recordLog("使用金库（白天）");
    }

    @Override
    public void doAlarm(Context context) {//按下警铃
        context.callSecurityCenter("按下警铃(白天)");
    }

    @Override
    public void doPhone(Context context) {//正常通话
        context.callSecurityCenter("正常通话(白天)");
    }

    @Override
    public String toString() {
        return "{白天}";
    }
}
