package view;




import bean.Coneccion;
import bean.vpoliza;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import bean.fpoliza;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

import bean.stylotablas;
import busqueda.busquedavehiculo;
import java.awt.EventQueue;
import java.io.File;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;

//import static presentacion.frmPrestamo.cantidad_actual;

public class viewpoliza extends javax.swing.JFrame {
    
    public viewpoliza() {
        initComponents();
        
      fpoliza func=new fpoliza();
        idpoliza.setText(String.valueOf(func.obtenermaximoidpago())); 
         //int id= Integer.parseInt(idpoliza.getText())-1;
        //iddetalle_poliza.setText(String.valueOf(func.conseguirdatos_paraactualizar(id))); 
        
        vehiculo_cliente_chapaId.setVisible(false);
      
        idpoliza.setVisible(false);
        iddetalle_poliza.setVisible(false);
        txtbuscar.setVisible(false);
        
        btnseleccpaciente.requestFocus();
        
        inhabilitar();
       
        mostrar(buscar.getText());
       // jRadioButton2.setSelected(true);
        //jRadioButton1.setSelected(false);
            //BasicInternalFrameUI BI =  (BasicInternalFrameUI) this.getUI();
     //BI.setNorthPane(null);
     //this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        stylotablas stylo =new stylotablas();
      
        stylo.stylo_tablas(jTable1);      

           Calendar c= Calendar.getInstance();
          String dia= Integer.toString(c.get(Calendar.DATE));
          String mes= Integer.toString(c.get(Calendar.MONTH)+1);
          String anho= Integer.toString(c.get(Calendar.YEAR));
         String fechaactual=dia+"-"+mes+"-"+anho;
         try {
             java.util.Date fecha=new SimpleDateFormat("dd-MM-yyyy").parse(fechaactual);
             
            
             
             fecha_inicio.setDate(fecha);
        } catch (Exception e) {
        }
         
    }
    
    void inhabilitar(){
         
          btnseleccpaciente.setEnabled(false);
         
            
           fecha_inicio.setEnabled(false);
           fecha_venc.setEnabled(false); 
           
            
             chasisID.setEnabled(false);
          marca.setEnabled(false);
           modelo.setEnabled(false);
           nombre.setEnabled(false);
           apellido.setEnabled(false);
           monto_total.setEnabled(false);
           
              chasisID.setText("");
          marca.setText("");
           modelo.setText("");
           nombre.setText("");
           apellido.setText("");
           monto_total.setText("");
          
          
          
            
        
        btncancelar.setEnabled(false);
      btnnuevo.setEnabled(true);
      btnguardar.setEnabled(false); 
      
    }
    
      void habilitar(){
          
              btnseleccpaciente.setEnabled(true);
            
           fecha_inicio.setEnabled(true);
           fecha_venc.setEnabled(true);
           monto_total.setEnabled(true);
           
              chasisID.setText("");
          marca.setText("");
           modelo.setText("");
           nombre.setText("");
           apellido.setText(""); 
           monto_total.setText("");
           
          
          
           
           btncancelar.setEnabled(true);
      btnnuevo.setEnabled(false);
      btnguardar.setEnabled(true); 
    }
    
       void mostrar(String buscar) {
        try {
             
            DefaultTableModel modelo; 
             fpoliza func = new fpoliza();
             modelo = func.mostrartodos(buscar);
             jTable1.setModel(modelo);
            ocultar_columnas(); 
                         lbltotalregistroconsulta.setText("REGISTROS " + Integer.toString(func.totalRegistro));
        } catch (Exception e) {
        }
    }
       
         void mostrar_detalle(String txtbuscar) {
        try {
             
            DefaultTableModel modelo; 
             fpoliza func = new fpoliza();
             modelo = func.mostrar_detalle(txtbuscar);
             jTable2.setModel(modelo);
            //ocultar_columnas(); 
                         lbltotalregistroconsulta1.setText("CUOTAS " + Integer.toString(func.totalRegistro));
        } catch (Exception e) {
        }

    

      

    }

