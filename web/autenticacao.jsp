<jsp:useBean id="conexao" scope="page" class="Database.Conexaobd"/>
<jsp:useBean id="usuario" scope="page" class="Database.Usuario"/>    
<%@page import="javax.servlet.http.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <title>Catalogo de Livros</title>
    </head>
    <body>
        <div id="tudo">
        <div id="topo">
               
        <h1>
        Catalago de Livros    
          <img src="imagens/Banner.jpg" alt="">
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
                    
                    if(resultado==0)
                    {
                        HttpSession sessao = request.getSession();
                        sessao.setAttribute("nome", usuario.getNome());
                        sessao.setAttribute("senha",usuario.getSenha());
                     
                     out.println("<h2>Autenticação realizada!!!</h2><br>");
                     out.println("<h2><a href=\"logado.jsp\"> Vamos La !!!<br></a></h2>");
                    
                    }
                    else{
                     
                     out.println("<h2>Erro! Usuario ou senha estão incorretos.</h2");
                     out.println("<a href=\"index.jsp\"> Tente novamente.</h2></a>");
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
