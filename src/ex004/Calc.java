package ex004;
import java.util.Stack;


public class Calc {


    public double evaluate(String expr) {
        if (expr.isEmpty()) return 0;
        Stack<Double> digitStack = new Stack<>();
        Double a, b;
        for (String atom : expr.split(" ")) {
            switch (atom) {
                case "+":
                    digitStack.push(digitStack.pop() + digitStack.pop());
                    break;
                case "-":
                    a = digitStack.pop();
                    b = digitStack.pop();
                    digitStack.push(b - a);
                    break;
                case "/":
                    a = digitStack.pop();
                    b = digitStack.pop();
                    digitStack.push(b / a);
                    break;
                case "*":
                    digitStack.push(digitStack.pop() * digitStack.pop());
                    break;
                default:
                    digitStack.push(Double.parseDouble(atom));
            }

        }
        return digitStack.pop();

    }
}