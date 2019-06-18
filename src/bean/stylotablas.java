/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author User
 */
public class stylotablas {
        public void stylo_tablas(javax.swing.JTable  tabla)
    {
        javax.swing.table.DefaultTableCellRenderer Centrar_Contenido_Letras = new javax.swing.table.DefaultTableCellRenderer();
        Centrar_Contenido_Letras.setHorizontalAlignment( javax.swing.JLabel.CENTER );
        tabla.getColumnModel().getColumn(0).setCellRenderer( Centrar_Contenido_Letras );
        //tablelistado.setRowHeight(70);
      
        tabla.setBounds(new Rectangle(255, 255, 255, 255));
        tabla.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
        tabla.setForeground(java.awt.Color.BLACK);
        tabla.setBackground(java.awt.Color.WHITE);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);    
        tabla.setFillsViewportHeight(true);
        tabla.setShowGrid(true);
        tabla.setShowVerticalLines(true);
        tabla.setGridColor(java.awt.Color.gray);
        
        tabla.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, boolean hasFocus,int row, int column) {
               
               JLabel l=(JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
               //l.setBorder(new LineBorder(Color.getHSBColor(0,204,102)));
               l.setBorder(noFocusBorder);
              
               l.setBackground(new java.awt.Color(0,0,0));
              // l.setAutoscrolls(contains(0,0));
               l.setForeground(new java.awt.Color(255,255,255));
               l.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
               return l;
            }
        
        });
    }

}
