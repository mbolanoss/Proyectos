package UI;

import businessLogic.BookStore;
import businessLogic.ExceptionManager;
import data.Book;
import java.awt.Cursor;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ModifyBookWindow extends javax.swing.JFrame {

    private static int bookIndex;
    private String coverFilePath;
    private static String review;

    /**
     * Creates new form ModificarLibro
     */
    public ModifyBookWindow() {
        initComponents();

        setTitle("\ud83d\udcda Bookotá");
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/Bookota.png")).getImage());
        setLocationRelativeTo(null);

        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Imagen/BookSetBook.png"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabelBookotaLogo.getWidth(), jLabelBookotaLogo.getHeight(), Image.SCALE_DEFAULT));
        jLabelBookotaLogo.setIcon(fondo1);
        this.repaint();

        setBookInfo();
    }

    private void setBookInfo() {
        txtTitle.setText(BookStore.getBooksMap().get(bookIndex).getTitle());
        txtAuthor.setText(BookStore.getBooksMap().get(bookIndex).getAuthor());
        txtBookCover.setText(BookStore.getBooksMap().get(bookIndex).getTypeOfCover());
        txtISBNCode.setText(BookStore.getBooksMap().get(bookIndex).getIsbnCode());
        txtPages.setText(Integer.toString(BookStore.getBooksMap().get(bookIndex).getNumberOfPages()));
        txtEditorial.setText(BookStore.getBooksMap().get(bookIndex).getEditorial());
        txtPrice.setText(Integer.toString(BookStore.getBooksMap().get(bookIndex).getPrice()));
        txtStock.setText(Integer.toString(BookStore.getBooksMap().get(bookIndex).getStock()));
        cbxGenres.setSelectedItem(BookStore.getBooksMap().get(bookIndex).getGenre());
        coverFilePath = BookStore.getBooksMap().get(bookIndex).getCoverFilePath();
        review = BookStore.getBooksMap().get(bookIndex).getReview();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelSetBook = new javax.swing.JLabel();
        jLabelISBNCodeSetBook = new javax.swing.JLabel();
        txtISBNCode = new javax.swing.JTextField();
        jLabelTitleSetBook = new javax.swing.JLabel();
        jLabelGenderSetBook = new javax.swing.JLabel();
        jLabelPageNumberSetBook = new javax.swing.JLabel();
        jLabelAuthorSetBook = new javax.swing.JLabel();
        jlabelPrice = new javax.swing.JLabel();
        jLabelEditorialSetBook = new javax.swing.JLabel();
        jLabelCoverSetBook = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtBookCover = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtPages = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jButtonApplyChanges = new javax.swing.JButton();
        jLabelStockBooksSet = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        jLabelBookotaLogo = new javax.swing.JLabel();
        cbxGenres = new javax.swing.JComboBox<>();
        btnReturn = new javax.swing.JButton();
        btnSynopsis = new javax.swing.JButton();
        btnChooseBookCover = new javax.swing.JButton();

        jLabel5.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel2.setText("© Todos los derechos reservados. 2019.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(154, 154, 154))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 485, 523, -1));

        jLabelSetBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSetBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSetBook.setText("Modificar un libro");
        jPanel1.add(jLabelSetBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 23, -1, -1));

        jLabelISBNCodeSetBook.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelISBNCodeSetBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelISBNCodeSetBook.setText("Código ISBN");
        jPanel1.add(jLabelISBNCodeSetBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 131, 133, -1));
        jPanel1.add(txtISBNCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 152, 133, -1));

        jLabelTitleSetBook.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTitleSetBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitleSetBook.setText("Título");
        jPanel1.add(jLabelTitleSetBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 187, -1, -1));

        jLabelGenderSetBook.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelGenderSetBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGenderSetBook.setText("Género");
        jPanel1.add(jLabelGenderSetBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 242, -1, -1));

        jLabelPageNumberSetBook.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPageNumberSetBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPageNumberSetBook.setText("Número de páginas");
        jPanel1.add(jLabelPageNumberSetBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 296, -1, -1));

        jLabelAuthorSetBook.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelAuthorSetBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAuthorSetBook.setText("Autor");
        jPanel1.add(jLabelAuthorSetBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 296, -1, -1));

        jlabelPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlabelPrice.setForeground(new java.awt.Color(255, 255, 255));
        jlabelPrice.setText("Precio");
        jPanel1.add(jlabelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 187, -1, -1));

        jLabelEditorialSetBook.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEditorialSetBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEditorialSetBook.setText("Editorial");
        jPanel1.add(jLabelEditorialSetBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 242, -1, -1));

        jLabelCoverSetBook.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCoverSetBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCoverSetBook.setText("Empastado");
        jPanel1.add(jLabelCoverSetBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 131, -1, -1));
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 207, 133, -1));

        txtAuthor.setAlignmentX(0.0F);
        txtAuthor.setAlignmentY(0.0F);
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 317, 133, -1));
        jPanel1.add(txtBookCover, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 152, 137, -1));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 207, 137, -1));
        jPanel1.add(txtPages, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 317, 137, -1));

        txtStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStock.setAlignmentX(0.0F);
        txtStock.setAlignmentY(0.0F);
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 376, 133, -1));

        jButtonApplyChanges.setText("Aplicar cambios");
        jButtonApplyChanges.setAlignmentY(0.0F);
        jButtonApplyChanges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonApplyChangesMouseEntered(evt);
            }
        });
        jButtonApplyChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApplyChangesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonApplyChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 444, 130, -1));

        jLabelStockBooksSet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelStockBooksSet.setForeground(new java.awt.Color(255, 255, 255));
        jLabelStockBooksSet.setText("Stock");
        jPanel1.add(jLabelStockBooksSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 355, -1, -1));

        txtEditorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEditorial.setAlignmentX(0.0F);
        txtEditorial.setAlignmentY(0.0F);
        jPanel1.add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 264, 137, -1));
        jPanel1.add(jLabelBookotaLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 78, 81));

        cbxGenres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxGenres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Literatura Universal", "Literatura Juvenil", "Fantasía", "Romance", "Terror", "Novela" }));
        jPanel1.add(cbxGenres, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 263, 133, -1));

        btnReturn.setText("Volver");
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReturnMouseEntered(evt);
            }
        });
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 444, -1, -1));

        btnSynopsis.setText("Escribir sinopsis");
        btnSynopsis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSynopsisMouseEntered(evt);
            }
        });
        btnSynopsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSynopsisActionPerformed(evt);
            }
        });
        jPanel1.add(btnSynopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 405, 111, -1));

        btnChooseBookCover.setText("Escoger portada");
        btnChooseBookCover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChooseBookCoverMouseEntered(evt);
            }
        });
        btnChooseBookCover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseBookCoverActionPerformed(evt);
            }
        });
        jPanel1.add(btnChooseBookCover, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 364, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        BookStore.close(rootPane);
    }//GEN-LAST:event_formWindowClosing

    private void btnSynopsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSynopsisActionPerformed
        ChangeReviewWindow changeReviewWindow = new ChangeReviewWindow();
        changeReviewWindow.setVisible(true);
    }//GEN-LAST:event_btnSynopsisActionPerformed

    private void btnChooseBookCoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseBookCoverActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG, JPG, JPEG", "png", "jpg", "jpeg");
        fileChooser.setFileFilter(filter);
        int selection = fileChooser.showOpenDialog(rootPane);
        if (selection == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            coverFilePath = file.getPath();
        }
    }//GEN-LAST:event_btnChooseBookCoverActionPerformed

    private void jButtonApplyChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApplyChangesActionPerformed
        int numberOfPages, stock, price, index;
        String isbnCode, title, genre, author, typeOfCover, editorial;
        if (ExceptionManager.checkIntegerValue(txtPrice) || ExceptionManager.checkIntegerValue(txtPages)
                || ExceptionManager.checkIntegerValue(txtStock)) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese correctamente los datos",
                    "", JOptionPane.ERROR_MESSAGE);
        } else {
            //index = BookStore.getLastBookIndex() + 1;
            isbnCode = txtISBNCode.getText();
            title = txtTitle.getText();
            genre = cbxGenres.getSelectedItem().toString();
            author = txtAuthor.getText();
            typeOfCover = txtBookCover.getText();
            editorial = txtEditorial.getText();
            numberOfPages = Integer.parseInt(txtPages.getText());
            stock = Integer.parseInt(txtStock.getText());
            price = Integer.parseInt(txtPrice.getText());
            if (isbnCode.length() == 0 || title.length() == 0 || genre.length() == 0
                    || author.length() == 0 || typeOfCover.length() == 0 || editorial.length() == 0
                    || numberOfPages == 0 || stock == 0 || price == 0 || review.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Por favor llene todos los campos",
                        "", JOptionPane.ERROR_MESSAGE);
            } else {
                int answer = JOptionPane.showConfirmDialog(rootPane, "Está de seguro?", "", JOptionPane.YES_NO_OPTION);
                if (answer == 0) {
                    BookStore.getAdmin().modifyBookInfo(bookIndex, numberOfPages, stock, price, isbnCode, title, genre, author, typeOfCover, editorial, coverFilePath, review);
                    JOptionPane.showMessageDialog(rootPane, "Cambios aplicados con éxito", "", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButtonApplyChangesActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        setVisible(false);
        AdminWindow adminWindow = new AdminWindow();
        adminWindow.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnChooseBookCoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChooseBookCoverMouseEntered
        btnChooseBookCover.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnChooseBookCoverMouseEntered

    private void btnSynopsisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSynopsisMouseEntered
        btnSynopsis.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnSynopsisMouseEntered

    private void btnReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseEntered
        btnReturn.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnReturnMouseEntered

    private void jButtonApplyChangesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonApplyChangesMouseEntered
        jButtonApplyChanges.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_jButtonApplyChangesMouseEntered

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
            java.util.logging.Logger.getLogger(ModifyBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyBookWindow().setVisible(true);
            }
        });
    }

    public static int getBookIndex() {
        return bookIndex;
    }

    public static void setBookIndex(int index) {
        ModifyBookWindow.bookIndex = index;
    }

    public String getCoverFilePath() {
        return coverFilePath;
    }

    public void setCoverFilePath(String coverFilePath) {
        this.coverFilePath = coverFilePath;
    }

    public static String getReview() {
        return review;
    }

    public static void setReview(String review) {
        ModifyBookWindow.review = review;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseBookCover;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSynopsis;
    private javax.swing.JComboBox<String> cbxGenres;
    private javax.swing.JButton jButtonApplyChanges;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAuthorSetBook;
    private javax.swing.JLabel jLabelBookotaLogo;
    private javax.swing.JLabel jLabelCoverSetBook;
    private javax.swing.JLabel jLabelEditorialSetBook;
    private javax.swing.JLabel jLabelGenderSetBook;
    private javax.swing.JLabel jLabelISBNCodeSetBook;
    private javax.swing.JLabel jLabelPageNumberSetBook;
    private javax.swing.JLabel jLabelSetBook;
    private javax.swing.JLabel jLabelStockBooksSet;
    private javax.swing.JLabel jLabelTitleSetBook;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel jlabelPrice;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookCover;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtISBNCode;
    private javax.swing.JTextField txtPages;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