     void ocultar_columnas() { 
          
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
        
          jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(4).setMinWidth(0);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(0);
         
       jTable1.getColumnModel().getColumn(10).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(10).setMinWidth(0);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(0);
        
       
//        
//          jTable1.getColumnModel().getColumn(3).setMaxWidth(0);
//        jTable1.getColumnModel().getColumn(3).setMinWidth(0);
//        jTable1.getColumnModel().getColumn(3).setPreferredWidth(0);
//        
//         jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
//        jTable1.getColumnModel().getColumn(4).setMinWidth(0);
//        jTable1.getColumnModel().getColumn(4).setPreferredWidth(0);
    }
       
     
      
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jtableconsultas = new javax.swing.JTabbedPane();
        jPanelconsultasrealizadas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbltotalregistroconsulta = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btnnuevo2 = new javax.swing.JButton();
        lbltotalregistroconsulta1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        panelconsulta = new javax.swing.JPanel();
        btncancelar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fecha_inicio = new com.toedter.calendar.JDateChooser();
        monto_total = new javax.swing.JTextField();
        fecha_venc = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vehiculo_cliente_chapaId = new javax.swing.JTextField();
        btnseleccpaciente = new javax.swing.JButton();
        idpoliza = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        chasisID = new javax.swing.JTextField();
        iddetalle_poliza = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CLIENTES");

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("POLIZAS");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 1130, 10));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setToolTipText("CERRAR VENTANA");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 50, 50));

        jPanelconsultasrealizadas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelconsultasrealizadas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanelconsultasrealizadas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 1060, 140));

        lbltotalregistroconsulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltotalregistroconsulta.setForeground(new java.awt.Color(0, 51, 102));
        lbltotalregistroconsulta.setText("CUOTAS");
        jPanelconsultasrealizadas.add(lbltotalregistroconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 100, 20));

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarKeyPressed(evt);
            }
        });
        jPanelconsultasrealizadas.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 370, 30));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("BUSCAR POR NOMBRE, APELLIDO O C.I. DEL USUARIO");
        jPanelconsultasrealizadas.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 360, -1));

        btnnuevo2.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnnuevo2.setText("NUEVO");
        btnnuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevo2ActionPerformed(evt);
            }
        });
        jPanelconsultasrealizadas.add(btnnuevo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 130, 40));

        lbltotalregistroconsulta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltotalregistroconsulta1.setForeground(new java.awt.Color(0, 51, 102));
        lbltotalregistroconsulta1.setText("CUOTAS");
        jPanelconsultasrealizadas.add(lbltotalregistroconsulta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 210, 20));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanelconsultasrealizadas.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 1060, 140));

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        jPanelconsultasrealizadas.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 40, 20));

        jButton2.setText("REPORTES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelconsultasrealizadas.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 94, 35));

        jtableconsultas.addTab("REGISTRO DE POLIZAS", jPanelconsultasrealizadas);

        panelconsulta.setBackground(new java.awt.Color(255, 255, 255));
        panelconsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncancelar.setBackground(new java.awt.Color(255, 255, 255));
        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        panelconsulta.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 130, 40));

        btnguardar.setBackground(new java.awt.Color(255, 255, 255));
        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        panelconsulta.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 130, 40));

        btnnuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        panelconsulta.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 130, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "DATOS DE LA POLIZA"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("FECHA VENCIMIENTO");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 140, -1));
        jPanel5.add(fecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 170, 30));

        monto_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monto_totalActionPerformed(evt);
            }
        });
        monto_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                monto_totalKeyReleased(evt);
            }
        });
        jPanel5.add(monto_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 180, 30));
        jPanel5.add(fecha_venc, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 170, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("FECHA INCIO");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 140, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("MONTO TOTAL");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 180, -1));

        panelconsulta.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 1050, 170));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Datos Cliente_vehiculo"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Marca");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 140, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Chasis");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Modelo");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 70, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nombre");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 90, -1));

        vehiculo_cliente_chapaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculo_cliente_chapaIdActionPerformed(evt);
            }
        });
        jPanel6.add(vehiculo_cliente_chapaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 40, -1));

        btnseleccpaciente.setBackground(new java.awt.Color(255, 255, 255));
        btnseleccpaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnseleccpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccpacienteActionPerformed(evt);
            }
        });
        jPanel6.add(btnseleccpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 30, 30));

        idpoliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpolizaActionPerformed(evt);
            }
        });
        jPanel6.add(idpoliza, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 40, -1));

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        jPanel6.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Apellido");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel6.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 180, 30));
        jPanel6.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 180, 30));
        jPanel6.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 190, 30));

        chasisID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chasisIDActionPerformed(evt);
            }
        });
        jPanel6.add(chasisID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 170, 30));
        jPanel6.add(iddetalle_poliza, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 30, -1));

        panelconsulta.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 1050, 150));

        jtableconsultas.addTab("POLIZAS", panelconsulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1226, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jtableconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 1149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtableconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
 inhabilitar(); 

    }//GEN-LAST:event_btncancelarActionPerformed
 private String accion = "guardar";
    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitar();
        btnguardar.setText("GUARDAR");
        accion="guardar"; 
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        
       
        if(vehiculo_cliente_chapaId.getText().equals("")){
            btnseleccpaciente.requestFocus();
            JOptionPane.showMessageDialog(this, "FALTO SELECCIONAR VEHICULO");
            return ;
        }
        
       
         
          
          
        
             fpoliza func = new fpoliza();
             vpoliza dts = new vpoliza();
             vpoliza dts1= new vpoliza();
             Calendar  cal;
           int d,m,a;
           cal=fecha_inicio.getCalendar();
           d=cal.get(Calendar.DAY_OF_MONTH);
             m=cal.get(Calendar.MONTH);
             a=cal.get(Calendar.YEAR)-1900;
             dts.setFecha_inicio(new Date(a,m,d));
             
             Calendar  cal1;
           int d1,m1,a1;
           cal1=fecha_venc.getCalendar();
           d1=cal1.get(Calendar.DAY_OF_MONTH); 
             m1=cal1.get(Calendar.MONTH);
             a1=cal1.get(Calendar.YEAR)-1900;
             dts.setFecha_venc(new Date(a1,m1,d1));
              //dts.setLibros_idlibros(Integer.parseInt(idlibros.getText()));
               
              dts.setCliente_vehiculo_chapaId(vehiculo_cliente_chapaId.getText());
              
              dts.setMonto_total(Integer.parseInt(monto_total.getText())); 
              dts.setPoliza_idpoliza(Integer.parseInt(idpoliza.getText()));
               
              
              
              
             
           
            
              
              
  
               if (accion.equals("guardar")) {
                    
                if (func.insertar(dts)){
                    JOptionPane.showMessageDialog(rootPane, "POLIZA GUARDADO CORRECTAMENTE","INFORMACION",1);
                    func.insertar_detalle(dts); 
                inhabilitar();  
                   
                    mostrar(""); 
            }
        }    
            
             if (accion.equals("editar")) {
                 dts.setIdpoliza(Integer.parseInt(idpoliza.getText())); 
                  
                 dts1.setPoliza_idpoliza(Integer.parseInt(iddetalle_poliza.getText())); 
                inhabilitar();
                
                if (func.editar(dts)) {
                    
                    func.actualizar_detalle(dts1);
                     JOptionPane.showMessageDialog(rootPane, "POLIZA MODIFICADO CORRECTAMENTE","INFORMACION",1);
                     
                  mostrar("");
                           
                }   
             
            
        }
