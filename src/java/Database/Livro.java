package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

public class Livro {

private Connection con; 
private PreparedStatement ps; 
private ResultSet rs;

//int idlivro; 
String titulo; 
String autor; 
int ano;
double preco; 
String foto; 
int ideditora;
public void setConexao(Connection con){
this.con = con;
}
public int gerarId(){
String novoId;
try{
ps=con.prepareStatement("SELECT MAX(idlivro) as novoid FROM livro");
rs=ps.executeQuery();
rs.next();
novoId=rs.getString("novoid");
if(novoId == null){
return 1;
}else{
return Integer.parseInt(novoId)+1;
}
}catch (Exception e){
e.printStackTrace();
return 0;
}
}
public boolean inserirLivro(String titulo, String autor, int ano, double preco, String 
foto, int editora_ideditora){
try{
int idlivro=gerarId();
ps=con.prepareStatement("INSERT INTO livro VALUES (?,?,?,?,?,?,?)");
ps.setInt(1, idlivro);
ps.setString(2, titulo);
ps.setString(3, autor);
ps.setInt(4, ano);
ps.setDouble(5, preco);
ps.setString(6, foto);
ps.setInt(7, editora_ideditora);
ps.executeUpdate();
return true;
}catch (Exception e){ 
return false;
}  
}
public boolean atualizarLivro(int idlivro, String titulo, String autor, int ano, 
double preco, String foto, int editora_ideditora){
try {
ps=con.prepareStatement("UPDATE livro SET"
+"titulo = ?,"
+"autor = ?,"
+"ano = ?,"
+"preco = ?,"
+"foto = ?,"
+"editora_ideditora=? "
+"WHERE idlivro=?"); 
ps.setString(1, titulo); 
ps.setString(2, autor);
ps.setInt(3, ano);
ps.setDouble(4, preco);
ps.setString(5, foto);
ps.setInt(6, editora_ideditora);
ps.setInt(7, idlivro); 
ps.executeUpdate();
return true;
}catch (Exception e){ 
e.printStackTrace();
return false;
}
}
public ResultSet listarLivro(){
try{
ps = con.prepareStatement("SELECT * FROM livro");
rs = ps.executeQuery();
return rs;
}catch (Exception e) {
e.printStackTrace();
return null;
} 
}
public boolean excluirLivro(int idlivro){
try{
ps=con.prepareStatement("DELETE FROM livro WHERE idlivro = ?");
ps.setInt(1, idlivro);
ps.executeUpdate();
return true;
}catch (Exception e){
e.printStackTrace();
return false;
}
}
public ArrayList listarColecao(){
ArrayList colecao = new ArrayList();
ColecaoLivro colecaoLivro;
try {
ps = con.prepareStatement("SELECT * FROM livro");
rs = ps.executeQuery();
while (rs.next()){
colecaoLivro = new ColecaoLivro(
rs.getInt("idlivro"),
rs.getString("titulo"),
rs.getString("autor"),
rs.getInt("ano"),
rs.getDouble("preco"),
rs.getString("foto"),
rs.getInt("editora_ideditora"));
colecao.add(colecaoLivro);
}
return colecao;
}catch(Exception e){
e.printStackTrace();
return null;
}
}
}