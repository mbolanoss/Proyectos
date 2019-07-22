/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import AppPackage.AnimationClass;
import businessLogic.BookStore;
import data.Book;
import data.User;
import java.awt.Cursor;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Valentina Gonzalez
 */
public class MainWindow extends javax.swing.JFrame {

    AnimationClass ac = new AnimationClass();
    private static ArrayList<Book> randomBooks = new ArrayList<>();
    private Book recomendedBook;

    /**
     * Creates new form PantallaPrincipal
     */
    public MainWindow() {
        initComponents();
        sliderShowLeft();
        sliderShowRight();

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

        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/Imagen/User1.png"));
        Icon fondo5 = new ImageIcon(imagen5.getImage().getScaledInstance(btnAccount.getWidth(), btnAccount.getHeight(), Image.SCALE_SMOOTH));
        btnAccount.setIcon(fondo5);
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

        ImageIcon imagen10 = new ImageIcon(getClass().getResource("/Imagen/Search.png"));
        Icon fondo10 = new ImageIcon(imagen10.getImage().getScaledInstance(btnSearch.getWidth(), btnSearch.getHeight(), Image.SCALE_SMOOTH));
        btnSearch.setIcon(fondo10);
        this.repaint();

        ImageIcon imagen11 = new ImageIcon(getClass().getResource("/Imagen/CloseSession.png"));
        Icon fondo11 = new ImageIcon(imagen11.getImage().getScaledInstance(btnLogOut.getWidth(), btnLogOut.getHeight(), Image.SCALE_SMOOTH));
        btnLogOut.setIcon(fondo11);
        this.repaint();
        
        ImageIcon imagen12 = new ImageIcon(getClass().getResource("/Imagen/Title.png"));
        Icon fondo12 = new ImageIcon(imagen12.getImage().getScaledInstance(jlableTitle.getWidth(), jlableTitle.getHeight(), Image.SCALE_SMOOTH));
        jlableTitle.setIcon(fondo12);
        this.repaint();

        randomBooks = BookStore.generateRandomBooks(BookStore.getBooksMap());

        setRandomInfo();

    }

