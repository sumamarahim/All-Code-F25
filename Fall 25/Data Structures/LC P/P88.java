// Date: 01/04/2026
// P: 88. Merge Sorted Array

public class P88 {
    public static void main(String... args) {

        // brute force approach
        int m = 3, n = 3; // representing num of elems in nums1 and nums2
        // after merging nums1 and 2, put all elements in nums1 and should not be 
        // returned by a function, instead stored inside the array nums1. 
        int totalElem = m + n; // length of nums1, m rep element should be merged, n set to 0
        int nums1[] = {1, 2, 3, 0, 0, 0}; // here m + n elements, if no then do it 0
        int nums2[] = {2, 5, 6};

        for (int i = 0; i < totalElem; i++) {
            for (int j = 0; j < nums2.length; j++) {
                // if (i >= m){
                nums1[i] = nums2[j];
                // }
            }
        }
        for (int j = 0; j < totalElem; j++) {
            System.out.print(nums1[j] + " ");
        }
    }
}