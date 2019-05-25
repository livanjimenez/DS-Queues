import java.util.ArrayList;

public class CAQueue {
    private int front;
    private int back;
    private int capacity;
    private int size;
    ArrayList<Integer> circularArray;

    public CAQueue(int capacity) {
        this.capacity = capacity;
        // back = capacity - 1;
        // front = 0;
        circularArray = new ArrayList<>(capacity);

    }

    boolean isFull() {
        return (getSize() == capacity);
    }

    public int getFront() {
        return this.front;
    }

    public int getBack() {
        return this.back;
    }

    public int getSize() {
        return this.size;
    }

    // Adds item to the queue
    public void enqueue(int item) {
        if (!isFull()) {
            circularArray.add(back, item);
            back = ((back + 1) % capacity);
            size++;
        } else {
            System.out.println("Queue is full!");
        }
    }

    // Removes item from the queue
    public int dequeue() {
        int data = circularArray.get(front);

        if (!circularArray.isEmpty()) {
            front = ((front + 1) % capacity);
            size--;
        } else {
            System.out.println("Queue is empty!");
        }

        // keep it circular
        return data;
    }

}