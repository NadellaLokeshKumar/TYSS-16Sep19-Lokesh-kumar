package exception.java;
import java.io.*;
public class file {
static void readData() throws FileNotFoundException{
	FileReader f=new FileReader("bdss");
}
public static void main(String[] args) {
	try {
		readData();
	}
	catch(FileNotFoundException e) {
		System.out.println("file not found");
	}
}
}