//              mostrar(buscar.getText());
//                     chasisID.setText("");
//          marca.setText("");
//           modelo.setText("");
//           nombre.setText("");
//             
              
                
        
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void vehiculo_cliente_chapaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculo_cliente_chapaIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiculo_cliente_chapaIdActionPerformed
    public int control=2;
    private void btnseleccpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccpacienteActionPerformed
        // TODO add your handling code here:

 busquedavehiculo form = new busquedavehiculo();
        form.control=2;
        control=2;
        form.toFront();
        form.setVisible(true);
       
    }//GEN-LAST:event_btnseleccpacienteActionPerformed
       
    private void monto_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monto_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monto_totalActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
       mostrar(buscar.getText());
    }//GEN-LAST:event_buscarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         btnguardar.setText("ACTUALIZAR");
        habilitar();          
        accion="editar";
        /*
          registro[0] = rs.getString("idpoliza");
                registro[1] = rs.getString("monto_total");
                registro[2] = rs.getString("fecha_inicio");
                registro[3] = rs.getString("fecha_venc");
                registro[4] = rs.getString("cliente_vehiculo_cliente_idCliente1");
                registro[5] = rs.getString("chapaId");
                registro[6] = rs.getString("marca");
                registro[7] = rs.getString("modelo");
                registro[8] = rs.getString("nombre");
                registro[9] = rs.getString("apellido");
        */
          Calendar  cal;
           int d,m,a;
           cal=fecha_inicio.getCalendar();
           d=cal.get(Calendar.DAY_OF_MONTH);
             m=cal.get(Calendar.MONTH);
             a=cal.get(Calendar.YEAR)-1900;
         int fila = jTable1.rowAtPoint(evt.getPoint());
         idpoliza.setText(jTable1.getValueAt(fila, 0).toString());
         //iddetalle_poliza.setText(jTable1.getValueAt(fila, 0).toString());
          txtbuscar.setText(jTable1.getValueAt(fila, 0).toString());
         System.out.println("monto" +monto_total);
         monto_total.setText(jTable1.getValueAt(fila, 1)+"");
         
         
         fecha_inicio.setDate(Date.valueOf(jTable1.getValueAt(fila, 2).toString()));
           fecha_venc.setDate(Date.valueOf(jTable1.getValueAt(fila, 3).toString()));
        vehiculo_cliente_chapaId.setText(jTable1.getValueAt(fila, 4).toString());       
              
                chasisID.setText(jTable1.getValueAt(fila, 5).toString());
                marca.setText(jTable1.getValueAt(fila, 6).toString());
                modelo.setText(jTable1.getValueAt(fila, 7).toString());
                nombre.setText(jTable1.getValueAt(fila, 8).toString());
                apellido.setText(jTable1.getValueAt(fila, 9).toString()); 
                iddetalle_poliza.setText(jTable1.getValueAt(fila, 10).toString()); 
                //jtableconsultas.setSelectedIndex(jtableconsultas.indexOfComponent(panelconsulta));
                
                mostrar_detalle(txtbuscar.getText()); 
                
               
