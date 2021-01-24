package Stack;

public class ArrayStack {

    private int[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new int[capacity];
    }

    public void push(int data) {
        //If stack is full it will create a new array and copy previous values to new array.
        if(top == stack.length) {
            int[] newArray = new int[2 * stack.length];
            System.arraycopy(stack,0,newArray,0, stack.length);
            stack = newArray;
        }

        stack[top++] = data;
    }

    public int pop() {
        if(stack.length <= 0) {
            System.out.println("Stack is empty");
        }
        int temp = stack[top-1];
        top--;
        return temp;
    }

    public int peek() {
        return stack[top-1];
    }

    public void printStack() {
        for (int i = top - 1 ; i>= 0 ; i--) {
            System.out.println(stack[i]);
        }
    }
}
