package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class testik {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/dota4.xml");
		
		FileInputStream fis = new FileInputStream(file);
		String result = "";
		int c =fis.read();
		
		while(c!=-1){
			result+=(char)c;
			c=fis.read();
		}
		System.out.println(result);
	}

}
