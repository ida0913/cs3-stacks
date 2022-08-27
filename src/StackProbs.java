import java.util.*;

public class StackProbs {

    public Stack<Integer> doubleUp(Stack<Integer> stack) {
        // create stack to add double numbers
        Stack<Integer> temp1 = new Stack<>();
        while (!stack.isEmpty()) {
            temp1.push(stack.peek());
            temp1.push(stack.pop());
        }
        // create stack to reverse order
        Stack<Integer> temp2 = new Stack<>();
        while (!temp1.isEmpty()) {
            temp2.push(temp1.pop());
        }
        return temp2;
    }

    public Stack<Integer> posAndNeg(Stack<Integer> stack) {
        Stack<Integer> positive = new Stack<>();
        Stack<Integer> negative = new Stack<>();

        while (!stack.isEmpty()) {
            if (stack.peek() < 0)
                negative.push(stack.pop());
            else
                positive.push(stack.pop());
        }
        while (!positive.isEmpty()) {
            negative.push(positive.pop());
        }
        return negative;
    }

    public Stack<Integer> shiftByN(Stack<Integer> stack, int n) {
        Stack<Integer> tempStack = new Stack<>();
        Stack<Integer> revAndComp = new Stack<>();
        while (stack.size() != n)
            tempStack.push(stack.pop());

        // reverse temp stack

        while (!tempStack.isEmpty())
            revAndComp.push(tempStack.pop());

        // set up elements you want shifted to top

        while (!stack.isEmpty())
            tempStack.push(stack.pop());

        // reverse top part
        while (!tempStack.isEmpty())
            revAndComp.push(tempStack.pop());

        return revAndComp;

    }
}