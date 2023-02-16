package composite.homework;

public class Main {
	public static void main(String args[]) {
		
		
		// add a file
		File file1 = new File("입학원서.pdf", 123);
		file1.getSize();
		
		// add a folder
		Folder folder1 = new Folder("마도요");
		folder1.getSize();
		folder1.add(file1);
		folder1.getSize();
	}
}
