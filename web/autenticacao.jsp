<jsp:useBean id="conexao" scope="page" class="Database.Conexaobd"/>
<jsp:useBean id="usuario" scope="page" class="Database.Usuario"/>    
<%@page import="javax.servlet.http.*"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <title>Catalogo de Livros</title>
    </head>
    <body>
        <%@ page import="javax.servlet.http.*" %>
        <div id="tudo">
        <div id="topo">
             
            <h1>
            Catalago de Livros    
            </h1>
        </div>
        <div id="principal2">
            <h3>
               
        <%
            /*armazena os valores dos parametros em variaveis*/

            String nome = request.getParameter("nome");
            String senha = request.getParameter("senha");

            conexao.conectar();
            usuario.setConexao(conexao.getConexao());

            int resultado = usuario.autenticar(nome, senha);
            HttpSession sessao = request.getSession();

            if (resultado == 1)
            {                
                sessao.setAttribute("nome", usuario.getNome());
                sessao.setAttribute("senha", usuario.getSenha());

                out.println("<h2>Vamos começar?</h2>");
                out.println("<a href=\"logado.jsp\">Começar!</a>");
            }
            else if (resultado == 0) {
                out.println("<h2>Erro usuario ou senha nao confere.</h2>");
                out.println("<a href=\"index.jsp\"><h2>Tente novamente</h2></a>");
            }
            else if (resultado == 2) {
                out.println("<h2>Falha na conexão com o banco.</h2>");
                out.println("<a href=\"index.jsp\"><h2>Tente novamente</h2></a>");
            }

            conexao.fechar();
        %>
        
         </h3>
                       
        </div>
                <div id="rodape">
                    
        </div>
        </div>
                 
</body>
</html>