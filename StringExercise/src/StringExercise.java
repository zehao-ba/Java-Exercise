
public class StringExercise {
	public static void main(String[] args){
		char[] helloArray = {'a','b'};
		String helloString = new String(helloArray);
		int len = helloString.length();
		System.out.println("The string is " + helloString  
				+ "\nThe length of string is " + len);
		
		String s = "google";
		System.out.println("s1 is " + s);
		
		s ="banboo";
		System.out.println("s2 is " + s); // google is still in the RAM
		
		StringBuffer sBuffer = new StringBuffer("Google website is: ");
		sBuffer.append("www");
		sBuffer.append(".google");
		sBuffer.append(".ca");
		System.out.println(sBuffer);
		System.out.println(sBuffer.delete(1, 10));
		//System.out.println(sBuffer.reverse());
	}
}
