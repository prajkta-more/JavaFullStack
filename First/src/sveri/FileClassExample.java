
package sveri;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileClassExample{
	public static void fileClassMethods() {
	File obj=new File("TestFile.txt");
	if(obj.exists()) {
		System.out.println(" is file Executable : "+obj.canExecute());
		System.out.println(" is file Writable : "+obj.canWrite());
		System.out.println(" is file Redable : "+obj.canRead());
		System.out.println(" file absolute path  : "+obj.getAbsolutePath());
		System.out.println(" file size in byte : "+obj.length());
		System.out.println(" is file Deleted : "+obj.delete());
	}
	}
	public static void main(String[]abc)
	{
		FileClassExample o=new FileClassExample();
		o.fileClassMethods();
		o.createFile("Demo.txt");
	}
	
	
	public static void createFile(String fileName) {
		try {
			File obj=new File(fileName);
			if(obj.createNewFile()) {
				System.out.println("File Created ... File Name is "+obj.getName());
				
			}
			else {
				System.out.println("File Already Exist ... File Name is "+obj.getName());
				FileWriter fwObj=new FileWriter(fileName);
				fwObj.write("Welcome to file...");
				fwObj.close();
				Scanner scanObj=new Scanner(obj);
				while(scanObj.hasNextLine()) {
					String str=scanObj.nextLine();
					System.out.println("File Content : "+str);
				}
			}
		}catch(IOException e) {e.printStackTrace();}
	}
}//JavaFileClassExample
 
 
 
 
 
 
 