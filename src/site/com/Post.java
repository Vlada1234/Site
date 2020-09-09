package site.com;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private String text;
	private String userName;
	private LocalDateTime uploadDateTime;
	private List<Comment> comments = new ArrayList<>();
	private String title;
	
	
	public Post(String title, String text, String userName, LocalDateTime uploadDateTime) {
		super();
		this.uploadDateTime = uploadDateTime;
		this.title = title;
		this.text = text;
		this.userName = userName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getUploadDateTime() {
		return uploadDateTime;
	}

	public void setUploadDateTime(LocalDateTime uploadDateTime) {
		this.uploadDateTime = uploadDateTime;
	}
	
	public String toString() {
		return "Your name is: " + userName + " Your post title is: " + title + " Your post text is: " + text + " Uploaded date and time is: " + uploadDateTime;
	}
	
    

}
