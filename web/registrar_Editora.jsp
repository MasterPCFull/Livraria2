<jsp:useBean id="conexao" scope="page" class="Database.Conexaobd"/>
<jsp:useBean id="editora" scope="page" class="Database.Editora"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>  
        <title>Registra Livros</title>
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
        /* armazena os valores dos parametros em variaveis */
        String nome=request.getParameter("nome");
        String cidade=request.getParameter("cidade");
        conexao.conectar();
        editora.setConexao(conexao.getConexao());
        if(editora.inserirEditora(nome, cidade)){
            out.println("<h2>Editora cadastrada com sucesso</h2>");
        }else{
            out.println("<h2>Erro ao tentar efetuar Cadastro</h2>");
        }
        conexao.fechar();
        %>
        <a href="logado.jsp"><h3>Voltar</h3></a><br><br>
        </div>
             <div id="rodape">
                 
    </div>
    </div>
               
</body>
</html>
