package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public final class autenticacao_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      Database.Usuario usuario = null;
      synchronized (_jspx_page_context) {
        usuario = (Database.Usuario) _jspx_page_context.getAttribute("usuario", PageContext.PAGE_SCOPE);
        if (usuario == null){
          usuario = new Database.Usuario();
          _jspx_page_context.setAttribute("usuario", usuario, PageContext.PAGE_SCOPE);
        }
      }
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Catalogo de Livros</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"tudo\">\n");
      out.write("        <div id=\"topo\">\n");
      out.write("               \n");
      out.write("        <h1>\n");
      out.write("        Catalago de Livros    \n");
      out.write("          <img src=\"imagens/Banner.jpg\" alt=\"\"/>\n");
      out.write("        </h1>\n");
      out.write("        </div>\n");
      out.write("            <div id=\"principal2\">\n");
      out.write("                <h3>\n");
      out.write("                    ");

                        
                      /*armazena os valores dos parametros em variaveis*/
                    String nome = request.getParameter("nome");
                    String senha = request.getParameter("senha");
                    
                    conexao.conectar();
                    
                    usuario.setConexao(conexao.getConexao());
                    
                    int resultado = usuario.autenticar(nome, senha);
                    
                    if(resultado==1)
                    {
                        HttpSession sessao = request.getSession();
                        sessao.setAttribute("nome", usuario.getNome());
                        sessao.setAttribute("senha",usuario.getSenha());
                     
                     out.println("<h2>Autenticação realizada!!!</h2><br>");
                     out.println("<h2><a href=\"logado.jsp\"> Vamos La !!!<br></a></h2>");
                    
                    }
                    else{
                     
                     out.println("<h2>Erro! Ususario ou senha estão incorretos.</h2");
                     out.println("<a href=\"logado.jsp\"> Tente novamente.</h2></a>");
                    }
                    conexao.fechar();
                    
      out.write("\n");
      out.write("         </h3>\n");
      out.write("        </div>\n");
      out.write("                <div id=\"rodape\">\n");
      out.write("                    \n");
      out.write("        </div>\n");
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
