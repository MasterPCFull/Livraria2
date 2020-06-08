<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>  
        <title>Alterar Cadastro de Livros</title>
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
            <h2>Alterar Livro</h2>
            <%
                String idlivro=request.getParameter("idlivro");
                String titulo=request.getParameter("titulo");
                String autor=request.getParameter("autor");
                String ano=request.getParameter("ano");
                String preco=request.getParameter("preco");
                String foto=request.getParameter("foto");
                String editora_ideditora=request.getParameter("editora_ideditora");
            %>
            <form action="atualizar_Livro" method="post">
                <table border="0px" align="center">
                    <tr>
                        <td>Id Livro:</td><td><input type="text" name="idlivro" value="<%=idlivro%>"></td></tr>
                    <tr>
                        <td>Titulo:</td><td><input type="text" name="titulo" value="<%=titulo%>"></td></tr>
                    <tr>
                        <td>Autor:</td><td><input type="text" name="autor" value="<%=autor%>"></td></tr>
                    <tr>
                        <td>Ano:</td><td><input type="text" name="ano" value="<%=ano%>"></td></tr>
                    <tr>
                        <td>Preco:</td><td><input type="text" name="preco" value="<%=preco%>"></td></tr>
                    <tr>
                        <td>Foto:</td><td><input type="text" name="foto" value="<%=foto%>"></td></tr>
                    <tr>
                        <td>Id Editora:</td><td><input type="text" name="editora_ideditora" value="<%=editora_ideditora%>"></td></tr>
                    <tr>
                    <td colspan="2"><input type="submit" value="Atualizar"></td></tr>
                </table><br>
            </form>
        </div>
                    <div id="rodape">
                        
        </div>
        </div>
                    
                
    </body>
</html>
