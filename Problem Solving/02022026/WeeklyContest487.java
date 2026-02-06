
public class WeeklyContest487 {

    public static void main(String... args) {
        int n = 4;
        int count = 0;
        while (n >= 0) {
            String bit = Integer.toBinaryString(n);
            // for (int i = bit.length() - 1; i > 0; i--) {
            for (int i = 0; i < bit.length() - 1; i++){
                for (int j = 1; j < bit.length(); j++) {
                    char ci = bit.charAt(i);
                    char cj = bit.charAt(j);
                    if (ci == cj) {
                        count++;
                        System.out.println("Counted!");
                        break;
                    } 
                    else {
                        
                    }
                }
            }
            n--;
        }
        System.out.println(count);

        while (n >= 0) {
            String bit = Integer.toBinaryString(n);
            char first = bit.charAt(0);
            boolean valid = true;

            for (int i = 1; i < bit.length(); i++) {
                if (bit.charAt(i) != first) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
            n--;
        }
        System.out.println(count); // 3
    }
}
