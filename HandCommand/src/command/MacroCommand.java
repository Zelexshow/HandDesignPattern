package command;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Author Zelex
 * @Date 2021/2/6 18:06
 * @Version 1.0
 */
public class MacroCommand implements Command {
    //命令的集合
    private Stack<Command> commands=new Stack<>();
    @Override
    public void execute() {
        Iterator<Command> it = commands.iterator();
        while (it.hasNext()){
            Command next = it.next();
            next.execute();
        }
    }
    //添加一个命令
    public void append(Command cmd){
        if (cmd!=null){
            commands.push(cmd);
        }
    }
    //删除最后一个命令
    public void undo(){
        if (!commands.empty()){
            commands.pop();
        }
    }
    //删除所有的命令
    public void clear(){
        commands.clear();
    }
}
