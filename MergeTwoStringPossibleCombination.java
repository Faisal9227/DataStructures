import java.util.ArrayList;
import java.util.List;

public class MergeTwoStringPossibleCombination {

	public static void main(String args[]) {
		List<String> wordList = new ArrayList<String>();
		String s1 = "hey", s2 = "sam";
		wordList = possibleStrings(s1, s2);
		for (int i = 0; i < wordList.size(); i++) {
			System.out.println(wordList.get(i));
		}

	}

	private static void findcombinations(String s1, int i, String s2, int j, List<String> wordlist, String current) {

		if (current.length() == s1.length() + s2.length()) {
			wordlist.add(current);
			return;
		}

		if (i < s1.length())
			findcombinations(s1, i + 1, s2, j, wordlist, current + s1.charAt(i));

		if (j < s2.length())
			findcombinations(s1, i, s2, j + 1, wordlist, current + s2.charAt(j));
	}

	public static List<String> possibleStrings(String s1, String s2) {
		List<String> wordList = new ArrayList<String>();

		findcombinations(s1, 0, s2, 0, wordList, "");
		return wordList;
	}
}
