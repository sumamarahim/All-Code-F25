
/**
 * Given an integer array arr, return true if there are three consecutive odd numbers 
 * in the array. Otherwise, return false.
 
Example 1:
Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.

Example 2:
Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.
 
Constraints:
1 <= arr.length <= 1000
1 <= arr[i] <= 1000
*/

public class LC1550 {
    public static void main(String... args) {
        boolean ret = true;
        int[] n = {2,34,3,4,5,7,23,12};//{2,6,4,1};//{1, 3, 4, 6, 7, 8, 9, 11, 12, 13, 15, 17};
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            int odd = n[i] % 2;
            if (odd == 1) {
                count += 1;
                if (count == 3) {
                    System.out.println(ret);
                    break;
                }
            }
            else {count = 0;}
        }
    }
}

