/**
 * @Author Zelex
 * @Date 2021/2/11 12:15
 * @Version 1.0
 */
public class AndExpression implements Expression {
    private Expression exp1;
    private Expression exp2;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) && exp2.interpret(context);
    }
}
