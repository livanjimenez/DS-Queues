public class SSQueue {
    MyStack stack1;
    MyStack stack2;

    public SSQueue() {
        stack1 = new MyStack();
        stack2 = new MyStack();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public void dequeue() {
        if (stack2.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack2.pop();
    }

    public void printSSQueue() {
        System.out.println(stack1.stack);
    }
}