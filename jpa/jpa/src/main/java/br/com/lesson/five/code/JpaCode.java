package br.com.lesson.five.code;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();

//		manager.getTransaction().begin();
//		manager.getTransaction().commit();
//		manager.close();
//		factory.close();
	}

}
