// ID : 02724205101138
public class Book {

    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

   
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discountAmount = (price * percentage) / 100;
            price -= discountAmount;
            System.out.println("Discount of " + percentage + "% applied successfully.");
        } else {
            System.out.println("Invalid discount percentage! Must be between 0 and 100.");
        }
    }


    public static void main(String[] args) {
       
        Book book1 = new Book();

       
        book1.setTitle("Java Programming");
        book1.setAuthor("James Gosling");
        book1.setPrice(500.0);

        
        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Original Price: " + book1.getPrice());


        book1.applyDiscount(10); 

      
        System.out.println("Discounted Price: " + book1.getPrice());
    }
}
