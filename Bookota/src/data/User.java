package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class User extends Person implements UserActions {

    private ArrayList<Book> wishList;
    private String homeAdress;
    private ArrayList<Book> shoppingCart;
    private String favouriteGenre;
    private ArrayList<String> payPalPaying;
    private ArrayList<String> creditCardPaying;
    private boolean rememberPayPalData;
    private boolean rememberCreditCardData;
    

    public User(String homeAdress, String favouriteGenre, String username, String password, String name, String email) {
        super(username, password, name, email);
        this.homeAdress = homeAdress;
        this.favouriteGenre = favouriteGenre;
        this.shoppingCart = new ArrayList<>();
        this.wishList = new ArrayList<>();
        this.payPalPaying = new ArrayList<>();
        this.creditCardPaying = new ArrayList<>();
        
        this.payPalPaying.add(""); //Correo
        this.payPalPaying.add(""); //Contraseña
        
        this.creditCardPaying.add(""); //Tipo de tarjeta
        this.creditCardPaying.add(""); //Titular
        this.creditCardPaying.add(""); //Tipo de documento
        this.creditCardPaying.add(""); //Documento
        this.creditCardPaying.add(""); //Numero de la tarjeta
        this.creditCardPaying.add(""); //Codigo de seguridad
        this.creditCardPaying.add(""); //Año
        this.creditCardPaying.add(""); //Mes
        this.creditCardPaying.add(""); //Cuotas
        this.creditCardPaying.add(""); //Telefono celular
        
        this.rememberPayPalData = false;
        this.rememberCreditCardData = false;
    }

    @Override
    public void AddBookToShoppingCart(int index, HashMap<String, Book> booksMap) {
        for (Book book : booksMap.values()) {// Se revisa si el codigo corresponde a un libro
            if (index == book.getIndex()) {
                this.shoppingCart.add(book);
            }
        }
    }
    
    @Override
    public void AddBookToShoppingCart(int index, ArrayList<Book> booksList) {
        for (Book book : booksList) {// Se revisa si el codigo corresponde a un libro
            if (index == book.getIndex()) {
                this.shoppingCart.add(book);
            }
        }
    }
    
    @Override
    public void AddBookToWishList(int index, HashMap<String, Book> booksMap) {
        for (Book book : booksMap.values()) {// Se revisa si el codigo corresponde a un libro
            if (index == book.getIndex()) {
                this.wishList.add(book);
            }
        }
    }
    
    @Override
    public void deleteBookFromShoppingCart(int index){
        int bookPosition = 0;
        for(int i=0; i<this.shoppingCart.size(); i++){
            if(this.shoppingCart.get(i).getIndex() == index){
                bookPosition = i;
            }
        }
        this.shoppingCart.remove(bookPosition);
    }
    
    @Override
    public void deleteBookFromWishList(int index){
        this.wishList.remove(index);
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return this.username.equals(user.getUsername());
    }

    public ArrayList<Book> getWishList() {
        return wishList;
    }

    public void setWishList(ArrayList<Book> wishList) {
        this.wishList = wishList;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public ArrayList<Book> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Book> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String getFavouriteGenre() {
        return favouriteGenre;
    }

    public void setFavouriteGenres(String favouriteGenre) {
        this.favouriteGenre = favouriteGenre;
    }

    public ArrayList<String> getPayPalPaying() {
        return payPalPaying;
    }

    public void setPayPalPaying(ArrayList<String> payPalPaying) {
        this.payPalPaying = payPalPaying;
    }

    public ArrayList<String> getCreditCardPaying() {
        return creditCardPaying;
    }

    public void setCreditCardPaying(ArrayList<String> creditCardPaying) {
        this.creditCardPaying = creditCardPaying;
    }

    public boolean getRememberPayPalData() {
        return rememberPayPalData;
    }

    public void setRememberPayPalData(boolean rememberPayPalData) {
        this.rememberPayPalData = rememberPayPalData;
    }

    public boolean getRememberCreditCardData() {
        return rememberCreditCardData;
    }

    public void setRememberCreditCardData(boolean rememberCreditCardData) {
        this.rememberCreditCardData = rememberCreditCardData;
    }

    
}
