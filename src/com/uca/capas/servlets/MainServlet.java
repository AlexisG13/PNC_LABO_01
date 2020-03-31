package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(!(username.equals("admin")&&password.equals("root"))) {
			response.setStatus(200);
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>" + "ACCESO INCORRECTO" + "</h3>");
			out.println("</body>");
			out.println("</html>");
			return;
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>" + "ACCESO CORRECTO" + "</h3>");
		out.println("</body>");
		out.println("</html>");
	}

}
