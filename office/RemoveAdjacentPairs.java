package office;
import java.util.Stack;

public class RemoveAdjacentPairs {

    public static String removeAdjacentPairs(String S) {
        Stack<Character> stack = new Stack<>();

        for (char ch : S.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();  // Remove the top element if it matches the current character
            } else {
                stack.push(ch);  // Push the current character onto the stack
            }
        }

        // Rebuild the final string from the characters in the stack
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example 1
        String input1 = "abbbbd";
        System.out.println(removeAdjacentPairs(input1));  // Output: ad

        // Example 2
        String input2 = "abbba";
        System.out.println(removeAdjacentPairs(input2));  // Output: aba

        // Example 3
        String input3 = "abcddcba";
        System.out.println(removeAdjacentPairs(input3));  // Output: (empty string)
    }
}
