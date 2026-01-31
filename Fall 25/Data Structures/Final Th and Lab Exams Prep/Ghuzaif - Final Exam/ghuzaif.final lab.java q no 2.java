class StudentScores {
     int[] scores = new int[100]; 
     int size = 0;

    
    public void addScore(int score) {
        int i = size - 1;
        while (i >= 0 && scores[i] < score) { 
            scores[i + 1] = scores[i];
            i--;
        }
        scores[i + 1] = score; 
        size++;
    }

  
    public void searchScore(int target) {
        int left = 0, right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (scores[mid] == target) {
            return;
            }

            if (scores[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

    }

   
    public void displayScores() {
        System.out.print("Scores in descending order: ");
        for (int i = 0; i < size; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        StudentScores system = new StudentScores();
        system.addScore(85);
        system.addScore(90);
        system.addScore(78);
        system.displayScores();
        system.searchScore(90); 
        system.searchScore(95); 
    }
}
