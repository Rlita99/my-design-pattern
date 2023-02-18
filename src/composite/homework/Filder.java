package composite.homework;

import java.util.ArrayList;

// Folder와 File의 기능을 합쳐서 한개의 노드역할을 수행할 수 있도록 짜본다.

public class Filder implements FileSystem{
	private String name;
	private int size;
	private ArrayList<FileSystem> contents = new ArrayList<>();
	
	public Filder(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public void add(FileSystem fileSystem) {
		contents.add(fileSystem);
	}
	
	public void remove(FileSystem fileSystem) {
		contents.remove(fileSystem);
	}
		
	@Override
	public int getSize() {
		int sum = 0;
		for (FileSystem included : contents) {
			sum += included.getSize();
		}
		int total = sum + size;
		System.out.println(name + " 폴더 크기 : " + total);
		System.out.println("------");
		return total;
	}

	@Override
	public void remove() {
		
	}

}
