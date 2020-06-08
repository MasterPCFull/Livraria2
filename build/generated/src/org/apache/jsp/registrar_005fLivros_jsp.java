package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrar_005fLivros_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      Database.Conexaobd conexao = null;
      synchronized (_jspx_page_context) {
        conexao = (Database.Conexaobd) _jspx_page_context.getAttribute("conexao", PageContext.PAGE_SCOPE);
        if (conexao == null){
          conexao = new Database.Conexaobd();
          _jspx_page_context.setAttribute("conexao", conexao, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      Database.Livro Livro = null;
      synchronized (_jspx_page_context) {
        Livro = (Database.Livro) _jspx_page_context.getAttribute("Livro", PageContext.PAGE_SCOPE);
        if (Livro == null){
          Livro = new Database.Livro();
          _jspx_page_context.setAttribute("Livro", Livro, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>  \n");
      out.write("        <title>Registra Livros</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div id=\"tudo\">\n");
      out.write("    <div id=\"topo\">     \n");
      out.write("        <h1>\n");
      out.write("            Catalogo de Livros\n");
      out.write("            <img src=\"imagens/\" alt=\"banner de livros\"/>\n");
      out.write("        </h1>\n");
      out.write("    </div>\n");
      out.write("        <div id=\"navegacao\">\n");
      out.write("            <a href=\"logado.jsp\"><h3>Area Admnistrativa</h3></a>\n");
      out.write("            <a href=\"index.jsp\"><h3>Sair da Aplicação</h3></a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"principal\">\n");
      out.write("            ");

                /* armazena os valores dos parametros em variaveis */
             String titulo = request.getParameter("titulo");
             String autor = request.getParameter("autor");
             int ano = Integer.parseInt(request.getParameter("ano"));
             double preco = Double.parseDouble(request.getParameter("preco"));
             String foto = request.getParameter("foto");
             int editora_ideditora=Integer.parseInt(request.getParameter("editora_ideditora"));
             
             conexao.conectar();
             
             Livro.setConexao(conexao.getConexao());
             
             if(Livro.inserirLivro(titulo, autor, ano, preco, foto, editora_ideditora)){
                 out.println("<h2>Cadastro realizado com sucesso</h2>");
             }else{
                 out.println("<h2>Erro ao tentar efetuar Cadastro</h2>");
             }
             conexao.fechar();
             
      out.write("\n");
      out.write("             <a href=\"cadastra_Livro.jsp\"><h3>Voltar</h3></a><br><br>\n");
      out.write("        </div>\n");
      out.write("             <div id=\"rodape\">\n");
      out.write("                 \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write(" </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
