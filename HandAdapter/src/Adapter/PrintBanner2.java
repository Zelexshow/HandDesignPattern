package Adapter;

import Adaptee.Banner;
import Target.Print2;

public class PrintBanner2 extends Print2 {
    private Banner banner;
    public PrintBanner2(String str){
        this.banner=new Banner(str);
    }
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
