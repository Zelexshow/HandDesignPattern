package drawer;

import command.MacroCommand;

import java.awt.*;

/**
 * @Author Zelex
 * @Date 2021/2/6 18:23
 * @Version 1.0
 */
public class DrawCanvas extends Canvas implements Drawable {
    //颜色
    private Color color=Color.red;
    //要绘制的原点的半径
    private int radius=6;
    //命令的历史记录
    private MacroCommand history;

    public DrawCanvas(int width,int height,MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history=history;
    }

    public void paint(Graphics g){
        history.execute();
    }
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x-radius,y-radius,radius*2,radius*2);
    }
}
