/**
 * Created by den on 2017-01-19.
 */
public class TerminalExpression implements Expression {
    String input;

    public TerminalExpression(String input) {
        this.input = input;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(input))
            return true;
        return false;
    }
}
