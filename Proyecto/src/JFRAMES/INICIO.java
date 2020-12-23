
package JFRAMES;

import JFRAMES.Conector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class INICIO extends javax.swing.JFrame {
    Conector cc = new Conector();
    Connection con = (Connection) cc.Conectar();
    
    public INICIO() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Crearcuenta = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        clave = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\TECSUP CICLO 2 DISEÑO Y DESARROLLO DE SOFTWARE\\PROGRAMACIÓN ORIENTADA A OBJETOS\\usuario.PNG")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CLAVE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        Crearcuenta.setBackground(new java.awt.Color(0, 153, 204));
        Crearcuenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Crearcuenta.setForeground(new java.awt.Color(255, 255, 255));
        Crearcuenta.setText("Crear Cuenta");
        Crearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearcuentaActionPerformed(evt);
            }
        });
        getContentPane().add(Crearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 129, -1));

        ingresar.setBackground(new java.awt.Color(153, 255, 51));
        ingresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("INGRESAR");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 123, 40));

        cancelar.setBackground(new java.awt.Color(255, 102, 102));
        cancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, 39));

        clave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });
        getContentPane().add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 128, 28));

        usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 128, 28));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\TECSUP CICLO 2 DISEÑO Y DESARROLLO DE SOFTWARE\\PROGRAMACIÓN ORIENTADA A OBJETOS\\Fondo de practica calificada 2.PNG")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        usuario.setText("");
        clave.setText("");
    }//GEN-LAST:event_cancelarActionPerformed

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
      try {
            validausuario();   // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(INICIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void CrearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearcuentaActionPerformed
               INICIO1 form= new INICIO1();
                form.setVisible(true);
                this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_CrearcuentaActionPerformed

     public void validausuario() throws SQLException{
        int resultado = 0;
        String pass = String.valueOf(clave.getPassword());
        String usu= usuario.getText(); 
        String SQL = "select * from encargados where usuario= '"+usu+"' and clave='"+pass+"'";
        try{
            java.sql.Statement st =con.createStatement();
            java.sql.ResultSet rs= st.executeQuery(SQL);
            if (rs.next()){
                resultado=1;  
                if (resultado==1){
                ventana1 form= new ventana1();
                form.setVisible(true);
                this.dispose();
                }
            }else{
              JOptionPane.showMessageDialog(null,"Error de acceso, Usuario no registrado");  
            }     
        }
        catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error de conexión"+e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INICIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crearcuenta;
    private javax.swing.JButton cancelar;
    private javax.swing.JPasswordField clave;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
