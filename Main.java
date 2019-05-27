import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        // Remove comment to test
        //testCAQueue();
        //testMyStack();
        testSSQueue();
    }

    public void testCAQueue() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a capacity for the queue: ");
        int inputCap = in.nextInt();

        // init object
        CAQueue caQueue = new CAQueue(inputCap);

        System.out.print("Enter " + inputCap + " number of items you want in the queue.\n:");

        // loop for user input
        for (int i = 1; i <= inputCap; i++) {
            int item = in.nextInt();
            caQueue.enqueue(item);
        }
        
        // test dequeue
        caQueue.dequeue();

        // showQueue
        caQueue.showQueue();
        
        in.close();
    }

    public void testMyStack() {
        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(1);
        myStack.push(2);
        myStack.pop();
        System.out.println(myStack.stack);
    }

    public void testSSQueue() {
        SSQueue ssQueue = new SSQueue();
        
        ssQueue.enqueue(1);
    }
}