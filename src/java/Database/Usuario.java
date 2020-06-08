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
        this.con = con;
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
    
    private void setNome(String nome) {
        this.nome = nome;
    }
    
    private void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int inserir(String nome, String senha) {

        try{
            if(usuarioExiste(nome)) {
                return 2; //indica que existe um usuario
            }
            else {

                ps=con.prepareStatement("INSERT INTO usuario (nome, senha) VALUES(?,?);");
                //ps. setInt(1, idusuario);
                ps.setString(1, nome);
                ps.setString(2, senha);
                ps.executeUpdate();

                return 0; // indica um registo foi feito
            }
        }
        catch(Exception e) {
            e.printStackTrace();
            return 1; //indica erro na tentativa de inseção de usuario
        }
    }

    public boolean usuarioExiste(String nome){

        int qtde = 0;

        try{

            ps = con.prepareStatement("SELECT COUNT(*) AS qtde FROM usuario WHERE nome=?;");
            ps.setString(1, nome);
            rs = ps.executeQuery();

            rs.next();
            qtde=rs.getInt("qtde");

            if (qtde > 0) {
                return true;
            }
        }
        catch(Exception e){
            e.printStackTrace();
            return true;
        }

        return false;
    }

    public int autenticar (String nome, String senha) {

        int qtde = 0;

        try{

            ps = con.prepareStatement("SELECT *, COUNT(*) as qtde FROM usuario WHERE nome = ? and senha = ?;");
            ps.setString(1, nome);
            ps.setString(2, senha);
            rs = ps.executeQuery();
            rs.next();

            qtde = rs.getInt("qtde");

            if (qtde == 1) {

                setNome(rs.getString("nome"));
                setSenha(rs.getString("senha"));

                return 1;
            }

            return 0;
        }
        catch (Exception e){
            e.printStackTrace();
            return 2;
        }
    }
}