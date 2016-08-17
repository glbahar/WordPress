package wordPress;

public abstract class Post extends Page{
	private String slug;
	
	public Post(String title, String body, String category, String slug) {
		super(title, body, category);
		this.slug = slug;
		// TODO Auto-generated constructor stub
	
	}



}
