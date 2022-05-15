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

}
