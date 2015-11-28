package old;

public class formatHeader {
	public int number, width;
	
	public formatHeader (int number, int width){
		this.number = number;
		this.width = width;
	}

	public static String format(int number, int width){
		int numLength = String.valueOf(number).length();	
		if (numLength >= width){
			return String.valueOf(number);
		}
		else {
			String formatted = String.format("%%0%dd", width);
			String result = String.format(formatted,  number);
			return result;
		}
	}
}

