package pl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Pierwszy")
public class Pierwszy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String ksywa = request.getParameter("ksywa");
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter writer =response.getWriter();
		writer.println("hello tu serwlet");
		writer.println("data i godzina; " + ZonedDateTime.now());
		writer.println("Witaj ziomek " +name+ " " + ksywa);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, String> mapPar = new HashMap<>();
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		String hobby = req.getParameter("hobby");
		String gender = req.getParameter("gender");
		
		mapPar.put("name", name);
		mapPar.put("pass", pass);
		mapPar.put("hobby", hobby);
		mapPar.put("gender", gender);
		
		
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter w = resp.getWriter();
		
		for (String key : mapPar.keySet()) {
			w.println(key);
		}	
		}

}
