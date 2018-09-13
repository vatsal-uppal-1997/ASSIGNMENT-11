import java.util.*;
import java.io.*;
public class TraverseDir {
	
	static ArrayList<String[]> out = new ArrayList<>();
	
	private static void recursiveTraverse(File f) {
		if (f.isFile())
			return;
		File[] lst = f.listFiles();
		if (lst != null)
			for (File i: lst) {
				if (i.isFile()) {
					out.add(new String[]{"File",i.getName(),i.getAbsolutePath()});
				} else {
					out.add(new String[]{"Directory",i.getName(),i.getAbsolutePath()});
					recursiveTraverse(i);
				}
			}
	}
	
	public static void traverseDir(String path) throws IOException {
		
		File f = new File(path);
		if (!f.exists() || f.isFile()) {
			System.out.println(f.getName()+" does not exist or is a file !");
			return;
		}
		recursiveTraverse(f);
		GenCSV.genCSV(out);
	}
	
}