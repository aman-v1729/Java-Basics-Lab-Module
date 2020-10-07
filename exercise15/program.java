import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;

public class program {

	private String toBinary(char c) {
		String s = "0123456789ABCDEF";
		int d = s.indexOf(c);
		String bin = Integer.toString(d % 2);
		for (int i = 0; i < 3; i++) {
			d /= 2;
			if (d == 0)
				break;
			bin = d % 2 + bin;
		}
		return bin;
	}

	private String makeLengthFour(String bin) {
		for (int i = bin.length(); i < 4; i++) {
			bin = 0 + bin;
		}
		return bin;
	}

	public String test(String hex) {
		/*
		 * Exercise 15: Hex to binary- Given a string representing a number in
		 * hexadecimal format, convert it into its equivalent binary string. For e.g. if
		 * the input if ”1F1” then its binary equivalent is ”111110001”. If the input is
		 * ”13AFFFF”, the output should be ”1001110101111111111111111”.
		 */
		String binary = toBinary(hex.charAt(0));
		for (int i = 1; i < hex.length(); i++) {
			binary = binary + makeLengthFour(toBinary(hex.charAt(i)));
		}
		return binary;
	}
}
