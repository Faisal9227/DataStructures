import java.util.Scanner;

/*
 * author: Faisal
 * Given a string S,
 * print the longest substring P such that
 * P > S lexicographically. 
 */

public class LongetLexicographicalString {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String output=longestLexicalSubstring(input);
		System.out.println(output);
	}
	public static String longestLexicalSubstring(String in){
		int start=0,end=0;
		int tempstart=0,tempend=0;
		if(in.length()==0||in.isEmpty()){
			return "";
		}
		for(int i=1;i<in.length();i++){
			if(in.charAt(i)<in.charAt(i-1)){
				tempstart=i;
			}
			else{
				tempend=i+1;
			}
			if(tempend-tempstart>end-start){
				start=tempstart;
				end=tempend;
			}
		}
		return in.substring(start,end);
		 
	}
}


