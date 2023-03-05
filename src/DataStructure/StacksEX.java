package DataStructure;

import java.util.Stack;

// items are added and deleted from same end
public class StacksEX {
    public static void main(String[] a)
    {
        Stack stack = new Stack();
        for (int i = 0; i <= 10 ; i++) {
            stack.push(i);

        }
        while (!stack.empty())
        {
            System.out.println(stack.pop());
            System.out.print(",");
        }
        System.out.println("Lift Off!!");
    }
}
