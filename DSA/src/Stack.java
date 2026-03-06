public class Stack {

    int arr[];
    int top;
    int size;
    public Stack(int size )
    {
        this.size = size;
        arr = new int[size];
        top =-1;
    }
    public void push(int data)
    {
        if(top == size -1)
        {
            System.out.println("Stack overflow");
            return;
        }
        else
        {
            arr[++top]= data;
        }
    }

    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            return arr[top--];
        }
        return 0;
    }

    public int peek()
    {
        return arr[top];
    }



}
