package com.company.lockers;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class LockedMe 
{
	
	static final String projectPath="D:\\FullStackJavaDevelopment\\Implement OOPS using JAVA with Data Structures and Beyond\\JavaFullStackDevlopment\\src\\basics";

 	public static void main(String[] args) 
   {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int ch;
		do 
		{
			displaymenu();
			System.out.println("Enter your option:");
			ch=Integer.parseInt(obj.nextLine());
			
			switch (ch) 
			{
			case 1:displayallfiles();
				break;
			case 2:addanewfile();
				break;
			case 3:deleteafile();
				break;
			case 4:searchafile();
				break;
			case 5:System.exit(0);
				break;
			default :System.out.println("Invalir Option");
				break;
			
			}
		}
		while(ch>0);
		obj.close();
	}
 	
	public static void displaymenu()
	{
		System.out.println("****************************************************");
		System.out.println("Welcome to Company Locker  pvt Ltd. - LockedMe.com");
		System.out.println("Developer: Vignesh Maharajan");
		System.out.println("****************************************************");
		System.out.println("\t1. Display All Files");
		System.out.println("\t2. Add a new File");
		System.out.println("\t3. Delete a File");
		System.out.println("\t4. Search a File");
		System.out.println("\t5. Exit.");		
		
	}
	
	public static void displayallfiles()
	{
		//File[] listofFiles = new File(projectPath).listFiles();
		File folder = new File(projectPath);
		File[] listofFiles = folder.listFiles();
		
		if (listofFiles.length==0)
			System.out.println("No Files in Directory");
		else {
			for(var l:listofFiles)
			{
				System.out.println(l.getName());
			}
		}
		
	}
	
	public static void addanewfile()
	{
		Scanner obj = new Scanner(System.in);
		try
		{
			String filename;
			int  linecount;
		
			System.out.println("Enter the File Name:");
			filename=obj.nextLine();
		
			System.out.println("Number of Lines to Add:");
			linecount=Integer.parseInt(obj.nextLine());
			
			FileWriter fw = new FileWriter(projectPath+"\\"+filename);
			
			System.out.println("Enter File Content:");

			for(int i=1;i<=linecount;i++)
			{
				fw.write(obj.nextLine()+"\n");			
			}
			System.out.println("File Created Sucessfully.");
			fw.close();
		}
		catch(Exception ex)
		{
			System.out.println("Invalid Entry.");			
		}
		obj.close();	
	}
	
	public static void deleteafile()
	{
		Scanner obj = new Scanner(System.in);

		try
		{
			String fileName;
		
			System.out.println("Enter the File Name to Delete:");
			fileName=obj.nextLine();
			
			File f1 = new File(projectPath+"\\"+fileName);
			
			if(f1.exists())
			{
				f1.delete();
				System.out.println("File is Deleted.");
			}
			else
			{
				System.out.println("File does not Exist.");
			}
		}
		catch(Exception Ex)
		{
			System.out.println("Invalid Entry.");
		}
		obj.close();
	}
	
	public static void searchafile()
	{
		Scanner obj = new Scanner(System.in);
		try
		{
			/*LinkedList<String> fileNames = new LinkedList<String>();
		
			String fileName;
		
			System.out.println("Ener the File Name to Search:");
			fileName=obj.nextLine();

			File[] listofFiles = new File(projectPath).listFiles();
			for(File l:listofFiles)
			{
				fileNames.add(l.getName());
			}
			if(fileNames.contains(fileName))
				System.out.println("File Is Avaliable.");			
			else
				System.out.println("File is Not Available.");*/
			
			String fileName;
			
			System.out.println("Enter the File Name to Search:");
			fileName=obj.nextLine();
			
			File f1 = new File(projectPath+"\\"+fileName);
			
			if(f1.exists())
			{
				//f1.delete();
				System.out.println("File is Availble.");
			}
			else
			{
				System.out.println("File does not Exist.");
			}
		}
		catch(Exception Ex)
		{
			System.out.println("Invalid Entry.");
		}
		obj.close();
     }
}
