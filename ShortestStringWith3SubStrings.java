import java.util.Arrays;

public class ShortestStringWith3SubStrings {

public static void main(String[] args) {
		
		//Got distance of 12
		String text = "00as0de00000as00bp1000de000bp000as000de120bp";
		String p1 = "as";
		String p2 = "bp1";
		String p3 = "de";

		//Got distance of 4. 
//		String text = "Mississippi";
//		String p1 = "is";
//		String p2 = "si";
//		String p3 = "ssi";
		
		int[] vals = calc_size(text, p1, p2, p3);
		
		System.out.println("distance: " + vals[0] + ", min loc: " + vals[1] + ", max loc: " + vals[2]);	
	}
	
	static int[] calc_size(String text, String p1, String p2, String p3)
	{
		int[] retVals = new int[3];
		int[] match_locations = new int[3];
		
		int[] p1_array = slow_matcher(text, p1);
		int[] p2_array = slow_matcher(text, p2);
		int[] p3_array = slow_matcher(text, p3);

		char[] text_array = text.toCharArray();
		int small_dist = Integer.MAX_VALUE;
		
		for(int i = 0; i < text_array.length; i++)
		{			
			if(p1_array[i] == 1)
				match_locations[0] = i;
			
			if(p2_array[i] == 1)
				match_locations[1] = i;
			
			if(p3_array[i] == 1)
				match_locations[2] = i;
			
			if(match_locations[0] != 0 && match_locations[1] != 0 && match_locations[2] != 0)
			{
				int min = Math.min(match_locations[0], Math.min(match_locations[1], match_locations[2]));
				int max = Math.max(match_locations[0]+ p1.length(), Math.max(match_locations[1]+ p2.length(), match_locations[2]+ p3.length()));				
				
				if(small_dist > max-min)
				{
					small_dist = max-min;
					retVals[0] = small_dist;
					retVals[1] = min;
					retVals[2] = max;
				}
			}
		}

		return retVals;
	}
	
	//O(nm): This can definitely be improved with KMP algorithm. 
	static int[] slow_matcher(String text, String pattern)
	{
		int[] ret = new int[text.length()];
		char[] text_array = text.toCharArray();
		for(int i = 0; i < text_array.length; i++)
		{
			String temp = new String(Arrays.copyOfRange(text_array, i, i+pattern.length()));
			if(temp.equalsIgnoreCase(pattern))
			{
				ret[i] = 1;
				i = i+pattern.length()-1;
			}
		}
		return ret;
	}
}
