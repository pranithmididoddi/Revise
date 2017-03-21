import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Pranith on 3/21/17.
 */
public class Sol {

    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);
        queue.add(6);
        for(int i=1;i<queue.size();i++){
            queue.add(queue.poll());
        }

        System.out.println(queue);
    }

    public Queue<Integer> queue;

    /** Initialize your data structure here. */
    public Sol() {
        queue=new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);

        for(int i=1;i<queue.size();i++){
            queue.add(queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
