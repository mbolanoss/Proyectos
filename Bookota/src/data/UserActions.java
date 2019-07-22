package data;

import java.util.ArrayList;
import java.util.HashMap;


public interface UserActions {
    void AddBookToShoppingCart (int index, HashMap<String, Book> booksMap);
    void AddBookToShoppingCart (int index, ArrayList<Book> booksList);
    void AddBookToWishList (int index, HashMap<String, Book> booksMap);
    void deleteBookFromShoppingCart (int index);
    void deleteBookFromWishList(int index);

}
