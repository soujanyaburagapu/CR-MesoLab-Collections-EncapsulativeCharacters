package io.zipcoder;

import java.util.EmptyStackException;
import java.util.Stack;

public class ParenChecker
{
    private static final String OPEN = "([{";
    private static final String CLOSE = ")]}";
    public static boolean isBalanced(String expression)
    {
        Stack<Character> stack = new Stack<Character>();
        boolean balanced = true;
        try {
            int index = 0;
            while (balanced && index < expression.length()) {
                char nextCh = expression.charAt(index);
                if (isOpen(nextCh)) {
                    stack.push(nextCh);
                } else if (isClose(nextCh)) {
                    char topCh = stack.pop();
                    balanced =
                            OPEN.indexOf(topCh) == CLOSE.indexOf(nextCh);
                }
                index++;
            }
        } catch (EmptyStackException ex) {
            balanced = false;
        }
        return (balanced && stack.empty());
    }
    private static boolean isOpen(char ch) {
        return OPEN.indexOf(ch) > -1;
    }
    private static boolean isClose(char ch) {
        return CLOSE.indexOf(ch) > -1;
    }
}
