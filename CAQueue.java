import java.util.ArrayList;

public class CAQueue {
    private int front;
    private int back;

    public int getFront(int front) {
        return this.front = front;
    }

    public int getBack(int back) {
        return this.back = back;
    }

    ArrayList<Integer> queue = new ArrayList<Integer>();

    public void startQueue() {
        for (int i = 0; i < 10; i++) 
            queue.add(i);
        
        System.out.println(queue);
    }

    public void enqueue() {

    }

    public void dequeue() {

    }
}