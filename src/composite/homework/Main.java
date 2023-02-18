package composite.homework;

public class Main {
	public static void main(String args[]) {
		
		
		// add a file
		File file1 = new File("입학원서.pdf", 123);
		file1.getSize();	//123
		
		// add a folder
		Folder folder1 = new Folder("마도요");
		folder1.getSize();	//0
		folder1.add(file1);	
		folder1.getSize();	//123
		
		Filder filder = new Filder("filder",222);
		filder.getSize();	//222
		filder.add(folder1);	//123
		filder.add(file1);		//123
		filder.getSize();	// 468
	}
	
		
}
