package busqueda;

import bean.fvehiculo_cliente;
import bean.stylotablas;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.viewpoliza;


public class busquedavehiculo extends javax.swing.JFrame{
static public int controltablas=0;
DefaultTableModel modelo = new DefaultTableModel();
public busquedavehiculo() {
    
    initComponents();
   
    
    mostrar(""); 
    
     stylotablas tb=new stylotablas();
    tb.stylo_tablas(jTable1);
    
    }
public void mostrar(String buscar) {
        try {
            DefaultTableModel modelo; 
             fvehiculo_cliente func = new fvehiculo_cliente();
             modelo = func.mostrar(buscar);
             jTable1.setModel(modelo);
             ocultar_columnas();
            lbltotalregistro.setText(String.valueOf(func.totalRegistro));
        } catch (Exception e) {
        }
    }

     void ocultar_columnas() { 
          
       jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0); 
       
          
    }
   
     
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpanelbuscarproveedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new JTable(){       public boolean isCellEditable(int rowIndex, int colIndex) {       return false;       }   };
        lbltotalregistro = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jpanelbuscarproveedor.setBackground(new java.awt.Color(247, 247, 247));
        jpanelbuscarproveedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        jpanelbuscarproveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jpanelbuscarproveedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1240, 380));

        lbltotalregistro.setBackground(new java.awt.Color(255, 255, 255));
        lbltotalregistro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbltotalregistro.setForeground(new java.awt.Color(0, 153, 0));
        lbltotalregistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltotalregistro.setText("0");
        lbltotalregistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbltotalregistro.setOpaque(true);
        jpanelbuscarproveedor.add(lbltotalregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 80, 30));

        jLabel27.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("REGISTROS");
        jLabel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jpanelbuscarproveedor.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 100, 30));

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        jpanelbuscarproveedor.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 450, 30));

        jLabel1.setText("BUSCAR POR  PROPIETARIO O CHASIS");
        jpanelbuscarproveedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 270, -1));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelbuscarproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelbuscarproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     
  
    
    
    
    
   
    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());

    }//GEN-LAST:event_jTable1KeyReleased
public int control=0; 
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int fila = jTable1.rowAtPoint(evt.getPoint());
            
           if(evt.getClickCount()==2){
                     seleccionar_esta_fila(fila);
                     this.dispose();
               }       
    }//GEN-LAST:event_jTable1MouseClicked
void seleccionar_esta_fila(int fila){
         if (control==2) {  
        try {
                  /*
            registro[0] = rs.getString("chapaId");
                registro[1] = rs.getString("cliente_idcliente");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("apellido");
                registro[4] = rs.getString("chasis");
                registro[5] = rs.getString("color");
                registro[6] = rs.getString("marca");
                registro[7] = rs.getString("modelo");
                registro[8] = rs.getString("ano");
            */     
            viewpoliza.chasisID.setText(jTable1.getValueAt(fila, 4).toString());
            viewpoliza.vehiculo_cliente_chapaId.setText(jTable1.getValueAt(fila, 0).toString());
            viewpoliza.nombre.setText(jTable1.getValueAt(fila, 2).toString());
            viewpoliza.apellido.setText(jTable1.getValueAt(fila, 3).toString());
            viewpoliza.marca.setText(jTable1.getValueAt(fila, 6).toString());
            viewpoliza.modelo.setText(jTable1.getValueAt(fila, 7).toString());
            
            

        } catch (Exception e) {
     
         }
         }
}
    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        
        mostrar(txtbuscar.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
        mostrar(txtbuscar.getText()); 
    }//GEN-LAST:event_txtbuscarActionPerformed


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
            java.util.logging.Logger.getLogger(busquedavehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(busquedavehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(busquedavehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(busquedavehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
       
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
         
            public void run() {
                new busquedavehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JPanel jpanelbuscarproveedor;
    public static javax.swing.JLabel lbltotalregistro;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
