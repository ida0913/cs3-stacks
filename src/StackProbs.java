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
        while(!positive.isEmpty()){
            negative.push(positive.pop());
        }
    return negative;
    }
}