package wordPress;

public class TextPost extends Post {
	private String summary;

	public TextPost(String title, String body, String category, String slug) {
		super(title, body, category, slug);
		// TODO Auto-generated constructor stub
		this.summary = summary;
	}


	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	

}
