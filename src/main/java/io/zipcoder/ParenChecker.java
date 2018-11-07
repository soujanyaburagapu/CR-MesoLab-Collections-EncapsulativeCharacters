package io.zipcoder;
import java.util.HashMap;
import java.util.Stack;

public class ParenChecker {
    Stack<String> stack = new Stack();
    public boolean isValid(String value) {

        String[] charArray = value.split("");
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i].equals("(")) {
                stack.push(charArray[i]);
            } else if (charArray[i].equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    public boolean checkIfPaired(String value) {
        HashMap<String, String> pairs = new HashMap<String, String>();
        pairs.put("(", ")");
        pairs.put("[", "]");
        pairs.put("{", "}");
        pairs.put("\"", "\"");
        pairs.put("'", "'");
        pairs.put("<", ">");

        String[] charArray = value.split("");
        for (int i = 0; i < charArray.length; i++) {
            String currentChar = charArray[i];

            if (pairs.containsKey(currentChar)) {
                stack.push(charArray[i]);
            } else if (!stack.isEmpty() && currentChar.equals(pairs.get(stack.peek()))) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (stack.isEmpty() && pairs.containsValue(currentChar)) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
