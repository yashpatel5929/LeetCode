package stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;

    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty()) {
            minStack.push(val);
        }else if(val < minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        st.pop();
        minStack.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
