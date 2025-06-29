package assignment2;
//COSTSTRUCTOR CAN BE ONLY OF CLASS NAME
class Book {
        int bookId;
        double price;
        int quantity;
        static double totalAmount = 0;

    public  Book(int i, double v, int i1) {
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;
    }
        public void displayDetails() {
            System.out.println("Book ID: " + bookId);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
        }

        public double calculateTotalCost() {
            double totalCost = price * quantity;
            totalAmount += totalCost;
            return totalCost;
        }

        public static double getTotalAmount() {
            return totalAmount;
        }
    }
    public class a2q4 {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        System.out.println("Details of the books purchased:");
        for (int i = 0; i < books.length; i++) {
            books[i].displayDetails(); 
            System.out.println("Total cost of book " + (i + 1) + ": " + books[i].calculateTotalCost());
            System.out.println();
        }
        System.out.println("Total amount spent on all books: " + Book.getTotalAmount());
    }
}


