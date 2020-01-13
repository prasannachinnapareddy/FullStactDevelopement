package com.cts.activity.main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class CharStream
{
	    public static void main(String[] args) throws IOException 
	    {
	    	/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    	String s=br.readLine();
	    	System.out.println(s); */
	    	String path="C:\\Users\\Lenovo\\Desktop\\Newfile\\data.text";
	    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    	FileWriter fw=new FileWriter(path);
	    	fw.write("over");
	    	System.out.println(fw);
	    }
}
