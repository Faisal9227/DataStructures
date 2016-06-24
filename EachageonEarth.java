
public class EachageonEarth {
	static int count[];

	public static void main(String args[]) {
		int arr[] = { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 5, 5, 5, 5 };
		count = new int[arr[arr.length-1]+1];
		calculate(arr, 0, arr.length - 1);
		for (int i = 1; i < count.length; i++)
			System.out.println(count[i]+1);
	}

	private static void calculate(int[] arr, int start, int length) {
		int begin = start, end = length;
		if (arr[begin] == arr[end])
			count[arr[begin]] += (end - begin) + 1;
		else {
			calculate(arr, ((end + begin) / 2) + 1, end);
			calculate(arr, start, ((end + begin) / 2));
		}
	}

}
