/**
 * @Author Zelex
 * @Date 2021/1/8 20:51
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int seed1=314;
        int seed2=15;
        Player p1 = new Player("拓海", new WinningStrategy(seed1));
        Player p2 = new Player("昊南", new ProbStrategy(seed2));
        for (int i=0;i<10;i++){
            Hand nextHand1 = p1.nextHand();
            Hand nextHand2 = p2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)){
                System.out.println("Winner:"+p1);
                p1.win();
                p2.lose();
            }else if (nextHand2.isStrongerThan(nextHand1)){
                System.out.println("Winner:"+p2);
                p2.win();
                p1.lose();
            }else{
                System.out.println("Even...");
                p2.even();
                p1.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
