
public class apotofgoldindequeue {

	public static void main(String args[]){
		int arr[]={5, 1, 5, 1, 5, 1};
		int ans = play(arr);
		System.out.println(ans);
	}
	public static int play(int arr[]){
		int atotal=0,btotal=0;
		int i=0,j=arr.length-1;
		while(i<=j){
			if(arr[i]>arr[j]){
				atotal=atotal+arr[i];
				i++;
			}
			else{
				atotal=atotal+arr[j];
				j--;
			}
			if(arr[i]>arr[j]){
				btotal=btotal+arr[i];
				i++;
			}
			else{
				btotal=btotal+arr[j];
				j--;
			}
		}
		return atotal;
		
	}
	
}
