package br.com.lesson.project.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table (name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column (name = "ds_name")
	private String name;
	
	@Column(name = "ds_email", unique = true)
	private String  email;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<UserToClassroom> userToClassroom;

}
