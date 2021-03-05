import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * @Author Zelex
 * @Date 2021/1/26 22:33
 * @Version 1.0
 */
public class ColleagueTextField extends TextField implements TextListener,Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) throws HeadlessException {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {//Mediator下达启用/禁用指示
        setEnabled(enabled);
        setBackground(enabled?Color.white:Color.lightGray);
    }
    public void textValueChanged(TextEvent event){
        mediator.collegueChanged();//当文字发生变化时通知Mediator
    }
}
