import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.crypto.Data;

public class ReducingSubArray {

	public static class Pair implements Comparable<Pair> {
		Integer a;
		Integer b;

		Pair(Integer a, Integer b) {
			this.a = a;
			this.b = b;
		}
		@Override
		public int compareTo(Pair o) {
			return o.a==this.a?b.compareTo(o.b):
				a.compareTo(o.a);
		}
		public int isInside(Pair newpair) {
			if (this.a <= newpair.a && this.b >= newpair.b)
				return 1; // first pair
			else if (this.a >= newpair.a && this.b <= newpair.b) {
				return 2; // second pair
			} else if (this.a == newpair.a && this.b == newpair.b)
				return 3; // equal
			return 0;
		}
	}

	public static void main(String args[]) {
		ArrayList<Pair> data = new ArrayList<Pair>();
		data.add(new Pair(3, 5));
		data.add(new Pair(2, 6));
		data.add(new Pair(2, 8));
		data.add(new Pair(20, 21));
		data.add(new Pair(8, 20));
		ArrayList<Pair> result = new ArrayList<Pair>();
		//.Arrays.sort(data);
		reduce(data);
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).a+"----"+data.get(i).b);
		}
	}

	private static Pair[] reduce(ArrayList<Pair> data) {
		int i = 0;
		do {
			System.out.println("do");
			if (data.get(i).isInside(data.get(i+1)) == 1) {
				System.out.println(1);
				System.out.println(data.get(i+1).a+"-"+data.get(i+1).b);
				System.out.println(data.get(i).a+"--"+data.get(i).b);
				data.remove(i + 1);
			} else if (data.get(i).isInside(data.get(i+1)) == 2) {
				System.out.println(2);
				System.out.println(data.get(i+1).a+"-"+data.get(i+1).b);
				System.out.println(data.get(i).a+"--"+data.get(i).b);
				data.remove(i);
			} else if (data.get(i).isInside(data.get(i+1)) == 3) {
				System.out.println(3);
				System.out.println(data.get(i+1).a+"-"+data.get(i+1).b);
				System.out.println(data.get(i).a+"--"+data.get(i).b);
				data.remove(i);
			} else {
				i++;
			}
			System.out.println(data.get(i).a+"00"+data.get(i).b);
		} while (i < data.size() - 1);
		return null;
	}

}
