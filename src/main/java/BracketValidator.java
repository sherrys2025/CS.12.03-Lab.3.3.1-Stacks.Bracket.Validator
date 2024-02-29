import java.util.Stack;

public class BracketValidator {
    private static char[] leftBrackets = {
            '(', '{', '['
    };

    private static char[] rightBrackets = {
            ')', '}', ']'
    };

    // Method called checkValidParentheses that returns a boolean indicating whether a string of brackets is valid or not.
    public static boolean checkValidParentheses(String expression) {

        // Obtain an array of the brackets (each element is a single bracket).
        Stack<Character> stack = new Stack<>();

        // Create a stack.

        // Iterate over the array of brackets.
        for (char c : expression.toCharArray()) {
            if (!isBracket(c)) {
                continue;
            }
            // Obtain the reversed version of bracket.
            char opp = getReversedBracket(c);
            // Check if the bracket is an opening bracket. If it is, push it onto the stack.
            if (isLeftBracket(c)) {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty() || stack.pop() != opp) {
                return false;
            }
            // If the stack is empty or if the popped bracket is not equal to the reverse bracket of the current bracket, return false as this must mean that the expression is invalid.
        }
        // If the stack is empty after we have finished iterating over the array of brackets, then return true as this must mean that the expression is valid. If the stack is not empty, this must mean that the expression is invalid.
        return stack.isEmpty();

    }

    // Private helper method called isLeftBracket that returns a boolean value to indicate whether the bracket is a left (opening) bracket.
    private static boolean isLeftBracket(char bracket) {
        return bracket == '[' || bracket == '(' || bracket == '{';
    }

    private static boolean isBracket(char bracket) {
        return isLeftBracket(bracket) || bracket == ']' || bracket == ')' || bracket == '}';
    }

    // Private helper method called getReversedBracket that returns a String which is the reverse version of the bracket passed to the method.
    private static char getReversedBracket(char bracket){
        switch (bracket){
            case '(':
                return ')';
            case '{':
                return '}';
            case '[':
                return ']';
            case ')':
                return '(';
            case '}':
                return '{';
            default:
                return '[';
        }
    }
}
