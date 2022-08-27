import java.util.Stack;

public class Runner {
    public static void main(String[] args) {
        makeStack(new int[] { 1, 3, 5, 0, -1 });
    }

    public static Stack<Integer> makeStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }
        return stack;
    }
}