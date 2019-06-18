/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import bean.vpoliza;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;

/**
 *
 * @author ALUMNO
 */
public class fpoliza {

    private Coneccion mysql = new Coneccion();
    //Se crea una instancia "mysql" del tipo Conecion.
    private Connection cn = mysql.conectar();
    /*Se crea un objeto "cn" del tipo Connection en el cual se almacena
    los valores devueltos por el método "mysql.conectar"*/
    private String sSql;
    public int totalRegistro;
   public String nuevaFecha;
public Date fecha_inicio;
public String monto_cuota;
public String cuotas;
public int poliza_idpoliza;
public int c=0;
public int idcuota=0;
DecimalFormat formatea = new DecimalFormat("###,###.##");

   
    public DefaultTableModel mostrartodos(String buscar) {
        DefaultTableModel modelo;

        
        String[] titulos = {"IDpoliza","monto_total","fecha_inicio", "fecha_venc ", "idvehiculo", "Chapa", "Marca", "Modelo","Nombre", "Apellido","iddetalle_cuota"};
        String[] registro = new String[11];
        totalRegistro = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSql = "SELECT idpoliza,monto_total,fecha_inicio,po.fecha_venc,po.cliente_vehiculo_chapaId, cv.chapaId,\n" +
"cv.marca,cv.modelo, cl.nombre,cl.apellido,dc.idcuota FROM poliza po\n" +
"inner join cliente_vehiculo cv on (po.cliente_vehiculo_chapaId=cv.chapaId)\n" +
"INNER JOIN cliente cl ON cv.cliente_idcliente = cl.idcliente\n" +
"INNER JOIN cuota dc on po.idpoliza= dc.poliza_idpoliza\n" +
" where  (cl.nombre like '%"+ buscar +"%' or cl.apellido like '%" + buscar + "%' \n" +
" or cv.chapaid like '%" + buscar + "%' or cl.ci like '%" + buscar + "%')\n" +
" group by po.idpoliza\n" +
" order by idpoliza asc;";
        //System.out.println("ssql en usuario="+sSql);
        try {
            System.out.println("sql mostrar todos"+sSql);
            Statement st = cn.createStatement();
            //Se crea un objeto "st" de tipo Statement para procesar la consulta sql

            ResultSet rs = st.executeQuery(sSql);
            /*se crea un objeto "rs" de tipo ResultSet que contiene todas 
            las filas y columnas que satisfacen la sentencia sql*/
            while (rs.next()) {//mueve el cursor a la siguiente línea para recorrer los campos
                registro[0] = rs.getString("idpoliza");
                registro[1] = formatea.format(rs.getInt("monto_total"));
                registro[2] = rs.getString("fecha_inicio");
                registro[3] = rs.getString("fecha_venc");
                registro[4] = rs.getString("cliente_vehiculo_chapaId");
                registro[5] = rs.getString("chapaId");
                registro[6] = rs.getString("marca");
                registro[7] = rs.getString("modelo");
                registro[8] = rs.getString("nombre");
                registro[9] = rs.getString("apellido");
                registro[10] = rs.getString("idcuota");
                

                totalRegistro = totalRegistro + 1;
                modelo.addRow(registro);
            }

            return modelo;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "LO SENTIMOS HA OCURRIDO UN ERROR >> " + ex + " <<");
            return null;
        }
    }
     public DefaultTableModel mostrar_detalle(String txtbuscar) {
        DefaultTableModel modelo;

        
        String[] titulos = {"IDcuota","MONTO CUOTA","VENCIMIENTO", "ESTADO ", "IDPOLIZA"};
        String[] registro = new String[5];
        totalRegistro = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSql = " SELECT idcuota,monto,fecha_venc,estado,poliza_idpoliza FROM cuota"
                + " where  poliza_idpoliza = '" + txtbuscar + "'"
                + "order by idcuota desc;";
        //System.out.println("ssql en usuario="+sSql);
        try {
            Statement st = cn.createStatement();
            //Se crea un objeto "st" de tipo Statement para procesar la consulta sql

            ResultSet rs = st.executeQuery(sSql);
            /*se crea un objeto "rs" de tipo ResultSet que contiene todas 
            las filas y columnas que satisfacen la sentencia sql*/
            while (rs.next()) {//mueve el cursor a la siguiente línea para recorrer los campos
                registro[0] = rs.getString("idcuota");
                registro[1] = formatea.format(rs.getInt("monto"));
                registro[2] = rs.getString("fecha_venc");
                registro[3] = rs.getString("estado");
                registro[4] = rs.getString("poliza_idpoliza"); 
              
                

                totalRegistro = totalRegistro + 1;
                modelo.addRow(registro);
            }

            return modelo;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "LO SENTIMOS HA OCURRIDO UN ERROR >> " + ex + " <<");
            return null;
        }
    }
    public void cantidad_cuotas() {
               
        
        String[] registro = new String[10];
        
       

        sSql = " SELECT datediff(fecha_inicio,fecha_venc) as cuotas FROM poliza order by idpoliza desc limit 1;";
        //System.out.println("ssql en usuario="+sSql);
        try {
            Statement st = cn.createStatement();
            //Se crea un objeto "st" de tipo Statement para procesar la consulta sql

            ResultSet rs = st.executeQuery(sSql);
            /*se crea un objeto "rs" de tipo ResultSet que contiene todas 
            las filas y columnas que satisfacen la sentencia sql*/
            while (rs.next()) {//mueve el cursor a la siguiente línea para recorrer los campos
                registro[0] = rs.getString("cuotas");
           

              
            }

           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "LO SENTIMOS HA OCURRIDO UN ERROR >> " + ex + " <<");
           
        }
    }

    public boolean insertar(vpoliza dts) {
/*
         public int idpoliza;
    public int monto_total;
    
    public Date fecha_inicio;
    public Date fecha_venc;
    public int cliente_vehiculo_cliente_idcliente1;*/
        sSql = "INSERT INTO poliza\n"
                + "(monto_total,fecha_inicio, fecha_venc, cliente_vehiculo_chapaId) \n"
                + "VALUES\n"
                + "(?,?,?,?);";
        try {
            PreparedStatement pst = cn.prepareStatement(sSql);
            /*Se crea un objeto pst del tipo PreparedStatement (prepara la consulta sql)
            para insertar los datos en la base de datos mediante insert into*/
            pst.setInt(1, dts.getMonto_total());
            pst.setDate(2, dts.getFecha_inicio());
            pst.setDate(3, dts.getFecha_venc());
            
            pst.setString(4, dts.getCliente_vehiculo_chapaId());
           
            int n = pst.executeUpdate();
           
            if (n != 0) {
                return true;
            }
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "LO SENTIMOS HA OCURRIDO UN ERROR >> " + ex + " <<");
            return false;
        }
    }

    public boolean editar(vpoliza dts) {
        sSql = "UPDATE poliza SET monto_total = ?,fecha_inicio = ?,fecha_venc = ?,cliente_vehiculo_chapaId = ? "
                + " WHERE idpoliza = ? ";
        try {
            PreparedStatement pst = cn.prepareStatement(sSql);
           System.out.println("sentencia update"+sSql);
           
            pst.setInt(1, dts.getMonto_total());
            pst.setDate(2, dts.getFecha_inicio());
            pst.setDate(3, dts.getFecha_venc());
            pst.setString(4, dts.getCliente_vehiculo_chapaId());
            
            pst.setInt(5, dts.getIdpoliza());

            int n = pst.executeUpdate();
            
            if (n != 0) {
                return true;
            }
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("sentencia update"+sSql);
            JOptionPane.showMessageDialog(null, "LO SENTIMOS HA OCURRIDO UN ERROR >> " + ex + " <<");
            return false;
        }
    }
    public void conseguirdatos(){
        System.out.println("ssql en conseguir datos=");
      String[] registro = new String[2];
           Date[] registro1= new Date[1];
     
//SE calcula las cuotas usando timestampdiff y se divide el monto total con la cantidad para obtener las cuotas
        sSql = "select timestampdiff(month,fecha_inicio,fecha_venc) as cuotas,\n" +
" round((monto_total/timestampdiff(month,fecha_inicio,fecha_venc)),0) as monto_cuota, fecha_inicio FROM poliza order by idpoliza desc limit 1;";
        System.out.println("ssql en conseguir datos="+sSql);
        try {
            Statement st = cn.createStatement();
            //Se crea un objeto "st" de tipo Statement para procesar la consulta sql

            ResultSet rs = st.executeQuery(sSql);
            /*se crea un objeto "rs" de tipo ResultSet que contiene todas 
            las filas y columnas que satisfacen la sentencia sql*/
            while (rs.next()) {//mueve el cursor a la siguiente línea para recorrer los campos
                
                cuotas = rs.getString("cuotas");
                System.out.println("cuoootaaas puuta"+cuotas);
                monto_cuota=rs.getString("monto_cuota");  
                fecha_inicio=rs.getDate("fecha_inicio"); 
            }//fin while

          
    }   catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return;
        }
                
    }
    
