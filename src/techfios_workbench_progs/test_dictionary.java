package techfios_workbench_progs;
import java.io.IOException;
import java.nio.file.*;
/*Author;Shayesta Wassay
 * Date Created: June 18,2020
 * This program reads from a text file and prints the words with their meanings
 * 
 */
public class test_dictionary {
	
	static String linepath;
	static String linearray; 
	public static void main(String[] args) throws IOException {
	
	linepath=(".\\techfios_workbench\\dictionarydata.txt");

	doesFileExist(linepath);
	
//		Scanner Readme = new Scanner(System.in);
//		System.out.println("What is your word?");
//		word=Readme.next();
//		System.out.println(word);
	
		}
	
	public static void doesFileExist(String linepath) {
		try {
			Files.lines(Paths.get(linepath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	try {
linearray = new String(Files.readAllBytes(Paths.get("C:\\Users\\18173\\Documents\\winter2020\\techfios_workbench\\dictionarydata.txt")));
		} catch (IOException e) {
		e.printStackTrace();
	}
	
	String[] newword=linearray.split(",");
	for (String nwWord:newword) {
	System.out.println(nwWord+"\n"+"\n");
	
}
	}
	}