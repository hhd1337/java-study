package mid1.nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookCount;

    class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public Library(int maxBookCount) {
        books = new Book[maxBookCount];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount] = new Book(title, author);
            bookCount++;
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }
}
