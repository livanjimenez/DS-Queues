import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        printCAQueue();
    }

    public void printCAQueue() {
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
        
        // print circular array
        System.out.println(caQueue.circularArray);

        in.close();
    }
}