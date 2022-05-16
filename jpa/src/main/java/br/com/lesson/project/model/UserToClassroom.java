package br.com.lesson.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_user_to_classroom")
public class UserToClassroom {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column (name = "ds_role")
	private String role;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Classroom classroom;
	
	public String getRole() {
		return role;
	}
	
	private void addTeacher() {
		this.role = "TEACHER";
	}
	
	private void addStudent() {
		this.role = "STUDENT";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user, String role) {
		this.user = user;
		if(role == "T") {
			this.addTeacher();
		} else if(role == "S") {
			this.addStudent();
		}
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

}
