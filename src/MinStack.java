/**
 * Created by Pranith on 3/21/17.
 */
import java.util.*;
public class MinStack {

        private Stack<Integer> stack;
        private Stack<Integer> minStack;


        public MinStack() {
            stack=new Stack<Integer>();
            minStack=new Stack<Integer>();
        }

        public void push(int x) {
            stack.push(x);
            if(minStack.empty()){
                minStack.push(x);
            }else{
                minStack.push(Math.min(x, minStack.peek()));
            }
        }

        public void pop() {
            minStack.pop();
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

