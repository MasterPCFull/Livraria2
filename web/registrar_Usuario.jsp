
<jsp:useBean id="conexao" scope="page" class="Database.Conexaobd"/>
<jsp:useBean id="usuario" scope="page" class="Database.Usuario"/>

<html>
<head>
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>  
        <title>Catalogo de Livros</title>
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
           int idusuario = Integer.parseInt(request.getParameter("idusuario"));
           String nome = request.getParameter("nome");
           String senha = request.getParameter("senha");
           
           conexao.conectar();
           
           usuario.setConexao(conexao.getConexao());
           
           int resultado = usuario.inserir(idusuario, nome, senha);
           
           if(resultado==0){
               out.println("<h2>Usuario registrado com sucesso!!!</h2>");
           
           }else if (resultado==1){
             
               out.println("<h2>Usuario ja registrado</h2>");
           
           }else{
           
               out.println("<h2>Erro ao registrar usuario</h2>");
           }
           
           conexao.fechar();
    %>
           <a href="logado.jsp">Pagina de Cadastros</a>
       </div>
           <div id="rodape">
               
   </div>
   </div>
          
</body>
</html>
