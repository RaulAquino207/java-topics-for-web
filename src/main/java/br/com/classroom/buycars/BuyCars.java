package br.com.classroom.buycars;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.classroom.bean.Car;
import br.com.classroom.utils.BeanUtilities;

/**
 * Servlet implementation class BuyCars
 */
@WebServlet("/buyCars")
public class BuyCars extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyCars() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration params = request.getParameterNames();
		
		//first form
		//http://localhost:8080/JTW/buyCars?brand=VW&model=gol&year=2015
//		while(params.hasMoreElements()) {
//			String param = (String) params.nextElement();
//			String value = request.getParameter(param);
//			System.out.println(param + " > " + value);
//		}
//		
		//second form
		//http://localhost:8080/JTW/buyCars?brand=VW&model=gol&year=2015
//		while(params.hasMoreElements()) {
//			String param = (String) params.nextElement();
//			String[] values = request.getParameterValues(param);
//			for (int i = 0; i < values.length; i++) {
//				System.out.println(values[i]);
//			}
//		}
		
		//third form
		Car car = new Car();
		BeanUtilities.populateBean(car, request);
		
//		System.out.println("Brand : " + car.getBrand() + " Model : " + car.getModel() +  " Year : " + car.getYear());
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<h1>" + "Brand : " + car.getBrand() + "</h1>");
		out.println("<h1>" + "Model : " + car.getModel() + "</h1>");
		out.println("<h1>" + "Year : " + car.getYear() + "</h1>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
