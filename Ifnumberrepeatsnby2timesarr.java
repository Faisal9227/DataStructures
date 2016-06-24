/*Complexity O(1)*/
public class Ifnumberrepeatsnby2timesarr {

	public static void main(String args[]){
		int arr[]={1,2,2,3,4,5,7,8};		//9	17
		findlongest(arr);
		findlongest4(arr);
	}

	private static void findlongest(int[] arr) {
		// TODO Auto-generated method stub
		int len=arr.length;
		if(arr[len/2]==arr[len/4] || arr[len/2]==arr[(3*len)/4-1]){
			System.out.println(arr[len/2]);
		}
		
	}
	
	private static void findlongest4(int[] arr) {
		// TODO Auto-generated method stub
		int len=arr.length;
		if(arr[len/4]==arr[len/8] || arr[len/4]==arr[((5*len)/8)-1]){
			System.out.println(arr[len/4]);
		}
		
	}
	
}
