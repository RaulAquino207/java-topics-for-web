package br.com.lesson.project.code;

import javax.persistence.EntityManager;

import br.com.lesson.six.utils.JpaUtil;

public class ProjectCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager manager = JpaUtil.getEntityManager();
		manager.getTransaction().begin();
		
		
		
		manager.getTransaction().commit();
		manager.close();

	}

}
