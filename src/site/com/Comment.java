package site.com;

import java.time.LocalDateTime;

public class Comment {
	private ExpressingType expressingType;
	private String userName;
	private int numberOfLikes;
	private int numberOfDislikes;
	private int topComment = 0;
	private String text;
	private LocalDateTime dateTime;

	public Comment(String userName, String text, LocalDateTime datetime) {
		super();
		this.text = text;
		this.userName = userName;
		this.dateTime = datetime;
		this.numberOfLikes = 0;
		this.numberOfDislikes = 0;
	}
	
	public ExpressingType getExpressingType() {
		return expressingType;
	}

	public void setExpressingType(ExpressingType expressingType) {
		this.expressingType = expressingType;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public int getNumberOfLikes() {
		return numberOfLikes;
	}

	public void setNumberOfLikes(int numberOfLikes) {
		this.numberOfLikes = numberOfLikes;
	}

	public int getNumberOfDislikes() {
		return numberOfDislikes;
	}

	public void setNumberOfDislikes(int numberOfDislikes) {
		this.numberOfDislikes = numberOfDislikes;
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

	public void expressingTypeSystem(ExpressingType expressingType) {
		if (expressingType == expressingType.LIKE) {
			numberOfLikes++;
		} else if (expressingType == expressingType.DISLIKE) {
			numberOfDislikes++;
		} else {
			System.out.println("You didnt liked or disliked the comment.");
		}

	}

	public String toString() {
		return "Name is: " + userName + " Text of comment is: " + text + ", Comment date and time is: " + dateTime
				+ " Number of likes is: " + numberOfLikes + " Number of dislikes is: " + numberOfDislikes;
	}

	

}
