package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String Path = "D:/";
		File file = new File(Path);
		while (true) {
			file = new File(Path);
			if (file.isDirectory()) {
				String[] list = file.list();
				for (String fl : list) {
					System.out.println(fl);
				}
			}
			System.out.println("Enter:");
			String newPath = in.nextLine();
			if (newPath.equals("mkdir")) {
				System.out.println("Enter folder name:");
				String nameFolder = in.nextLine();
				file = new File(Path + nameFolder + "/");
				file.mkdirs();

			} else if (newPath.equals("delete")) {
				System.out.println("Enter name delete :");
				String delFolder = in.nextLine();
				file = new File(Path + delFolder + "/");
				file.delete();
			} else if (newPath.equals("read")) {
				System.out.println("That will read?");
				String readFile = in.nextLine();
				file = new File(Path + readFile + "/");
				try {
					FileInputStream fis = new FileInputStream(file);
					String result = "";
					int c = fis.read();
					while (c != -1) {
						result += (char) c;
						c = fis.read();
					}
					fis.close();
					System.out.println(result);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}else if(Path.equals("back")){
				Path = Path.substring(0, Path.lastIndexOf("/"));
				System.out.println(Path);
		
			}else if(!Path.equals("exit") && !Path.equals("back")){
				Path= Path +"/"+ newPath + "/";
				System.out.println(Path);
			}
		}

	}
}
