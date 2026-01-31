
public class Searching {

    void LinearSearch(int target) {
        int[] nums = {1, 3, 7, 2, 9, 6};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(target + " found at index " + i);
            }
        }
    }

    int LinearSearch2(int target, int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return 1;
            }
        }
        return -1;
    }

    int BinarySearch(int nums[], int L, int F, int target) {
        if (F >= L) {
            int M = L + F / 2;
            if (nums[M] == target) {
                return M;
            }
            if (nums[M] > target) {
                return BinarySearch(nums, L, M - 1, target);
            } 
                return BinarySearch(nums, M + 1, F, target);
            
        }
        // if not found any, then we reach here
        return -1;
    }

    public static void main(String... args) {
        Searching algo = new Searching();
        int target = 7;
        algo.LinearSearch(target);
        int nums[] = {3, 8, 9, 1, 7, 4};
        int result = algo.LinearSearch2(target, nums);
        if (result == 1) {
            System.out.println("Target found");
        } else {
            System.out.println("Target not found");
        }

        // Binary Search
        int[] numsBinary = {1, 3, 7, 2, 9, 6};
        int binResult = algo.BinarySearch(numsBinary, 0, numsBinary.length - 1 - 1, target);
        if (binResult == -1) {
            System.out.println("value not exists!");
        } else {
            System.out.println("Found");
        }
    }
}
