package wordPress;

import java.util.List;
import java.util.ArrayList;

public class WordPressHelper {
	
	public static List<Page> Pages = new ArrayList<Page>();
	public static List<VideoPost> VideoPosts = new ArrayList<VideoPost>();
	public static List<TextPost> TextPosts = new ArrayList<TextPost>();
	public static List<Comment> Comments = new ArrayList<Comment>();
	
	public static void addPages1(Page page){
		Pages.add(page);
	}
	public static void addVideoPosts(VideoPost videoPost){
		VideoPosts.add(videoPost);
	}
	public static void addTextPosts(TextPost textPost){
		TextPosts.add(textPost);
	}
	public static List<Page> getPages() {
		return Pages;
	}
	public static List<VideoPost> getVideoPosts() {
		return VideoPosts;
	}
	public static List<TextPost> getTextPosts() {
		return TextPosts;
	}
	public static List<Comment> getComments() {
		return Comments;
	}
	

}
