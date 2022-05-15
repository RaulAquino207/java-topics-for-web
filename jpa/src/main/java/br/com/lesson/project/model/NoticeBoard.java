package br.com.lesson.project.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tb_notice_board")
public class NoticeBoard {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "ds_content", unique = true)
	private String  content;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Classroom> classroom;

}
