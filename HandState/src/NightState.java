/**
 * @Author Zelex
 * @Date 2021/2/1 17:00
 * @Version 1.0
 */
//表示白天的状态
public class NightState implements State{
    private static NightState state=new NightState();
    private NightState(){};
    public static State getInstance(){
        return state;
    }
    @Override
    public void doClock(Context context, int hour) {//设置时间
        if (9<=hour&&hour<17){
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {//使用金库
        context.recordLog("紧急：晚上使用金库");
    }

    @Override
    public void doAlarm(Context context) {//按下警铃
        context.callSecurityCenter("按下警铃(晚上)");
    }

    @Override
    public void doPhone(Context context) {//正常通话
        context.callSecurityCenter("晚上的通话录音");
    }

    @Override
    public String toString() {
        return "{晚上}";
    }
}
