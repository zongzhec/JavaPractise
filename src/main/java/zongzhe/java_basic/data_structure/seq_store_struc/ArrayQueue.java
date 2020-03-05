package zongzhe.java_basic.data_structure.seq_store_struc;

/**
 * @see <a href="https://www.bilibili.com/video/av54029771?p=12</a>
 */
public class ArrayQueue {

    private int front;
    private int rear;
    private int maxSize;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        System.out.println("Creating ArrayQueue with maxsize = " + maxSize);
        this.maxSize = maxSize;
        this.front = -1;
        this.rear = -1;
        arr = new int[maxSize];
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int number) {
        if (isFull()) {
            System.out.println("Queue is full, cannot add more value!");
            return;
        }
        arr[rear++] = number;
        System.out.println("Added number " + number + " at pos: " + rear);
    }

    public int getFromQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty, cannot retrieve value!");
        }
        front++; // Because front is pointing the position prior to the first value.
        int value = arr[front];
        System.out.println("Getting value at " + front + ", and value is " + value);
        return value;
    }

    public void printAllValues() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Print all existing values from queue:");
        for (int i = front + 1; i <= rear; i++) {
            System.out.printf("%d\t", arr[i]);
        }
    }


}
