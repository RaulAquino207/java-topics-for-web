package br.com.lesson.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_comment_to_activity")
public class CommentToActivity {
	
	@Id
	@GeneratedValue
	private Long id;

}
