package businessLogic;

import UI.SplashWindow;
import data.*;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;

public class BookStore {

    private static HashMap<String, User> usersMap = new HashMap<>();
    private static HashMap<Integer, Book> booksMap = new HashMap<>();
    private static File usersArchive = new File("usersMap.txt");
    private static File booksArchive = new File("booksMap.txt");
    private static Admin admin = new Admin("admin", "adminBookota", "Administrador", "adminBookota@gmail.com");

    public static void main(String[] args) throws IOException, IOException {

        if (booksArchive.exists()) { //Se revisa si el archivo de texto de libros ya fue creado
            booksMap = FileManager.updateBooksMap(booksArchive); // Se hace un casteo de Object a HashMap de libros
        } else {
            booksMap = Book.createBooks();
        }
        usersMap = FileManager.updateUsersMap(usersArchive);

        new Thread(new SplashWindow()).start();

    }

    public static void close(Component rootPane) {
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            FileManager.saveUsersMap(usersArchive, usersMap);
            FileManager.saveBooksMap(booksArchive, booksMap);
            JOptionPane.showMessageDialog(rootPane, "Muchas gracias por usar "
                    + "nuestro servicio", "", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

    }

    public static boolean checkRepeatedUser(HashMap<String, User> usersMap, User newUser) {
        for (User user : usersMap.values()) {
            if (user.equals(newUser)) {
                return true;
            }
        }
        return false;
    }

    public static boolean existsIndexBook(ArrayList<Book> booksList, int index) {
        for (Book book : booksList) {
            if (book.getIndex() == index) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkCorrectUserName(String userName) {
        for (User user : usersMap.values()) {
            if (user.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkCorrectPassword(String userName, String password) {
        for (User user : usersMap.values()) {
            if (user.getUsername().equals(userName) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static int getLastBookIndex() {
        if (booksMap.isEmpty()) {
            return 1;
        }
        ArrayList<Integer> bookIndexesList = new ArrayList<>();
        for (Book book : booksMap.values()) {
            bookIndexesList.add(book.getIndex());
        }
        Collections.sort(bookIndexesList);
        int index = bookIndexesList.get(bookIndexesList.size() - 1);
        return index;
    }

    public static ArrayList<Book> generateRandomBooks(HashMap<Integer, Book> newBooksMap) {
        ArrayList<Book> randomBooks = new ArrayList<>();
        ArrayList<Integer> booksIndexes = getBooksIndexes(newBooksMap);

        ArrayList<Integer> usedIndexes = new ArrayList<>();

        Random random = new Random();
        int index = -1;

        for (int i = 0; i < 6; i++) {
            index = booksIndexes.get(random.nextInt(booksIndexes.size()));
            if (i == 0) {
                usedIndexes.add(index);
                Book randomBook = newBooksMap.get(index);
                randomBooks.add(randomBook);
            } else {
                while (usedIndexes.contains(index)) {
                    index = booksIndexes.get(random.nextInt(booksIndexes.size()));
                }
                usedIndexes.add(index);
                Book randomBook = newBooksMap.get(index);
                randomBooks.add(randomBook);
            }
        }

        return randomBooks;
    }

    public static ArrayList<Book> filterBookMap(String genre) {
        ArrayList<Book> filteredBooksMap = new ArrayList<>();
        if (genre.length() == 0) {
            for (Book book : booksMap.values()) {
                filteredBooksMap.add(book);
            }
        } else {
            for (Book book : booksMap.values()) {
                if (book.getGenre().equals(genre)) {
                    filteredBooksMap.add(book);
                }
            }
        }
        if (filteredBooksMap.size() < 5) {
            for (int i = filteredBooksMap.size(); i < 5; i++) {
                filteredBooksMap.add(new Book(-1, "", "", "", "", 0, "", 0, "", 
                        0, "/Imagen/EmptyBookCover.png", ""));
            }
        }
        return filteredBooksMap;
    }

    public static ArrayList<Integer> getBooksIndexes(HashMap<Integer, Book> newBooksMap) {
        ArrayList<Integer> booksIndexes = new ArrayList<>();
        for (Book book : newBooksMap.values()) {
            booksIndexes.add(book.getIndex());
        }
        return booksIndexes;
    }

    public static ArrayList<Integer> getBooksIndexes(ArrayList<Book> newBooksMap) {
        ArrayList<Integer> booksIndexes = new ArrayList<>();
        for (Book book : newBooksMap) {
            booksIndexes.add(book.getIndex());
        }
        return booksIndexes;
    }

    public static int getTotalPrice(ArrayList<Book> booksList) {
        int price = 0;
        for (Book book : booksList) {
            price += book.getPrice();
        }
        return price;
    }

    public static int getBookPosition(ArrayList<Book> booksList, String title) {
        int position = -1;
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getTitle().equals(title)) {
                position = i;
                break;
            }
        }
        return position;
    }

    public static ArrayList<Book> searchBooks(String word) {
        ArrayList<Book> booksList = new ArrayList<>();
        String lowerCaseWord = word.toLowerCase();
        String bookTitle = "";
        String bookAuthor = "";
        for (Book book : booksMap.values()) {
            bookTitle = book.getTitle().toLowerCase();
            bookAuthor = book.getAuthor().toLowerCase();
            if (bookTitle.contains(word) || bookAuthor.contains(word)) {
                booksList.add(book);
            }
        }
        return booksList;
    }

    public static HashMap<String, User> getUsersMap() {
        return usersMap;
    }

    public static void setUsersMap(HashMap<String, User> usersMap) {
        BookStore.usersMap = usersMap;
    }

    public static HashMap<Integer, Book> getBooksMap() {
        return booksMap;
    }

    public static void setBooksMap(HashMap<Integer, Book> booksMap) {
        BookStore.booksMap = booksMap;
    }

    public static File getUsersArchive() {
        return usersArchive;
    }

    public static void setUsersArchive(File userArchive) {
        BookStore.usersArchive = userArchive;
    }

    public static File getBookArchive() {
        return booksArchive;
    }

    public static void setBookArchive(File bookArchive) {
        BookStore.booksArchive = bookArchive;
    }

    public static Admin getAdmin() {
        return admin;
    }

    public static void setAdmin(Admin aAdmin) {
        admin = aAdmin;
    }

}
