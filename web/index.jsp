<%@page import="java.util.ArrayList" %>
<%@page import="Database.ColecaoLivro" %>
<%@page import="java.sql.*" %>



<jsp:useBean id="conexao" scope="page" class="Database.Conexaobd"/>
<jsp:useBean id="Livro" scope="page" class="Database.Livro"/>        
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link  rel="stylesheet" href="css/estilo.css" type="text/css">
        <title>Catalogo de Livros</title>
    </head>
    <body>
      
        <div id="tudo">
        <div id="topo">
        <h1>
        Catalogo de Livros
        <img src="imagem/logo.jpeg" width="520" height="205" alt=""/><br>
        
        <form action="pesquisa_Livro.jsp" method="GET">
            
             Pesquise o título: <br><input type="text" name="titulo">            
            <input type="submit" value="busca"><br><br>
            
        </form> 
       
        
        </h1>
        </div>
        <div id="navegacao">
            <form action="autenticacao.jsp" method="post">
                
                
                <table>
                    <tr>
                    <img src="imagem/" alt=""/>
                    
                    
                    <th colspan="2">Autenticar<br></th><tr>
                    <tr><td>Usuario</td></tr>
                    <tr><td><input type="text" name="nome"><br></td></tr>
                    <tr><td>Senha</td></tr>
                    <tr><td><input type="password" name="senha"><br></td></tr>
                    <tr><th colspan="2"><input type="submit" value="Entra"<br></th><tr><br>
                  <tr><th><a href="cadastra_Usuario.html">Cadastrar contato</a></th></tr> <br>
                  
                </table>
                </form>
        </div>
        <div id="principal">
            <h3>Livros Cadastrados no Catalogo</h3>
            <table border="0">
                <tr>
                    <td><img src="imagem/img2.jpg" width="200" height="150" alt=""/></td>
                
                    <td>
                        Nome:Java como Programa 8 ED<br>
                        Autor:Deitel<br>
                        Ano:2010<br>Valor:328,99<br>Editora:Abril
                </td>
                </tr>
                <tr>
                    <td> <img src="imagem/img1.jpg" width="200" height="150" alt=""/></td>
               
                    <td>
                        Nome:Senhor dos Aneis:A sociedade do Anel <br>
                        Autor:J. R. R. Tolkien <br>
                        Ano:1949<br>Valor:55,00<br>Editora:Veja
                </td>
                
            </table>
        </div>
            <div id="rodape">
            </div>
        </div>
                 
</body>
</html>
