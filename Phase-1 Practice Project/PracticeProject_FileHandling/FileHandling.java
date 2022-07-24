package PracticeProject_FileHandling;

//Set of imports done 

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	
	//Code for File Create
	public static void createFileUsingFileClass() throws IOException {
		File file = new File("E:\\testFilejava.txt");

		if (file.createNewFile()) {
			System.out.println("File is Created");
		} else {
			System.out.println("File already Exist");
		}
		FileWriter writer = new FileWriter(file, false);
		writer.write("Hiii   .\n Welcome Everyone .\n  How are you");
		writer.close();

	}
	
	//Code for File Read

	public static void readFileReaderClass() throws IOException {

		FileReader reader = new FileReader("E:\\testFilejava.txt");

		Scanner read = new Scanner(reader);
		while (read.hasNext()) {
			String content = read.nextLine();
			System.out.println(content);
		}
	}

	//Code for File Append
	public static void appendFileAppendClass() throws IOException {
		FileWriter writer = new FileWriter("E:\\testFilejava.txt", true);// appends File
		writer.write("\nHave a nice day!");
		writer.close();

	}
	
	//Final Code of log of actions done.

	public static void main(String args[]) {

		try {
			createFileUsingFileClass();
			System.out.println("File created and writen successfully\n");

			readFileReaderClass();
			System.out.println("File readed successfully");

			appendFileAppendClass();
			System.out.println("\nFile appended Successfully");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error" + e);
		}
	}
}