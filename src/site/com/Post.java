package site.com;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private String text;
	private String userName;
	private LocalDateTime uploadDateTime;
	private List<Comment> comments = new ArrayList<>();
	private Comment topComment;
	private String title;

	
	public Post(String title, String text, String userName) {
		super();
		this.uploadDateTime = LocalDateTime.now();
		this.title = title;
		this.text = text;
		this.comments = comments;
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
		return "Your name is: " + userName + " Your post title is: " + title + " Your post text is: " + text
				+ " Uploaded date and time is: " + uploadDateTime;
	}

	public Comment getTopComment() {
		for (int i = 0; i < comments.size(); i++) {
			if (comments.size() > 0) {
				topComment = comments.get(0);
			}
			if (comments.get(i).getNumberOfLikes() > topComment.getNumberOfLikes()) {
				topComment = comments.get(i);
			}
			

		}
		System.out.println(comments.size());
		System.out.println(topComment);
		return topComment;

	}
}
