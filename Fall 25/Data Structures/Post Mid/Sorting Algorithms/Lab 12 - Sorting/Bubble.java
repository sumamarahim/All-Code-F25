// Sumama Rahim - F24BSCS039
// Date 01/11/2026

// Practicing
// Bubble sort
public class Bubble {

    static void bubble() {
        int[] array = {3, 9, 5, 1, 7, 8, 6, 2, 4};
        for (int i = array.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    
                }
            }
            System.out.print(array[i] + ", ");
        }
    }

    public static void main(String... args) {
        bubble();
    }
}
