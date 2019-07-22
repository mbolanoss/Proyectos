package data;

import businessLogic.BookStore;

public class Admin extends Person implements AdminActions {

    public Admin(String username, String password, String name, String email) {
        super(username, password, name, email);
    }

    @Override
    public Book createNewBook(int index, int numberOfPages, int stock, int price,
            String isbnCode, String title, String genre, String author,
            String typeOfCover, String editorial, String coverFilePath, String review) {
        Book newBook = new Book(index, isbnCode, title,
                genre, author, numberOfPages, typeOfCover, price, editorial, stock, coverFilePath, review);
        return newBook;
    }

    @Override
    public void modifyBookInfo(int index, int numberOfPages, int stock, int price,
            String isbnCode, String title, String genre, String author,
            String typeOfCover, String editorial, String coverFilePath, String review) {
        BookStore.getBooksMap().get(index).setAuthor(author);
        BookStore.getBooksMap().get(index).setCoverFilePath(coverFilePath);
        BookStore.getBooksMap().get(index).setEditorial(editorial);
        BookStore.getBooksMap().get(index).setGenre(genre);
        BookStore.getBooksMap().get(index).setIndex(index);
        BookStore.getBooksMap().get(index).setIsbnCode(isbnCode);
        BookStore.getBooksMap().get(index).setNumberOfPages(numberOfPages);
        BookStore.getBooksMap().get(index).setPrice(price);
        BookStore.getBooksMap().get(index).setStock(stock);
        BookStore.getBooksMap().get(index).setReview(review);
        BookStore.getBooksMap().get(index).setTitle(title);
        BookStore.getBooksMap().get(index).setTypeOfCover(typeOfCover);
    }

    @Override
    public void deleteBook(int index) {
        BookStore.getBooksMap().remove(index);
    }

    public static void addNewBook(Book newBook) {
        BookStore.getBooksMap().put(newBook.getIndex(), newBook);
    }

}
