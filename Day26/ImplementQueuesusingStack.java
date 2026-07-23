package Day26;

import java.util.Stack;

public class ImplementQueuesusingStack {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public ImplementQueueusingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        peek();
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        ImplementQueueusingStack q = new ImplementQueueusingStack();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.peek());   // 1
        System.out.println(q.pop());    // 1
        System.out.println(q.empty());  // false
    }
}
