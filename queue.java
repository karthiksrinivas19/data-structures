
public class queue{
    private int[] queue;
    private int front;
    private int rear;
    private int maxsize;

    public queue(int size) {
        this.maxsize = size;
        this.queue = new int[maxsize];
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue(int key) {
        if ((rear == maxsize - 1 && front == 0) || front == rear + 1) {
            System.out.println("OVERFLOW");
        } else {
            if (front == -1) {
                front++;
                rear = 0;
            } else if (rear == maxsize - 1) {
                rear = 0;
            } else {
                rear++;
            }
            queue[rear] = key;
        }
    }

    public int dequeue() {
        int x = -1;

        if (front == -1) {
            System.out.println("UNDERFLOW");
        } else {
            x = queue[front];

            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == maxsize - 1) {
                front = 0;
            } else {
                front++;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        queue myQueue = new queue(5);

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        System.out.println("Dequeued element: " + myQueue.dequeue());
        System.out.println("Dequeued element: " + myQueue.dequeue());

        myQueue.enqueue(40);
        myQueue.enqueue(50);


        System.out.println("Remaining elements in the queue:");
        while (myQueue.front != -1) {
            System.out.println(myQueue.dequeue());
        }
    }
}

