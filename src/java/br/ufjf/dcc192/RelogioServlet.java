package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RelogioServlet", urlPatterns = {"/relogio.html"})

public class RelogioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try (PrintWriter out = resp.getWriter()) {
            resp.setContentType("text/html;charset=UTF-8");
            Date horaAtual = new Date();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Relógio </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Relógio </h1>");
            out.println("<p>");
            out.println(horaAtual.toString());
            out.println("</p>");
            out.println("<a href = 'index.html'> Início </a>");
            out.println("</body>");
            out.println("</html>");
            
        }
    }

}
