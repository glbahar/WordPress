package wordPress;

import java.util.Scanner;

import javax.print.attribute.standard.PagesPerMinute;

public class Menu {
	public static int blogMenu(){
		
		Scanner input = new Scanner (System.in);
		System.out.println("Menu List");
		int inputValue = input.nextInt();
		
       StringBuilder menu = new StringBuilder(50);
		
		menu.append("Menu\n");
		menu.append("=====\n");
		menu.append("\n");
		menu.append("1 - Add Page\n");
		menu.append("2 - Add Post\n");
		menu.append("3 - Add Comment\n");
		menu.append("4 - Show Pages\n");
		menu.append("5 - Show Posts\n");
		
		return inputValue;			
	}
	
	public static void AddPage(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("===ADD PAGE===");
		
		System.out.println("Title:");
		String title =input.nextLine();
		
		System.out.println("Body:");
		String body = input.nextLine();
		
		System.out.println("Category");
		String category = input.nextLine();
		
		System.out.println("Page Created");
		String  pageCreated = input.nextLine();
		
		Page page = new Page(title, body, pageCreated);
		//Page.add                                              ????
		returnMenu();
		
		
		
}
	private static void returnMenu() {	
		// TODO Auto-generated method stub
		
	}

	public static void AddPost(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("===ADD POST===");
		
		System.out.println("Post Created");
		String  postCreated = input.nextLine();
		
		System.out.println("Type:");
		String type =input.nextLine();
		
		if(p instanceof VideoPost){
		VideoPost videopost = new VideoPost(title, body, category, slug, url,);	
		}
		
		/*if(type.equals("videopost")){
			
			String url = input.nextLine();
		}
		else if(type.equals("textpost")){
			//String summary = input.nextLine();
		}
		*/
			
}
	public static void showPage(){
		System.out.println(" === SHOW PAGE ===");
		
		Scanner input = new Scanner(System.in);
		/*
		System.out.println("Title:");
		String title = input.nextLine();
		
		System.out.println("Body:");
		String body = input.nextLine();
		*/
		
		
		
	}
	public static void AddComment(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("===ADD COMMENT===");
		
		
	
		
		//Comment comment = new Comment(author, text);
	
		returnMenu();
	
	}
}
