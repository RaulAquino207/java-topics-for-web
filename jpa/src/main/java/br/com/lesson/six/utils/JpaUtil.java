package br.com.lesson.six.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}
