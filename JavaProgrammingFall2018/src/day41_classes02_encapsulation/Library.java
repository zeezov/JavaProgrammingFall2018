package day41_classes02_encapsulation;


public class Library {
	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		book1.setTitle("Grit");
		System.out.println(book1.getTitle());
		
		book1.setAuthor("Zee Zov");
		System.out.println(book1.getAuthor());
		
		book1.setPages(345);
		System.out.println(book1.getPages());
		
		
		Book javaBook = new Book();
		
		javaBook.setTitle("Head First Java");
		javaBook.setAuthor("Kathy Sierra, Bert Bates");
		javaBook.setPages(543);
		
		System.out.println("Title: " + javaBook.getTitle());
		System.out.println("Author: " + javaBook.getAuthor());
		System.out.println("Pages: " + javaBook.getPages());
		
		
	}

}
