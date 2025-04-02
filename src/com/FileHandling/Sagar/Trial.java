package com.FileHandling.Sagar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Trial {
	
	public static void main(String[] args) {
		
//		String path="C:\\Users\\vprab\\OneDrive\\Desktop\\Java";
//		File f=new File(path);
//		System.out.println(f.exists());
//		System.out.println(f.canRead());
//		System.out.println(f.canWrite());
//		System.out.println(f.isFile());
//		System.out.println(f.isDirectory());
//		System.out.println(f.getName());
//		System.out.println(f.getPath());
//		System.out.println(f);
//		System.out.println(f.getAbsolutePath());
//		try {
//			System.out.println(f.getCanonicalPath());
//		}
//		catch(Exception e) {
//			System.out.println("No Canonical Path");
//		}
//		f.mkdir();
//		f.createNewFile();
		
//		String[] slist=f.list();
//		for(String s:slist) {
//			System.out.println(s);
//		}
		
//		String path="C:\\Users\\vprab\\OneDrive\\Desktop\\Java\\ads.txt";
//		System.out.println(f.delete());
		
		String path="C:\\Users\\vprab\\OneDrive\\Desktop\\Java\\sdf.txt";
		
		try {
			FileWriter fwriter=new FileWriter(path);
			fwriter.write("Hello World !!!");
			fwriter.flush();
		}
		catch(IOException e) {
			System.out.println(e.printStackTrace());
		}
		
		
	}

}
