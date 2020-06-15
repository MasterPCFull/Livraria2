<%@ page import="java.sql.*"%>
<jsp:useBean id="conexao" scope="page" class="Database.Conexaobd"/>
<jsp:useBean id="Livro" scope="page" class="Database.Livro"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>  
        <title>Lista de Livros</title>
    </head>
    <body>
    <div id="tudo">
    <div id="topo"> 
        
        <h1>
      Catalogo de Livros
      <img src="imagens/" alt=""/>
        </h1>
    </div>
        <div id="principal2">
            <h2>Resultado da pesquisa</h2>
            <% 
                HttpSession sessao = request.getSession();
                String titulo = request.getParameter("titulo");
                ResultSet rs;
                
                
            conexao.conectar();
            Livro.setConexao(conexao.getConexao());
            rs = Livro.pesquisa(titulo);
                     
            if (rs!=null){
            out.println("<table border=1px>");
            out.println("<tr><th>Titulo</th>");                
            while (rs.next()){
            out.println("<tr>");
            out.println("<td>"+ rs.getString("titulo")+"</td>"
            );
                       
        out.print("</tr>");
        }
        out.println("</table>");
        }else{
        out.println("<h3>livro nâo encontrado</h3>");
        }
        
        %>
        <br>
        <a href="index.jsp">Voltar</a><br><br>
        </div>
        <div id="rodape">
            
    </div>
    </div>
</body>
</html>