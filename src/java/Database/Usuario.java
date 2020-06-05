package Database;

import java.sql.*;

public class Usuario {

private Connection con;
private PreparedStatement ps;
private ResultSet rs;        
private int idusuario;
private String nome;
private String senha;

public void setConexao(Connection con){
    this.con=con;
}
public boolean usuarioExiste(int idusuario){
    int qtde;
try{
    ps = con.prepareStatement("SELECT COUNT(*) as qtde FROM usuario" + "WHERE idusuario=?");
    ps.setInt(1, idusuario);
    rs = ps.executeQuery();
    rs.next();
    qtde=rs.getInt("qtde");
    
    if (qtde == 0)
    return false;
   else
   return true;

}
catch(Exception e){
    
    e.printStackTrace();
    return false;
}    
}
public int inserir(int idusuario, String nome, String senha){
    try{
        if(usuarioExiste(idusuario)){
            return 1; //indica que existe um usuario
    }
   else
   {
   ps=con.prepareStatement("INSERT INTO usuario VALUES(?, ?, ?)");
   ps. setInt(1, idusuario);
   ps.setString(2, nome);
   ps.setString(3, senha);
   ps.executeUpdate();
   return 0;// indica um registo foi feito
}
}
    catch(Exception e)
    {
    e.printStackTrace();
    return -1;//indica erro na tentativa de inseção de usuario
}
}
public int autenticar (String nome, String senha){
    int qtde;
try{
    ps=con.prepareStatement("SELECT *, COUNT(*) as qtde FROM usuario" + "Where nome=? and senha=?");
    ps.setString(1, nome);
    ps.setString(2, senha);
    rs=ps.executeQuery();
    rs.next();
    
    qtde=rs.getInt("qtde");
    
    if (qtde==1)
    {
    this.nome=rs.getString("nome");
    this.senha=rs.getString("senha");
    }
    return qtde;
}

catch (Exception e){
 e.printStackTrace();
    return -1;
}
}
public int getIdusuario(){
    return idusuario;
}
public String getNome(){
    return nome;
}
public String getSenha(){
    return senha;
}
}


