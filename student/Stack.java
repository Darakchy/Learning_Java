package student;

public class Stack {
    private int[] stack;
    private int n = -1;

    public Stack() {
        this.stack = new int[5];
    }

    void push(int num) {
        if (n + 1 < 5) {
            n++;
            stack[n] = num;
        } else {
            System.out.println("Stack is full");
        }
    }

    void pop() {
        if (n > -1) {
            System.out.println(stack[n]);
            n--;
        } else {
            System.out.println("Stack is empty");
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(30);
        s1.push(9);
        s1.push(13);
        s1.push(19);
        s1.push(15);
        s1.push(14);
        s1.push(26);
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
    }
}
