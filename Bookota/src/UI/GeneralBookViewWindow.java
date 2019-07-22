package UI;

import AppPackage.AnimationClass;
import businessLogic.BookStore;
import data.Book;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Valentina Gonzalez
 */
public class GeneralBookViewWindow extends javax.swing.JFrame {

    AnimationClass ac = new AnimationClass();
    private static ArrayList<Book> booksList;

    /**
     * Creates new form PantallaPrincipal
     */
    public GeneralBookViewWindow() {
        initComponents();

        setTitle("\ud83d\udcda Bookotá");
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/Bookota.png")).getImage());// Icono de la ventana

        setLocationRelativeTo(null);
        
        JTableHeader header = jtableBooksGeneralInformation.getTableHeader();
        header.setBackground(new java.awt.Color(0, 153, 153));
        header.setForeground(Color.white);
        header.setFont(new Font("Calibri", 1, 12));

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

        updateTable();

    }

    private void updateTable() {
        jtableBooksGeneralInformation.setDefaultRenderer(Object.class, new ImgTabla());

        Object matrix[][] = new Object[booksList.size()][6];
        for (int j = 0; j < jtableBooksGeneralInformation.getRowCount(); j++) {
            jtableBooksGeneralInformation.setRowHeight(200);
        }

        for (int i = 0; i < booksList.size(); i++) {
            JLabel jlabelCover = new JLabel(new ImageIcon(getClass().getResource(booksList.get(i).getCoverFilePath())));
            jlabelCover.setSize(145, 200);
            matrix[i][0] = jlabelCover;
            ImageIcon bookCover = new ImageIcon(getClass().getResource(booksList.get(i).getCoverFilePath()));
            Icon bookCoverBackground = new ImageIcon(bookCover.getImage().getScaledInstance(jlabelCover.getWidth(), jlabelCover.getHeight(), Image.SCALE_SMOOTH));
            jlabelCover.setIcon(bookCoverBackground);
            matrix[i][1] = booksList.get(i).getTitle();
            matrix[i][2] = booksList.get(i).getAuthor();
            matrix[i][3] = booksList.get(i).getGenre();
            matrix[i][4] = Integer.toString(booksList.get(i).getPrice());

        }

        jtableBooksGeneralInformation.setModel(new javax.swing.table.DefaultTableModel(
                matrix,
                new String[]{
                    "Portada", "Titulo", "Autor", "Género", "Precio"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

    }

    public static ArrayList<Book> getBooksList() {
        return booksList;
    }

    public static void setBooksList(ArrayList<Book> booksList) {
        GeneralBookViewWindow.booksList = booksList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroupSelected = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanelBookota = new javax.swing.JPanel();
        jPanelFreeShipping = new javax.swing.JPanel();
        jLabelFreeShipping = new javax.swing.JLabel();
        jLabelAppLogo = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jPanelRightsReserved = new javax.swing.JPanel();
        jLabelRightsReserved = new javax.swing.JLabel();
        jLabelFacebookIcon = new javax.swing.JLabel();
        jLabelInstagramIcon = new javax.swing.JLabel();
        jLabelTwitterIconB = new javax.swing.JLabel();
        jLabelPayment = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnShoppingCart = new javax.swing.JButton();
        jLabelShoppingC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelShoppingCar = new javax.swing.JLabel();
        jLabelWishList = new javax.swing.JLabel();
        jLabelCategoriesIcon = new javax.swing.JLabel();
        btnWishList = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableBooksGeneralInformation = new javax.swing.JTable();
        btnBookInformation = new javax.swing.JButton();
        jlabelBanner = new javax.swing.JLabel();

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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBookota.setBackground(new java.awt.Color(40, 47, 93));
        jPanelBookota.setAlignmentX(0.0F);
        jPanelBookota.setAlignmentY(0.0F);

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

        javax.swing.GroupLayout jPanelBookotaLayout = new javax.swing.GroupLayout(jPanelBookota);
        jPanelBookota.setLayout(jPanelBookotaLayout);
        jPanelBookotaLayout.setHorizontalGroup(
            jPanelBookotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBookotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAppLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 894, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanelFreeShipping, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBookotaLayout.setVerticalGroup(
            jPanelBookotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBookotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBookotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAppLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFreeShipping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelBookota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 989, 77));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jPanel1.add(jPanelRightsReserved, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 989, -1));
        jPanel1.add(jLabelPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, 90, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Todos los medios de pago");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 610, 110, -1));

        btnShoppingCart.setBackground(new java.awt.Color(40, 47, 93));
        btnShoppingCart.setForeground(new java.awt.Color(250, 250, 250));
        btnShoppingCart.setText("Mis compras");
        btnShoppingCart.setBorder(null);
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
        jPanel1.add(btnShoppingCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, 40));
        jPanel1.add(jLabelShoppingC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 36, 40));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 60, 40));

        jLabelShoppingCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ShoppingCar.png"))); // NOI18N
        jPanel1.add(jLabelShoppingCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 40, 40));

        jLabelWishList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Wish3.png"))); // NOI18N
        jLabelWishList.setText("jLabel3");
        jPanel1.add(jLabelWishList, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 40, 40));
        jPanel1.add(jLabelCategoriesIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 50, 50));

        btnWishList.setBackground(new java.awt.Color(40, 43, 97));
        btnWishList.setForeground(new java.awt.Color(250, 250, 250));
        btnWishList.setText("Mis Deseos");
        btnWishList.setBorder(null);
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
        jPanel1.add(btnWishList, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 350, 40));

        jButton30.setBackground(new java.awt.Color(255, 82, 73));
        jButton30.setText("Suprimir");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 80, 20));

        jtableBooksGeneralInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Portada", "Titulo", "Autor", "Género", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableBooksGeneralInformation.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableBooksGeneralInformation);
        if (jtableBooksGeneralInformation.getColumnModel().getColumnCount() > 0) {
            jtableBooksGeneralInformation.getColumnModel().getColumn(0).setResizable(false);
            jtableBooksGeneralInformation.getColumnModel().getColumn(1).setResizable(false);
            jtableBooksGeneralInformation.getColumnModel().getColumn(2).setResizable(false);
            jtableBooksGeneralInformation.getColumnModel().getColumn(3).setResizable(false);
            jtableBooksGeneralInformation.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 730, 320));

        btnBookInformation.setText("Ver libro");
        btnBookInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBookInformationMouseEntered(evt);
            }
        });
        btnBookInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookInformationActionPerformed(evt);
            }
        });
        jPanel1.add(btnBookInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 90, -1));

        jlabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Banner1 .png"))); // NOI18N
        jPanel1.add(jlabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 200, 320));

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        BookStore.close(rootPane);
    }//GEN-LAST:event_formWindowClosing

    private void btnBookInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookInformationActionPerformed
        int row = jtableBooksGeneralInformation.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(rootPane, "Por favor escoja un libro", "", JOptionPane.WARNING_MESSAGE);
        } else {
            String title = (String) jtableBooksGeneralInformation.getValueAt(row, 1);
            Book selectedBook = null;
            for (Book book : booksList) {
                if (book.getTitle().equals(title)) {
                    selectedBook = book;
                }
            }
            if (selectedBook.getTitle().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Libro vacío", "", JOptionPane.ERROR_MESSAGE);
            } else {
                BookViewWindow.setBook(selectedBook);
                BookViewWindow bookViewWindow;
                try {
                    bookViewWindow = new BookViewWindow();
                    setVisible(false);
                    bookViewWindow.setVisible(true);
                } catch (IOException ex) {
                    System.out.println("Error BookViewWindow");
                }
            }
        }
    }//GEN-LAST:event_btnBookInformationActionPerformed

    private void btnBookInformationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookInformationMouseEntered
        btnBookInformation.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnBookInformationMouseEntered

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void btnWishListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWishListActionPerformed
        if (BookStore.getUsersMap().get(LogInWindow.getUserName()).getWishList().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Su lista de deseos está vacia", "", JOptionPane.WARNING_MESSAGE);
        } else {
            setVisible(false);
            WishListWindow wishListWindow = new WishListWindow();
            wishListWindow.setVisible(true);
        }
    }//GEN-LAST:event_btnWishListActionPerformed

    private void btnWishListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWishListMouseEntered
        btnWishList.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnWishListMouseEntered

    private void btnShoppingCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShoppingCartActionPerformed
        setVisible(false);
        ShoppingCartWindow shoppingCartWindow = new ShoppingCartWindow();
        shoppingCartWindow.setVisible(true);
    }//GEN-LAST:event_btnShoppingCartActionPerformed

    private void btnShoppingCartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShoppingCartMouseEntered
        btnShoppingCart.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnShoppingCartMouseEntered

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        setVisible(false);
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        btnHome.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnHomeMouseEntered

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
            java.util.logging.Logger.getLogger(GeneralBookViewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralBookViewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralBookViewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralBookViewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new GeneralBookViewWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookInformation;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnShoppingCart;
    private javax.swing.JButton btnWishList;
    private javax.swing.ButtonGroup btngroupSelected;
    private javax.swing.JButton jButton30;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAppLogo;
    private javax.swing.JLabel jLabelCategoriesIcon;
    private javax.swing.JLabel jLabelFacebookIcon;
    private javax.swing.JLabel jLabelFreeShipping;
    private javax.swing.JLabel jLabelInstagramIcon;
    private javax.swing.JLabel jLabelPayment;
    private javax.swing.JLabel jLabelRightsReserved;
    private javax.swing.JLabel jLabelShoppingC;
    private javax.swing.JLabel jLabelShoppingCar;
    private javax.swing.JLabel jLabelTwitterIconB;
    private javax.swing.JLabel jLabelWishList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBookota;
    private javax.swing.JPanel jPanelFreeShipping;
    private javax.swing.JPanel jPanelRightsReserved;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabelBanner;
    private javax.swing.JTable jtableBooksGeneralInformation;
    // End of variables declaration//GEN-END:variables

}
