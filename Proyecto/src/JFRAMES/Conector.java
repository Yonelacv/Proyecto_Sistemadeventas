package JFRAMES;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conector {private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String clave="";
    private static final String url="jdbc:mysql://localhost:3306/SISTEMA";
  
    public java.sql.Connection Conectar() {
        try{
            Class.forName(driver);
            java.sql.Connection xcon = DriverManager.getConnection(url, user, clave);
            return xcon;
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
       return null;                            
}
    
}
