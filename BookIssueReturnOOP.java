class Library {
    String bookName, authorName;
    int quantity;

    Library(String bookName, String authorName, int quantity) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.quantity = quantity;
    }
    boolean issue() {
        if (quantity > 0) { quantity--; return true; }
        return false;
    }
    void returnBook() { quantity++; }
    void display() {
        System.out.println("\"" + bookName + "\" by " + authorName + " | Qty: " + quantity);
    }
}
public class BookIssueReturnOOP {
    public static void main(String[] args) {
        
        Library b1 = new Library("OOP", "Mr.XYZ.", 2);
        Library b2 = new Library("Effective Java", "Joshua Bloch", 1);
        Library b3 = new Library("Algorithms", "Sedgewick", 0);

        b1.display(); b2.display(); b3.display();
        System.out.println("Issuing b1: " + (b1.issue() ? "Success" : "Failed"));
        b1.display();
        System.out.println("Issuing b3: " + (b3.issue() ? "Success" : "Failed"));
        b3.returnBook();
        System.out.println("Returned b3");
        b3.display();
    }
}

