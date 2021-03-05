/**
 * @Author Zelex
 * @Date 2021/1/8 19:19
 * @Version 1.0
 */
public interface Strategy {
    public abstract Hand nextHand();/**获取下一局的手势*/
    public abstract void study(boolean win);/**学习上一次的手势是否获胜*/
}
