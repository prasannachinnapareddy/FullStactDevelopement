package com.cts.activity.main;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class NIOBasicOperations
{
	  public static void main(String[] args) throws IOException
	    {
		  //FileSystem fs=FileSystems.getDefault();
		  //Path path=fs.getPath("C:\\Users\\Lenovo\\Desktop\\Newfile");
		  //Path path=fs.getPath("C:","Users","Lenovo","Desktop","Newfile");
		Path path=Paths.get("C:","Users","Lenovo","Desktop","Java","com","cts","main","new");
		  System.out.println("Namecount:" +path.getNameCount());
		 System.out.println("Isabsolute:" +path.isAbsolute());
		  System.out.println("Name on index 0:" +path.getName(0));  
		  //Files.createDirectory(path);
		  //Files.createFile(path);
		  boolean file=Files.exists(path);
		  System.out.println(file);	
		  boolean file1=Files.notExists(path);
		  System.out.println(file1);
		  Path path1=Paths.get("C:","Users","Lenovo","Desktop","cpyfile","new.txt");
		  Files.createFile(path1);
		  Files.copy(path,path1);		  }
}
