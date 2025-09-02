public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Data Structures and Algorithms with Java";
        author = "Dr. Raj Kumar";
        price = 3499.5;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display method
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();

        // Using parameterized constructor
        Book book2 = new Book("Data Structures and Algorithms with C", "Dr. Varun", 2499.99);

        // Display both books
        book1.display();
        book2.display();
    }
}


