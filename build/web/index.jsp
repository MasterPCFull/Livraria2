
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
        <img src=".../imagem/logo.png" alt="">
    
        </h1>
        </div>
        <div id="navegacao">
            <form action="autenticacao.jsp" method="post">
                
                
                <table>
                    <tr>
                    <img src="imagem/" alt=""/>
                    
                    
                    <th >Autenticar<br></th><tr>
                    <tr><td>Usuario</td></tr>
                    <tr><td><input type="text" name="nome"><br></td></tr>
                    <tr><td>Senha</td></tr>
                    <tr><td><input type="password" name="senha"><br></td></tr>
                  <tr><th><input type="submit" value="Entra"<br></th><tr>
                </table>
                </form>
        </div>
        <div id="principal">
            <h3>Livros Cadastrados no Catalogo</h3>
            <table border="0">
                <tr>
                    <td><img src="imagem/logo.jpg" alt=""></td>
                    <td>
                        Java como Programa 8 ED<br>
                        Deitel<br>
                        2010<br>328,99<br>Prentice Hall
                </td>
                </tr>
                <tr>
                    <td><img src="imagens/" alt=""/></td>
                    <td>
                        O Jardim Secreto-Col.Reencontro Infantil<br>
                        Brunett,Frances Hodgson<br>
                        2010<br>55,00<br>Scipione
                </td>
                <tr>
                    <td><img scr="imagens/" alt=""/></td>
                    <td>
                        Um Romance Grego<br>
                        Tvette Manessis Corporon<br>
                        2012<br>66,00<br>Rocco
                    </td>
                </tr>
            </table>
        </div>
            <div id="rodape">
            </div>
        </div>
                 
</body>
</html>
