package OOPs.CollectionFramework.Vector;

import java.util.Stack;

public class Lab150 {
    public static void main(String[] args) {
        //Stack

        Stack stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.empty());
    }
}
