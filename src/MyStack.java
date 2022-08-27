import java.util.EmptyStackException;

public class MyStack {
    private Integer[] stack;
    private int size;

    public MyStack(int initCap) {
        stack = new Integer[initCap];
        size = this.getSize();
    }

    public MyStack() {

        stack = new Integer[2];
        size = this.getSize();
    }

    public int getSize() {
        size = 0;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null) {
                size++;
            }
        }
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Integer peek() {
        if (this.isEmpty())
            throw new EmptyStackException();

        return stack[size - 1];
    }

    public Integer pop() {
        if (this.isEmpty())
            throw new EmptyStackException();

        int temp = stack[size - 1];
        stack[size - 1] = null;
        size = this.getSize();
        return temp;

    }

    public void push(int num) {
        if (size == stack.length)
            doubleCapacity();

        stack[size - 1] = num;

        size = this.getSize();
    }

    public void doubleCapacity() {
        Integer[] newStack = new Integer[stack.length * 2];
        size = this.getSize();
        for (int i = 0; i < size; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
        size = this.getSize();
    }
}