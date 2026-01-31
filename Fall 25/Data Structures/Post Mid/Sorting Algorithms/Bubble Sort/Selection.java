// working and clear
public class Selection {
    public static void main(String... args) {
        int[] num = {2, 9, 4, 1, 7};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int z = 0; z < num.length; z++) {
            System.out.print(num[z] + " ");
        }
    }
}