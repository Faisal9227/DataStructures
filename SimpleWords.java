
public class SimpleWords {

	public static void main(String[] args) {

		String arr[]={"chat","snapchat","ever","snap","salesperson","per","person","sales","son","whatsoever","what","so"};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(j==i)
					continue;
				else if(arr[j].matches("(.*)"+arr[i]+"(.*)"))
					arr[j]=arr[j].replace(arr[i], "");
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i].length()>0)
				System.out.println(arr[i]);
		}

	}

}
