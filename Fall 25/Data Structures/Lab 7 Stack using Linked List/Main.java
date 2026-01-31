// Sumama Rahim
// F24BSCS039
S
class infoBooks {

    private class Book {
        String title;
        int price;
        int edition;
        int noOfPages;
        Book next;
    }

    Book top;

    infoBooks() {
        this.top = null;
    }

    public void push(String title, int price, int edition, int noOfPages) {
        Book newBook = new Book();
        if (top == null) {
            newBook.title = title;
            newBook.price = price;
            newBook.edition = edition;
            newBook.noOfPages = noOfPages;
            top = newBook;
            
        } else {
            newBook.title = title;
            newBook.price = price;
            newBook.edition = edition;
            newBook.noOfPages = noOfPages;
            newBook.next = top;
            top = newBook;
        }
    }

    public void top() {
        if (top == null) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("on top we have following book: \n" +
            "Title : " + top.title +
            ", price: " + top.price +
            ", Edition: " + top.edition +
            ", Pages: " + top.noOfPages);
}
}



public void pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
        } else {
            top = top.next;
        }
    }

    public void display() {
        if (top == null) {
            System.out.println("Empty!");
            
        } else {
            Book S = top;
            System.out.println("Books inoformation:\n-------------------------------------------------");
            while (S != null) {
                System.out.println("Title: " + S.title +
                ", Price: " + S.price +
                ", Edition: " + S.edition +
                ", Pages: " + S.noOfPages);
                S = S.next; // moves to next node
            }
            System.out.println();
        }
    }
}

class Main {

    public static void main(String... args) {

        // 1
        infoBooks list = new infoBooks();
        list.push("I am Sumama", 79, 1, 1240); // prices are in GBP
        list.push("Mai aur meri dunya", 69, 4, 1378);
        list.push("Meri Dua", 72, 1, 780);
        list.push("Kal sy parhunga - how to change this?", 98, 1, 378);
        list.push("Wo din", 19, 5, 977);
        // 2
        list.top();
        // 3
        list.pop();
        list.pop();
        // 4
        list.display();
    }
}
