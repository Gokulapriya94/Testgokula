package day2.java;

public class Classworkday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*//			1.Palindrome
		String text= "LEVEL",temp = "";
		char[] array = text.toCharArray();
//			1.1Reverse string using charArray 
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
			temp=temp+array[i];
			
		}
		System.out.println(temp);
		 if ((temp.equals(text)))
		 {
			 System.out.println(text + " is a Palindrome");
		 }
		 else
		 {
			 System.out.println(text + " is not a palindrome");
		 }
		*/
		
//			2.reverse order in both way charArray and charAt
		
//			3.print the word in reverse order
		
		String text="Welcome to Testleaf chennai",concatinate="";
		String[] name=text.split(" ");
		String store = null,j;
		for (String div : name) {
//			System.out.println(div);
//			concatinate=div.concat(div);
			System.out.print(div);
			store=div;
			//System.out.println("  Strore"+store);
		}
		j=store;
		System.out.println("  Strore"+j);
		System.out.println("Strore"+store);
		
		
		
		
		
	}

}
