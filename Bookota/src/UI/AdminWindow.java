package UI;

import businessLogic.BookStore;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AdminWindow extends javax.swing.JFrame {

    public AdminWindow() {
        initComponents();

        setTitle("\ud83d\udcda Bookotá");
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/Bookota.png"))
                .getImage());// Icono de la ventana

        setLocationRelativeTo(null);

        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Imagen/Administrator.png"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabelManagerIcon.getWidth(), jLabelManagerIcon.getHeight(), Image.SCALE_SMOOTH));
        jLabelManagerIcon.setIcon(fondo1);
        this.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanelManagerBackground = new javax.swing.JPanel();
        jLabelLeftSideBanner = new javax.swing.JLabel();
        jLabelRightSideBanner = new javax.swing.JLabel();
        jPanelAllRightsReserved = new javax.swing.JPanel();
        jLabelAllRightsReserved = new javax.swing.JLabel();
        jLabelManagerIcon = new javax.swing.JLabel();
        jLabelManagerTitle = new javax.swing.JLabel();
        btnAddBook = new javax.swing.JButton();
        btnModifyBook = new javax.swing.JButton();
        btnRemoveBook = new javax.swing.JButton();
        btnAvailableBooks = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelManagerBackground.setBackground(new java.awt.Color(40, 47, 93));

        jLabelLeftSideBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Laterales.jpg"))); // NOI18N

        jLabelRightSideBanner.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelRightSideBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Laterales.jpg"))); // NOI18N

        jPanelAllRightsReserved.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAllRightsReserved.setAlignmentX(0.0F);
        jPanelAllRightsReserved.setAlignmentY(0.0F);

        jLabelAllRightsReserved.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabelAllRightsReserved.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAllRightsReserved.setText("© Todos los derechos reservados. 2019.");

        javax.swing.GroupLayout jPanelAllRightsReservedLayout = new javax.swing.GroupLayout(jPanelAllRightsReserved);
        jPanelAllRightsReserved.setLayout(jPanelAllRightsReservedLayout);
        jPanelAllRightsReservedLayout.setHorizontalGroup(
            jPanelAllRightsReservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAllRightsReservedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAllRightsReserved, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAllRightsReservedLayout.setVerticalGroup(
            jPanelAllRightsReservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAllRightsReservedLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabelAllRightsReserved)
                .addContainerGap())
        );

        jLabelManagerTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelManagerTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManagerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelManagerTitle.setText("Administrador");

        btnAddBook.setText("Agregar libro");
        btnAddBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddBookMouseEntered(evt);
            }
        });
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        btnModifyBook.setText("Modificar libro");
        btnModifyBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModifyBookMouseEntered(evt);
            }
        });
        btnModifyBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyBookActionPerformed(evt);
            }
        });

        btnRemoveBook.setText("Eliminar libro");
        btnRemoveBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoveBookMouseEntered(evt);
            }
        });
        btnRemoveBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveBookActionPerformed(evt);
            }
        });

        btnAvailableBooks.setText("Ver libros disponibles");
        btnAvailableBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAvailableBooksMouseEntered(evt);
            }
        });
        btnAvailableBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableBooksActionPerformed(evt);
            }
        });

        btnExit.setText("Salir");
        btnExit.setAlignmentY(0.0F);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelManagerBackgroundLayout = new javax.swing.GroupLayout(jPanelManagerBackground);
        jPanelManagerBackground.setLayout(jPanelManagerBackgroundLayout);
        jPanelManagerBackgroundLayout.setHorizontalGroup(
            jPanelManagerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManagerBackgroundLayout.createSequentialGroup()
                .addComponent(jLabelLeftSideBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelManagerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManagerBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelManagerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))
                    .addGroup(jPanelManagerBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelManagerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManagerBackgroundLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabelManagerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelManagerBackgroundLayout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addGroup(jPanelManagerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModifyBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRemoveBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAvailableBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addGroup(jPanelManagerBackgroundLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(btnExit)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jLabelRightSideBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanelAllRightsReserved, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelManagerBackgroundLayout.setVerticalGroup(
            jPanelManagerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManagerBackgroundLayout.createSequentialGroup()
                .addGroup(jPanelManagerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRightSideBanner)
                    .addComponent(jLabelLeftSideBanner)
                    .addGroup(jPanelManagerBackgroundLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelManagerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelManagerTitle)
                        .addGap(19, 19, 19)
                        .addComponent(btnAddBook)
                        .addGap(14, 14, 14)
                        .addComponent(btnModifyBook)
                        .addGap(13, 13, 13)
                        .addComponent(btnRemoveBook)
                        .addGap(18, 18, 18)
                        .addComponent(btnAvailableBooks)
                        .addGap(26, 26, 26)
                        .addComponent(btnExit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAllRightsReserved, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelManagerBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelManagerBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int answer = JOptionPane.showConfirmDialog(rootPane, "Está de seguro de querer salir", "", JOptionPane.YES_NO_OPTION);
        if (answer == 0) {
            setVisible(false);
            StartWindow pantallaInicio = new StartWindow();
            pantallaInicio.setVisible(true);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        AddBookWindow addBookWindow = new AddBookWindow();
        setVisible(false);
        addBookWindow.setVisible(true);
    }//GEN-LAST:event_btnAddBookActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        BookStore.close(rootPane);
    }//GEN-LAST:event_formWindowClosing

    private void btnModifyBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyBookActionPerformed
        setVisible(false);
        SelectBookWindow selectBookWindow = new SelectBookWindow();
        selectBookWindow.setVisible(true);
    }//GEN-LAST:event_btnModifyBookActionPerformed

    private void btnAvailableBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableBooksActionPerformed
        AvaliableBooksWindow avaliableBooksWindow = new AvaliableBooksWindow();
        setVisible(false);
        avaliableBooksWindow.setVisible(true);
    }//GEN-LAST:event_btnAvailableBooksActionPerformed

    private void btnRemoveBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveBookActionPerformed
        DeleteBookWindow deleteBookWindow = new DeleteBookWindow();
        setVisible(false);
        deleteBookWindow.setVisible(true);
    }//GEN-LAST:event_btnRemoveBookActionPerformed

    private void btnAddBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMouseEntered
        btnAddBook.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnAddBookMouseEntered

    private void btnModifyBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifyBookMouseEntered
        btnModifyBook.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnModifyBookMouseEntered

    private void btnRemoveBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveBookMouseEntered
        btnRemoveBook.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnRemoveBookMouseEntered

    private void btnAvailableBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvailableBooksMouseEntered
        btnAvailableBooks.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnAvailableBooksMouseEntered

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnExitMouseEntered

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
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAvailableBooks;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnModifyBook;
    private javax.swing.JButton btnRemoveBook;
    private javax.swing.JLabel jLabelAllRightsReserved;
    private javax.swing.JLabel jLabelLeftSideBanner;
    private javax.swing.JLabel jLabelManagerIcon;
    private javax.swing.JLabel jLabelManagerTitle;
    private javax.swing.JLabel jLabelRightSideBanner;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAllRightsReserved;
    private javax.swing.JPanel jPanelManagerBackground;
    // End of variables declaration//GEN-END:variables
}
