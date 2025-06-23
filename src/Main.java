import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Books> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int bookCounter = 5;

        // Predefined books
        library.add(new Books(1, "Thomas' Calculus", "George B. Thomas", true));
        library.add(new Books(2, "The Unicorn Project", "Gene Kim", true));
        library.add(new Books(3, "Harry Potter", "J. K. Rowling", true));
        library.add(new Books(4, "Cristiano Ronaldo: The Biography", "Guillem Balague", true));
        library.add(new Books(5, "The History of Kazakhstan", "Jensen Ross", true));

        int choice;
        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. View all books");
            System.out.println("2. Add a new book");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. View available books");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nAll Books:");
                    for (Books book : library) {
                        book.displayBookDetails();
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();

                    bookCounter++;
                    library.add(new Books(bookCounter, title, author, true));
                    System.out.println("Book added with ID: " + bookCounter);
                    break;

                case 3:
                    System.out.print("Enter book ID to borrow: ");
                    int borrowId = scanner.nextInt();
                    boolean borrowFound = false;

                    for (Books book : library) {
                        if (book.getBookId() == borrowId) {
                            book.borrowBook();
                            borrowFound = true;
                            break;
                        }
                    }
                    if (!borrowFound) {
                        System.out.println("No book found with ID: " + borrowId);
                    }
                    break;

                case 4:
                    System.out.print("Enter book ID to return: ");
                    int returnId = scanner.nextInt();
                    boolean returnFound = false;

                    for (Books book : library) {
                        if (book.getBookId() == returnId) {
                            if (book.isAvailable()) {
                                System.out.println("You have not borrowed this book.");
                            } else {
                                book.returnBook();
                            }
                            returnFound = true;
                            break;
                        }
                    }
                    if (!returnFound) {
                        System.out.println("No book found with ID: " + returnId);
                    }
                    break;

                case 5:
                    System.out.println("\nAvailable Books:");
                    for (Books book : library) {
                        if (book.isAvailable()) {
                            System.out.println(book.getBookId() + " - " + book.getTitle());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
