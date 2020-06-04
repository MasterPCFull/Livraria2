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
      <img src="imagens/" alt="banner de livros"/>
        </h1>
    </div>
        <div id="principal2">
            <h2>Livros Cadastrados</h2>
            <% ResultSet rs;
            conexao.conectar();
            Livro.setConexao(conexao.getConexao());
            rs=Livro.listarLivro();
        if (rs!=null){
            out.println("<table border=1px>");
            out.println("<tr><th>Titulo</th><th>Autor</th><th>Ano</th>");
            out.println("<th>Preço</th><th>Foto</th><th>Id Editora</th></tr>");       
        while (rs.next()){
            out.println("<tr>");
            out.println("<td>"+ rs.getString("titulo")+"</td>"
            +"<td>"+rs.getString("autor")+"</td>"
            +"<td>"+rs.getString("ano")+"</td>"
            +"<td>"+rs.getString("preco")+"</td>"
            +"<td>"+rs.getString("foto")+"</td>"
            +"<td>"+rs.getString("editora_ideditora")+"</td>");
            out.print("<td><a href=\"excluir_Livro.jsp?idlivro="
            +rs.getString("idlivro")+ "\">Excluir</a></td>");
            out.print("<td><a href=\"alterar_Livro.jsp?idlivro="
            +rs.getString("idlivro")
            +"&titulo="+rs.getString("titulo")
            +"&autor="+rs.getString("autor")
            +"&ano="+rs.getString("ano")
            +"&preco="+rs.getString("preco")
            +"&foto="+rs.getString("foto")
            +"&editora_ideditora="+rs.getString("editora_ideditora")
            +"\"></a></td>");
        out.print("</tr>");
        }
        out.println("</table>");
        }else{
        out.println("<h3>Erro ao lista o Livros</h3>");
        }
        conexao.fechar();
        %>
        <br>
        <a href="logado.jsp">Voltar</a><br><br>
        </div>
        <div id="rodape">
            
    </div>
    </div>
</body>
</html>
