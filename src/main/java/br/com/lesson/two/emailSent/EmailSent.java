package br.com.lesson.two.emailSent;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailSent
 */
@WebServlet("/emailSent")
public class EmailSent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailSent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Enumeration params = request.getParameterNames();
		while(params.hasMoreElements()) {
			String param = (String) params.nextElement();
			String value = request.getParameter(param);
			System.out.println(param + " > " + value);
			
			request.setAttribute(param, value);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("emailSent.jsp");
		dispatcher.forward(request, response);
	}

}
