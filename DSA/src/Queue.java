public class Queue {
    int front =0;
    int rear =-1;
    int[] arr;
    int size;
    public Queue(int size)
    {
        this.size = size;
        arr= new int[size];

    }

    public void enqueue(int data) throws Exception {

        if(!isFull())
        {
            rear = (rear+1) % arr.length;
            arr[rear] = data;
            size++;
        }
        else
        {
            throw new RuntimeException("Queue is full");
        }

    }

    public int dequeue()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Queue is Empty");
        }
        int tempdata = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return tempdata;

    }


    public int peek()
    {

        if(isEmpty())
        {
            throw new RuntimeException("Queue is Empty");
        }
        return arr[front];
    }
    public boolean isFull()
    {
        return size == arr.length;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }
}
