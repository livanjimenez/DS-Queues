import java.util.ArrayList;

public class CAQueue {
    private int front;
    private int back;
    ArrayList<Integer> circularArray;
    private int capacity;

    public CAQueue(int capacity) {
        this.capacity = capacity;
        back = capacity - 1;
        front = 0;
        circularArray = new ArrayList<>(capacity);
        
    }

    boolean isFull() {
        // .size() doesnt work?

        return (circularArray.size() == capacity);
    }

    public int getFront() {
        return this.front;
    }

    public int getBack() {
        return this.back;
    }

    // Adds item to the queue
    public void enqueue(int item) {
        if (!isFull()) {
            circularArray.add(back, item);

            back = ((back + 1) % capacity);
        } else {
            System.out.println("Queue is full!");
        }
    }

    // Removes item from the queue
    public void dequeue() {

    }
}