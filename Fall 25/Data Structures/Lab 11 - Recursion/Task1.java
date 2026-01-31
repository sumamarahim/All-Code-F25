// Sumama Rahim - F24BSCS039
// Date 01/05/2026

import java.util.Scanner;

public class LotteryTicketChecker {

    // Function to perform Binary Search
    // Returns the index of the target if found, otherwise returns -1
    public static int binarySearch(int[] tickets, int winningNumber) {
        int low = 0;
        int high = tickets.length - 1;

        while (low <= high) {
            // Calculate mid to avoid potential overflow with (low + high)
            int mid = low + (high - low) / 2;

            if (tickets[mid] == winningNumber) {
                return mid; // Number found
            }
            else if (tickets[mid] < winningNumber) {
                low = mid + 1; // Search in the right half
            }
            else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Number not found
    }

    public static void main(String[] args) {
        // Initialize the array with the player's lucky numbers.
        // Binary Search requires the array to be sorted (these are already sorted).
        int[] playerTickets = {
            13579, 26791, 26792, 33445, 55555,
            62483, 77777, 79422, 85647, 93121
        };

        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter this week's winning 5-digit number: ");
        
        // Input validation to ensure an integer is entered
        if (scanner.hasNextInt()) {
            int winningNumber = scanner.nextInt();

            // Perform Binary Search
            int resultIndex = binarySearch(playerTickets, winningNumber);

            // Report the results
            if (resultIndex != -1) {
                System.out.println("Congratulations! You have a winning ticket: " + playerTickets[resultIndex]);
            } else {
                System.out.println("The number is invalid (not found in your list of tickets).");
            }
        } else { // if none number entered
            System.out.println("Invalid input. Please enter a numeric value.");
        }

        scanner.close();
    }
}