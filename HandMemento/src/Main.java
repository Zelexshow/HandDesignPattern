import game.Gamer;
import game.Memento;

/**
 * @Author Zelex
 * @Date 2021/1/28 16:56
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //初始状态
        Gamer gamer = new Gamer(100);//初始金额为100
        Memento memento = gamer.createMemento();
        for (int i=0;i<100;i++){
            System.out.println("------第"+i+"次掷色子------");
            System.out.println("当前状态："+gamer);
            gamer.bet();//开始游戏

            System.out.println("所持金钱为"+gamer.getMoney()+"元");
            //决定如何处理momento
            if (gamer.getMoney() > memento.getMoney()){
                System.out.println("###金钱增加，保存游戏当前状态###");
                memento=gamer.createMemento();
            }else if (gamer.getMoney() <= memento.getMoney()/2){
                System.out.println("!!!金钱减少，回滚到之前状态!!!");
                gamer.restoreMemento(memento);
            }
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}
