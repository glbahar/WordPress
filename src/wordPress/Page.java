package wordPress;

import java.time.LocalDate;
import java.util.Set;

public class Page {
	private String title;
	private String body;
	private String category;
	LocalDate Date = LocalDate.now();
	private Set<Comment> comment;
	


	public Page(String title, String body, String category) {
		super();
		this.title = title;
		this.body = body;
		this.category = category;
	}
	

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Set<Comment> getComment() {
		return comment;
	}
	public void setComment(Set<Comment> comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Page [title=" + title + ", body=" + body + ", category=" + category + "]";
	}

}
