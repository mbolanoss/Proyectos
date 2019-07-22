package UI;

import businessLogic.BookStore;
import data.Book;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

/**
 *
 * @author migue
 */
public class SelectBookWindow extends javax.swing.JFrame {

    /**
     * Creates new form SelectBookWindow
     */
    public SelectBookWindow() {
        initComponents();
        setLocationRelativeTo(null);
        
        JTableHeader header = jtableBooks.getTableHeader();
        header.setBackground(new java.awt.Color(0, 153, 153));
        header.setForeground(Color.white);
        header.setFont(new Font("Calibri", 1, 12));
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/Bookota.png")).getImage());// Icono de la ventana
        
        updateTable();

    }

    private void updateTable() {
        HashMap<Integer, Book> booksMap = BookStore.getBooksMap();
        if (booksMap.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No hay libros disponibles", "", JOptionPane.WARNING_MESSAGE);
        }
        Object matrix[][] = new String[booksMap.size()][5];
        ArrayList<Book> booksList = new ArrayList<>();
        for (Book book : booksMap.values()) {
            booksList.add(book);
        }

        for (int i = 0; i < booksList.size(); i++) {
            matrix[i][0] = Integer.toString(booksList.get(i).getIndex());
            matrix[i][1] = booksList.get(i).getIsbnCode();
            matrix[i][2] = booksList.get(i).getTitle();
            matrix[i][3] = Integer.toString(booksList.get(i).getPrice());
            matrix[i][4] = Integer.toString(booksList.get(i).getStock());
        }

        jtableBooks.setModel(new javax.swing.table.DefaultTableModel(
                matrix,
                new String[]{
                    "Indice", "ISBN", "Titulo", "Precio", "Stock"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableBooks = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 47, 93));

        jtableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Indice", "ISBN", "Titulo", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jtableBooks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtableBooks);
        if (jtableBooks.getColumnModel().getColumnCount() > 0) {
            jtableBooks.getColumnModel().getColumn(0).setResizable(false);
            jtableBooks.getColumnModel().getColumn(1).setResizable(false);
            jtableBooks.getColumnModel().getColumn(2).setResizable(false);
            jtableBooks.getColumnModel().getColumn(3).setResizable(false);
            jtableBooks.getColumnModel().getColumn(4).setResizable(false);
        }

        btnModify.setText("Modificar");
        btnModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModifyMouseEntered(evt);
            }
        });
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(btnModify)
                .addGap(41, 41, 41)
                .addComponent(btnReturn)
                .addContainerGap(261, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify)
                    .addComponent(btnReturn))
                .addGap(0, 28, Short.MAX_VALUE))
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

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        setVisible(false);
        AdminWindow adminWindow = new AdminWindow();
        adminWindow.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        int selectedRow = jtableBooks.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(rootPane, "Escoja un libro", "", JOptionPane.WARNING_MESSAGE);
        } else {
            int selectedBookIndex = Integer.parseInt((String) jtableBooks.getValueAt(selectedRow, 0));
            setVisible(false);
            ModifyBookWindow.setBookIndex(selectedBookIndex);
            ModifyBookWindow modifyBookWindow = new ModifyBookWindow();
            modifyBookWindow.setVisible(true);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnModifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifyMouseEntered
        btnModify.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnModifyMouseEntered

    private void btnReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseEntered
        btnReturn.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnReturnMouseEntered

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
            java.util.logging.Logger.getLogger(SelectBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectBookWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnReturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableBooks;
    // End of variables declaration//GEN-END:variables
}
