package Database;

import java.sql.*;

        
        
        public class Conexaobd {
    Connection con;
    public boolean conectar() {
        
        String url;
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        url = "jdbc:mysql://localhost/bancodaaplicacao?user=root&password=";

        con = DriverManager.getConnection(url);
        
        return true;
    } 
    catch (ClassNotFoundException | SQLException e){
      e.printStackTrace();
        return false;
      }            
    }
    public void fechar(){
        try{
            con.close();
        } 
        catch (SQLException e){
         e.printStackTrace();   
        }
        }
    public Connection getConexao(){
        return con;
    }
    }
    

