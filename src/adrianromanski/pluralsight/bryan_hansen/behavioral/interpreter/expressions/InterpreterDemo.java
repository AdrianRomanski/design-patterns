package adrianromanski.pluralsight.bryan_hansen.behavioral.interpreter.expressions;

public class InterpreterDemo {

    static Expression buildInterpreterTree() {

        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        //Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        return new AndExpression(terminal3, alternation2);
    }


    public static void main(String[] args) {

        String context1 = "Lions";
        String context2 = "Tigers";
        String context3 = "Bears";
        String context4 = "Lions Tigers";
        String context5 = "Lions Bears";
        String context6 = "Tigers Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context1 + " is " + define.interpret(context1));
        System.out.println(context2 + " is " + define.interpret(context2));
        System.out.println(context3 + " is " + define.interpret(context3));
        System.out.println(context4 + " is " + define.interpret(context4));
        System.out.println(context5 + " is " + define.interpret(context5));
        System.out.println(context6 + " is " + define.interpret(context6));
    }
}
