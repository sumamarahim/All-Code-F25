// working and clear
class Bubble {
    public static void main(String... args) {
        // bubble sort algorithm
        int[] nums = {10, 2, 50, 15, 1};

        // madam's code
        int i, j;
        for (i = nums.length - 1; i >= 0; i--) {
            for (j = 0; j < i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.print(nums[i] + " ");
        }
        
        // try descending sorting
        // my code
        System.out.println("\nMarks (Highest to Smallest)");
        int[] marks = {77, 81, 71, 67, 92, 53};
        // total 6 elements so 6-1 passes we need
        for (int outer = 0;  outer <= marks.length - 1; outer++) {
            for (int inner = 0; inner < marks.length - 1; inner++) {
                if (marks[inner] < marks[inner + 1]) { // < to > for smallest to highest
                    int temp = marks[inner]; // to hold temporary
                    marks[inner] = marks[inner + 1];
                    marks[inner + 1] = temp;
                }
            }
        }

        // displaying
        for (int z = 0; z <= marks.length - 1; z++) {
            System.out.print(marks[z] + " ");
        }
    }
}