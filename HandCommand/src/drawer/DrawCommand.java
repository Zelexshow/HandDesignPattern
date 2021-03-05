package drawer;

import command.Command;

import java.awt.*;

/**
 * @Author Zelex
 * @Date 2021/2/6 18:15
 * @Version 1.0
 */
public class DrawCommand implements Command {
    //绘制对象
    protected Drawable drawable;
    //绘制位置
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x,position.y);
    }
}
