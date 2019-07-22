package UI;

import businessLogic.BookStore;
import data.Book;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class ShoppingCartWindow extends javax.swing.JFrame {

    /**
     * Creates new form CarritoCompras
     */
    public ShoppingCartWindow() {
        initComponents();

        setTitle("\ud83d\udcda Bookotá");
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/Bookota.png")).getImage());
        setLocationRelativeTo(null);

        JTableHeader header = jtableShoppingCart.getTableHeader();
        header.setBackground(new java.awt.Color(0, 153, 153));
        header.setForeground(Color.white);
        header.setFont(new Font("Calibri", 1, 12));
        //255,153,51

        ImageIcon home = new ImageIcon(getClass().getResource("/Imagen/Home1.png"));
        Icon homeBackground = new ImageIcon(home.getImage().getScaledInstance(btnHome.getWidth(), btnHome.getHeight(), Image.SCALE_SMOOTH));
        btnHome.setIcon(homeBackground);
        this.repaint();

        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/Imagen/Facebook.png"));
        Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(imageIconFacebook.getWidth(), imageIconFacebook.getHeight(), Image.SCALE_SMOOTH));
        imageIconFacebook.setIcon(fondo3);
        this.repaint();

        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/Imagen/Instagram.png"));
        Icon fondo4 = new ImageIcon(imagen4.getImage().getScaledInstance(imageIconInstagram.getWidth(), imageIconInstagram.getHeight(), Image.SCALE_SMOOTH));
        imageIconInstagram.setIcon(fondo4);
        this.repaint();

        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/Imagen/Twitter.png"));
        Icon fondo5 = new ImageIcon(imagen5.getImage().getScaledInstance(imageIconTwitter.getWidth(), imageIconTwitter.getHeight(), Image.SCALE_SMOOTH));
        imageIconTwitter.setIcon(fondo5);
        this.repaint();

        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/Imagen/ShoppingCart1.png"));
        Icon fondo7 = new ImageIcon(imagen7.getImage().getScaledInstance(imageIconShoppingCart.getWidth(), imageIconShoppingCart.getHeight(), Image.SCALE_SMOOTH));
        imageIconShoppingCart.setIcon(fondo7);
        this.repaint();

        ImageIcon imagen8 = new ImageIcon(getClass().getResource("/Imagen/Wish3.png"));
        Icon fondo8 = new ImageIcon(imagen8.getImage().getScaledInstance(imageIconWishList.getWidth(), imageIconWishList.getHeight(), Image.SCALE_SMOOTH));
        imageIconWishList.setIcon(fondo8);
        this.repaint();

        ImageIcon imagen9 = new ImageIcon(getClass().getResource("/Imagen/ShoppingCart1.png"));
        Icon fondo9 = new ImageIcon(imagen9.getImage().getScaledInstance(imageIconShoppingCart2.getWidth(), imageIconShoppingCart2.getHeight(), Image.SCALE_SMOOTH));
        imageIconShoppingCart2.setIcon(fondo9);
        this.repaint();

        updateTable();

        setFalseSelection();

    }

    private void updateTable() {
        jtableShoppingCart.setDefaultRenderer(Object.class, new ImgTabla());

        txtNumberTotalPrice.setText("$" + BookStore.getTotalPrice(BookStore.getUsersMap().get(LogInWindow.getUserName()).getShoppingCart()));

        Object[][] matrix = new Object[BookStore.getUsersMap().get(LogInWindow.getUserName()).getShoppingCart().size()][5];

        ArrayList<Book> userShoppingCart = BookStore.getUsersMap().get(LogInWindow.getUserName()).getShoppingCart();

        for (int i = 0; i < userShoppingCart.size(); i++) {
            matrix[i][0] = userShoppingCart.get(i).getTitle();
            matrix[i][1] = userShoppingCart.get(i).getAuthor();
            matrix[i][2] = userShoppingCart.get(i).getEditorial();
            matrix[i][3] = Integer.toString(userShoppingCart.get(i).getPrice());
        }

        jtableShoppingCart.setModel(new javax.swing.table.DefaultTableModel(
                matrix,
                new String[]{
                    "Título", "Autor", "Editorial", "Precio", ""
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

    }

    private void setFalseSelection() {
        for (int i = 0; i < jtableShoppingCart.getRowCount(); i++) {
            jtableShoppingCart.setValueAt(false, i, 4);
        }
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
        jPanelRightsReserved = new javax.swing.JPanel();
        txtRightsReserved = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imageIconFacebook = new javax.swing.JLabel();
        imageIconInstagram = new javax.swing.JLabel();
        imageIconTwitter = new javax.swing.JLabel();
        jPanelHeader = new javax.swing.JPanel();
        jPanelFreeShippingBanner = new javax.swing.JPanel();
        txtFreeShipping = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnShoppingCart = new javax.swing.JButton();
        btnWishList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableShoppingCart = new javax.swing.JTable();
        txtTotalPrice = new javax.swing.JLabel();
        txtNumberTotalPrice = new javax.swing.JLabel();
        btnBuy = new javax.swing.JButton();
        imageIconPayment = new javax.swing.JLabel();
        imageIconShoppingCart = new javax.swing.JLabel();
        imageIconWishList = new javax.swing.JLabel();
        imageIconShoppingCart2 = new javax.swing.JLabel();
        btnDeleteBook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelRightsReserved.setBackground(new java.awt.Color(40, 47, 93));

        txtRightsReserved.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txtRightsReserved.setForeground(new java.awt.Color(255, 255, 255));
        txtRightsReserved.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRightsReserved.setText("© Todos los derechos reservados. 2019.");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanelRightsReservedLayout = new javax.swing.GroupLayout(jPanelRightsReserved);
        jPanelRightsReserved.setLayout(jPanelRightsReservedLayout);
        jPanelRightsReservedLayout.setHorizontalGroup(
            jPanelRightsReservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightsReservedLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(txtRightsReserved, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageIconFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageIconInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageIconTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRightsReservedLayout.setVerticalGroup(
            jPanelRightsReservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageIconFacebook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imageIconInstagram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelRightsReservedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRightsReservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRightsReserved)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imageIconTwitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelHeader.setBackground(new java.awt.Color(40, 47, 93));

        jPanelFreeShippingBanner.setBackground(new java.awt.Color(255, 153, 51));

        txtFreeShipping.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFreeShipping.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFreeShipping.setText("Envío gratis en Bogotá. Pedidos con duración máxima de envío de 24 horas");

        javax.swing.GroupLayout jPanelFreeShippingBannerLayout = new javax.swing.GroupLayout(jPanelFreeShippingBanner);
        jPanelFreeShippingBanner.setLayout(jPanelFreeShippingBannerLayout);
        jPanelFreeShippingBannerLayout.setHorizontalGroup(
            jPanelFreeShippingBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFreeShippingBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFreeShipping, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFreeShippingBannerLayout.setVerticalGroup(
            jPanelFreeShippingBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtFreeShipping, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFreeShippingBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFreeShippingBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnShoppingCart.setBackground(new java.awt.Color(40, 43, 97));
        btnShoppingCart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnShoppingCart.setForeground(new java.awt.Color(255, 255, 255));
        btnShoppingCart.setText("Mis compras");
        btnShoppingCart.setEnabled(false);
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

        btnWishList.setBackground(new java.awt.Color(40, 47, 93));
        btnWishList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnWishList.setForeground(new java.awt.Color(255, 255, 255));
        btnWishList.setText("Mi lista de deseos");
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

        jtableShoppingCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Editorial", "Precio", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableShoppingCart.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jtableShoppingCart);
        if (jtableShoppingCart.getColumnModel().getColumnCount() > 0) {
            jtableShoppingCart.getColumnModel().getColumn(4).setResizable(false);
        }

        txtTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalPrice.setForeground(new java.awt.Color(255, 82, 73));
        txtTotalPrice.setText("Valor Total de la Compra");

        txtNumberTotalPrice.setBackground(new java.awt.Color(255, 204, 153));
        txtNumberTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNumberTotalPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNumberTotalPrice.setText("empty");

        btnBuy.setText("Comprar todos");
        btnBuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuyMouseEntered(evt);
            }
        });
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        btnDeleteBook.setText("Quitar");
        btnDeleteBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteBookMouseEntered(evt);
            }
        });
        btnDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRightsReserved, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imageIconShoppingCart2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNumberTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85)
                                        .addComponent(btnBuy)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeleteBook))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(imageIconShoppingCart, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(267, 267, 267)
                                .addComponent(imageIconWishList, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnShoppingCart, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnWishList, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageIconPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageIconShoppingCart, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(imageIconWishList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(imageIconPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnWishList, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShoppingCart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtTotalPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNumberTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuy)
                                    .addComponent(btnDeleteBook)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(imageIconShoppingCart2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27)
                .addComponent(jPanelRightsReserved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        setVisible(false);
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        BookStore.close(rootPane);
    }//GEN-LAST:event_formWindowClosing

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        setVisible(false);
        FinishPurchaseWindow finishPurchaseWindow = new FinishPurchaseWindow();
        finishPurchaseWindow.setVisible(true);
    }//GEN-LAST:event_btnBuyActionPerformed

    private void btnShoppingCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShoppingCartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShoppingCartActionPerformed

    private void btnWishListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWishListActionPerformed
        if (BookStore.getUsersMap().get(LogInWindow.getUserName()).getWishList().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Su lista de deseos está vacia", "", JOptionPane.WARNING_MESSAGE);
        } else {
            setVisible(false);
            WishListWindow wishListWindow = new WishListWindow();
            wishListWindow.setVisible(true);
        }
    }//GEN-LAST:event_btnWishListActionPerformed

    private void btnDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBookActionPerformed
        int answer = JOptionPane.showConfirmDialog(rootPane, "Está seguro?", "", JOptionPane.YES_NO_OPTION);
        if (answer == 0) {
            boolean selected = false;
            ArrayList<Book> deleteBooksList = new ArrayList<>();
            for (int i = 0; i < BookStore.getUsersMap().get(LogInWindow.getUserName()).getShoppingCart().size(); i++) {
                if ((boolean) jtableShoppingCart.getValueAt(i, 4)) {
                    String title = (String) jtableShoppingCart.getValueAt(i, 0);
                    for (Book book : BookStore.getUsersMap().get(LogInWindow.getUserName()).getShoppingCart()) {
                        if (book.getTitle().equals(title)) {
                            deleteBooksList.add(book);
                            selected = true;
                        }
                    }
                }
            }
            for (Book book : deleteBooksList) {
                BookStore.getUsersMap().get(LogInWindow.getUserName()).getShoppingCart().remove(book);
            }
            if (selected) {
                updateTable();
                setFalseSelection();
                JOptionPane.showMessageDialog(rootPane, "Libros eliminados de su carrito\nde compras con éxito", "", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Escoja al menos un libro", "", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnDeleteBookActionPerformed

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        btnHome.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnWishListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWishListMouseEntered
        btnWishList.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnWishListMouseEntered

    private void btnShoppingCartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShoppingCartMouseEntered
        btnShoppingCart.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnShoppingCartMouseEntered

    private void btnBuyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyMouseEntered
        btnBuy.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnBuyMouseEntered

    private void btnDeleteBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteBookMouseEntered
        btnDeleteBook.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnDeleteBookMouseEntered

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
            java.util.logging.Logger.getLogger(ShoppingCartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingCartWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnDeleteBook;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnShoppingCart;
    private javax.swing.JButton btnWishList;
    private javax.swing.JLabel imageIconFacebook;
    private javax.swing.JLabel imageIconInstagram;
    private javax.swing.JLabel imageIconPayment;
    private javax.swing.JLabel imageIconShoppingCart;
    private javax.swing.JLabel imageIconShoppingCart2;
    private javax.swing.JLabel imageIconTwitter;
    private javax.swing.JLabel imageIconWishList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFreeShippingBanner;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelRightsReserved;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableShoppingCart;
    private javax.swing.JLabel txtFreeShipping;
    private javax.swing.JLabel txtNumberTotalPrice;
    private javax.swing.JLabel txtRightsReserved;
    private javax.swing.JLabel txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
