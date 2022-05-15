package br.com.lesson.five.code;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.lesson.five.model.Student;
import br.com.lesson.six.utils.JpaUtil;

public class JpaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
//		EntityManager manager = factory.createEntityManager();
		
		EntityManager manager = JpaUtil.getEntityManager();

		manager.getTransaction().begin();
		
//		CREATE
//		Student student1 = new Student();
//		student1.setNome("Nityananda Barbosa");
//		student1.setEmail("nity@email.com");
//
//		manager.persist(student1);
		
//		FIND AND UPDATE
//		Student student2 = manager.find(Student.class, 3L); or Student student2 = manager.getReference(Student.class, 3L);
//		student2.setEmail("monalisa@gmail.com");
//		
//		System.out.println(student2.getEmail());
//		manager.persist(student2);
		
//		DELETE
//		Student student3 = manager.find(Student.class, 3L);
//		manager.remove(student3);
		
		manager.getTransaction().commit();
		manager.close();
	}

}
