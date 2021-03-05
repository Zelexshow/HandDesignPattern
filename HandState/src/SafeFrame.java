import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author Zelex
 * @Date 2021/2/1 17:16
 * @Version 1.0
 */
public class SafeFrame extends Frame implements ActionListener,Context {
    private TextField textClock=new TextField(60);//显示当前时间
    private TextArea textScreen=new TextArea(10,60);//显示警报中心的记录
    private Button buttonUse=new Button("使用金库");//使用金库按钮
    private Button buttonAlarm=new Button("按下警铃");//按下警铃按钮
    private Button buttonPhone=new Button("正常通话");//正常通话按钮
    private Button buttonExit=new Button("结束通话");//结束按钮
    private State state=DayState.getInstance();//当前状态

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        //配置textClock
        add(textClock,BorderLayout.NORTH);
        textClock.setEditable(false);
        //配置textScreen
        add(textScreen,BorderLayout.CENTER);
        textScreen.setEditable(false);
        //为界面添加按钮
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        //配置界面
        add(panel,BorderLayout.SOUTH);
        //显示
        pack();
        show();
        //设置监听器
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    //设置时间
    @Override
    public void setClock(int hour) {
        String clockString="现在的时间是";
        if (hour<10){
            clockString+="0"+hour+":00";
        }else{
            clockString+=hour+":00";
        }
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this,hour);
    }
    //改变状态
    @Override
    public void changeState(State state) {
        System.out.println("从"+this.state+"状态变为了"+state+"状态。");
        this.state=state;
    }
    //联系警报中心
    @Override
    public void callSecurityCenter(String s) {
        textScreen.append("call!"+s+"\n");
    }
    //在警报中心中留下记录
    @Override
    public void recordLog(String s) {
        textScreen.append("record..."+s+"\n");

    }
    //按下按钮后该方法会被调用
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse){//金库使用按钮
            state.doUse(this);
        }else if (e.getSource() == buttonAlarm){//按下警铃按钮
            state.doAlarm(this);
        }else if (e.getSource() == buttonPhone){//正常通话按钮
            state.doPhone(this);
        }else if (e.getSource() == buttonExit){
            System.exit(0);
        }else{
            System.out.println("?");
        }
    }
}
