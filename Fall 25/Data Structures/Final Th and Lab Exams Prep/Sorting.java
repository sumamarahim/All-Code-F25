
public class Sorting {

    void BubbleSort() {

        int[] nums = {3, 9, 10, 4, 5, 1, 8, 2, 11, 19};
        for (int i = nums.length; i > 0; i--) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int z = 0; z < nums.length; z++) {
            System.out.print(nums[z] + " ");
        }
    }

    void SelectionSort() {

        int[] nums = {3, 9, 10, 4, 5, 1, 8, 2, 11, 19};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int min = nums[i];
                if (min > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int z = 0; z < nums.length; z++) {
            System.out.print(nums[z] + " ");
        }
    }

    void InsertionSort() {
        int[] nums = {3, 9, 10, 4, 5, 1, 8, 2, 11, 19};
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                int min = nums[j];
                if (min < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int z = 0; z < nums.length; z++) {
            System.out.print(nums[z] + " ");
        }
    }

    public static void main(String... args) {
        Sorting algo = new Sorting();
        System.out.println("Bubble Sort");
        algo.BubbleSort();
        System.out.println("\nSelection Sort");
        algo.SelectionSort();
        System.out.println("\nInsertion Sort");
        algo.InsertionSort();
    }
}
