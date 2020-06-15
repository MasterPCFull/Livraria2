<%@ page import="java.sql.*"%>
<jsp:useBean id="conexao" scope="page" class="Database.Conexaobd"/>
<jsp:useBean id="Livro" scope="page" class="Database.Livro"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>  
   
</head>

<body>
        
    <div id="tudo">
    <div id="topo">     
        <h1>
            Catalogo de Livros
            <img src="imagens/" alt=""/>
        </h1>
    </div>
        <div id="navegacao">
        </div>
        <div id="principal">
           
            
            
            <%
                 
                
                int idLivro = Integer.parseInt(request.getParameter("id"));
                String titulo = request.getParameter("titulo");
                String autor = request.getParameter("autor");
                int ano = Integer.parseInt(request.getParameter("ano"));
                double preco = Double.parseDouble(request.getParameter("preco"));
                String foto = request.getParameter("foto");
                int editora_ideditora = Integer.parseInt(request.getParameter("editora_ideditora"));
               
                conexao.conectar();
                Livro.setConexao(conexao.getConexao());
                

                if(Livro.atualizar(idLivro, titulo, autor, ano, preco, foto, editora_ideditora))
                    out.println("<h2>Alteraçao realizado com sucesso</h2>");
                
                else {
                    out.println("<h2>Erro ao tentar alterar</h2>");
                }
                
           %>
           <a href="listar_Livro.jsp"><h3>Voltar</h3></a><br><br>
        </div>
             <div id="rodape">
                 
    </div>
    </div>
    </body>
</html>
