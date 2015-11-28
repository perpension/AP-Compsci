package old;
public class randomCharacter{
	/**
	 * Random Character
	 * @author Daniel Gu
	 * 
	 * @param overLoadedMethod(char) takes an character 
	 * @param overLoadedMethod(int) takes an integer 
	 * @param overLoadedMethod(double) takes a double 
	 * @param overLoadedMethod(float) takes a float  
	 * @param overLoadedMethod(boolean) takes a boolean 
	 * @return a character based on the parameter of the overLoadedMethod
	 */
	
	public static char overLoadedMethod(char char1){
		return char1;
	}
	public static char overLoadedMethod(int int1){
		char char1 = (char) int1;
		return char1;
	}
	public static char overLoadedMethod(double double1){
		char char1 = (char) double1;
		return char1;
	}
	public static char overLoadedMethod(float float1){
		char char1 = (char) float1;
		return char1;
	}
	public static char overLoadedMethod(boolean boolean1){
		char char1;
		if (boolean1){
			char1 = (char)((Math.random()*128)/2);
		}
		else {
			char1 = (char)(((Math.random()*128)/2)+64);
		}
		return char1;
	}

	public static void main(String[] args) {
		System.out.println(overLoadedMethod('A'));
		System.out.println(overLoadedMethod(66));
		System.out.println(overLoadedMethod(67.3));
		System.out.println(overLoadedMethod(68.213));
		System.out.println(overLoadedMethod(false));
	}
}


