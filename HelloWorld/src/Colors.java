public class Colors {
	public String Col(String color, String text) {
		if (color == "black") {
			return "\u001B[30m" + text;
		} else if (color == "red") {
			return "\u001B[31m" + text;
		} else if (color == "green") {
			return "\u001B[32m" + text;
		} else if (color == "gold") {
			return "\u001B[33m" + text;
		} else if (color == "blue") {
			return "\u001B[34m" + text;
		} else if (color == "purple") {
			return "\u001B[35m" + text;
		} else if (color == "Lblue" || color == "lightblue" || color == "lblue"
				|| color == "lBlue") {
			return "\u001B[36m" + text;
		} else if (color == "gray") {
			return "\u001B[37m" + text;
		} else if (color == "bgBlack") {
			return "\u001B[40m" + text;
		} else if (color == "bgRed") {
			return "\u001B[41m" + text;
		} else if (color == "bgGreen") {
			return "\u001B[42m" + text;
		} else if (color == "bgGold") {
			return "\u001B[43m" + text;
		} else if (color == "bgBlue") {
			return "\u001B[44m" + text;
		} else if (color == "bgPurple") {
			return "\u001B[45m" + text;
		} else if (color == "bgLblue" || color == "bglightblue"
				|| color == "bglblue" || color == "bglBlue") {
			return "\u001B[46m" + text;
		} else if (color == "bgGray") {
			return "\u001B[47m" + text;
		}
		return text;
	}
}