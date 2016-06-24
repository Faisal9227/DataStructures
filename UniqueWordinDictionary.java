import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueWordinDictionary {

	public static void main(String args[]) {
		Map<String, ArrayList> hm = new HashMap<String, ArrayList>();
		String arr[] = { "carry", "candy", "candy", "dummy" };
		for (int i = 0; i < arr.length; i++) {
			ArrayList<String> list = new ArrayList<String>();
			int length = arr[i].length();
			String key = arr[i].charAt(0) + Integer.toString(length - 2) + arr[i].charAt(length - 1);
			if (hm.get(key) == null) {
				list.add(arr[i]);
				hm.put(key, list);
			} else {
				list = hm.get(key);
				list.add(arr[i]);
				hm.put(key, list);
			}
		}
		String str = "dummy";
		System.out.println("Finding " + str + " is unique");
		int length = str.length();
		String key = str.charAt(0) + Integer.toString(length - 2) + str.charAt(length - 1);
		ArrayList<String> list = hm.get(key);
		if (list == null) {
			System.out.println("Item does not exists");
		} else {
			if (list.contains(str)) {
				int count = 0;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) == str) {
						count++;
					}
				}
				if (count == 1) {
					System.out.println("Item exists and is unique");
				} else {
					System.out.println("Item exists multiple times");
				}
			}
		}
	}

}
