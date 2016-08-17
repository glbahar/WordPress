package wordPress;

public class VideoPost extends Post {

	private String url;
	
	public VideoPost(String title, String body, String category, String slug) {
		super(title, body, category, slug);
		// TODO Auto-generated constructor stub
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
