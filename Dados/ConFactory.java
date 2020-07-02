
package Dados;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConFactory {
    public java.sql.Connection getConnection(){
       try {
           return DriverManager.getConnection("jdbc:mysql://localhost/dbconsultorio","root","");
       }
       catch(SQLException excecao){
           throw new RuntimeException(excecao);
       }
 }
}