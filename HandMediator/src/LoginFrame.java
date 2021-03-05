import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author Zelex
 * @Date 2021/1/26 22:51
 * @Version 1.0
 */
public class LoginFrame extends Frame implements ActionListener,Mediator {
    //各个组成部分，即成员
    private ColleagueCheckBox checkGuest;//游客键
    private ColleagueCheckBox checkLogin;//登录键
    private ColleagueTextField textUser;//用户名
    private ColleagueTextField textPass;//密码
    private ColleagueButton buttonOk;//ok确认键
    private ColleagueButton buttonCancel;//取消键
    //生成并配置各个Colleague,显示对话框

    public LoginFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        //生成布局4×2窗格
        setLayout(new GridLayout(4,2));
        createCollegues();//生成各个Colleague
        //配置
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        //设置初始的启用/禁用状态
        collegueChanged();
        //显示
        pack();
        show();
    }

    @Override
    public void createCollegues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest= new ColleagueCheckBox("Guest", g, true);
        checkLogin= new ColleagueCheckBox("Login", g, false);
        textUser=new ColleagueTextField("",10);
        textPass=new ColleagueTextField("",10);
        textPass.setEchoChar('*');
        buttonOk=new ColleagueButton("OK");
        buttonCancel= new ColleagueButton("Cancel");
        //设置Mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        //设置listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void collegueChanged() {
        if (checkGuest.getState()){//游客模式被按下
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        }else{
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }
    //当textUser或者textPass文本框中发生变化时
    //判断Colleague的启用/禁用状态
    private void userpassChanged(){
        if (textUser.getText().length()>0){//用户名有输入时
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length()>0){
                buttonOk.setColleagueEnabled(true);
            }else{
                buttonOk.setColleagueEnabled(false);
            }
        }else {
            buttonOk.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
