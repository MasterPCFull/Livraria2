package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Database.ColecaoLivro;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("        \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link  rel=\"stylesheet\" href=\"css/estilo.css\" type=\"text/css\">\n");
      out.write("        <title>Catalogo de Livros</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"tudo\">\n");
      out.write("        <div id=\"topo\">\n");
      out.write("        <h1>\n");
      out.write("        Catalogo de Livros\n");
      out.write("        <img src=\".../imagem/logo.png\" alt=\"\">\n");
      out.write("    \n");
      out.write("        </h1>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navegacao\">\n");
      out.write("            <form action=\"autenticacao.jsp\" method=\"post\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                    <img src=\"imagem/\" alt=\"\"/>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <th >Autenticar<br></th><tr>\n");
      out.write("                    <tr><td>Usuario</td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"nome\"><br></td></tr>\n");
      out.write("                    <tr><td>Senha</td></tr>\n");
      out.write("                    <tr><td><input type=\"password\" name=\"senha\"><br></td></tr>\n");
      out.write("                  <tr><th><input type=\"submit\" value=\"Entra\"<br></th><tr>\n");
      out.write("                </table>\n");
      out.write("                </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"principal\">\n");
      out.write("            <h3>Livros Cadastrados no Catalogo</h3>\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><img src=\"imagem/logo.jpg\" alt=\"\"></td>\n");
      out.write("                    <td>\n");
      out.write("                        Java como Programa 8 ED<br>\n");
      out.write("                        Deitel<br>\n");
      out.write("                        2010<br>328,99<br>Prentice Hall\n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><img src=\"imagens/\" alt=\"\"/></td>\n");
      out.write("                    <td>\n");
      out.write("                        O Jardim Secreto-Col.Reencontro Infantil<br>\n");
      out.write("                        Brunett,Frances Hodgson<br>\n");
      out.write("                        2010<br>55,00<br>Scipione\n");
      out.write("                </td>\n");
      out.write("                <tr>\n");
      out.write("                    <td><img scr=\"imagens/\" alt=\"\"/></td>\n");
      out.write("                    <td>\n");
      out.write("                        Um Romance Grego<br>\n");
      out.write("                        Tvette Manessis Corporon<br>\n");
      out.write("                        2012<br>66,00<br>Rocco\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("            <div id=\"rodape\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                 \n");
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
