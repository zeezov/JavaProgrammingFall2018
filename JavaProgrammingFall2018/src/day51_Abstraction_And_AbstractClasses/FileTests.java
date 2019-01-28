package day51_Abstraction_And_AbstractClasses;

public class FileTests {
	public static void main(String[] args) {
		
		// You cant create object for Abstract classes
		//File file = new File();
		
		XlsFIle xl = new XlsFIle();
		xl.open();
		xl.close();
		
		xl.setName("TestData.x");
		System.out.println("XLS File name: " + xl.getName());
		
		JPGFIle jpg = new JPGFIle();
		
		jpg.setName("Event01.jpg");
		jpg.open();
		jpg.close();
		System.out.println("JPG file name: " + jpg.getName());
		
		System.out.println(File.count);
		
		System.out.println(JPGFIle.count);
		
		System.out.println(XlsFIle.count);
		
		PDFFile pdf = new PDFFile("AgileBook.pdf");
		
		pdf.open();
		pdf.close();
		
		System.out.println(File.count);
		
		
		
				
		
		
		
	}

}
