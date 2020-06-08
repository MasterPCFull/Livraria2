<%@ page import="java.sql.*"%>

<jsp:useBean id="conexao" scope="page" class="Database.Conexaobd"/>
<jsp:useBean id="Editora" scope="page" class="Database.Editora"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet" type="text/css">  
        <title>Cadastra Livro</title>
    </head>
    <body>
        <div id="tudo">
            <div id="topo">
                <h1>
                    Catalago de Livros
                    <img src="imagem/.jpg" alt=""/>
                </h1>
            </div>
            <div id="navegacao">
                <img src="imagens/" alt="">
                <a href="index.jsp"><h3>Sair da aplicação</h3></a>
            </div>
            <div id="principal" align="center">
                <h3>Cadastrar Livro</h3>

                <form action="registrar_Livros.jsp" method="post">
                    <table border="0">
                        <tr>
                            <td>Titulo:</td>
                            <td><input type="text" name="titulo"></td>
                        </tr>
                        <tr>
                            <td>Autor:</td>
                            <td><input type="text" name="autor"></td>
                        </tr>
                        <tr>
                            <td>Ano:</td>
                            <td><input type="number" name="ano"></td>
                        </tr>
                        <tr>
                            <td>Preço:</td>
                            <td><input type="text" name="preco"></td>
                        </tr>
                        <tr>
                            <td>Foto:</td>
                            <td><input type="text" name="foto"></td>
                        </tr>
                        <tr>
                            <!-- 
                            <td>id Editora:</td>
                            <td><input type="text" name="editora_ideditora"></td>
                            -->
                            <td>Escolha uma Editora:</td>
                            <td>
                                <select name="editora_ideditora" id="Editora">
                                    <% 
                                        ResultSet rs;
                                        
                                        conexao.conectar();
                                        Editora.setConexao(conexao.getConexao());
                                                                              
                                        rs = Editora.listarEditoras();
                                        
                                        out.println(rs);
                                        
                                        if (rs != null) {
                                            out.println("<option disabled>Nenhuma Editora existente</option>");
                                            while (rs.next()){
                                                out.println(
                                                    "<option value=" 
                                                    + rs.getInt("ideditora")
                                                    + ">" + rs.getString("nome")
                                                    + "</option>"
                                                );
                                            }
                                        }
                                        conexao.fechar();
                                    %>
                                </select>
                            </td>
                        </tr>
                        <tr><td colspan="2"><input type="submit" value="Cadastra"></td></tr>
                    </table>
                </form>
            </div>
            <div id="rodape">
                <!-- Pelamor de deus! -->
            </div>
        </div>
    </body>
</html>