package serwlety;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kalkulator.LogikaKalkulatora;

@WebServlet("/Kalkulator")
public class Kalkulator extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	 String parametrX = request.getParameter("x");
   	 String parametrY = request.getParameter("y");
   	 String operacja = request.getParameter("operacja");
   	 
   	 response.setContentType("text/html");
   	 response.setCharacterEncoding("utf-8");
   	 PrintWriter out = response.getWriter();
   	 
   	 out.println("<!DOCTYPE html>");
   	 out.println("<html><head>");
   	 out.println("<link rel='stylesheet' type='text/css' href='style.css'>");
   	 out.println("<title>Kalkulator</title>");
   	 out.println("</head><body>");
   	 out.println("<h1>Kalkulator</h1>");

   	 out.println("<p>Wpisz dwie liczby:</p>");
   	 out.println("<form>");
   	 out.println("<input type='text' name='x' value='" + (parametrX == null ? "" : parametrX) + "'>");
   	 out.println("<select name='operacja'>");
   	 out.println("<option value='+'>+</option>");
   	 out.println("<option value='-'>-</option>");
   	 out.println("<option value='*'>*</option>");
   	 out.println("<option value='/'>/</option>");
   	 out.println("</select>");
   	 out.println("<input type='text' name='y' value='" + (parametrY == null ? "" : parametrY) + "'>");
   	 out.println("<button>Oblicz</button>");
   	 out.println("</form>");
   	 if(parametrX!=null&& parametrY != null&& !parametrX.isEmpty() && !parametrY.isEmpty()) {
   	 try {
		double x = Double.parseDouble(parametrX);
		 double y = Double.parseDouble(parametrY);
		 double wynik = LogikaKalkulatora.oblicz(x, y, operacja);
		 
		 out.println("<p> Wynik: <strong>");   	
		 out.println(wynik);
		 out.println("</p>");
	} catch (NumberFormatException e) {
		 out.println("<p class='error'>Niepoprawny format liczby.</p>");
	}
   	 
   	 }
   	 // TODO oblicz wynik i wypisz na stronie ,np. za pomocą <p>
   	 
   	 out.println("</body>");
   	 out.println("</html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	 doGet(request, response);
    }

}