//         totalsesiones.setText(jTable1.getValueAt(fila, 8).toString());
//totalsesioneshitorial.setText(totalsesiones.getText());
//        quejaprincipal.setText(jTable1.getValueAt(fila, 9).toString());
//        quejaterapeutica.setText(jTable1.getValueAt(fila, 10).toString());
//           diagnostico.setText(jTable1.getValueAt(fila, 11).toString());
//                   fechaPrestamo.setDate(Date.valueOf(jTable1.getValueAt(fila, 12).toString()));
//       cboTurno.setSelectedItem(jTable1.getValueAt(fila, 13).toString());
//         jtableconsultas.setSelectedIndex(jtableconsultas.indexOfComponent(panelconsulta));
//         inhabilitarhistorial();
//         mostrarhitoria(idlibros.getText());
         
    }//GEN-LAST:event_jTable1MouseClicked
  
    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed
        // TODO add your handling code here:

            mostrar(buscar.getText());
    }//GEN-LAST:event_buscarKeyPressed

    private void btnnuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevo2ActionPerformed
        // TODO add your handling code here:
          jtableconsultas.setSelectedIndex(jtableconsultas.indexOfComponent(panelconsulta));
          habilitar();
          btnguardar.setText("GUARDAR");
          accion="guardar";
    }//GEN-LAST:event_btnnuevo2ActionPerformed

    private void idpolizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpolizaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpolizaActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void chasisIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chasisIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chasisIDActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void monto_totalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monto_totalKeyReleased
        // TODO add your handling code here:
         DecimalFormat formatea = new DecimalFormat("###,###.##");// TODO add your handling code here:
        monto_total.setText(monto_total.getText().replace(".", ""));
        int c = Integer.parseInt(monto_total.getText());
        monto_total.setText(formatea.format(c));
    }//GEN-LAST:event_monto_totalKeyReleased
private Connection connection = new Coneccion().conectar();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!txtbuscar.getText().equals("")) {

            Map p = new HashMap();
            p.put("idpoliza", txtbuscar.getText());
            JasperReport report;
            JasperPrint print;

            try {
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/reportes/rpcuotaspoliza.jrxml");
                print = JasperFillManager.fillReport(report, p, connection);
                JasperViewer view = new JasperViewer(print, false);
                view.setTitle("Cuotas");
                view.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }else {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar la cabecera");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
     
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField apellido;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnnuevo2;
    private javax.swing.JButton btnseleccpaciente;
    public static javax.swing.JTextField buscar;
    public static javax.swing.JTextField chasisID;
    private com.toedter.calendar.JDateChooser fecha_inicio;
    private com.toedter.calendar.JDateChooser fecha_venc;
    public static javax.swing.JTextField iddetalle_poliza;
    public static javax.swing.JTextField idpoliza;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelconsultasrealizadas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTabbedPane jtableconsultas;
    private javax.swing.JLabel lbltotalregistroconsulta;
    private javax.swing.JLabel lbltotalregistroconsulta1;
    public static javax.swing.JTextField marca;
    public static javax.swing.JTextField modelo;
    public static javax.swing.JTextField monto_total;
    public static javax.swing.JTextField nombre;
    private javax.swing.JPanel panelconsulta;
    public static javax.swing.JTextField txtbuscar;
    public static javax.swing.JTextField vehiculo_cliente_chapaId;
    // End of variables declaration//GEN-END:variables
 public static void main2(final String[] args) {
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
            java.util.logging.Logger.getLogger(taller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(taller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(taller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(taller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new taller());
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setTitle(args[0]); 
            }
        });
    }
}
