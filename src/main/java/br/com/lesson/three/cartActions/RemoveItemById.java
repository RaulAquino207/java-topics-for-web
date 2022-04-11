package br.com.lesson.three.cartActions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.lesson.three.product.Product;

/**
 * Servlet implementation class RemoveItemById
 */
@WebServlet("/removeItemById")
public class RemoveItemById extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	http://localhost:8080/JTW/removeItemById
//	http://localhost:8080/JTW/removeItemById?id=50549f1a-857f-498d-b2ca-efa2c83e0092
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration params = request.getParameterNames();
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		ArrayList<Product> cart = (ArrayList<Product>) session.getAttribute("cart");
		if(session.getAttribute("cart") == null) {
			out.print("Your shopping cart is empty");
		}
		else if(params.hasMoreElements() == false) {
			out.println("You can remove these items");
			for (int iterator = 0; iterator < cart.size(); iterator++) {
				out.println("ID : " + cart.get(iterator).getId() + " Name : " + cart.get(iterator).getName());
			}
		}
		while(params.hasMoreElements()) {
			String param = (String) params.nextElement();
			String value = request.getParameter(param);
			out.println("There are still these items left");
			for (int iterator = 0; iterator < cart.size(); iterator++) {
				System.out.println(value + " " + cart.get(iterator).getId());
				if(value.equals(cart.get(iterator).getId())) {
					cart.remove(iterator);
				}
				out.println("ID : " + cart.get(iterator).getId() + " Name : " + cart.get(iterator).getName());
			}
			
		}
	}

}
