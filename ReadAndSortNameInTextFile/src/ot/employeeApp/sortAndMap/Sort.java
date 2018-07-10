package ot.employeeApp.sortAndMap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.*;


public class Sort {
	 private static boolean write=false;
	public static void main(String[] args) throws Exception {

//		String inputFile =("src/File/input.txt") ;
System.out.println(System.getProperty("user.dir"));
		
		java.io.File inputFile = new java.io.File("src/input.txt");      
		System.out.println(inputFile);
		String outputFile = "src/output.txt";

		FileReader fileReader = new FileReader(inputFile);
		System.out.println(fileReader);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		System.out.println(bufferedReader);
		String inputLine;
		List<String> lineList = new ArrayList<String>();
		while ((inputLine = bufferedReader.readLine()) != null) {
			lineList.add(inputLine);
			System.out.println(inputLine);
		}
		fileReader.close();
		System.out.println(lineList);
		Collections.sort(lineList);
		System.out.println(outputFile);
		FileWriter fileWriter = new FileWriter(outputFile);
		PrintWriter out = new PrintWriter(fileWriter);
		for (String outputLine : lineList) {
			out.println(outputLine);
		}
		out.flush();
		out.close();
		fileWriter.close();
		
		System.out.println(lineList);
		System.out.println("Enter the name you want search");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String file_name = "/src/input.txt";
		String[] aryLines = {};    
//		 try {
//	            ReadFile file = new ReadFile(file_name);
//	            aryLines = file.OpenFile();
//
//	        } catch (IOException error) {
//	            System.out.println(error.getMessage());
//		 ReadFile file = new ReadFile(file_name);
//		 String[] aryLines = .OpenFile();
//		if(lineList.contains(s))
//		{
//			System.out.println(lineList.contains(s));
//		}
		
		
		System.out.println(s);
		
//		if (lineList.getName().equals(name)) {
//            return customer;
//        }
		

	}
}
