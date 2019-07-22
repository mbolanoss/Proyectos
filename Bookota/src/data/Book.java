package data;

import businessLogic.FileManager;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import javax.swing.ImageIcon;

public class Book implements Serializable {

    private int index;
    private String isbnCode;
    private String title;
    private String genre;
    private String author;
    private int numberOfPages;
    private String typeOfCover;
    private int price;
    private String editorial;
    private String review;
    private int stock;
    private String coverFilePath;
    private boolean isSelected;

    public Book(int index, String isbnCode, String title, String genre, String author, int numberOfPages, String typeOfCover, int price, String editorial, int stock, String coverFilePath, String review) {
        this.index = index;
        this.isbnCode = isbnCode;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.typeOfCover = typeOfCover;
        this.price = price;
        this.editorial = editorial;
        this.stock = stock;
        this.coverFilePath = coverFilePath;
        this.review = review;
        this.isSelected = false;
    }
    
    @Override
    public boolean equals(Object obj){
        Book book = (Book) obj;
        return this.getIsbnCode().equals(book.getIsbnCode());
    } 

    public static HashMap<Integer, Book> createBooks() throws IOException {
        HashMap<Integer, Book> booksMap = new HashMap<>();
        Book newBook1 = new Book(0,"9789588925493", "Madame Bovary", "Literatura Universal", "Gustave Flaubert", 448, "Rustica", 28000, "Penguin Clásicos", 10, "/Imagen/Portadas/9789588925493.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789588925493.txt"));
        Book newBook2 = new Book(1,"9789585403109", "Hamlet", "Literatura Universal", "William Shakespeare", 209, "Rustica", 18000, "Lo que leo", 1, "/Imagen/Portadas/9789585403109.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789585403109.txt"));
        Book newBook3 = new Book(2,"9789588617596", "El amante japonés", "Literatura Universal", "Isabel Allende", 352, "Rustica", 29000, "Plaza & Janes", 13, "/Imagen/Portadas/9789588617596.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789588617596.txt"));
        Book newBook4 = new Book(3,"9789585993679", "El psicoanalista", "Literatura Universal", "John Katzenbach", 523, "Rustica", 29000, "B de bolsillo", 11, "/Imagen/Portadas/9789585993679.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789585993679.txt"));
        Book newBook5 = new Book(4,"9788420471839", "Cien años de soledad", "Literatura Universal", "Gabriel García Márquez", 752, "Tapa dura", 35000, "Alfaguara", 5, "/Imagen/Portadas/9788420471839.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9788420471839.txt"));
        Book newBook6 = new Book(5,"9788478887613", "Harry potter: El prisionero de azkaban", "Literatura Juvenil", "J. K. Rowling", 360, "Tapa dura", 35000, "Salamandra", 25, "/Imagen/Portadas/9788478887613.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9788478887613.txt"));
        Book newBook7 = new Book(6,"9788427202139", "Los juegos del hambre:En llamas", "Literatura Juvenil", "Suzanne Collins", 408, "Rustica", 31000, "Molino", 15, "/Imagen/Portadas/9788427202139.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9788427202139.txt"));
        Book newBook8 = new Book(7,"9780142415436", "Sí decido quedarme", "Literatura Juvenil", "Gayle Forman", 320, "Rustica", 24000, "Speak", 18, "/Imagen/Portadas/9780142415436.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9780142415436.txt"));
        Book newBook9 = new Book(8,"9788408208525", "La Reina del Aire y la Oscuridad: Renacimiento 3", "Literatura Juvenil", "Cassandra Claire", 848, "Tapa dura", 50000, "Destiino", 6, "/Imagen/Portadas/9788408208525.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9788408208525.txt"));
        Book newBook10 = new Book(9,"9789588886435", "Juego de Tronos cancion de hielo y fuego I", "Literatura Juvenil", "George RR Martin", 800, "Rustica", 42000, "Plaza & Janés", 18, "/Imagen/Portadas/9789588886435.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789588886435.txt"));
        Book newBook11 = new Book(10,"9788415089216", "Romeo y Julieta", "Romance", "William Shakespeare", 252, "Rustica", 14000, "Plutón Ediciones", 16, "/Imagen/Portadas/9788415089216.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9788415089216.txt"));
        Book newBook12 = new Book(11,"9789588979519", "Jane Eyre", "Romance", "Charlotte Bronte", 633, "Rustica", 35000, "Penguin Clásicos", 18, "/Imagen/Portadas/9789588979519.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789588979519.txt"));
        Book newBook13 = new Book(12,"9786074574296", "Orgullo y Prejuicio", "Romance", "Jane Austen ", 140, "Rustica", 15000, "Lectorum S.A.", 22, "/Imagen/Portadas/9786074574296.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9786074574296.txt"));
        Book newBook14 = new Book(13,"9789588925400", "Cumbres borrascosas", "Romance", "Emily Bronte", 465, "Rustica", 26000, "Penguin Clásicos", 14, "/Imagen/Portadas/9789588925400.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789588925400.txt"));
        Book newBook15 = new Book(14,"9788416365913", "La dama de las camelias", "Romance", "Alexander Dumas", 256, "Rustica", 19000, "Mestas, Ediciones Escolares, SL", 12, "/Imagen/Portadas/9788416365913.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9788416365913.txt"));
        Book newBook16 = new Book(15,"9788445006467", "La llamada de Cthulhu", "Fantasía", "H.P. Lovecraft", 64, "Tapa Dura", 38000, "Minotauro", 10, "/Imagen/Portadas/9788445006467.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9788445006467.txt"));
        Book newBook17 = new Book(16,"9789583056765", "La guerra de los cielos Vol. 1", "Fantasía", "Fernando Trujillo", 494, "Tapa Dura", 40000, "Panamericana", 15, "/Imagen/Portadas/9789583056765.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789583056765.txt"));
        Book newBook18 = new Book(17,"9781484741986", "Percy Jackson y el ladron del rayo", "Fantasía", "Rick Riordan", 387, "Tapa Dura", 55000, "Puffin", 20, "/Imagen/Portadas/9781484741986.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9781484741986.txt"));
        Book newBook19 = new Book(18,"9789585986800", "Artemisa", "Fantasía", "Andy Weir", 377, "Rústica", 44000, "Nova", 10, "/Imagen/Portadas/9789585986800.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789585986800.txt"));
        Book newBook20 = new Book(19,"9789588617503", "Mr. Mercedes", "Fantasía", "Stephen King", 494, "Rústica", 15000, "Plaza&Janés", 25, "/Imagen/Portadas/9789588617503.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789588617503.txt"));
        Book newBook21 = new Book(20,"9781501175466", "It(eso)", "Terror", "Stephen King", 1157, "Rústica", 10000, "Scribner", 28, "/Imagen/Portadas/9781501175466.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9781501175466.txt"));
        Book newBook22 = new Book(21,"9788495881311", "De Dioses, Hombres y Demonios", "Terror", "Miguel Ángel Casaú", 205, "Rústica", 30000, "Ellago", 7, "/Imagen/Portadas/9788495881311.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9788495881311.txt"));
        Book newBook23 = new Book(22,"9789978809969", "El Retrato De Dorian Gray ", "Terror", "Oscar Wilde", 386, "Rústica", 28000, "Educar", 10, "/Imagen/Portadas/9789978809969.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789978809969.txt"));
        Book newBook24 = new Book(23,"9789588789774", "El resplandor", "Terror", "Stephen King", 651, "Rústica", 42000, "Debolsillo", 12, "/Imagen/Portadas/9789588789774.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789588789774.txt"));
        Book newBook25 = new Book(24,"9788466705660", "El gato negro", "Terror", "Edgar Allan Poe", 222, "Rústica", 32000, "Anaya-Rei", 14, "/Imagen/Portadas/9788466705660.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9788466705660.txt"));
        Book newBook26 = new Book(25,"9789588773605", "El nombre de la rosa", "Novela", "Umberto Eco", 505, "Rústica", 42000, "Debolsillo", 15, "/Imagen/Portadas/9789588773605.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789588773605.txt"));
        Book newBook27 = new Book(26,"9789585477681", "Los ladrones de seda", "Novela", "Dirk Husemann", 409, "Rústica", 45000, "Ediciones B", 10, "/Imagen/Portadas/9789585477681.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789585477681.txt"));
        Book newBook28 = new Book(27,"9789585987616", "El hijo del curandero", "Novela", "José María Valle Torralbo", 217, "Rústica", 37000, "Palabra Libre", 7, "/Imagen/Portadas/9789585987616.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789585987616.txt"));
        Book newBook29 = new Book(28,"9789585477636", "Nerón: El esplendor y la derrota", "Novela", "Margaret George", 646, "Rústica", 52000, "Ediciones B", 10, "/Imagen/Portadas/9789585477636.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9789585477636.txt"));
        Book newBook30 = new Book(29,"9788416634392", "La voz de los árboles", "Novela", "Tracy Chevalier", 342, "Rústica", 36000, "Duomo", 12, "/Imagen/Portadas/9788416634392.jpg", FileManager.readReviewFile("../src/Imagen/Resumenes/9788416634392.txt"));
        booksMap.put(newBook1.getIndex(), newBook1);
        booksMap.put(newBook2.getIndex(), newBook2);
        booksMap.put(newBook3.getIndex(), newBook3);
        booksMap.put(newBook4.getIndex(), newBook4);
        booksMap.put(newBook5.getIndex(), newBook5);
        booksMap.put(newBook6.getIndex(), newBook6);
        booksMap.put(newBook7.getIndex(), newBook7);
        booksMap.put(newBook8.getIndex(), newBook8);
        booksMap.put(newBook9.getIndex(), newBook9);
        booksMap.put(newBook10.getIndex(), newBook10);
        booksMap.put(newBook11.getIndex(), newBook11);
        booksMap.put(newBook12.getIndex(), newBook12);
        booksMap.put(newBook13.getIndex(), newBook13);
        booksMap.put(newBook14.getIndex(), newBook14);
        booksMap.put(newBook15.getIndex(), newBook15);
        booksMap.put(newBook16.getIndex(), newBook16);
        booksMap.put(newBook17.getIndex(), newBook17);
        booksMap.put(newBook18.getIndex(), newBook18);
        booksMap.put(newBook19.getIndex(), newBook19);
        booksMap.put(newBook20.getIndex(), newBook20);
        booksMap.put(newBook21.getIndex(), newBook21);
        booksMap.put(newBook22.getIndex(), newBook22);
        booksMap.put(newBook23.getIndex(), newBook23);
        booksMap.put(newBook24.getIndex(), newBook24);
        booksMap.put(newBook25.getIndex(), newBook25);
        booksMap.put(newBook26.getIndex(), newBook26);
        booksMap.put(newBook27.getIndex(), newBook27);
        booksMap.put(newBook28.getIndex(), newBook28);
        booksMap.put(newBook29.getIndex(), newBook29);
        booksMap.put(newBook30.getIndex(), newBook30);
        return booksMap;
    }
    
    public ImageIcon getBookCoverFile(){
        ImageIcon bookCover = new ImageIcon(this.coverFilePath);
        return bookCover;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTypeOfCover() {
        return typeOfCover;
    }

    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCoverFilePath() {
        return coverFilePath;
    }

    public void setCoverFilePath(String coverFilePath) {
        this.coverFilePath = coverFilePath;
    }

    public boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
    
}
