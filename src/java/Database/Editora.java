
package Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Editora {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    //int ideditora
    String nome;
    String cidade;
    public void setConexao(Connection con){
    this.con=con;
    }
    public int gerarId(){
        String novoId;
        try{
            ps= con.prepareStatement("SELECT MAX(ideditora) as novoid FROM editora");
            rs=ps.executeQuery();
            rs.next();
            novoId=rs.getString("novoid");
            if(novoId==null){
                return 1;
            }else{
            return Integer.parseInt(novoId)+1;
                 }
        }catch (Exception e){
            e.printStackTrace();
            return 0;
   }
   }
public boolean inserirEditora(String nome, String cidade){
 try{
     int ideditora=gerarId();
     ps=con.prepareStatement("INSERT INTO editora VALUES(?,?,?)");
     ps.setInt(1,ideditora);
     ps.setString(2,nome);
     ps.setString(3,cidade);
     ps.executeUpdate();
     return true;
 } catch(Exception e){
     e.printStackTrace();
     return false;
}   
}
}
    

