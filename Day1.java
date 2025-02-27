package cloverProject;
   // Que)find 1st non repeated character from given String
   //String str="Emmanuel"
public class Day1 {
	public static void main(String[] args) {
		String str="Emmanuel";
		
		for (char c:str.toCharArray()) {
			if(str.indexOf(c)==str.lastIndexOf(c));
			
			System.out.println("First non repeated char:"+c);
			return;
		}
		
	}

}
