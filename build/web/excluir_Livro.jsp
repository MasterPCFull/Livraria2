<jsp:useBean id="conexao" scope="page" class="Database.Conexaobd"/>
<jsp:useBean id="Livro" scope="page" class="Database.Livro"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="css/estilo.css" rel="stylesheet" type="text/css"/>  
        <title>Excluir Livro</title>
        
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
       
            <%
                int idlivro=Integer.parseInt(request.getParameter("idlivro"));
                conexao.conectar();
                Livro.setConexao(conexao.getConexao());
                if(Livro.excluirLivro(idlivro)){
                    out.println("<h2>Livro excluido com sucesso!</h2>");
                }else{
                    out.println("<h2>Erro ao tentar excluir</h2>");
                }
                conexao.fechar();
                %>
                <a href="listar_Livro.jsp"><h3>Voltar</h3></a><br>
        </div>
                <div id="rodape">
                    
                </div>
         </div>
                
          
    </body>
</html>
