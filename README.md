# 📚 Java Library Management System

This is a **console-based Library Management System** built in Java. It allows users to view, borrow, return, and register books using a simple menu-driven interface. The project demonstrates solid understanding of **Object-Oriented Programming (OOP)** principles such as **encapsulation**, **abstraction**, and **class-based design**.

## 🚀 Features

- 📖 View all books with details
- ➕ Add (register) new books
- ✅ Borrow a book if available
- 🔁 Return a borrowed book
- 📗 View list of currently available books
- 🧭 Menu-based navigation
- ❌ Graceful program exit

## 🛠 Technologies Used

- **Java** (JDK 8+)
- **Object-Oriented Programming (OOP)** concepts
  - Encapsulation
  - Constructors and Methods
  - Class Design

## 📂 Project Structure

- `Main.java`: Contains the main class and logic for user interaction via console.
- `Books.java`: Defines the `Books` class with all attributes and methods related to a book's behavior.

## 💡 How It Works

1. The program starts with a predefined list of books.
2. A menu is displayed where the user can:
   - View all books
   - Add new books by entering title and author
   - Borrow and return books using their ID
3. The status of each book (available/borrowed) is updated accordingly.

## 🧪 Sample Run

=== Library Menu ===

View all books

Add a new book

Borrow a book

Return a book

View available books

Exit
Choose an option: 1


## 🧠 Concepts Demonstrated

- **Encapsulation**: The `Books` class hides its fields and provides public getters/setters.
- **Data abstraction**: Users interact with books without needing to know internal implementation.
- **ArrayList** usage for managing dynamic book collection.
- **Menu-driven loop** with input validation.
  
## ✅ How to Run

1. Clone the repository or download the source code.
2. Open the project in any Java IDE (IntelliJ, Eclipse, etc.).
3. Run the `Main` class.
4. Use the menu options to interact with the library.
