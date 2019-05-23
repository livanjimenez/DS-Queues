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

        // Check what's inside the array
        System.out.println(circularArray);
    }

    boolean isFull(CAQueue caQueue) {
        return (circularArray.size() == caQueue.capacity);
    }

    public int getFront() {
        return this.front;
    }

    public int getBack() {
        return this.back;
    }

    // Adds object to the queue
    public void enqueue(int item) {
        if (isFull(this))
            return;
        this.back = (this.back + 1) % this.capacity;


        // https://www.geeksforgeeks.org/queue-set-1introduction-and-array-implementation/
        // https://docs.oracle.com/middleware/1213/coherence/java-reference/com/tangosol/util/CircularArrayList.html


    }

    // Removes object from the queue
    public void dequeue() {

    }
}