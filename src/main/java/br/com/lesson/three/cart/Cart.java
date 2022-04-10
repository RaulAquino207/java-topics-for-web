package br.com.lesson.three.cart;

import java.util.ArrayList;

import br.com.lesson.three.product.Product;

public class Cart {
	private ArrayList<Product> cart = new ArrayList();

	public ArrayList<Product> getCart() {
		return cart;
	}

	public void setCart(Product product) {
		this.cart.add(product);
	}

}
