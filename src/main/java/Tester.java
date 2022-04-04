import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tester {

	/**
	 * Complete the function below. DO NOT MODIFY anything outside this function!
	 */
	static List<String> columnNames(int n) {
		List<String> result = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			// To store result (Excel column name)
			StringBuilder columnName = new StringBuilder();
			int columnNumber = i;
			while (columnNumber > 0) {
				// Find remainder
				int rem = columnNumber % 26;

				// If remainder is 0, then a
				// 'Z' must be there in output
				if (rem == 0) {
					columnName.append("Z");
					columnNumber = (columnNumber / 26) - 1;
				} else // If remainder is non-zero
				{
					columnName.append((char) ((rem - 1) + 'A'));
					columnNumber = columnNumber / 26;
				}
			}

			// Reverse the string and print result
			result.add(columnName.reverse().toString());
		}
		return result;
	}

	/**
	 * DO NOT MODIFY THIS METHOD!
	 */
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int _columns = Integer.parseInt(in.nextLine().trim());

		List<String> result = columnNames(_columns);

		System.out.println(String.join(", ", result));
	}
}