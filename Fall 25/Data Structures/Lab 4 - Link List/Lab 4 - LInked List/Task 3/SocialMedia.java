
/**
 * Lab Task 3:
You are required to implement a basic social media portal where a user can create his/her profile
You can provide user the options to create a new profile, update profile and delete profile as well.

Create a class Profile having necessary information of user ( ID, Name, gender, age, email, interest, Date of birth) provide appropriate methods.
Next create a class Portal which uses node of Profile Class to handle profiles. Next provide methods to 
⦁	InsertProfile (ID, Name, gender, age, email, interest, Date of birth)// adds new profile to the list.
⦁	UpdateProfile (int id) which helps user to update his/her profile information)
⦁	DeleteProfile(string name)// delete a particular profile form the list
⦁	searchProfile(string name)
⦁	displayProfiles ()// display all values.
In main create a menu to show the following options to the user
⦁	Add new Profile
⦁	Update Profile ( which helps user to update his/her profile information)
⦁	Delete a Profile
⦁	Search Profile
⦁	Display All
⦁	Exit.
The program runs until user wants to exit.

 */

/**
 * Name: Sumama Rahim
 * Reg# F24BSCS039
 * Date: 11/02/2025
 * Course: Data Structures
 * Instructor: Ms. Engr. Afifa Zafar
 */

import java.util.Scanner;

public class SocialMedia {

    class Profile {
        String name, email, interest, dob;
        int ID, age;
        char gender;
        Profile next;

        public Profile(String name, String email, String interest, String dob, int ID, int age, char gender) {
            this.name = name;
            this.email = email;
            this.interest = interest;
            this.dob = dob;
            this.ID = ID;
            this.age = age;
            this.gender = gender;
            this.next = null;
        }
    }

    // represent the head and tail
    public Profile head = null;
    public Profile tail = null;

    // addProfile() will add a new Profile to the list
    public void addProfile(String name, String email, String interest, String dob, int ID, int age, char gender) {
        // creating a Profile
        Profile newProfile = new Profile(name, email, interest, dob, ID, age, gender);
        // checks for the existance of Profile
        if (head == null) {
            head = newProfile;
            tail = newProfile;
        } else {
            tail.next = newProfile;
            tail = newProfile;
        }
    }

    // Methods
    // 1. insert new profile to the list
    void insertProfile(String name, String email, String interest, String dob, int ID, int age, char gender) {
        Profile newProfile = new Profile(name, email, interest, dob, ID, age, gender);
        if (head == null) // checks if Profile is empty
        {
            head = newProfile;
        } else // insert Profile at start
        {
            newProfile.next = head;
            head = newProfile;
            System.out.println("\nProfile added successfully");
        }
    }

    // // updating
    // void updateProfile(int id) {
    // Profile S = head;
    // while (S != null) {
    // if (S.ID == id) {
    // S.ID = newVal;
    // System.out.println("\n" + id + " is updated with: " + newVal);
    // break;
    // } else {
    // S = S.next;
    // }
    // }
    // }

    // // Delete Profile
    // void deleteProfile(String name) {
    // Profile newProfile = new Profile(name, email, interest, dob, ID, age,
    // gender);
    // Profile S = head;
    // while (S.next != null) {
    // if (S.next.name == val) {
    // S.next = S.next.next;
    // }
    // S = S.next;
    // }
    // }

    // // searching a profile
    // void searchProfile(String name) {
    // Profile S = head;
    // // traversing till value
    // while (S != null) {
    // if (S.name == val)
    // System.out.println("Profile found, ID is: " + S.ID);
    // S = S.next;
    // }
    // }

    // displaying Profiles
    public void displayProfiles() {
        Profile S = head;
        if (head == null) {
            System.out.println("No profile found!");
            return;
        }
        System.out.println("Profiles in List are: ");
        while (S != null) {
            System.out.println("Name: " + S.name + ", ID: "
                    + S.ID + ", Gender: "
                    + S.gender + ", age:" + S.age
                    + ", DOB:" + S.dob + ", email:" + S.email
                    + ", interest:" + S.interest);
            S = S.next;
        }
    }

}

class Main {
    public static void main(String... args) {
        // taking input from user at run time
        Scanner takeInput = new Scanner(System.in);

        SocialMedia sList = new SocialMedia();

        System.out.println("Select your option\n" +
                "1. Add new profile\n2. Update profile\n3. Delete a profile" +
                "\n4. Search profile\n5. Display all profiles\n0. Exit");

        int option = takeInput.nextInt();
        switch (option) {
            case 1: {
                sList.addProfile("Sumama", "sumama.rahim@gmail.com", "Chess", "25 Feb", 378, 19, 'm');
            }
                break;
            case 2:
                break;
            case 5: {
                System.out.println("\nList of profiles");
                sList.displayProfiles();
            }
                break;
            default:
                System.out.println("Select 1,2 or 3");
        }

    }
}