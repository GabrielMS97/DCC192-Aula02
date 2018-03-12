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

@WebServlet(name = "TabelaPessoasServlet", urlPatterns = {"/tabela.pessoas.html"})
public class TabelaPessoasServlet extends HttpServlet {

    private List<Pessoa> pessoas;
    
    public TabelaPessoasServlet(){
        
        pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Diego Ribas", 32, "diegaoribas@fla.com"));
        pessoas.add(new Pessoa("Paolo Guerrero", 34, "acabouocao@fla.com"));
        pessoas.add(new Pessoa("Henrique Dourado", 27, "ciflador@fla.com"));
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
            out.println("<table border = 3>");
            out.println("<tr>");
                out.println("<th> Nome </td>");
                out.println("<th> Idade </td>");
                out.println("<th> E-Mail </td>");
                out.println("</tr>");
            for(Pessoa pessoa : pessoas)
            {
                out.println("<tr>");
                out.println("<td>" + pessoa.getNome() + "</td>");
                out.println("<td>" + pessoa.getIdade() + "</td>");
                out.println("<td>" + pessoa.getEmail()+ "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<a href = 'index.html'> Início </a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
