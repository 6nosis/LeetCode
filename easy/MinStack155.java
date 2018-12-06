package easy;

import java.util.ArrayList;
import java.util.List;

public class MinStack155 {
    private List<Integer> stack;
    private List<Integer> mins;

    /**
     * initialize your data structure here.
     */
    public MinStack155() {
        this.stack = new ArrayList<>();
        this.mins = new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
        if (mins.size() == 0) mins.add(x);
        else mins.add(Math.min(x, mins.get(mins.size() - 1)));
    }

    public void pop() {
        int p = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        mins.remove(mins.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return mins.get(mins.size() - 1);
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}

//class MinStack {
//    private Deque<Integer> mainStack; // 主栈，存储所有数据
//
//    private Deque<Integer> minStack; // 将数据压入主栈时，存储最小值
//
//    /** initialize your data structure here. */
//    public MinStack() {
//        mainStack = new ArrayDeque<>();
//        minStack = new ArrayDeque<>();
//    }
//
//    public void push(int x) {
//        mainStack.push(x);
//
//        Integer min = minStack.peek();
//        if (min == null || x <= min) {
//            minStack.push(x);
//        }
//    }
//
//    public int pop() {
//        int cur = mainStack.pop();
//        if (cur == minStack.peek()) {
//            minStack.pop();
//        }
//        return cur;
//
//    }
//
//    public int top() {
//        return mainStack.peek();
//    }
//
//    public int getMin() {
//        return minStack.peek();
//    }
//}
