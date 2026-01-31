public class Insertion {
    public static void main(String... args) {
        int[] a = {2, 9, 4, 17, 3, 1, 5};
        for (int j = 1; j < a.length; j++) {
            // for (int i = j; i >= 0; i--) {
            for (int i = j; i <= j; i++){
                if (a[i] > a[j]) {
                    int temp1 = a[i];
                    int temp2 = a[j];
                    
                }
            }
        }
        for (int z = 0; z < a.length; z++) {
            System.out.print(a[z] + " ");
        }
    }
}