    public void sliderShowLeft() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int nb = 0;
                try {
                    while (true) {
                        switch (nb) {
                            case 0:
                                Thread.sleep(3000);
                                ac.jLabelXLeft(0, -380, 12, 10, img1);
                                ac.jLabelXLeft(380, 0, 12, 10, img2);
                                ac.jLabelXLeft(760, 380, 12, 10, img3);
                                ac.jLabelXLeft(1140, 760, 12, 10, img4);
                                nb++;
                            case 1:
                                Thread.sleep(3000);
                                ac.jLabelXLeft(-380, -760, 12, 10, img1);
                                ac.jLabelXLeft(0, -380, 12, 10, img2);
                                ac.jLabelXLeft(380, 0, 12, 10, img3);
                                ac.jLabelXLeft(760, 360, 12, 10, img4);
                                nb++;
                            case 2:
                                Thread.sleep(3000);
                                ac.jLabelXLeft(-760, -1140, 12, 10, img1);
                                ac.jLabelXLeft(-380, -760, 12, 10, img2);
                                ac.jLabelXLeft(0, -380, 12, 10, img3);
                                ac.jLabelXLeft(360, 0, 12, 10, img4);
                                nb++;
                            case 3:
                                Thread.sleep(3000);
                                ac.jLabelXRight(-1140, -760, 12, 10, img1);
                                ac.jLabelXRight(-760, -380, 12, 10, img2);
                                ac.jLabelXRight(-380, 0, 12, 10, img3);
                                ac.jLabelXRight(0, 380, 12, 10, img4);
                                nb++;
                            case 4:
                                Thread.sleep(3000);
                                ac.jLabelXRight(-760, -380, 12, 10, img1);
                                ac.jLabelXRight(-380, 0, 12, 10, img2);
                                ac.jLabelXRight(0, 380, 12, 10, img3);
                                ac.jLabelXRight(380, 760, 12, 10, img4);
                                nb++;
                            case 5:
                                Thread.sleep(3000);
                                ac.jLabelXRight(-380, 0, 12, 10, img1);
                                ac.jLabelXRight(0, 380, 12, 10, img2);
                                ac.jLabelXRight(380, 760, 12, 10, img3);
                                ac.jLabelXRight(760, 1140, 12, 10, img4);
                                nb = 0;
                        }
                    }
                } catch (Exception ex) {

                }
            }
        }).start();

    }

    public void sliderShowRight() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int mb = 0;
                try {
                    while (true) {
                        switch (mb) {
                            case 0:
                                Thread.sleep(3000);
                                ac.jLabelXLeft(0, -380, 12, 10, img5);
                                ac.jLabelXLeft(380, 0, 12, 10, img6);
                                ac.jLabelXLeft(760, 380, 12, 10, img7);
                                ac.jLabelXLeft(1140, 760, 12, 10, img8);
                                mb++;
                            case 1:
                                Thread.sleep(3000);
                                ac.jLabelXLeft(-380, -760, 12, 10, img5);
                                ac.jLabelXLeft(0, -380, 12, 10, img6);
                                ac.jLabelXLeft(380, 0, 12, 10, img7);
                                ac.jLabelXLeft(760, 360, 12, 10, img8);
                                mb++;
                            case 2:
                                Thread.sleep(3000);
                                ac.jLabelXLeft(-760, -1140, 12, 10, img5);
                                ac.jLabelXLeft(-380, -760, 12, 10, img6);
                                ac.jLabelXLeft(0, -380, 12, 10, img7);
                                ac.jLabelXLeft(360, 0, 12, 10, img8);
                                mb++;
                            case 3:
                                Thread.sleep(3000);
                                ac.jLabelXRight(-1140, -760, 12, 10, img5);
                                ac.jLabelXRight(-760, -380, 12, 10, img6);
                                ac.jLabelXRight(-380, 0, 12, 10, img7);
                                ac.jLabelXRight(0, 380, 12, 10, img8);
                                mb++;
                            case 4:
                                Thread.sleep(3000);
                                ac.jLabelXRight(-760, -380, 12, 10, img5);
                                ac.jLabelXRight(-380, 0, 12, 10, img6);
                                ac.jLabelXRight(0, 380, 12, 10, img7);
                                ac.jLabelXRight(380, 760, 12, 10, img8);
                                mb++;
                            case 5:
                                Thread.sleep(3000);
                                ac.jLabelXRight(-380, 0, 12, 10, img5);
                                ac.jLabelXRight(0, 380, 12, 10, img6);
                                ac.jLabelXRight(380, 760, 12, 10, img7);
                                ac.jLabelXRight(760, 1140, 12, 10, img8);
                                mb = 0;
                        }
                    }
                } catch (Exception ex) {

                }
            }
        }).start();

    }

    private void setRandomInfo() {
        setRandomCovers();
        setRandomTitles();
        setRandomAuthors();
        setRandomPrices();
        setRecommendedBookInfo();
    }

    private void setRandomCovers() {
        Book randomBook1 = randomBooks.get(0);
        Book randomBook2 = randomBooks.get(1);
        Book randomBook3 = randomBooks.get(2);
        Book randomBook4 = randomBooks.get(3);
        Book randomBook5 = randomBooks.get(4);

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
        jlabelTitleBook1.setText(randomBooks.get(0).getTitle());
        jlabelTitleBook2.setText(randomBooks.get(1).getTitle());
        jlabelTitleBook3.setText(randomBooks.get(2).getTitle());
        jlabelTitleBook4.setText(randomBooks.get(3).getTitle());
        jlabelTitleBook5.setText(randomBooks.get(4).getTitle());
    }

    private void setRandomAuthors() {
        jlabelAuthorBook1.setText(randomBooks.get(0).getAuthor());
        jlabelAuthorBook2.setText(randomBooks.get(1).getAuthor());
        jlabelAuthorBook3.setText(randomBooks.get(2).getAuthor());
        jlabelAuthorBook4.setText(randomBooks.get(3).getAuthor());
        jlabelAuthorBook5.setText(randomBooks.get(4).getAuthor());
    }

    private void setRandomPrices() {
        jlabelPriceBook1.setText("$" + Integer.toString(randomBooks.get(0).getPrice()));
        jlabelPriceBook2.setText("$" + Integer.toString(randomBooks.get(1).getPrice()));
        jlabelPriceBook3.setText("$" + Integer.toString(randomBooks.get(2).getPrice()));
        jlabelPriceBook4.setText("$" + Integer.toString(randomBooks.get(3).getPrice()));
        jlabelPriceBook5.setText("$" + Integer.toString(randomBooks.get(4).getPrice()));
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
        txtSearch = new javax.swing.JTextField();
        btnAccount = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlableTitle = new javax.swing.JLabel();
        jLabelCategories = new javax.swing.JLabel();
        jLabelSomeAvailableBooks = new javax.swing.JLabel();
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
        jPanelLeft = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        jPanelRight = new javax.swing.JPanel();
        img5 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        img7 = new javax.swing.JLabel();
        img8 = new javax.swing.JLabel();
        btnUniversalLiterature = new javax.swing.JButton();
        btnYoungLiterature = new javax.swing.JButton();
        btnFantasy = new javax.swing.JButton();
        btnRomance = new javax.swing.JButton();
        btnTerror = new javax.swing.JButton();
        btnNovel = new javax.swing.JButton();
        btnWishList = new javax.swing.JButton();
        jLabelShoppingCar = new javax.swing.JLabel();
        jLabelWishList = new javax.swing.JLabel();
        jLabelCategoriesIcon = new javax.swing.JLabel();
        btnBook1 = new javax.swing.JButton();
        btnBook2 = new javax.swing.JButton();
        btnBook3 = new javax.swing.JButton();
        btnBook4 = new javax.swing.JButton();
        btnBook5 = new javax.swing.JButton();
        btnShoppingCart = new javax.swing.JButton();
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
                .addComponent(jLabelFreeShipping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFreeShippingLayout.setVerticalGroup(
            jPanelFreeShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFreeShippingLayout.createSequentialGroup()
                .addComponent(jLabelFreeShipping, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        jPanelBookota.add(jPanelFreeShipping, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 989, -1));
        jPanelBookota.add(jLabelAppLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 35, 33));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        jPanelBookota.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 11, 201, -1));

        btnAccount.setBackground(new java.awt.Color(255, 255, 255));
        btnAccount.setBorder(null);
        btnAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAccountMouseExited(evt);
            }
        });
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });
        jPanelBookota.add(btnAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 11, 31, 33));

        btnSearch.setBorder(null);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanelBookota.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 11, 35, 33));

        btnLogOut.setBackground(new java.awt.Color(255, 255, 255));
        btnLogOut.setBorder(null);
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogOutMouseEntered(evt);
            }
        });
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanelBookota.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(934, 11, 31, 33));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mi cuenta");
        jPanelBookota.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 11, -1, -1));

        jlableTitle.setForeground(new java.awt.Color(255, 255, 255));
        jPanelBookota.add(jlableTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 120, 50));

        jLabelCategories.setText("CATEGORÍAS");

        jLabelSomeAvailableBooks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSomeAvailableBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSomeAvailableBooks.setText("Algunos de nuestros títulos disponibles");

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
        jPanelMonthlyFindings.add(jlabelRecomendedTitleBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 20));

        btnRecomendedBook.setBorder(null);
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

        jPanelLeft.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img1.jpg"))); // NOI18N
        jPanelLeft.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 250));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img4 (1).jpg"))); // NOI18N
        jPanelLeft.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 380, 250));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img5.jpg"))); // NOI18N
        jPanelLeft.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 380, 250));

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img3.jpg"))); // NOI18N
        jPanelLeft.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 380, 250));

        jPanelContainer.add(jPanelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 250));

        jPanelRight.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img4 (1).jpg"))); // NOI18N
        jPanelRight.add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 250));

        img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img5.jpg"))); // NOI18N
        jPanelRight.add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 380, 250));

        img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img3.jpg"))); // NOI18N
        jPanelRight.add(img7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 380, 250));

        img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img1.jpg"))); // NOI18N
        jPanelRight.add(img8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 380, 250));

        jPanelContainer.add(jPanelRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 380, 250));

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

        btnNovel.setBackground(new java.awt.Color(40, 47, 97));
        btnNovel.setForeground(new java.awt.Color(250, 250, 250));
        btnNovel.setText("Novela");
        btnNovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovelMouseEntered(evt);
            }
        });
        btnNovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovelActionPerformed(evt);
            }
        });

        btnWishList.setBackground(new java.awt.Color(40, 47, 93));
        btnWishList.setForeground(new java.awt.Color(250, 250, 250));
        btnWishList.setText("Mis Deseos");
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanelBookota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabelShoppingCar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnShoppingCart, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(15, 15, 15)
                        .addComponent(jPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabelSomeAvailableBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnViewAllBooks))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(btnBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(420, 420, 420)
                                .addComponent(btnBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(btnBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(486, 486, 486)
                                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(662, 662, 662)
                                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addComponent(btnBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jlabelAuthorBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jlabelPriceBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlabelTitleBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jlabelPriceBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlabelTitleBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlabelAuthorBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlabelAuthorBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jlabelPriceBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jlabelTitleBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jlabelTitleBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jlabelPriceBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jlabelAuthorBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jlabelAuthorBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jlabelPriceBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlabelTitleBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUniversalLiterature, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYoungLiterature, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFantasy, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRomance, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTerror, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMonthlyFindings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanelRightsReserved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelBookota, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelShoppingCar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnShoppingCart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSomeAvailableBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewAllBooks))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jlabelAuthorBook3)
                                .addGap(5, 5, 5)
                                .addComponent(jlabelPriceBook3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jlabelPriceBook4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jlabelAuthorBook5)
                                .addGap(5, 5, 5)
                                .addComponent(jlabelPriceBook5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jlabelTitleBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlabelTitleBook2)
                                            .addComponent(jlabelTitleBook3)
                                            .addComponent(jlabelTitleBook4)
                                            .addComponent(jlabelTitleBook5))
                                        .addGap(4, 4, 4)
                                        .addComponent(jlabelAuthorBook1)
                                        .addGap(5, 5, 5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlabelAuthorBook2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlabelAuthorBook4)
                                        .addGap(6, 6, 6)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlabelPriceBook1)
                                    .addComponent(jlabelPriceBook2)))))
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
                        .addComponent(btnNovel)
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

    private void btnWishListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWishListActionPerformed
        if (BookStore.getUsersMap().get(LogInWindow.getUserName()).getWishList().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Su lista de deseos está vacia", "", JOptionPane.WARNING_MESSAGE);
        } else {
            setVisible(false);
            WishListWindow wishListWindow = new WishListWindow();
            wishListWindow.setVisible(true);
        }
    }//GEN-LAST:event_btnWishListActionPerformed

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        MyAccountWindow myAccountWindow = new MyAccountWindow();
        setVisible(false);
        myAccountWindow.setVisible(true);
    }//GEN-LAST:event_btnAccountActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        BookStore.close(rootPane);
    }//GEN-LAST:event_formWindowClosing

    private void btnBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook1ActionPerformed
        setVisible(false);
        BookViewWindow.setBook(randomBooks.get(0));
        try {
            BookViewWindow bookViewWindow = new BookViewWindow();
            bookViewWindow.setVisible(true);
        } catch (IOException ex) {
            System.out.println("Error BookViewWindow");
        }
    }//GEN-LAST:event_btnBook1ActionPerformed

    private void btnBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook2ActionPerformed
        setVisible(false);
        BookViewWindow.setBook(randomBooks.get(1));
        try {
            BookViewWindow bookViewWindow = new BookViewWindow();
            bookViewWindow.setVisible(true);
        } catch (IOException ex) {
            System.out.println("Error BookViewWindow");
        }
    }//GEN-LAST:event_btnBook2ActionPerformed

    private void btnBook3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook3ActionPerformed
        setVisible(false);
        BookViewWindow.setBook(randomBooks.get(2));
        try {
            BookViewWindow bookViewWindow = new BookViewWindow();
            bookViewWindow.setVisible(true);
        } catch (IOException ex) {
            System.out.println("Error BookViewWindow");
        }
    }//GEN-LAST:event_btnBook3ActionPerformed

    private void btnBook4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook4ActionPerformed
        setVisible(false);
        BookViewWindow.setBook(randomBooks.get(3));
        try {
            BookViewWindow bookViewWindow = new BookViewWindow();
            bookViewWindow.setVisible(true);
        } catch (IOException ex) {
            System.out.println("Error BookViewWindow");
        }
    }//GEN-LAST:event_btnBook4ActionPerformed

    private void btnBook5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook5ActionPerformed
        setVisible(false);
        BookViewWindow.setBook(randomBooks.get(4));
        try {
            BookViewWindow bookViewWindow = new BookViewWindow();
            bookViewWindow.setVisible(true);
        } catch (IOException ex) {
            System.out.println("Error BookViewWindow");
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

    private void btnUniversalLiteratureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUniversalLiteratureActionPerformed
        GenreWindow.setGenre("Literatura Universal");
        GenreWindow.setGenreBooksList(BookStore.filterBookMap("Literatura Universal"));
        GenreWindow genreWindow = new GenreWindow();
        setVisible(false);
        genreWindow.setVisible(true);
    }//GEN-LAST:event_btnUniversalLiteratureActionPerformed

    private void btnYoungLiteratureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYoungLiteratureActionPerformed
        GenreWindow.setGenre("Literatura Juvenil");
        GenreWindow.setGenreBooksList(BookStore.filterBookMap("Literatura Juvenil"));
        GenreWindow genreWindow = new GenreWindow();
        setVisible(false);
        genreWindow.setVisible(true);
    }//GEN-LAST:event_btnYoungLiteratureActionPerformed

    private void btnFantasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFantasyActionPerformed
        GenreWindow.setGenre("Fantasía");
        GenreWindow.setGenreBooksList(BookStore.filterBookMap("Fantasía"));
        GenreWindow genreWindow = new GenreWindow();
        setVisible(false);
        genreWindow.setVisible(true);
    }//GEN-LAST:event_btnFantasyActionPerformed

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

    private void btnNovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovelActionPerformed
        GenreWindow.setGenre("Novela");
        GenreWindow.setGenreBooksList(BookStore.filterBookMap("Novela"));
        GenreWindow genreWindow = new GenreWindow();
        setVisible(false);
        genreWindow.setVisible(true);
    }//GEN-LAST:event_btnNovelActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        int answer = JOptionPane.showConfirmDialog(rootPane, "Está seguro?", "", JOptionPane.YES_NO_OPTION);
        if (answer == 0) {
            setVisible(false);
            StartWindow startWindow = new StartWindow();
            startWindow.setVisible(true);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnShoppingCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShoppingCartActionPerformed
        if (BookStore.getUsersMap().get(LogInWindow.getUserName()).getShoppingCart().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Su carrito de compras está vacio", "", JOptionPane.WARNING_MESSAGE);
        } else {
            setVisible(false);
            ShoppingCartWindow shoppingCartWindow = new ShoppingCartWindow();
            shoppingCartWindow.setVisible(true);
        }
    }//GEN-LAST:event_btnShoppingCartActionPerformed

    private void btnViewAllBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllBooksActionPerformed
        setVisible(false);
        GeneralBookViewWindow.setBooksList(BookStore.filterBookMap(""));
        GeneralBookViewWindow generalBookViewWindow = new GeneralBookViewWindow();
        generalBookViewWindow.setVisible(true);
    }//GEN-LAST:event_btnViewAllBooksActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        setVisible(false);
        GeneralBookViewWindow.setBooksList(BookStore.searchBooks(txtSearch.getText()));
        GeneralBookViewWindow generalBookViewWindow = new GeneralBookViewWindow();
        generalBookViewWindow.setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccountMouseEntered
        btnAccount.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnAccountMouseEntered

    private void btnAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccountMouseExited

    }//GEN-LAST:event_btnAccountMouseExited

    private void btnLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseEntered
        btnLogOut.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnLogOutMouseEntered

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        btnSearch.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnSearchMouseEntered

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

    private void btnNovelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovelMouseEntered
        btnNovel.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnNovelMouseEntered

    private void btnRecomendedBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecomendedBookMouseEntered
        btnRecomendedBook.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnRecomendedBookMouseEntered

    private void btnViewAllBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewAllBooksMouseEntered
        btnViewAllBooks.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnViewAllBooksMouseEntered

    private void btnBook5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook5MouseEntered
        btnBook5.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnBook5MouseEntered

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    public static ArrayList<Book> getRandomBooks() {
        return randomBooks;
    }

    public static void setRandomBooks(ArrayList<Book> aRandomBooks) {
        randomBooks = aRandomBooks;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnBook1;
    private javax.swing.JButton btnBook2;
    private javax.swing.JButton btnBook3;
    private javax.swing.JButton btnBook4;
    private javax.swing.JButton btnBook5;
    private javax.swing.JButton btnFantasy;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnNovel;
    private javax.swing.JButton btnRecomendedBook;
    private javax.swing.JButton btnRomance;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShoppingCart;
    private javax.swing.JButton btnTerror;
    private javax.swing.JButton btnUniversalLiterature;
    private javax.swing.JButton btnViewAllBooks;
    private javax.swing.JButton btnWishList;
    private javax.swing.JButton btnYoungLiterature;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel img8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAppLogo;
    private javax.swing.JLabel jLabelCategories;
    private javax.swing.JLabel jLabelCategoriesIcon;
    private javax.swing.JLabel jLabelFacebookIcon;
    private javax.swing.JLabel jLabelFindings;
    private javax.swing.JLabel jLabelFreeShipping;
    private javax.swing.JLabel jLabelInstagramIcon;
    private javax.swing.JLabel jLabelPayment;
    private javax.swing.JLabel jLabelRightsReserved;
    private javax.swing.JLabel jLabelShoppingCar;
    private javax.swing.JLabel jLabelSomeAvailableBooks;
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
    private javax.swing.JPanel jPanelLeft;
    private javax.swing.JPanel jPanelMonthlyFindings;
    private javax.swing.JPanel jPanelRight;
    private javax.swing.JPanel jPanelRightsReserved;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabelAuthorBook1;
    private javax.swing.JLabel jlabelAuthorBook2;
    private javax.swing.JLabel jlabelAuthorBook3;
    private javax.swing.JLabel jlabelAuthorBook4;
    private javax.swing.JLabel jlabelAuthorBook5;
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
    private javax.swing.JLabel jlableTitle;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
