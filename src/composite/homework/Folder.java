package composite.homework;

import java.util.ArrayList;

public class Folder implements FileSystem{
	private String name;
	private ArrayList<FileSystem> includeds = new ArrayList<>();
	
	public Folder(String name) {
		this.name = name;
	}
	
	public void add(FileSystem fileSystem) {
		includeds.add(fileSystem);
	}

	@Override
	public int getSize() {
		int total = 0;
		for (FileSystem included : includeds) {
			total += included.getSize();
		}
		System.out.println(name + " 폴더 크기 : " + total);
		System.out.println("------");
		return total;
	}

	@Override
	public void remove() {
		for (FileSystem included : includeds) {
			included.remove();
		}
		System.out.println(name + " 폴더 삭제");
		System.out.println("-----");
	}

}
