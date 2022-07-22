package Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "How are you?";
		
		StringBuilder sb =  new StringBuilder(s);
		
		sb.append(" Good");   //Over loaded append methods [append(char), append(boolean), append(int), append(float), append(double)]
        
		System.out.println(sb);
		
		sb.replace(2, 6, "00000");
		
		System.out.println(sb);
		
		sb.insert(2,"Sachin");
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		
//		char charAt(int index)
//		int length()
//		String substring(int beginIndex)
//		String substring(int beginIndex, int endIndex)
		
		
		
	}

}
