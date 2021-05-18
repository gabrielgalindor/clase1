/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseorange;
import java.sql.*;

/**
 *
 * @author GOGA
 */
public class ConexionBD {
    Connection cn = null;
    boolean a1= false;
    public String us1="root";
    public String pas1="";
    public String dir="localhost";
    public Connection conexion()
    {
        
        try {
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://"+dir+"/sistema",us1,pas1);
        System.out.println("conecto");
        a1=true;
        
        } catch(Exception e){
            System.out.println(e.getMessage());
        } return cn;
      
    }
    void setUsuario(String a1)
    {
        us1=a1;
      
    }
    void setDireccionIp(String dirIp)
    {
        dir=dirIp;
    }
    
    Statement createStatement (){
        throw new UnsupportedOperationException("no soportado");
    }
    
    boolean geta1 ()
    {
        return a1;
    }
    
}
