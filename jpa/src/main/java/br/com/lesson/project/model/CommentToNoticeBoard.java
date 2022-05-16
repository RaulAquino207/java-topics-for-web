package br.com.lesson.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_comment_to_notice_board")
public class CommentToNoticeBoard {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Comment comment;
	
	@ManyToOne
	private NoticeBoard noticeBoard;

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public NoticeBoard getNoticeBoard() {
		return noticeBoard;
	}

	public void setNoticeBoard(NoticeBoard noticeBoard) {
		this.noticeBoard = noticeBoard;
	}

}
