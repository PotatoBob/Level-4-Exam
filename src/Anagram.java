import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Anagram {
	static ArrayList<String> sArr = new ArrayList<String>();
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a String");
		Anagram(input);
	}
	static ArrayList<String> Anagram(String s) {
		
		return sArr;
	}
	static ArrayList<String> Organize(ArrayList<String> sA) {
		
		return sA;
	}
	//Anagram will find the anagrams, isWord checks it, and a third method will delete those that aren't.
	static boolean isWord(String s) {
		boolean maybe = false;
		try {
			String line = "";
			BufferedReader br = new BufferedReader(new FileReader("Dict.txt"));
			while ((line=br.readLine())!=null) {
				if(s == line) {
					maybe = true;
				}
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		return maybe;
	}
}
