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
}