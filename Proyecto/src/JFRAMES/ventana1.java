/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFRAMES;
import JFRAMES.Conector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.util.ResultSetUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ventana1 extends javax.swing.JFrame {
    Conector cc = new Conector();
    Connection con = (Connection) cc.Conectar();
    
    /**
     * Creates new form ventana1
     */
    public ventana1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());         
        mostrarDatos();      
    }

    public void mostrarDatos(){
        String[] titulos= {"Id_producto","Nombre_producto","Cantidad","Precio"};
        String[] registros= new String[4];
        
        DefaultTableModel modelo= new DefaultTableModel(null, titulos);
        
        String Sql = "select * from productos";
        
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            
            while(rs.next()){
            registros[0]=rs.getString("id_producto");
            registros[1]=rs.getString("nombre_producto");
            registros[2]=rs.getString("cantidad");
            registros[3]=rs.getString("precio");  
            
            modelo.addRow(registros);
            
            }
            Tabla_Productos.setModel(modelo);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al mostrar Datos " + e.getMessage());
        }
    
    }
    public void EliminarDatos (){
        try {
            int filaSeleccionada=Tabla_Productos.getSelectedRow();
            
            String Sql = "delete from productos where id_producto="+Tabla_Productos.getValueAt(filaSeleccionada,0);
            
            java.sql.Statement st=con.createStatement();
            
            int n=st.executeUpdate(Sql);
            
               if (n>=0){
                JOptionPane.showMessageDialog(null,"Producto Eliminado");
               }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error al eliminar producto" + e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        EliminarProducto = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        NOMBRE_PRODUCTO = new javax.swing.JTextField();
        CANTIDAD = new javax.swing.JTextField();
        PRECIO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Productos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 11, 164, -1));

        EliminarProducto.setBackground(new java.awt.Color(255, 102, 102));
        EliminarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        EliminarProducto.setText("Eliminar Producto ");
        EliminarProducto.setToolTipText("");
        EliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(EliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, 34));

        Agregar.setBackground(new java.awt.Color(0, 204, 204));
        Agregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("AGREGAR");
        Agregar.setToolTipText("");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 407, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 445, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 465, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 483, -1, -1));
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 407, 65, -1));
        getContentPane().add(NOMBRE_PRODUCTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 445, 128, -1));
        getContentPane().add(CANTIDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 483, 77, -1));
        getContentPane().add(PRECIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 511, 77, -1));

        Tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Productos.setToolTipText("");
        jScrollPane1.setViewportView(Tabla_Productos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, -1, 300));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Precio en s/");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 514, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\TECSUP CICLO 2 DISEÑO Y DESARROLLO DE SOFTWARE\\PROGRAMACIÓN ORIENTADA A OBJETOS\\fondo venta1a.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProductoActionPerformed
      EliminarDatos();
      mostrarDatos();
    }//GEN-LAST:event_EliminarProductoActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        try {
            agregarproducto();
        } catch (SQLException ex) {
            Logger.getLogger(ventana1.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrarDatos();
    }//GEN-LAST:event_AgregarActionPerformed

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
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana1().setVisible(true);
            }
        });
    }
public void agregarproducto() throws SQLException{
       
        String SQL = "insert into productos (id_producto,nombre_producto,cantidad,precio)values(?,?,?,?)";
        
        try{
            java.sql.PreparedStatement pst = con.prepareStatement(SQL);
            
            pst.setString(1,ID.getText());
            pst.setString(2,NOMBRE_PRODUCTO.getText());
            pst.setString(3,CANTIDAD.getText());
            pst.setString(4,PRECIO.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro Exitoso");
        }catch (Exception e){
          JOptionPane.showMessageDialog(null,"Error de Registro : Ingrese otro ID o llene correctamente los campos ---> " + e.getMessage());
        }
      }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField CANTIDAD;
    private javax.swing.JButton EliminarProducto;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField NOMBRE_PRODUCTO;
    private javax.swing.JTextField PRECIO;
    private javax.swing.JTable Tabla_Productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}