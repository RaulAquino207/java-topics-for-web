package br.com.lesson.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_comment_to_activity")
public class CommentToActivity {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Comment comment;
	
	@ManyToOne
	private Activity activity;

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
	

}
