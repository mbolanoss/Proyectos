/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import businessLogic.BookStore;
import data.Book;
import java.awt.Cursor;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Valentina Gonzalez
 */
public class GenreWindow extends javax.swing.JFrame {

    private static ArrayList<Book> genreBooksList;
    private static String genre;
    private Book recomendedBook;

    /**
     * Creates new form PantallaPrincipal
     */
    public GenreWindow() {
        initComponents();

        setTitle("\ud83d\udcda Bookotá");
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/Bookota.png")).getImage());// Icono de la ventana

        setLocationRelativeTo(null);

        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Imagen/Bookota.png"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabelAppLogo.getWidth(), jLabelAppLogo.getHeight(), Image.SCALE_SMOOTH));
        jLabelAppLogo.setIcon(fondo1);
        this.repaint();

        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Imagen/ShoppingCart1.png"));
        Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(jLabelShoppingCar.getWidth(), jLabelShoppingCar.getHeight(), Image.SCALE_SMOOTH));
        jLabelShoppingCar.setIcon(fondo2);
        this.repaint();

        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/Imagen/Wish3.png"));
        Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(jLabelWishList.getWidth(), jLabelWishList.getHeight(), Image.SCALE_SMOOTH));
        jLabelWishList.setIcon(fondo3);
        this.repaint();

        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/Imagen/Categories.png"));
        Icon fondo4 = new ImageIcon(imagen4.getImage().getScaledInstance(jLabelCategoriesIcon.getWidth(), jLabelCategoriesIcon.getHeight(), Image.SCALE_SMOOTH));
        jLabelCategoriesIcon.setIcon(fondo4);
        this.repaint();

        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/Imagen/Home1.png"));
        Icon fondo5 = new ImageIcon(imagen5.getImage().getScaledInstance(btnHome.getWidth(), btnHome.getHeight(), Image.SCALE_SMOOTH));
        btnHome.setIcon(fondo5);
        this.repaint();

        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/Imagen/Facebook.png"));
        Icon fondo6 = new ImageIcon(imagen6.getImage().getScaledInstance(jLabelFacebookIcon.getWidth(), jLabelFacebookIcon.getHeight(), Image.SCALE_SMOOTH));
        jLabelFacebookIcon.setIcon(fondo6);
        this.repaint();

        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/Imagen/Instagram.png"));
        Icon fondo7 = new ImageIcon(imagen7.getImage().getScaledInstance(jLabelInstagramIcon.getWidth(), jLabelInstagramIcon.getHeight(), Image.SCALE_SMOOTH));
        jLabelInstagramIcon.setIcon(fondo7);
        this.repaint();

        ImageIcon imagen8 = new ImageIcon(getClass().getResource("/Imagen/Twitter.png"));
        Icon fondo8 = new ImageIcon(imagen8.getImage().getScaledInstance(jLabelTwitterIconB.getWidth(), jLabelTwitterIconB.getHeight(), Image.SCALE_SMOOTH));
        jLabelTwitterIconB.setIcon(fondo8);
        this.repaint();

        ImageIcon imagen9 = new ImageIcon(getClass().getResource("/Imagen/Payment.png"));
        Icon fondo9 = new ImageIcon(imagen9.getImage().getScaledInstance(jLabelPayment.getWidth(), jLabelPayment.getHeight(), Image.SCALE_SMOOTH));
        jLabelPayment.setIcon(fondo9);
        this.repaint();
        
        ImageIcon imagen12 = new ImageIcon(getClass().getResource("/Imagen/Title.png"));
        Icon fondo12 = new ImageIcon(imagen12.getImage().getScaledInstance(jlableTitle.getWidth(), jlableTitle.getHeight(), Image.SCALE_SMOOTH));
        jlableTitle.setIcon(fondo12);
        this.repaint();
        
        ImageIcon imagen13 = new ImageIcon( getClass().getResource("/Imagen/Bookota.png"));
        Icon fondo13 =new ImageIcon ( imagen1.getImage().getScaledInstance(jLabelAppLogo.getWidth(), jLabelAppLogo.getHeight(),Image.SCALE_DEFAULT));
        jLabelAppLogo.setIcon(fondo1);
        this.repaint();

        setBooksInfo();

    }

    private void setBooksInfo() {
        Icon genreImage = new ImageIcon(getClass().getResource("/Imagen/Generos/" + genre + ".png"));
        //Icon genreBackGround = new ImageIcon();
        jlabelGenre.setIcon(genreImage);
        this.repaint();

        jlabelTypeOfGenre.setText(genre);
        jlabelGenreTitle.setText(genre);

        setRandomCovers();
        setRandomTitles();
        setRandomAuthors();
        setRandomPrices();
        setRecommendedBookInfo();
    }

    private void setRandomCovers() {
        Book randomBook1 = genreBooksList.get(0);
        Book randomBook2 = genreBooksList.get(1);
        Book randomBook3 = genreBooksList.get(2);
        Book randomBook4 = genreBooksList.get(3);
        Book randomBook5 = genreBooksList.get(4);

        ImageIcon book1Image = new ImageIcon(getClass().getResource(randomBook1.getCoverFilePath()));
        Icon book1Background = new ImageIcon(book1Image.getImage().getScaledInstance(btnBook1.getWidth(), btnBook1.getHeight(), Image.SCALE_SMOOTH));
        btnBook1.setIcon(book1Background);
        this.repaint();

        ImageIcon book2Image = new ImageIcon(getClass().getResource(randomBook2.getCoverFilePath()));
        Icon book2Background = new ImageIcon(book2Image.getImage().getScaledInstance(btnBook2.getWidth(), btnBook2.getHeight(), Image.SCALE_SMOOTH));
        btnBook2.setIcon(book2Background);
        this.repaint();

        ImageIcon book3Image = new ImageIcon(getClass().getResource(randomBook3.getCoverFilePath()));
        Icon book3Background = new ImageIcon(book3Image.getImage().getScaledInstance(btnBook3.getWidth(), btnBook3.getHeight(), Image.SCALE_SMOOTH));
        btnBook3.setIcon(book3Background);
        this.repaint();

        ImageIcon book4Image = new ImageIcon(getClass().getResource(randomBook4.getCoverFilePath()));
        Icon book4Background = new ImageIcon(book4Image.getImage().getScaledInstance(btnBook4.getWidth(), btnBook4.getHeight(), Image.SCALE_SMOOTH));
        btnBook4.setIcon(book4Background);
        this.repaint();

        ImageIcon book5Image = new ImageIcon(getClass().getResource(randomBook5.getCoverFilePath()));
        Icon book5Background = new ImageIcon(book5Image.getImage().getScaledInstance(btnBook5.getWidth(), btnBook5.getHeight(), Image.SCALE_SMOOTH));
        btnBook5.setIcon(book5Background);
        this.repaint();

    }

    private void setRandomTitles() {
        jlabelTitleBook1.setText(genreBooksList.get(0).getTitle());
        jlabelTitleBook2.setText(genreBooksList.get(1).getTitle());
        jlabelTitleBook3.setText(genreBooksList.get(2).getTitle());
        jlabelTitleBook4.setText(genreBooksList.get(3).getTitle());
        jlabelTitleBook5.setText(genreBooksList.get(4).getTitle());
    }

    private void setRandomAuthors() {
        jlabelAuthorBook1.setText(genreBooksList.get(0).getAuthor());
        jlabelAuthorBook2.setText(genreBooksList.get(1).getAuthor());
        jlabelAuthorBook3.setText(genreBooksList.get(2).getAuthor());
        jlabelAuthorBook4.setText(genreBooksList.get(3).getAuthor());
        jlabelAuthorBook5.setText(genreBooksList.get(4).getAuthor());
    }

    private void setRandomPrices() {
        jlabelPriceBook1.setText("$" + Integer.toString(genreBooksList.get(0).getPrice()));
        jlabelPriceBook2.setText("$" + Integer.toString(genreBooksList.get(1).getPrice()));
        jlabelPriceBook3.setText("$" + Integer.toString(genreBooksList.get(2).getPrice()));
        jlabelPriceBook4.setText("$" + Integer.toString(genreBooksList.get(3).getPrice()));
        jlabelPriceBook5.setText("$" + Integer.toString(genreBooksList.get(4).getPrice()));
    }

    private void setRecommendedBookInfo() {
        Random random = new Random();
        int index = random.nextInt(BookStore.getBooksIndexes(BookStore.getBooksMap()).size());
        recomendedBook = BookStore.getBooksMap().get(index);

        ImageIcon recomendedBookImage = new ImageIcon(getClass().getResource(recomendedBook.getCoverFilePath()));
        Icon recomendedBookBackground = new ImageIcon(recomendedBookImage.getImage().getScaledInstance(btnRecomendedBook.getWidth(), btnRecomendedBook.getHeight(), Image.SCALE_SMOOTH));
        btnRecomendedBook.setIcon(recomendedBookBackground);
        this.repaint();

        jlabelRecomendedTitleBook.setText(recomendedBook.getTitle());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelBookota = new javax.swing.JPanel();
        jPanelFreeShipping = new javax.swing.JPanel();
        jLabelFreeShipping = new javax.swing.JLabel();
        jLabelAppLogo = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jlableTitle = new javax.swing.JLabel();
        jLabelAppLogo1 = new javax.swing.JLabel();
        jLabelCategories = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jlabelTitleBook3 = new javax.swing.JLabel();
        jlabelTitleBook4 = new javax.swing.JLabel();
        jlabelTitleBook5 = new javax.swing.JLabel();
        jlabelPriceBook2 = new javax.swing.JLabel();
        jlabelPriceBook3 = new javax.swing.JLabel();
        jlabelPriceBook4 = new javax.swing.JLabel();
        jlabelPriceBook5 = new javax.swing.JLabel();
        jPanelRightsReserved = new javax.swing.JPanel();
        jLabelRightsReserved = new javax.swing.JLabel();
        jLabelFacebookIcon = new javax.swing.JLabel();
        jLabelInstagramIcon = new javax.swing.JLabel();
        jLabelTwitterIconB = new javax.swing.JLabel();
        jlabelAuthorBook1 = new javax.swing.JLabel();
        jlabelAuthorBook2 = new javax.swing.JLabel();
        jlabelAuthorBook3 = new javax.swing.JLabel();
        jlabelAuthorBook4 = new javax.swing.JLabel();
        jlabelAuthorBook5 = new javax.swing.JLabel();
        jPanelMonthlyFindings = new javax.swing.JPanel();
        jLabelFindings = new javax.swing.JLabel();
        jlabelRecomendedTitleBook = new javax.swing.JLabel();
        btnRecomendedBook = new javax.swing.JButton();
        jlabelTitleBook2 = new javax.swing.JLabel();
        jlabelTitleBook1 = new javax.swing.JLabel();
        jlabelPriceBook1 = new javax.swing.JLabel();
        jLabelPayment = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelContainer = new javax.swing.JPanel();
        jPanelGenre = new javax.swing.JPanel();
        jlabelGenre = new javax.swing.JLabel();
        btnUniversalLiterature = new javax.swing.JButton();
        btnYoungLiterature = new javax.swing.JButton();
        btnFantasy = new javax.swing.JButton();
        btnRomance = new javax.swing.JButton();
        btnTerror = new javax.swing.JButton();
        Novel = new javax.swing.JButton();
        btnShoppingCart = new javax.swing.JButton();
        jLabelShoppingC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnWishList = new javax.swing.JButton();
        jLabelShoppingCar = new javax.swing.JLabel();
        jLabelWishList = new javax.swing.JLabel();
        jLabelCategoriesIcon = new javax.swing.JLabel();
        btnBook1 = new javax.swing.JButton();
        btnBook2 = new javax.swing.JButton();
        btnBook3 = new javax.swing.JButton();
        btnBook4 = new javax.swing.JButton();
        btnBook5 = new javax.swing.JButton();
        jlabelGenreTitle = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlabelTypeOfGenre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnViewAllBooks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jPanelBookota.setBackground(new java.awt.Color(40, 47, 93));
        jPanelBookota.setAlignmentX(0.0F);
        jPanelBookota.setAlignmentY(0.0F);
        jPanelBookota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFreeShipping.setBackground(new java.awt.Color(255, 153, 51));

        jLabelFreeShipping.setBackground(new java.awt.Color(255, 37, 69));
        jLabelFreeShipping.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFreeShipping.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFreeShipping.setText("Envíos gratis en Bogotá. Pedidos con duración máxima de envío de 24 horas.");
        jLabelFreeShipping.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanelFreeShippingLayout = new javax.swing.GroupLayout(jPanelFreeShipping);
        jPanelFreeShipping.setLayout(jPanelFreeShippingLayout);
        jPanelFreeShippingLayout.setHorizontalGroup(
            jPanelFreeShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFreeShippingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFreeShipping, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFreeShippingLayout.setVerticalGroup(
            jPanelFreeShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFreeShippingLayout.createSequentialGroup()
                .addComponent(jLabelFreeShipping, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        jPanelBookota.add(jPanelFreeShipping, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));
        jPanelBookota.add(jLabelAppLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 35, 33));

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setBorder(null);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanelBookota.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 40, 39));

        jlableTitle.setForeground(new java.awt.Color(255, 255, 255));
        jPanelBookota.add(jlableTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 120, 50));
        jPanelBookota.add(jLabelAppLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 35, 33));

        jLabelCategories.setText("CATEGORÍAS");

        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jlabelTitleBook3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlabelTitleBook3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelTitleBook3.setText("Empty");

        jlabelTitleBook4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlabelTitleBook4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelTitleBook4.setText("Empty");

        jlabelTitleBook5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlabelTitleBook5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelTitleBook5.setText("Empty");

        jlabelPriceBook2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabelPriceBook2.setForeground(new java.awt.Color(255, 82, 73));
        jlabelPriceBook2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelPriceBook2.setText("Empty");
        jlabelPriceBook2.setAlignmentY(0.0F);

        jlabelPriceBook3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabelPriceBook3.setForeground(new java.awt.Color(255, 82, 73));
        jlabelPriceBook3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelPriceBook3.setText("Empty");
        jlabelPriceBook3.setToolTipText("");
        jlabelPriceBook3.setAlignmentY(0.0F);

        jlabelPriceBook4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabelPriceBook4.setForeground(new java.awt.Color(255, 82, 73));
        jlabelPriceBook4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelPriceBook4.setText("Empty");
        jlabelPriceBook4.setAlignmentY(0.0F);

        jlabelPriceBook5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabelPriceBook5.setForeground(new java.awt.Color(255, 82, 73));
        jlabelPriceBook5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelPriceBook5.setText("Empty");
        jlabelPriceBook5.setAlignmentY(0.0F);

        jPanelRightsReserved.setBackground(new java.awt.Color(40, 47, 93));
        jPanelRightsReserved.setAlignmentX(0.0F);
        jPanelRightsReserved.setAlignmentY(0.0F);

        jLabelRightsReserved.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabelRightsReserved.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRightsReserved.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRightsReserved.setText("© Todos los derechos reservados. 2019.");

        javax.swing.GroupLayout jPanelRightsReservedLayout = new javax.swing.GroupLayout(jPanelRightsReserved);
        jPanelRightsReserved.setLayout(jPanelRightsReservedLayout);
        jPanelRightsReservedLayout.setHorizontalGroup(
            jPanelRightsReservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightsReservedLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabelRightsReserved, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelFacebookIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelInstagramIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTwitterIconB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanelRightsReservedLayout.setVerticalGroup(
            jPanelRightsReservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRightsReservedLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabelRightsReserved)
                .addContainerGap())
            .addComponent(jLabelFacebookIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelInstagramIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTwitterIconB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jlabelAuthorBook1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jlabelAuthorBook1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelAuthorBook1.setText("Empty");

        jlabelAuthorBook2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jlabelAuthorBook2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelAuthorBook2.setText("Empty");

        jlabelAuthorBook3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jlabelAuthorBook3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelAuthorBook3.setText("Empty");

        jlabelAuthorBook4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jlabelAuthorBook4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelAuthorBook4.setText("Empty");

        jlabelAuthorBook5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jlabelAuthorBook5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelAuthorBook5.setText("Empty");

        jPanelMonthlyFindings.setBackground(new java.awt.Color(0, 153, 153));
        jPanelMonthlyFindings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFindings.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFindings.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFindings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFindings.setText("Nuestro recomendado ");
        jPanelMonthlyFindings.add(jLabelFindings, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 22));

        jlabelRecomendedTitleBook.setFont(new java.awt.Font("Tahoma", 2, 9)); // NOI18N
        jlabelRecomendedTitleBook.setForeground(new java.awt.Color(255, 255, 255));
        jlabelRecomendedTitleBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelRecomendedTitleBook.setText("Empty");
        jPanelMonthlyFindings.add(jlabelRecomendedTitleBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 20));

        btnRecomendedBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRecomendedBookMouseEntered(evt);
            }
        });
        btnRecomendedBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecomendedBookActionPerformed(evt);
            }
        });
        jPanelMonthlyFindings.add(btnRecomendedBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 70, 90));

        jlabelTitleBook2.setBackground(new java.awt.Color(50, 40, 30));
        jlabelTitleBook2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlabelTitleBook2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelTitleBook2.setText("Empty");

        jlabelTitleBook1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlabelTitleBook1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelTitleBook1.setText("Empty");

        jlabelPriceBook1.setBackground(new java.awt.Color(255, 255, 255));
        jlabelPriceBook1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabelPriceBook1.setForeground(new java.awt.Color(255, 82, 73));
        jlabelPriceBook1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelPriceBook1.setText("Empty");
        jlabelPriceBook1.setAlignmentY(0.0F);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Todos los medios de pago");

        jPanelContainer.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelGenre.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGenre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabelGenre.setToolTipText("");
        jPanelGenre.add(jlabelGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 200));

        jPanelContainer.add(jPanelGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 200));

        btnUniversalLiterature.setBackground(new java.awt.Color(40, 47, 93));
        btnUniversalLiterature.setForeground(new java.awt.Color(250, 250, 250));
        btnUniversalLiterature.setText("Literatura Universal");
        btnUniversalLiterature.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUniversalLiteratureMouseEntered(evt);
            }
        });
        btnUniversalLiterature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniversalLiteratureActionPerformed(evt);
            }
        });

        btnYoungLiterature.setBackground(new java.awt.Color(40, 47, 93));
        btnYoungLiterature.setForeground(new java.awt.Color(250, 250, 250));
        btnYoungLiterature.setText("Literatura Juvenil");
        btnYoungLiterature.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnYoungLiteratureMouseEntered(evt);
            }
        });
        btnYoungLiterature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYoungLiteratureActionPerformed(evt);
            }
        });

        btnFantasy.setBackground(new java.awt.Color(40, 47, 93));
        btnFantasy.setForeground(new java.awt.Color(250, 250, 250));
        btnFantasy.setText("Fantasía");
        btnFantasy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFantasyMouseEntered(evt);
            }
        });
        btnFantasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFantasyActionPerformed(evt);
            }
        });

        btnRomance.setBackground(new java.awt.Color(40, 47, 93));
        btnRomance.setForeground(new java.awt.Color(250, 250, 250));
        btnRomance.setText("Romance");
        btnRomance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRomanceMouseEntered(evt);
            }
        });
        btnRomance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRomanceActionPerformed(evt);
            }
        });

        btnTerror.setBackground(new java.awt.Color(40, 47, 93));
        btnTerror.setForeground(new java.awt.Color(250, 250, 250));
        btnTerror.setText("Terror");
        btnTerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTerrorMouseEntered(evt);
            }
        });
        btnTerror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerrorActionPerformed(evt);
            }
        });

        Novel.setBackground(new java.awt.Color(40, 47, 97));
        Novel.setForeground(new java.awt.Color(250, 250, 250));
        Novel.setText("Novela");
        Novel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NovelMouseEntered(evt);
            }
        });
        Novel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovelActionPerformed(evt);
            }
        });

        btnShoppingCart.setBackground(new java.awt.Color(40, 47, 93));
        btnShoppingCart.setForeground(new java.awt.Color(250, 250, 250));
        btnShoppingCart.setText("Mis compras");
        btnShoppingCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnShoppingCartMouseEntered(evt);
            }
        });
        btnShoppingCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShoppingCartActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        btnWishList.setBackground(new java.awt.Color(40, 43, 97));
        btnWishList.setForeground(new java.awt.Color(250, 250, 250));
        btnWishList.setText("Mis  Deseos");
        btnWishList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnWishListMouseEntered(evt);
            }
        });
        btnWishList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWishListActionPerformed(evt);
            }
        });

        jLabelShoppingCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ShoppingCar.png"))); // NOI18N

        jLabelWishList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Wish3.png"))); // NOI18N
        jLabelWishList.setText("jLabel3");

        btnBook1.setBorder(null);
        btnBook1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBook1MouseEntered(evt);
            }
        });
        btnBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook1ActionPerformed(evt);
            }
        });

        btnBook2.setBorder(null);
        btnBook2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBook2MouseEntered(evt);
            }
        });
        btnBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook2ActionPerformed(evt);
            }
        });

        btnBook3.setBorder(null);
        btnBook3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBook3MouseEntered(evt);
            }
        });
        btnBook3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook3ActionPerformed(evt);
            }
        });

        btnBook4.setBorder(null);
        btnBook4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBook4MouseEntered(evt);
            }
        });
        btnBook4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook4ActionPerformed(evt);
            }
        });

        btnBook5.setBorder(null);
        btnBook5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBook5MouseEntered(evt);
            }
        });
        btnBook5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook5ActionPerformed(evt);
            }
        });

        jlabelGenreTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setText("A continuación veras los títulos de:");

        jlabelTypeOfGenre.setBackground(new java.awt.Color(204, 204, 255));
        jlabelTypeOfGenre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelTypeOfGenre.setText("Empty");

        jLabel6.setText("que manejamos. Disfruta tú visita. ");

        btnViewAllBooks.setText("Ver todos los libros");
        btnViewAllBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewAllBooksMouseEntered(evt);
            }
        });
        btnViewAllBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllBooksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBookota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelRightsReserved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabelShoppingCar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnShoppingCart, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabelShoppingC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabelWishList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnWishList, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabelCategories)
                        .addGap(35, 35, 35)
                        .addComponent(jLabelCategoriesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jlabelTypeOfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(btnBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jlabelAuthorBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlabelAuthorBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlabelPriceBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jlabelPriceBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(jlabelPriceBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jlabelPriceBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jlabelPriceBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jlabelAuthorBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addComponent(jlabelAuthorBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlabelAuthorBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlabelTitleBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(jlabelTitleBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(90, 90, 90)
                                .addComponent(jlabelTitleBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jlabelTitleBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jlabelTitleBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlabelGenreTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(127, 127, 127)
                                    .addComponent(btnViewAllBooks))
                                .addComponent(jPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUniversalLiterature, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnYoungLiterature, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFantasy, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRomance, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTerror, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Novel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelMonthlyFindings, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabelPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelBookota, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelShoppingCar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShoppingCart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelShoppingC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelWishList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnWishList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelCategoriesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jlabelGenreTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewAllBooks)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlabelTypeOfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlabelTitleBook1)
                                .addComponent(jlabelTitleBook2))
                            .addComponent(jlabelTitleBook3)
                            .addComponent(jlabelTitleBook4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jlabelTitleBook5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jlabelAuthorBook1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlabelAuthorBook5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlabelAuthorBook4)
                                        .addComponent(jlabelAuthorBook3)
                                        .addComponent(jlabelAuthorBook2)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabelPriceBook1)
                            .addComponent(jlabelPriceBook2)
                            .addComponent(jlabelPriceBook3)
                            .addComponent(jlabelPriceBook4)
                            .addComponent(jlabelPriceBook5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUniversalLiterature)
                        .addGap(7, 7, 7)
                        .addComponent(btnYoungLiterature)
                        .addGap(7, 7, 7)
                        .addComponent(btnFantasy)
                        .addGap(7, 7, 7)
                        .addComponent(btnRomance)
                        .addGap(7, 7, 7)
                        .addComponent(btnTerror)
                        .addGap(7, 7, 7)
                        .addComponent(Novel)
                        .addGap(17, 17, 17)
                        .addComponent(jPanelMonthlyFindings, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel1)))
                .addGap(13, 13, 13)
                .addComponent(jPanelRightsReserved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShoppingCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShoppingCartActionPerformed
        setVisible(false);
        ShoppingCartWindow shoppingCartWindow = new ShoppingCartWindow();
        shoppingCartWindow.setVisible(true);

    }//GEN-LAST:event_btnShoppingCartActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        setVisible(false);
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnUniversalLiteratureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUniversalLiteratureActionPerformed
        GenreWindow.setGenre("Literatura Universal");
        GenreWindow.setGenreBooksList(BookStore.filterBookMap("Literatura Universal"));
        GenreWindow genreWindow = new GenreWindow();
        setVisible(false);
        genreWindow.setVisible(true);
    }//GEN-LAST:event_btnUniversalLiteratureActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        BookStore.close(rootPane);
    }//GEN-LAST:event_formWindowClosing

    private void btnBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook1ActionPerformed
        if (genreBooksList.get(0).getTitle().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Libro vacío", "", JOptionPane.ERROR_MESSAGE);
        } else {
            setVisible(false);
            BookViewWindow.setBook(genreBooksList.get(0));
            try {
                BookViewWindow bookViewWindow = new BookViewWindow();
                bookViewWindow.setVisible(true);
            } catch (IOException ex) {
                System.out.println("Error BookViewWindow");
            }
        }
    }//GEN-LAST:event_btnBook1ActionPerformed

    private void btnBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook2ActionPerformed
        if (genreBooksList.get(1).getTitle().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Libro vacío", "", JOptionPane.ERROR_MESSAGE);
        } else {
            setVisible(false);
            BookViewWindow.setBook(genreBooksList.get(1));
            try {
                BookViewWindow bookViewWindow = new BookViewWindow();
                bookViewWindow.setVisible(true);
            } catch (IOException ex) {
                System.out.println("Error BookViewWindow");
            }
        }
    }//GEN-LAST:event_btnBook2ActionPerformed

    private void btnBook3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook3ActionPerformed
        if (genreBooksList.get(2).getTitle().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Libro vacío", "", JOptionPane.ERROR_MESSAGE);
        } else {
            setVisible(false);
            BookViewWindow.setBook(genreBooksList.get(2));
            try {
                BookViewWindow bookViewWindow = new BookViewWindow();
                bookViewWindow.setVisible(true);
            } catch (IOException ex) {
                System.out.println("Error BookViewWindow");
            }
        }
    }//GEN-LAST:event_btnBook3ActionPerformed

    private void btnBook4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook4ActionPerformed
        if (genreBooksList.get(3).getTitle().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Libro vacío", "", JOptionPane.ERROR_MESSAGE);
        } else {
            setVisible(false);
            BookViewWindow.setBook(genreBooksList.get(3));
            try {
                BookViewWindow bookViewWindow = new BookViewWindow();
                bookViewWindow.setVisible(true);
            } catch (IOException ex) {
                System.out.println("Error BookViewWindow");
            }
        }
    }//GEN-LAST:event_btnBook4ActionPerformed

    private void btnBook5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook5ActionPerformed
        if (genreBooksList.get(4).getTitle().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Libro vacío", "", JOptionPane.ERROR_MESSAGE);
        } else {
            setVisible(false);
            BookViewWindow.setBook(genreBooksList.get(4));
            try {
                BookViewWindow bookViewWindow = new BookViewWindow();
                bookViewWindow.setVisible(true);
            } catch (IOException ex) {
                System.out.println("Error BookViewWindow");
            }
        }
    }//GEN-LAST:event_btnBook5ActionPerformed

    private void btnRecomendedBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecomendedBookActionPerformed
        setVisible(false);
        BookViewWindow.setBook(recomendedBook);
        try {
            BookViewWindow bookViewWindow = new BookViewWindow();
            bookViewWindow.setVisible(true);
        } catch (IOException ex) {
            System.out.println("Error BookViewWindow");
        }
    }//GEN-LAST:event_btnRecomendedBookActionPerformed

    private void btnFantasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFantasyActionPerformed
        GenreWindow.setGenre("Fantasía");
        GenreWindow.setGenreBooksList(BookStore.filterBookMap("Fantasía"));
        GenreWindow genreWindow = new GenreWindow();
        setVisible(false);
        genreWindow.setVisible(true);
    }//GEN-LAST:event_btnFantasyActionPerformed

    private void btnYoungLiteratureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYoungLiteratureActionPerformed
        GenreWindow.setGenre("Literatura Juvenil");
        GenreWindow.setGenreBooksList(BookStore.filterBookMap("Literatura Juvenil"));
        GenreWindow genreWindow = new GenreWindow();
        setVisible(false);
        genreWindow.setVisible(true);
    }//GEN-LAST:event_btnYoungLiteratureActionPerformed

    private void btnRomanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRomanceActionPerformed
        GenreWindow.setGenre("Romance");
        GenreWindow.setGenreBooksList(BookStore.filterBookMap("Romance"));
        GenreWindow genreWindow = new GenreWindow();
        setVisible(false);
        genreWindow.setVisible(true);
    }//GEN-LAST:event_btnRomanceActionPerformed

    private void btnTerrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerrorActionPerformed
        GenreWindow.setGenre("Terror");
        GenreWindow.setGenreBooksList(BookStore.filterBookMap("Terror"));
        GenreWindow genreWindow = new GenreWindow();
        setVisible(false);
        genreWindow.setVisible(true);
    }//GEN-LAST:event_btnTerrorActionPerformed

    private void NovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovelActionPerformed
        GenreWindow.setGenre("Novela");
        GenreWindow.setGenreBooksList(BookStore.filterBookMap("Novela"));
        GenreWindow genreWindow = new GenreWindow();
        setVisible(false);
        genreWindow.setVisible(true);
    }//GEN-LAST:event_NovelActionPerformed

    private void btnWishListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWishListActionPerformed
        setVisible(false);
        WishListWindow wishListWindow = new WishListWindow();
        wishListWindow.setVisible(true);
    }//GEN-LAST:event_btnWishListActionPerformed

    private void btnViewAllBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllBooksActionPerformed
        setVisible(false);
        GeneralBookViewWindow.setBooksList(BookStore.filterBookMap(genre));
        GeneralBookViewWindow generalBookViewWindow = new GeneralBookViewWindow();
        generalBookViewWindow.setVisible(true);
    }//GEN-LAST:event_btnViewAllBooksActionPerformed

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        btnHome.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnShoppingCartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShoppingCartMouseEntered
        btnShoppingCart.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnShoppingCartMouseEntered

    private void btnWishListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWishListMouseEntered
        btnWishList.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnWishListMouseEntered

    private void btnUniversalLiteratureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUniversalLiteratureMouseEntered
        btnUniversalLiterature.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnUniversalLiteratureMouseEntered

    private void btnYoungLiteratureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYoungLiteratureMouseEntered
        btnYoungLiterature.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnYoungLiteratureMouseEntered

    private void btnFantasyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFantasyMouseEntered
        btnFantasy.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnFantasyMouseEntered

    private void btnRomanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRomanceMouseEntered
        btnRomance.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnRomanceMouseEntered

    private void btnTerrorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerrorMouseEntered
        btnTerror.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnTerrorMouseEntered

    private void NovelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovelMouseEntered
        Novel.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_NovelMouseEntered

    private void btnRecomendedBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecomendedBookMouseEntered
        btnRecomendedBook.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnRecomendedBookMouseEntered

    private void btnBook5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook5MouseEntered
        btnBook5.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnBook5MouseEntered

    private void btnViewAllBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewAllBooksMouseEntered
        btnViewAllBooks.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnViewAllBooksMouseEntered

    private void btnBook4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook4MouseEntered
        btnBook4.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnBook4MouseEntered

    private void btnBook3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook3MouseEntered
        btnBook3.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnBook3MouseEntered

    private void btnBook2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook2MouseEntered
        btnBook2.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnBook2MouseEntered

    private void btnBook1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook1MouseEntered
        btnBook1.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnBook1MouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GenreWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenreWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenreWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenreWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenreWindow().setVisible(true);
            }
        });
    }

    public static ArrayList<Book> getGenreBooksList() {
        return genreBooksList;
    }

    public static void setGenreBooksList(ArrayList<Book> genreBooksList) {
        GenreWindow.genreBooksList = genreBooksList;
    }

    public static String getGenre() {
        return genre;
    }

    public static void setGenre(String genre) {
        GenreWindow.genre = genre;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Novel;
    private javax.swing.JButton btnBook1;
    private javax.swing.JButton btnBook2;
    private javax.swing.JButton btnBook3;
    private javax.swing.JButton btnBook4;
    private javax.swing.JButton btnBook5;
    private javax.swing.JButton btnFantasy;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRecomendedBook;
    private javax.swing.JButton btnRomance;
    private javax.swing.JButton btnShoppingCart;
    private javax.swing.JButton btnTerror;
    private javax.swing.JButton btnUniversalLiterature;
    private javax.swing.JButton btnViewAllBooks;
    private javax.swing.JButton btnWishList;
    private javax.swing.JButton btnYoungLiterature;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAppLogo;
    private javax.swing.JLabel jLabelAppLogo1;
    private javax.swing.JLabel jLabelCategories;
    private javax.swing.JLabel jLabelCategoriesIcon;
    private javax.swing.JLabel jLabelFacebookIcon;
    private javax.swing.JLabel jLabelFindings;
    private javax.swing.JLabel jLabelFreeShipping;
    private javax.swing.JLabel jLabelInstagramIcon;
    private javax.swing.JLabel jLabelPayment;
    private javax.swing.JLabel jLabelRightsReserved;
    private javax.swing.JLabel jLabelShoppingC;
    private javax.swing.JLabel jLabelShoppingCar;
    private javax.swing.JLabel jLabelTwitterIconB;
    private javax.swing.JLabel jLabelWishList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanelBookota;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JPanel jPanelFreeShipping;
    private javax.swing.JPanel jPanelGenre;
    private javax.swing.JPanel jPanelMonthlyFindings;
    private javax.swing.JPanel jPanelRightsReserved;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabelAuthorBook1;
    private javax.swing.JLabel jlabelAuthorBook2;
    private javax.swing.JLabel jlabelAuthorBook3;
    private javax.swing.JLabel jlabelAuthorBook4;
    private javax.swing.JLabel jlabelAuthorBook5;
    private javax.swing.JLabel jlabelGenre;
    private javax.swing.JLabel jlabelGenreTitle;
    private javax.swing.JLabel jlabelPriceBook1;
    private javax.swing.JLabel jlabelPriceBook2;
    private javax.swing.JLabel jlabelPriceBook3;
    private javax.swing.JLabel jlabelPriceBook4;
    private javax.swing.JLabel jlabelPriceBook5;
    private javax.swing.JLabel jlabelRecomendedTitleBook;
    private javax.swing.JLabel jlabelTitleBook1;
    private javax.swing.JLabel jlabelTitleBook2;
    private javax.swing.JLabel jlabelTitleBook3;
    private javax.swing.JLabel jlabelTitleBook4;
    private javax.swing.JLabel jlabelTitleBook5;
    private javax.swing.JLabel jlabelTypeOfGenre;
    private javax.swing.JLabel jlableTitle;
    // End of variables declaration//GEN-END:variables

}
