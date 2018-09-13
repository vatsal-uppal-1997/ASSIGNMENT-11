import java.io.*;
import java.util.*;

public class GenCSV {
	private static Scanner sc = new Scanner(System.in);
	public static void genCSV(ArrayList<String[]>data) throws IOException {
		System.out.print("Output File Name : ");
		File out = new File(sc.nextLine());
		if (!out.exists())
			out.createNewFile();
		System.out.println("Output file at : "+out.getAbsolutePath());
		BufferedWriter bw = new BufferedWriter(new FileWriter(out));
		/*
		*	Expecting ArrayList of format
		*	{{type,name,path}} 
		*	Where type is either file or dir
		*/
		for (String[] i: data) 
			bw.write(i[0]+","+i[1]+","+"\""+i[2]+"\""+"\n");
		bw.close();
	}
	
}