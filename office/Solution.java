package office;

public class Solution {

    public StringBuilder trimSpaces(String s) {
        int start = 0, end = s.length() - 1;

        // Trim leading spaces
        while (start <= end && s.charAt(start) == ' ') start++;

        // Trim trailing spaces
        while (end >= start && s.charAt(end) == ' ') end--;

        // Reduce multiple spaces to a single space
        StringBuilder sb = new StringBuilder();
        while (start <= end) {
            char c = s.charAt(start);
            if (c != ' ' || (sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ')) {
                sb.append(c);
            }
            start++;
        }
        return sb;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: String with multiple spaces between words
        String test1 = "   hello     world   ";
        System.out.println("Test 1: '" + solution.trimSpaces(test1).toString() + "'");

        // Test Case 2: String with leading and trailing spaces
        String test2 = "   hello world   ";
        System.out.println("Test 2: '" + solution.trimSpaces(test2).toString() + "'");

        // Test Case 3: String with only spaces
        String test3 = "       ";
        System.out.println("Test 3: '" + solution.trimSpaces(test3).toString() + "'");

        // Test Case 4: String with no spaces
        String test4 = "helloworld";
        System.out.println("Test 4: '" + solution.trimSpaces(test4).toString() + "'");

        // Test Case 5: String with multiple spaces between a single word
        String test5 = "hello       world";
        System.out.println("Test 5: '" + solution.trimSpaces(test5).toString() + "'");

        // Test Case 6: String with only one word and spaces around
        String test6 = "    word   ";
        System.out.println("Test 6: '" + solution.trimSpaces(test6).toString() + "'");

        // Test Case 7: String with leading, trailing, and multiple spaces in the middle
        String test7 = "  The   quick brown    fox    ";
        System.out.println("Test 7: '" + solution.trimSpaces(test7).toString() + "'");
    }
}
