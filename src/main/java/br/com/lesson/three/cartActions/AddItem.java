package br.com.lesson.three.cartActions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.classroom.bean.Car;
import br.com.classroom.utils.BeanUtilities;
import br.com.lesson.three.cart.Cart;
import br.com.lesson.three.product.Product;

/**
 * Servlet implementation class AddItem
 */
@WebServlet("/addItem")
public class AddItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Product> cart = new ArrayList();
//	http://localhost:8080/JTW/addItem?name=Pen&price=18,80&description=A%20super%20pen
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration params = request.getParameterNames();
		HttpSession session = request.getSession();
		
		Product product = new Product();
		
		if(session.getAttribute("cart") != null) {
			cart = (ArrayList<Product>) session.getAttribute("cart");
		}
		
		while(params.hasMoreElements()) {
		String param = (String) params.nextElement();
		String value = request.getParameter(param);
		switch (param) {
		case "name": {
			product.setName(value);
			break;
		}
		case "price": {
			product.setPrice(value);
			break;
		}
		case "description": {
			product.setDescription(value);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + param);
		}
		
//		System.out.println(param + " > " + value);
	}
//		System.out.println(product.getProductInfos());
		
//		cart.setCart(product);
//		System.out.println(cart.getCart());
		
		cart.add(product);
		session.setAttribute("cart", cart);
	}

}
