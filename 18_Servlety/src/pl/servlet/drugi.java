package pl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class drugi
 */
@WebServlet("/drugi")
public class drugi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
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
	
	
	
}


}
