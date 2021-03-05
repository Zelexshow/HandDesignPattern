import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import command.MacroCommand;
import drawer.DrawCanvas;
import drawer.DrawCommand;
import jdk.nashorn.internal.ir.CallNode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @Author Zelex
 * @Date 2021/2/6 18:35
 * @Version 1.0
 */
public class Main extends JFrame implements ActionListener, MouseMotionListener,WindowListener {
    //绘制的历史记录
    private MacroCommand history=new MacroCommand();

    //绘制区域
    private DrawCanvas canvas=new DrawCanvas(400,400,history);

    //删除按钮
    private JButton clearButton=new JButton("clear");

    public Main(String title){
        super(title);
        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton){
            history.clear();
            canvas.repaint();
        }
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        DrawCommand cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
