/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALUMNO
 */
public class fvehiculo_cliente {

    private Coneccion mysql = new Coneccion();
    //Se crea una instancia "mysql" del tipo Conecion.
    private Connection cn = mysql.conectar();
    /*Se crea un objeto "cn" del tipo Connection en el cual se almacena
    los valores devueltos por el método "mysql.conectar"*/
    private String sSql;
    public int totalRegistro;
  
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        /*private int idinsumos;
    private String cod_producto;
    private String nombre_producto;
    private String cantidad_actual;
    private String precio_compra;
    private String estado;
    private String descripcion;
    private String unidad_medida;*/
        
        String[] titulos = {"Chapa", "idCliente ","Nombre", "Apellido", "Chasis", "Color", "Marca", "Modelo", "Año"};
        String[] registro = new String[9];
        totalRegistro = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSql = " SELECT cv.chapaId as chapaId,cv.cliente_idCliente,cl.nombre,cl.apellido,cv.chasis,cv.color,cv.marca,cv.modelo,cv.ano FROM cliente_vehiculo cv "
                + "inner join cliente cl on cv.cliente_idcliente=cl.idcliente "
                + "where chapaId = '"+buscar+"' or cl.nombre  like '%"+buscar+"%' or cl.apellido like '%"+buscar+"%' \n "
                + "order by marca;";

        try {
            Statement st = cn.createStatement();
            //Se crea un objeto "st" de tipo Statement para procesar la consulta sql

            ResultSet rs = st.executeQuery(sSql);
            /*se crea un objeto "rs" de tipo ResultSet que contiene todas 
            las filas y columnas que satisfacen la sentencia sql*/
            while (rs.next()) {//mueve el cursor a la siguiente línea para recorrer los campos

                registro[0] = rs.getString("chapaId");
                registro[1] = rs.getString("cliente_idcliente");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("apellido");
                registro[4] = rs.getString("chasis");
                registro[5] = rs.getString("color");
                registro[6] = rs.getString("marca");
                registro[7] = rs.getString("modelo");
                registro[8] = rs.getString("ano");
                

                totalRegistro = totalRegistro + 1;
                modelo.addRow(registro);
            }

            return modelo;
        } catch (Exception ex) {
            System.out.println("sentencia"+sSql);
             JOptionPane.showMessageDialog(null,"LO SENTIMOS A OCURRIDO UN ERROR >> "+ ex+" <<");
            return null;
        }
    }
}
