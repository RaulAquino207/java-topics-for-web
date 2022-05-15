package br.com.lesson.five.code;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.lesson.five.model.Student;

public class JpaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		
		Student student1 = new Student();
		student1.setNome("Raul Aquino");
		student1.setEmail("raul@email.com");

		manager.persist(student1);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
