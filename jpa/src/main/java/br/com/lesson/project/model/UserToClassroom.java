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

	public void setRole(String role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

}
