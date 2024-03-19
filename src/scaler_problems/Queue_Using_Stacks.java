package scaler_problems;

import java.util.Stack;

public class Queue_Using_Stacks {
    public static void main(String[] args) {
        UserQueue obj = new UserQueue();
        obj.push(10);
        int param2 = obj.pop();
        int param3 = obj.peek();
        boolean param4 = obj.empty();

    }
}

class UserQueue {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    /** Initialize your data structure here. */
    UserQueue() {
        // this.s1 = new Stack<>();
        // this.s2 = new Stack<>();
    }

    /** Push element X to the back of queue. */
    static void push(int X) {
        s1.push(X);
    }

    /** Removes the element from in front of queue and returns that element. */
    static int pop() {
        if (empty())
            return -1;
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    /** Get the front element of the queue. */
    static int peek() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    /** Returns whether the queue is empty. */
    static boolean empty() {
        return s1.empty() && s2.empty();
    }
}

/**
 * Your UserQueue object will be instantiated and called as such:
 * UserQueue obj = new UserQueue();
 * obj.push(X);
 * int param2 = obj.pop();
 * int param3 = obj.peek();
 * boolean param4 = obj.empty();
 */