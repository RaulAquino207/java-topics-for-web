package br.com.lesson.project.code;

import java.io.IOException;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import br.com.lesson.project.model.Activity;
import br.com.lesson.project.model.ActivityFiles;
import br.com.lesson.project.model.Classroom;
import br.com.lesson.project.model.Comment;
import br.com.lesson.project.model.CommentToActivity;
import br.com.lesson.project.model.CommentToNoticeBoard;
import br.com.lesson.project.model.NoticeBoard;
import br.com.lesson.project.model.User;
import br.com.lesson.project.model.UserToClassroom;
import br.com.lesson.six.utils.JpaUtil;

public class ProjectCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EntityManager manager = JpaUtil.getEntityManager();
		manager.getTransaction().begin();
		
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();
		User user5 = new User();
		
		user1.setName("Corneli Junior");
		user1.setEmail("corneli@email.com");
		
		manager.persist(user1);
		
		user2.setName("Raul Aquino");
		user2.setEmail("raul@email.com");
		
		manager.persist(user2);
		
		user3.setName("Nityananda Barbosa");
		user3.setEmail("nity@email.com");
		
		manager.persist(user3);
		
		user4.setName("Carlos Brunno");
		user4.setEmail("brunno@email.com");
		
		manager.persist(user4);
		
		user5.setName("Joshuel Nobre");
		user5.setEmail("joshuel@email.com");
		
		manager.persist(user5);
		
		Classroom classroom1 = new Classroom();
		
		classroom1.setLabel("java topics for web");
		
		manager.persist(classroom1);
		
		UserToClassroom userToClassroom1 = new UserToClassroom();
		userToClassroom1.setUser(user1, "T");
		userToClassroom1.setClassroom(classroom1);
		
		manager.persist(userToClassroom1);
		
		UserToClassroom userToClassroom2 = new UserToClassroom();
		userToClassroom2.setUser(user2, "S");
		userToClassroom2.setClassroom(classroom1);
		
		manager.persist(userToClassroom2);
		
		UserToClassroom userToClassroom3 = new UserToClassroom();
		userToClassroom3.setUser(user3, "S");
		userToClassroom3.setClassroom(classroom1);
		
		manager.persist(userToClassroom3);
		
		UserToClassroom userToClassroom4 = new UserToClassroom();
		userToClassroom4.setUser(user4, "S");
		userToClassroom4.setClassroom(classroom1);
		
		manager.persist(userToClassroom4);
		
		UserToClassroom userToClassroom5 = new UserToClassroom();
		userToClassroom5.setUser(user5, "S");
		userToClassroom5.setClassroom(classroom1);
		
		manager.persist(userToClassroom5);
		
		NoticeBoard noticeBoard1 = new NoticeBoard();
		noticeBoard1.setContent("Exam on June 16.");
		noticeBoard1.setUser(user1);
		noticeBoard1.setClassroom(classroom1);
		
		manager.persist(noticeBoard1);
		
		NoticeBoard noticeBoard2 = new NoticeBoard();
		noticeBoard2.setContent("Has anyone managed to solve the servlet problem?");
		noticeBoard2.setUser(user5);
		noticeBoard2.setClassroom(classroom1);
		
		manager.persist(noticeBoard2);
		
		Activity activity1 = new Activity();
		activity1.setTittle("CLASS 01 - INTRODUCTION TO SERVLETS");
		activity1.setInstruction("Do this and do that.");
		activity1.setClassroom(classroom1);
		
		manager.persist(activity1);
		
		Activity activity2 = new Activity();
		activity2.setTittle("CLASS 02 - RECOVERING REQUEST PARAMETERS - BEANUTILS");
		activity2.setInstruction("Do this and do that.");
		activity2.setClassroom(classroom1);
		
		manager.persist(activity2);
		
		ActivityFiles activityFiles1 = new ActivityFiles();
		activityFiles1.setActivity(activity1);
		activityFiles1.uploadFile("src\\main\\resources\\assets\\BEST_1BOXING.mp4");
		
		manager.persist(activityFiles1);
		
		ActivityFiles activityFiles2 = new ActivityFiles();
		activityFiles2.setActivity(activity2);
		activityFiles2.uploadFile("src\\main\\resources\\assets\\BEST_1BOXING.mp4");
		
		manager.persist(activityFiles2);
		
		Comment comment1 = new Comment();
		comment1.setContent("BUT ALREADY?");
		comment1.setUser(user3);
		
		manager.persist(comment1);
		
		CommentToNoticeBoard commentToNoticeBoard1 = new CommentToNoticeBoard();
		commentToNoticeBoard1.setComment(comment1);
		commentToNoticeBoard1.setNoticeBoard(noticeBoard1);
		
		manager.persist(commentToNoticeBoard1);
		
		Comment comment2 = new Comment();
		comment2.setContent("Teacher can I deliver late?");
		comment2.setUser(user2);
		
		manager.persist(comment2);
		
		CommentToActivity commentToActivity1 = new CommentToActivity();
		commentToActivity1.setComment(comment2);
		commentToActivity1.setActivity(activity1);
		
		manager.persist(commentToActivity1);
		
		manager.getTransaction().commit();
		manager.close();

	}

}
