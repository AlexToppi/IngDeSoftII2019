/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
import javax.swing.*;
import utilitarios.*;
import view.factura;
import view.cliente;
import view.siniestro;
import view.usuario;
import view.viewpoliza;

//import registro.*;
public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    data mostrar_datos;
    String set_look = "com.sun.java.swing.plaf.metal.MetalLookAndFeel";

    public ventanaPrincipal() {
        initComponents();
        mostrar_datos = new data();
        mostrar_datos.el_dato();//primero tengo que ejecutar este método para después ejecutar el resto
        lbldata.setText("Hoy es " + mostrar_datos.dia_semana + " " + mostrar_datos.dia + " de " + mostrar_datos.mes + " del año " + mostrar_datos.anho);
        timer1.start();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jPanel1 = new javax.swing.JPanel();
        lbldata = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        itemRegistros = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenuItem();
        menuDireccion = new javax.swing.JMenuItem();
        menuSiniestro = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();
        itemMovimientos = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        itemReportes = new javax.swing.JMenu();
        menuReporteVentas = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        itemUtilitarios = new javax.swing.JMenu();
        menuNimbus = new javax.swing.JMenuItem();
        menuLiquid = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lbldata.setText("Fecha:");

        lblhora.setText("Hora:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldata, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbldata)
                .addGap(18, 18, 18)
                .addComponent(lblhora)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/rumbos logo3.jpeg"))); // NOI18N

        itemRegistros.setText("Registros");

        menuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cliente1.png"))); // NOI18N
        menuCliente.setText("Cliente");
        menuCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClienteMouseClicked(evt);
            }
        });
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        itemRegistros.add(menuCliente);

        menuDireccion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/barrio.png"))); // NOI18N
        menuDireccion.setText("Taller/Chapería");
        menuDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDireccionActionPerformed(evt);
            }
        });
        itemRegistros.add(menuDireccion);

        menuSiniestro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        menuSiniestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cargo.png"))); // NOI18N
        menuSiniestro.setText("Siniestro");
        menuSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSiniestroActionPerformed(evt);
            }
        });
        itemRegistros.add(menuSiniestro);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/check.png"))); // NOI18N
        jMenuItem12.setText("Póliza");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        itemRegistros.add(jMenuItem12);
        itemRegistros.add(jSeparator2);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/user-32.png"))); // NOI18N
        jMenuItem11.setText("Usuario del Sistema");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        itemRegistros.add(jMenuItem11);
        itemRegistros.add(jSeparator1);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/addphoto.png"))); // NOI18N
        jMenuItem9.setText("Solicitud de póliza");
        itemRegistros.add(jMenuItem9);
        itemRegistros.add(jSeparator4);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/salir.png"))); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        itemRegistros.add(menuSalir);

        jMenuBar1.add(itemRegistros);

        itemMovimientos.setText("Movimientos");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/getmoney.png"))); // NOI18N
        jMenuItem3.setText("Cobranza");
        itemMovimientos.add(jMenuItem3);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/table.png"))); // NOI18N
        jMenuItem13.setText("Factura");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        itemMovimientos.add(jMenuItem13);

        jMenuBar1.add(itemMovimientos);

        itemReportes.setText("Reportes");

        menuReporteVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuReporteVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/table.png"))); // NOI18N
        menuReporteVentas.setText("Reporte de Ventas");
        menuReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReporteVentasActionPerformed(evt);
            }
        });
        itemReportes.add(menuReporteVentas);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon-money.png"))); // NOI18N
        jMenuItem10.setText("Comisiones");
        itemReportes.add(jMenuItem10);

        jMenuBar1.add(itemReportes);

        itemUtilitarios.setText("Utilitarios");

        menuNimbus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menuNimbus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/application_double.png"))); // NOI18N
        menuNimbus.setText("Look and Fell-Nimbus");
        menuNimbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNimbusActionPerformed(evt);
            }
        });
        itemUtilitarios.add(menuNimbus);

        menuLiquid.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuLiquid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/table.png"))); // NOI18N
        menuLiquid.setText("Look and Fell-Liquid");
        menuLiquid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLiquidActionPerformed(evt);
            }
        });
        itemUtilitarios.add(menuLiquid);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Look And Feel-Windows");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        itemUtilitarios.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Look And Feel-Metal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        itemUtilitarios.add(jMenuItem2);

        jMenuBar1.add(itemUtilitarios);

        jMenu1.setText("Consultas");

        jMenu2.setText("Listas");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Polizas");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Clientes");
        jMenu2.add(jMenuItem8);

        jMenu1.add(jMenu2);

        jMenu3.setText("Cobranzas/Recibos");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Pendientes");
        jMenu3.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Cobradas");
        jMenu3.add(jMenuItem6);

        jMenu1.add(jMenu3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem5.setText("Ficha Cliente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu4.setMnemonic('S');
        jMenu4.setText("Salir");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        setBounds(0, 0, 521, 519);
    }// </editor-fold>//GEN-END:initComponents

    private void menuReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReporteVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuReporteVentasActionPerformed

    private void menuNimbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNimbusActionPerformed
        set_look = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
        lookandfeel();
    }//GEN-LAST:event_menuNimbusActionPerformed

    private void menuLiquidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLiquidActionPerformed
        set_look = "com.birosoft.liquid.LiquidLookAndFeel";
        lookandfeel();
    }//GEN-LAST:event_menuLiquidActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        mostrar_datos.leer_hora();
        lblhora.setText("Hora actual: " + mostrar_datos.hora);
    }//GEN-LAST:event_timer1OnTime

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        set_look = "javax.swing.plaf.metal.MetalLookAndFeel";
        lookandfeel();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menuDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDireccionActionPerformed

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        String args[] = new String[1];//creamos un vector aquí de una sola posición;
        args[0] = "Registro de Clientes";//es este el parámetro que le pasamos a nuestro método main
        cliente.main(args);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClienteMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_menuClienteMouseClicked

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        viewpoliza form = new viewpoliza();
        form.control = 2;
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        String args[] = new String[1];
        args[0] = "Registro Factura";
        factura.main(args);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void menuSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSiniestroActionPerformed
        String args[] = new String[1];
        args[0] = "Registro Siniestro";
        siniestro.main(args);
    }//GEN-LAST:event_menuSiniestroActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        String args[] = new String[1];
        args[0] = "Registro Usuario";
        usuario.main(args);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu itemMovimientos;
    private javax.swing.JMenu itemRegistros;
    private javax.swing.JMenu itemReportes;
    private javax.swing.JMenu itemUtilitarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel lbldata;
    private javax.swing.JLabel lblhora;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuDireccion;
    private javax.swing.JMenuItem menuLiquid;
    private javax.swing.JMenuItem menuNimbus;
    private javax.swing.JMenuItem menuReporteVentas;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuSiniestro;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables

    public void lookandfeel() {
        try {
            //La variable set look tiene que estar definida arriba como una variable String
            UIManager.setLookAndFeel(set_look);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error);
        }
    }
}
