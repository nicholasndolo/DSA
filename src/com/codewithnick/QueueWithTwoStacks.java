package com.codewithnick;

import java.util.Stack;

public class QueueWithTwoStacks {
    private Stack<Integer> stackA = new Stack<>();
    private Stack<Integer> stackB = new Stack<>();

    public void enqueque(int item) {
        stackA.push(item);
    }

    public int dequeue() {
        if(isEmpty())
            throw new IllegalStateException();

        moveStackAToStackB();

        return stackB.pop();
    }

    private void moveStackAToStackB() {
        if(stackB.isEmpty())
            while(!stackA.isEmpty())
                stackB.push(stackA.pop());
    }

    public boolean isEmpty() {
        return stackA.isEmpty() && stackB.isEmpty();
    }

    public int peek() {
        if(isEmpty())
            throw new IllegalStateException();

        moveStackAToStackB();

        return stackB.peek();
    }
}
