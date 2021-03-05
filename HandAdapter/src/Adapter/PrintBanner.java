package Adapter;

import Adaptee.Banner;
import Target.Print;

/*适配器*/
public class PrintBanner extends Banner implements Print  {

    public PrintBanner(String str) {
        super(str);
    }


    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
