import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @Author Zelex
 * @Date 2021/1/26 22:42
 * @Version 1.0
 */
public class ColleagueCheckBox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;

    public ColleagueCheckBox(String label, CheckboxGroup group, boolean state) throws HeadlessException {
        super(label, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {//Mediator下达启用/禁用指示
        setEnabled(enabled);
    }
    public void itemStateChanged(ItemEvent e){
        mediator.collegueChanged();
    }
}
