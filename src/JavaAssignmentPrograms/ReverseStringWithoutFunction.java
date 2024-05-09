package JavaAssignmentPrograms;

public class ReverseStringWithoutFunction {

	public static void main(String[] args) {
		String s = "Hello Vishal";  
		
		for(int i=s.length();i>0;--i)                
		{  
			System.out.print(s.charAt(i-1));             
		}  
	}

}
