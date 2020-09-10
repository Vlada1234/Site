package site.com;

import java.util.ArrayList;
import java.util.List;

public class Site {
	private List<Post> posts = new ArrayList<>();
	
	

	public List<Post> getPosts() {
		return posts;
	}



	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}



	public void myLastPosts() {
		List<Post> myLastPosts = posts.subList(posts.size() - 10, posts.size());
		System.out.println(myLastPosts);
	}
}