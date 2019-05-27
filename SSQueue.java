public class SSQueue extends MyStack {
    MyStack stack1;
    MyStack stack2;

    public SSQueue() {
        stack1 = new MyStack();
        stack2 = new MyStack();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int item = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return item;
    }
}