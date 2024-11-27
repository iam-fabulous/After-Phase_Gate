package queue;

public class Queue {
    private int front;
    private int rear;
    private int size;
    private int maxSize;
    private int[] queue;

    public Queue() {
        this.front = -1;
        this.rear = -1;
        this.size = 0;
        this.maxSize = 5;
        this.queue = new int[maxSize];
    }

    public boolean queueIsEmpty() {
        return this.front == -1 && this.rear == -1;
    }

    public boolean queueIsFull() {
        return rear == maxSize - 1;
    }

    public void add(int element) {
        if(queueIsFull()) {
            throw new IllegalStateException("Queue is full");
        } else if (queueIsEmpty()) {
            rear = front = rear + 1;
        }else {
            rear++;
        }
        queue[rear] = element;
        size++;

    }

    public int getSize() {
        return size;
    }

    public int remove() {
        int element = 0;
        if(queueIsEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } else if (front == rear) {
            element = queue[front];
            front = rear = -1;
            size--;
        }else {
            element = queue[front];
            front = front + 1;
            size--;
        }
        return element;
    }

    public int peek() {
        if(queueIsEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }
}
