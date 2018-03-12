package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListaPessoasServlet", urlPatterns = {"/pessoas.html"})
public class ListaPessoasServlet extends HttpServlet {

    private List<String> pessoas;
    
    public ListaPessoasServlet(){
        pessoas = new ArrayList<String>();
        pessoas.add("Diego");
        pessoas.add("Guerrero");
        pessoas.add("Juan");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try (PrintWriter out = resp.getWriter()) {
            resp.setContentType("text/html;charset=UTF-8");
            Date horaAtual = new Date();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Pessoas </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Pessoas </h1>");
            out.println("<ul>");
            for(String pessoa : pessoas)
            {
                out.println("<li>" + pessoa + "</li>");
            }
            out.println("</ul>");
            out.println("<a href = 'index.html'> Início </a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
