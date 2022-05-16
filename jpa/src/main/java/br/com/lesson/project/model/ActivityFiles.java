package br.com.lesson.project.model;

import java.io.IOException;
import org.apache.commons.io.FilenameUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.lesson.project.utils.ReadLob;

@Entity
@Table (name = "tb_activity_files")
public class ActivityFiles {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Activity activity;
	
	@Lob
	private byte [] fileLob;
	
	@Column (name = "ds_file_name")
	private String fileName;
	
	@Column (name = "ds_file_type")
	private String fileType;

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public byte[] getFileLob() {
		return fileLob;
	}

	public void setFileLob(byte[] fileLob) {
		this.fileLob = fileLob;
	}
	
	public void uploadFile(String path) throws IOException {
		this.fileName = FilenameUtils.removeExtension(FilenameUtils.getName(path));
		this.fileType = FilenameUtils.getExtension(path);
		this.fileLob = new ReadLob().getFoto(path);
	}
}
