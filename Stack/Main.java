package Stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack s = new ArrayStack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.printStack();

        System.out.println("Deleted element " + s.pop());

        s.printStack();
        System.out.println(s.peek());
    }
}
