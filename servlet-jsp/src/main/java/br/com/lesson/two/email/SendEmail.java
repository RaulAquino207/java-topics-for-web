package br.com.lesson.two.email;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.classroom.utils.BeanUtilities;
import br.com.lesson.two.bean.Email;

/**
 * Servlet implementation class SendEmail
 */
@WebServlet("/sendEmail")
public class SendEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("sendEmail.jsp");
		dispatcher.forward(request, response);
	}
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	System.out.println("saving data");
    	
		String fullName = request.getParameter("fullName");
		String email = request.getParameter("email");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		Email emailInformation = new Email();
		BeanUtilities.populateBean(emailInformation, request);
		
		System.out.println("FullName : " + emailInformation.getFullName() + " Email : " + emailInformation.getEmail() +  " Subject : " + emailInformation.getSubject() +  "Content : " + emailInformation.getContent());
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<h1>" + "Full Name : " + emailInformation.getFullName() + "</h1>");
//		out.println("<h1>" + "Email : " + emailInformation.getEmail() + "</h1>");
//		out.println("<h1>" + "Subject : " + emailInformation.getSubject() + "</h1>");
//		out.println("<h1>" + "Content : " + emailInformation.getContent() + "</h1>");
//		out.println("</html>");
		
		response.sendRedirect("emailSent?fullName=" + emailInformation.getFullName() + "&email=" + emailInformation.getEmail() + "&subject=" + emailInformation.getSubject() + "&content=" + emailInformation.getContent());
	}

}
