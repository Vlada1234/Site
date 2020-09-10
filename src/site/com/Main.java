package site.com;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Comment comment = new Comment("Ryan", "My New Comment" );
	    Comment newcomment = new Comment("Bob", "My Comment" );
	    
		Post newPost = new Post("MY NEW POST", "blabla", "John");
		Post post = new Post("NEW POST",  "My New Post", "Vlada");
		Post newPost1 = new Post("MY NEW POST", "blabla", "John");
		Post post2 = new Post("NEW POST",  "My New Post", "Vlada");
		Post newPost3 = new Post("MY NEW POST", "blabla", "John");
		Post post4 = new Post("NEW POST",  "My New Post", "Vlada");
		Post newPost5 = new Post("MY NEW POST", "blabla", "John");
		Post post6 = new Post("NEW POST",  "My New Post", "Vlada");
		Post newPost7 = new Post("MY NEW POST", "blabla", "John");
		Post post8 = new Post("NEW POST",  "My New Post", "Vlada");
		Post newPost9 = new Post("MY NEW POST", "blabla", "John");
		Post post10 = new Post("NEW POST",  "My New Post", "Vlada");
		Post newPost11 = new Post("MY NEW POST", "blabla", "John");
		Post post12 = new Post("NEW POST",  "My New Post", "Vlada");
		
	    
		List<Comment> commentsList = new ArrayList<Comment>();
		commentsList.add(comment);
		commentsList.add(newcomment);
		comment.expressingTypeSystem(ExpressingType.LIKE);
		comment.expressingTypeSystem(ExpressingType.LIKE);
		comment.expressingTypeSystem(ExpressingType.DISLIKE);
		newcomment.expressingTypeSystem(ExpressingType.DISLIKE);
		
		
		//comment.getDateTime();
		//System.out.println(commentsList.toString());
		
		Site site = new Site();
		List<Post> postList = new ArrayList<Post>();
		postList.add(post12);
		postList.add(newPost);
		postList.add(post);
		postList.add(post2);
		postList.add(newPost1);
		postList.add(post4);
		postList.add(newPost3);
		postList.add(post6);
		postList.add(newPost5);
		postList.add(post8);
		postList.add(newPost7);
		postList.add(post10);
		postList.add(newPost11);
		
		
		post.setComments(commentsList);
		post.getTopComment();
		
		site.setPosts(postList);
		site.myLastPosts();
		
		
		
		
		//System.out.println(postList.toString());

	}
	
	
}
