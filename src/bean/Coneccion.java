package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Coneccion {
    public String db="siscon_og"; 
 public String url ="jdbc:mysql://127.0.0.1/"+db;
 public String user = "root";
 public String pas="";

    public Coneccion() {        
    }
    
    public Connection conectar() {
        
            Connection link=null;
            
        try {
            
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url, this.user, this.pas);
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return link;
    }
    public PreparedStatement prepareStatement(String sql){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
