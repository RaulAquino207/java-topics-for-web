package br.com.lesson.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_comment_to_notice_board")
public class CommentToNoticeBoard {
	
	@Id
	@GeneratedValue
	private Long id;

}
