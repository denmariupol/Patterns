/**
 * Created by den on 2017-01-19.
 */
public class InterpertRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaCoreExpression();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println("Java developer knows java core:"+isJava.interpret("java core"));
        System.out.println("Java developer knows java ee:"+isJavaEE.interpret("Java Spring"));
    }

    static Expression getJavaCoreExpression(){
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("java core");

        return new OrExpression(java,javaCore);
    }

    static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("java");
        Expression javaSpring = new TerminalExpression("jav spring");

        return new AndExpression(java,javaSpring);
    }
}
