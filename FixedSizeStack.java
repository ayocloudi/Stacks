public class FixedSizeStack {
    private String[] stack;
    private int top;

    public FixedSizeStack() {
        stack = new String[100]; // Fixed size of 100 elements
        top = -1; // Initialize top to -1 to indicate the stack is empty
    }

    public boolean push(String item) {
        if (isFull()) {
            return false; // Push operation ignored because the stack is full
        }
        stack[++top] = item;
        return true;
    }

    public String pop() {
        if (isEmpty()) {
            return null; // Stack is empty, cannot pop
        }
        return stack[top--];
    }

    public String peek() {
        if (isEmpty()) {
            return null; // Stack is empty, nothing to peek
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }
}
