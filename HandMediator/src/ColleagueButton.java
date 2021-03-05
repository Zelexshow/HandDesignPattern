import java.awt.*;

/**
 * @Author Zelex
 * @Date 2021/1/26 22:30
 * @Version 1.0
 */
//按钮类
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String label) throws HeadlessException {
        super(label);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {//Mediator下达启用/禁用指示
        setEnabled(enabled);
    }
}
