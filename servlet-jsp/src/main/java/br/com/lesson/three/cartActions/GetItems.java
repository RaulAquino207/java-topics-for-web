package br.com.lesson.three.cartActions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.lesson.three.product.Product;

/**
 * Servlet implementation class GetItems
 */
@WebServlet("/getItems")
public class GetItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		if(session.getAttribute("cart") == null) {
			out.print("Your shopping cart is empty");
		}else {
			ArrayList<Product> cart = (ArrayList<Product>) session.getAttribute("cart");
			
			if(cart != null) {
				for (int iterator = 0; iterator < cart.size(); iterator++) {
					out.println(cart.get(iterator).getName());
				}
			}
		}
	}

}
