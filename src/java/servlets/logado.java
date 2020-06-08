package servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import Database.*;


public class logado extends HttpServlet {

public void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{
        PrintWriter out;
        resp.setContentType("text/html");
        out = resp.getWriter();
        long lastAccessedTime, submitTime,intervalTime;
        HttpSession sessao = req.getSession();
        lastAccessedTime = sessao.getLastAccessedTime();
        submitTime=System.currentTimeMillis();
        intervalTime=(submitTime-lastAccessedTime)/1000;
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Catalogo De livros</title>");
        out.print("</head>");
        if(intervalTime>120){
            out.print("<p>Que pena!" + "sessao encerrado!</p>");
        }
        out.print("<a href=\"index.jsp\">Efetuar Login</a>");
        out.print("<br>");
        out.print("<a href=\"logado\">sair</a>");
        out.print("</body>");
        out.print("</html>");
        }
public void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{
        PrintWriter out;
        out=resp.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Catalogo De livros</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<p>Sessão Encerrada </p>");
        out.print("</body>");
        out.print("</html>");
        HttpSession sessao = req.getSession();
        sessao.invalidate();
}
}
