/**
 * @Author Zelex
 * @Date 2021/1/26 22:23
 * @Version 1.0
 */
//仲裁者接口
public interface Mediator {
    public void createCollegues();//生成Mediator要管理的组员
    public void collegueChanged();//被各个Collegue调用让组员向仲裁者报告
}
