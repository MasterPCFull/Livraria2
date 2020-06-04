<jsp:useBean id="conexao" scope="page" class="Database.Conexaobd"/>
<jsp:useBean id="Livro" scope="page" class="Database.Livro"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>  
        <title>Atualizar Livros</title>
    </head>
    <body>
        
        <div id="tudo">
    <div id="topo">     
        <h1>
            Catalogo de Livros
            <img src="imagens/" alt="banner de livros"/>
        </h1>
    </div>
        <div id="navegacao">
            <a href="logado.jsp"><h3>Area Admnistrativa</h3></a>
            <a href="index.jsp"><h3>Sair da Aplicação</h3></a>
        </div>
        <div id="principal">
            <h2>Alterar Livro</h2>
            <%
                int idlivro=Integer.parseInt(request.getParameter("idlivro"));
                String titulo=request.getParameter("titulo");
                String autor=request.getParameter("autor");
                int ano= Integer.parseInt(request.getParameter("ano"));
                double preco=Double.parseDouble(request.getParameter("preco"));
                String foto=request.getParameter("foto");
                int editora_ideditora= Integer.parseInt(request.getParameter("editora_ideditora"));
                conexao.conectar();
                Livro.setConexao(conexao.getConexao());
                if(Livro.atualizarLivro(idlivro, titulo, autor, ano, preco, foto, editora_ideditora)){
                    out.println("<h2>Livro Alterado</h2>");
                  }else{
                    out.println("<h2>Erro ao tentar alterar</h2>");
                }
                conexao.fechar();
           %>
           <a href="listar_Livro.jsp"><h3>Voltar</h3></a><br><br>
        </div>
             <div id="rodape">
                 
    </div>
    </div>
    </body>
</html>
