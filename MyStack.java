import java.util.ArrayList;

public class MyStack {
    ArrayList<Integer> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    public void push(int item) {
        stack.add(item);
    }

    public int pop() {
        int removeItem = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return removeItem;
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}