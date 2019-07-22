package data;

public interface AdminActions {
    Book createNewBook(int index, int numberOfPages, int stock, int price,
            String isbnCode, String title, String genre, String author, 
            String typeOfCover, String editorial, String coverFilePath, String review);
    void modifyBookInfo (int index, int numberOfPages, int stock, int price,
            String isbnCode, String title, String genre, String author,
            String typeOfCover, String editorial, String coverFilePath, String review);
    void deleteBook (int index);
}
