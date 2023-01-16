package gitdemo;

public class Hello {
	
	public static void main(String[] args) {
		String s = "malayalam";
		String s1 = "";
		int l = s.length();
		for(int i=l-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		
			
		}
		//System.out.println(s1);
		if(s.equals(s1)) {
			System.out.println("it is a palindrome");
			
		}
		else {
			System.out.println("it is not a palindrome");
		}
		
	}

}