//      public int conseguirdatos_paraactualizar(int dts1){
//        
//      
//     
////SE calcula las cuotas usando timestampdiff y se divide el monto total con la cantidad para obtener las cuotas
//        sSql = "select iddetalle_cuota FROM detalle_cuota\n" +
//" where poliza_idpoliza= '"+dts1+"'\n" +
//" order by iddetalle_cuota asc limit 1;";
//        System.out.println("ssql en conseguir datos="+sSql);
//        try {
//            Statement st = cn.createStatement();
//            //Se crea un objeto "st" de tipo Statement para procesar la consulta sql
//
//            ResultSet rs = st.executeQuery(sSql);
//            /*se crea un objeto "rs" de tipo ResultSet que contiene todas 
//            las filas y columnas que satisfacen la sentencia sql*/
//            while (rs.next()) {//mueve el cursor a la siguiente línea para recorrer los campos
//                
//                iddetalle_cuota = Integer.parseInt(rs.getString("iddetalle_cuota"));
//                 
//            }//fin while
//
//          
//    }   catch (Exception e) {
//            JOptionPane.showMessageDialog(null,e);
//            return 0;
//        }
//           return iddetalle_cuota;
//    }
    
     public int obtenermaximoidpago(){
   
    sSql = "select  max(idpoliza) as id from poliza limit 1" ;
    try { 
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            while(rs.next()){
            poliza_idpoliza=Integer.parseInt(rs.getString("id"));
           
            } 
            return poliza_idpoliza+1;      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return 0;  
        } 
    }
     //boolean estado;
    public boolean insertar_detalle(vpoliza dts1){ 
       conseguirdatos();
       c=1;

           System.out.println("entro en insertar detalle");
                while (c<=Integer.parseInt(cuotas)) {//mueve el cursor a la siguiente línea para recorrer los campos
                sSql = "insert into cuota(monto, fecha_venc,poliza_idpoliza) values (?,?,?)";
                    System.out.println("sentencia sql entro en while"+sSql);
                    System.out.println("cuotas"+c);
        try {
            System.out.println("entro en try insertar detalle");
            Calendar cal = Calendar.getInstance(); 
                 cal.setTime(fecha_inicio);
                 //Sumar c a la fecha de inicio
                 cal.add(Calendar.MONTH, c);
                  nuevaFecha = cal.getTime()+"";
                 
                 
            PreparedStatement pst = cn.prepareStatement(sSql);
            pst.setDouble(1,Double.parseDouble(monto_cuota));
               Calendar  calx;
           int d,m,a;
           d=cal.get(Calendar.DAY_OF_MONTH);
             m=cal.get(Calendar.MONTH);
             a=cal.get(Calendar.YEAR)-1900;
            pst.setDate(2, new Date(a,m,d));
            pst.setInt(3, dts1.getPoliza_idpoliza());
            c=c+1;
            System.out.println("monto cuota"+monto_cuota);
            System.out.println("cuota numero"+c);
            System.out.println("fecha vencimiento"+new Date(a,m,d));
             int n = pst.executeUpdate();    
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Errorxxxx: "+e);
           return false;
        } 
           
} 
        
        
        return false;
        
    }
    
     public boolean actualizar_detalle(vpoliza dts1){ 
        
         conseguirdatos();
         
       c=1;
 int detalle= dts1.getPoliza_idpoliza();
           System.out.println("entro en update detalle");
                while (c<=Integer.parseInt(cuotas)) {//mueve el cursor a la siguiente línea para recorrer los campos
                sSql = " Update cuota set monto=?, fecha_venc=? where idcuota=?";
                    System.out.println("sentencia sql entro en while"+sSql);
                    System.out.println("cuotas"+c);
        try {
            System.out.println("entro en try update detalle");
            Calendar cal = Calendar.getInstance(); 
                 cal.setTime(fecha_inicio);
                 //Sumar c a la fecha de inicio
                 cal.add(Calendar.MONTH, c);
                  nuevaFecha = cal.getTime()+"";
                 
                 
            PreparedStatement pst = cn.prepareStatement(sSql);
            pst.setDouble(1,Double.parseDouble(monto_cuota));
               Calendar  calx;
           int d,m,a;
           d=cal.get(Calendar.DAY_OF_MONTH);
             m=cal.get(Calendar.MONTH);
             a=cal.get(Calendar.YEAR)-1900;
            pst.setDate(2, new Date(a,m,d));
            pst.setInt(3, detalle);
            
            System.out.println("monto_cuota"+monto_cuota);
            System.out.println("fecha_venci"+ new Date(a, m, d));
            System.out.println("idcuota"+idcuota);
           
            c=c+1;
            detalle= detalle+1;
             int n = pst.executeUpdate();    
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ErrorUpdate: "+e);
           return false;
        } 
           
} 
        
        
        return false;
        
    }
}

       
     
/**/
