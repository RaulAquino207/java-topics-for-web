package br.com.lesson.project.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_classroom")
public class Classroom {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column (name = "ds_label")
	private String label;
	
	@OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL)
	private Set<UserToClassroom> userToClassroom;

}
