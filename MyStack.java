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
        if (stack.size() == 0)
            System.out.println("Stack is empty!");

        return stack.remove(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}