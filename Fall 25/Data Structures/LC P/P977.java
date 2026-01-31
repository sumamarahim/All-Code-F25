// 977. Squares of a Sorted Array

/***
 * 
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */

// 01/02/2026
// my submitted code
/**
 class Solution {
    public int[] sortedSquares(int[] nums) {
        int squares[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squares[i] = nums[i] * nums[i];
        }
        // sorting the squares array - bubble sort
        for (int i = squares.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (squares[j] > squares[j + 1]) {
                    int temp = squares[j];
                    squares[j] = squares[j + 1];
                    squares[j + 1] = temp;
                }
            }
        }
        return squares;
    }
} 
 */

class P977 {
    public static int[] sortedSquares(int[] nums) {
        int squares[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squares[i] = nums[i] * nums[i];
        }

        // sorting the squares array - bubble sort
        for (int i = squares.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (squares[j] > squares[j + 1]) {
                    int temp = squares[j];
                    squares[j] = squares[j + 1];
                    squares[j + 1] = temp;
                }
            }
        }

        return squares;
    }
    public static void main(String... args) {
        int[] arr = {3, 4, 2, 1, 5, 0};
        int[] array = sortedSquares(arr);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
