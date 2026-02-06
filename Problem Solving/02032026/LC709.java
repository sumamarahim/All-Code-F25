/***
 * 
 * Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
 
Constraints:

1 <= s.length <= 100
s consists of printable ASCII characters.
*********************************************** 
 */


public class LC709 {
    public static void main(String... args) {
        String s = "Hello";
        String lowerS = s.toLowerCase(); // approach 1: Built-in method
        System.out.println(lowerS);
        // approach 2: Custom method
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i).isUpper()) {
                lowerS.charAt(i) = 
            }
        }
    }
}
