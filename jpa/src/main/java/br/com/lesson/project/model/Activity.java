package br.com.lesson.project.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tb_activity")
public class Activity {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column (name = "ds_tittle")
	private String tittle;
	
	@Column (name = "ds_instruction")
	private String instruction;
	
	@ManyToOne
	private Classroom classroom;
	
	@OneToMany(mappedBy = "activity", cascade = CascadeType.ALL)
	private Set<ActivityFiles> activityFiles;

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	
	

}
