package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class listar_005fLivro_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
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
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>  \n");
      out.write("        <title>Lista de Livros</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div id=\"tudo\">\n");
      out.write("    <div id=\"topo\"> \n");
      out.write("        \n");
      out.write("        <h1>\n");
      out.write("      Catalogo de Livros\n");
      out.write("      <img src=\"imagens/\" alt=\"banner de livros\"/>\n");
      out.write("        </h1>\n");
      out.write("    </div>\n");
      out.write("        <div id=\"principal2\">\n");
      out.write("            <h2>Livros Cadastrados</h2>\n");
      out.write("            ");
 ResultSet rs;
            conexao.conectar();
            Livro.setConexao(conexao.getConexao());
            rs=Livro.listarLivro();
        if (rs!=null){
            out.println("<table border=1px>");
            out.println("<tr><th>Titulo</th><th>Autor</th><th>Ano</th>");
            out.println("<th>Preço</th><th>Foto</th><th>Id Editora</th></tr>");       
        while (rs.next()){
            out.println("<tr>");
            out.println("<td>"+ rs.getString("titulo")+"</td>"
            +"<td>"+rs.getString("autor")+"</td>"
            +"<td>"+rs.getString("ano")+"</td>"
            +"<td>"+rs.getString("preco")+"</td>"
            +"<td>"+rs.getString("foto")+"</td>"
            +"<td>"+rs.getString("editora_ideditora")+"</td>");
            out.print("<td><a href=\"excluir_Livro.jsp?idlivro="
            +rs.getString("idlivro")+ "\">Excluir</a></td>");
            out.print("<td><a href=\"alterar_Livro.jsp?idlivro="
            +rs.getString("idlivro")
            +"&titulo="+rs.getString("titulo")
            +"&autor="+rs.getString("autor")
            +"&ano="+rs.getString("ano")
            +"&preco="+rs.getString("preco")
            +"&foto="+rs.getString("foto")
            +"&editora_ideditora="+rs.getString("editora_ideditora")
            +"\"></a></td>");
        out.print("</tr>");
        }
        out.println("</table>");
        }else{
        out.println("<h3>Erro ao lista o Livros</h3>");
        }
        conexao.fechar();
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <a href=\"logado.jsp\">Voltar</a><br><br>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"rodape\">\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
