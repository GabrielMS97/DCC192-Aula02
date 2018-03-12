package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NumerosServlet", urlPatterns = {"/numeros.html", "/impares.html", "/pares.html"})

public class NumerosServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter out = resp.getWriter()) {
            resp.setContentType("text/html;charset=UTF-8");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Números </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Números de 1 a 100 </h1>");
            out.println(req.getServletPath());
            out.println("<p>");
            if (req.getServletPath().equals("numeros.html")) {
                for (int i = 0; i <= 100; i++) {
                    out.println("<p>" + i + "</p>");
                }
            } else if (req.getServletPath().equals("pares.html")) {
                for(int i = 2; i <= 100; i+=2)
                {
                    out.println("<p>" + i + "</p>");
                }
            }else if (req.getServletPath().equals("impares.html")) {
                for(int i = 1; i <= 100; i+=2)
                {
                    out.println("<p>" + i + "</p>");
                }
            }
            out.println("</p>");
            out.println("<a href = 'index.html'> Início </a>");
            out.println("</body>");
            out.println("</html>");
        }
        
    }
    
}
