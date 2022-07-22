package Strings;


//StringBuilder   >    StringBuffer(Faster)    >    String(Slow concatenation)
// (Not Thread safe)      (Thread Safe)


//Thread safe or synchronized means two string can not call methods of StringBuffer simultaneously 

//Not thread safe or synchronized means two strings can call methods of StringBuilder simultaneously 


public class StringBufferDemo {

	public static String concatWithString() {
		String t = "Java";
		for (int i = 0; i < 10000; i++) {
			t = t + "Tpoint";
		}
		return t;
	}

	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 100000; i++) {
			sb.append("Tpoint");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(
				"Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

	}

}
