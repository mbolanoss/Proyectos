package UI;

import businessLogic.BookStore;
import data.User;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LogInWindow extends javax.swing.JFrame {

    private static String userName;
    private static String password;
    
    public LogInWindow() {
        initComponents();
        
        setTitle("\ud83d\udcda Bookotá");
        setIconImage ( new ImageIcon(getClass().getResource("/Imagen/Bookota.png")).getImage());
        setLocationRelativeTo(null);
        
        ImageIcon imagen1 = new ImageIcon( getClass().getResource("/Imagen/User.png"));
        Icon fondo1 =new ImageIcon ( imagen1.getImage().getScaledInstance(jLabelUserIcon.getWidth(), jLabelUserIcon.getHeight(),Image.SCALE_SMOOTH));
        jLabelUserIcon.setIcon(fondo1);
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

        jPanelBackground = new javax.swing.JPanel();
        jLabelReaders = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jbLogIn = new javax.swing.JButton();
        jPanelRightsReserved = new javax.swing.JPanel();
        jLabelRightsReserved = new javax.swing.JLabel();
        jLabelUserIcon = new javax.swing.JLabel();
        jLabelRightSide = new javax.swing.JLabel();
        jLabelLeftSide = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelBackground.setBackground(new java.awt.Color(0, 153, 153));
        jPanelBackground.setAlignmentX(0.0F);
        jPanelBackground.setAlignmentY(0.0F);

        jLabelReaders.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelReaders.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReaders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReaders.setText("Ingresa a nuestra comunidad de lectores");

        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelName.setText("Nombre de usuario");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPassword.setText("Contraseña");

        jbLogIn.setText("Ingresar");
        jbLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLogInMouseEntered(evt);
            }
        });
        jbLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLogInActionPerformed(evt);
            }
        });

        jPanelRightsReserved.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRightsReserved.setAlignmentX(0.0F);
        jPanelRightsReserved.setAlignmentY(0.0F);

        jLabelRightsReserved.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabelRightsReserved.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRightsReserved.setText("© Todos los derechos reservados. 2019.");

        javax.swing.GroupLayout jPanelRightsReservedLayout = new javax.swing.GroupLayout(jPanelRightsReserved);
        jPanelRightsReserved.setLayout(jPanelRightsReservedLayout);
        jPanelRightsReservedLayout.setHorizontalGroup(
            jPanelRightsReservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRightsReserved, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        jPanelRightsReservedLayout.setVerticalGroup(
            jPanelRightsReservedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightsReservedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRightsReserved)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelRightSide.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelRightSide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Laterales.jpg"))); // NOI18N

        jLabelLeftSide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Laterales.jpg"))); // NOI18N
        jLabelLeftSide.setAlignmentY(0.0F);

        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                .addComponent(jLabelLeftSide, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                        .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                                .addComponent(jbLogIn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnReturn))
                                            .addComponent(pfPassword)))
                                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelReaders, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelUserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)))
                .addComponent(jLabelRightSide, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanelRightsReserved, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelUserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelReaders)
                        .addGap(17, 17, 17)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelName)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPassword)
                            .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbLogIn)
                            .addComponent(btnReturn))
                        .addGap(21, 21, 21))
                    .addComponent(jLabelRightSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLeftSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jPanelRightsReserved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void jbLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLogInActionPerformed
        userName = txtUserName.getText();
        password = new String(pfPassword.getPassword());
        if(userName.length() == 0 && password.length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Por favor llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(userName.equals("admin") && password.equals("bookota")){
            setVisible(false);
            AdminWindow ventanaAdministrador = new AdminWindow();
            ventanaAdministrador.setVisible(true);
        }
        else if(!BookStore.checkCorrectUserName(userName)){
            JOptionPane.showMessageDialog(rootPane, "El nombre de usuario ingresado no\ncorresponde a ningún usuario creado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!BookStore.checkCorrectPassword(userName, password)){
            JOptionPane.showMessageDialog(rootPane, "Contrasela incorrecta\nIntentelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(BookStore.checkCorrectUserName(userName) && BookStore.checkCorrectPassword(userName, password)){
            setVisible(false);
            MainWindow pantallaPrincipal = new MainWindow();
            pantallaPrincipal.setVisible(true);
        }
    }//GEN-LAST:event_jbLogInActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
            setVisible(false);
            StartWindow pantallaInicio = new StartWindow();
            pantallaInicio.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        BookStore.close(rootPane);
    }//GEN-LAST:event_formWindowClosing

    private void jbLogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLogInMouseEntered
        jbLogIn.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_jbLogInMouseEntered

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
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInWindow().setVisible(true);
            }
        });
    }
    
    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        LogInWindow.userName = userName;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        LogInWindow.password = password;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabelLeftSide;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelReaders;
    private javax.swing.JLabel jLabelRightSide;
    private javax.swing.JLabel jLabelRightsReserved;
    private javax.swing.JLabel jLabelUserIcon;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelRightsReserved;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbLogIn;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
