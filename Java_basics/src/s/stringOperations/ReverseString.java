package s.stringOperations;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str= "Quick brown fox jumps over the lazy dog!";
		
		reverseBasic(str);
		
		reverseRecurse(str);
		
	}
	
	private static void reverseRecurse(String str) {
		
		if(str.length() > 0){
		System.out.print(str.charAt(str.length()-1));
		reverseRecurse(str.substring(0,str.length()-1));
		}
		
	}

	public static void reverseBasic(String str){
		StringBuilder strnew = new  StringBuilder();
		
		char cArr[] = str.toCharArray();
		
		for (int i = cArr.length - 1; i >= 0; i--) {
		
			strnew.append(cArr[i]);
		}
		
		System.out.println(" reversed by char "+strnew.toString());
	}
}
