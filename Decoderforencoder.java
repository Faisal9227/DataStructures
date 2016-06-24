
public class Decoderforencoder {

	public static void main(String args[]) {
		String input = "p14akkkkkkkkpq";
		System.out.println(decode(input));
	}

	private static String decode(String input) {
		StringBuilder builder = new StringBuilder();

//		char[] A = input.toCharArray();

		int i = 0;
		while (i < input.length()) {
			char c = input.charAt(i);
			int counter = 0;
			while (i < input.length() && input.charAt(i) == c) {
				i++;
				counter++;
			}

			if (counter > 1) {
				builder.append(counter).append('x').append(c);
			} else {
				builder.append(c);
			}
		}

		return builder.toString();
	}

}
