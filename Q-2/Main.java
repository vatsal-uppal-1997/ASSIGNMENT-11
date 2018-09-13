import java.io.*;
import java.util.*;
public class Main {
	private static final Scanner sc = new Scanner(System.in);
	static {
		
		System.out.println("Creating abc.txt in pwd and Desktop");
		File f1 = new File("abc.txt");
		System.out.print("Enter your username : ");
		File f2 = new File("c:/users/"+sc.nextLine()+"/Desktop/abc.txt");
		
		try {
			f1.createNewFile();
			f2.createNewFile();
			System.out.println("First abc at : "+f1.getAbsolutePath()+"\nSecond abc at :"+f2.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String []args) {
		try {
			TraverseDir.traverseDir("c:/users");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}