package Client;

import Adapter.PrintBanner;
import Adapter.PrintBanner2;
import Target.Print;
import Target.Print2;

//主类，用于
public class Main {
    public static void main(String[] args) {
        Print print=new PrintBanner("java");
        print.printWeak();
        print.printStrong();

        ///采用委托制的适配器
        Print2 print2 = new PrintBanner2("super java");
        print2.printWeak();
        print2.printStrong();
    }
}
