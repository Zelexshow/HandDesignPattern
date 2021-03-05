/**
 * @Author Zelex
 * @Date 2021/1/22 22:18
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Support alice=new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 101);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddlSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);
        //构造责任链
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        //制造问题，测试~
        for (int i=0;i<500;i++){
            alice.support(new Trouble(i));
        }
    }
}
