// Sumama Rahim - F24BSCS039
// Date 01/11/2026

// Practicing
// Selection sort


public class Selection {
    static void selection() {
        int array[] = {11, 20, 12, 15, 10, 9};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                
                }
            }

            // System.out.println(array[i] + " ");
        }
        for (int z = 0; z < array.length; z++) {
            System.out.print(array[z] + " ");
        }
    }
    public static void main(String... args) {
        selection();
    }
}