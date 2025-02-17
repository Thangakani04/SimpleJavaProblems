package SimpleJavaproblems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataintoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D:\\MY FILES\\file.txt");  //here we need to specify in which file we are going to write a content
		//if the file is not present it will create a new file in that particular location
		BufferedWriter bw = new BufferedWriter(fw);  // bw -> which will point to the text file, which is empty
	//Adding content into the particular file
		bw.write("Springboot is a framework");
		bw.write("Springboot is used to create RestFul applications");
		bw.write("Springboot feature is autoconfiguration");
		
		System.out.println("End !!");
		
		bw.close();
		
	}

}
