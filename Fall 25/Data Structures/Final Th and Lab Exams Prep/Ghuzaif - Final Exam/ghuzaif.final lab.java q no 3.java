public class House{
    
    int houseNumber;
    int streetNumber;
    String ownerName;
    House left, right;

    public House(int houseNumber, int streetNumber, String ownerName) {
        this.houseNumber = houseNumber;
        this.streetNumber = streetNumber;
        this.ownerName = ownerName;
        this.left = this.right = null;
    }
}

class HousingSociety {
     House root;
    public void insert(int houseNumber, int streetNumber, String ownerName) {
        root = insertRec(root, houseNumber, streetNumber, ownerName);
    }

    private House insertRec(House root, int houseNumber, int streetNumber, String ownerName) {
        if (root == null) {
            return new House(houseNumber, streetNumber, ownerName);
        }
        if (houseNumber < root.houseNumber) {
            root.left = insertRec(root.left, houseNumber, streetNumber, ownerName);
        } else {
            root.right = insertRec(root.right, houseNumber, streetNumber, ownerName);
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(House root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println("House No: " + root.houseNumber + ", Street: " + root.streetNumber + ", Owner: " + root.ownerName);
            inorderRec(root.right);
        }
    }

    public boolean search(int houseNumber) {
        return searchRec(root, houseNumber) != null;
    }

    private House searchRec(House root, int houseNumber) {
        if (root == null || root.houseNumber == houseNumber) {
            return root;
        }
        if (houseNumber < root.houseNumber) {
            return searchRec(root.left, houseNumber);
        }
        return searchRec(root.right, houseNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        HousingSociety society = new HousingSociety();
        society.insert(101, 5, "Ali");
        society.insert(102, 3, "qadeer");
        society.insert(103, 7, "zarsham");
        System.out.println("Inorder Traversal:");
        society.inorder();
        System.out.println("Search for House 102: " + (society.search(102) ? "Found" : "Not Found"));
    }
}
    

