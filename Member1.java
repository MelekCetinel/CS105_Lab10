import java.util.ArrayList;
import java.util.List;
    public class Member {
        private String fullName;
        private List<Book> borrowedBooks;
        private List<Book> returnedBooks;


        public Member(String fullName) {
            this.fullName = fullName;
            this.borrowedBooks = new ArrayList<>();
            this.returnedBooks = new ArrayList<>();
        }


        public void listBooks() {
            System.out.println("Currently Borrowed Books:");
            if (borrowedBooks.isEmpty()) {
                System.out.println("None");
            } else {
                for (Book book : borrowedBooks) {
                    System.out.println("- " + book.getName());
                }
            }
            System.out.println("Returned Books:");
            if (returnedBooks.isEmpty()) {
                System.out.println("None");
            } else {
                for (Book book : returnedBooks) {
                    System.out.println("- " + book.getName());
                }
            }
        }


        public void borrowBook(Book book, Date borrowDate) {
            if (book.isAvailable()) {
                book.setAvailable(false);
                book.setCurrentMember(this);
                book.setLastBorrowDate(borrowDate);
                borrowedBooks.add(book);
                System.out.println(book.getName() + " has been borrowed by " + fullName + ". The book can be kept for " + book.getDuration() + " days.");
            } else {
                System.out.println(book.getName() + " is not available. Another member has borrowed it already.");
            }
        }

        // Return book method
        public void returnBook(Book book, Date returnDate) {
            if (borrowedBooks.contains(book)) {
                int daysKept = returnDate.daysInBetween(book.getLastBorrowDate());
                borrowedBooks.remove(book);
                returnedBooks.add(book);
                book.setAvailable(true);
                book.setCurrentMember(null);

                if (daysKept > book.getDuration()) {
                    int lateDays = daysKept - book.getDuration();
                    double lateFee = lateDays * 10.0;
                    book.getBranch().addToBalance(lateFee);
                    System.out.println(book.getName() + " has been returned " + lateDays + " days late. The late fee of " + lateFee + " TL is charged to " + fullName + "'s account.");
                } else {
                    System.out.println(book.getName() + " has been returned on time.");
                }
            } else {
                System.out.println(fullName + " did not borrow " + book.getName() + ".");
            }
        }

        public String getFullName() {
            return fullName;
        }


    }


