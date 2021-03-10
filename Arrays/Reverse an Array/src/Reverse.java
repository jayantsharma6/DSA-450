
public class Reverse {
	
	public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder sb = new StringBuilder(str);
        for(int i=0,j=str.length()-1; i<j; i++,j--){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
        }
        
        return sb.toString();
        
        //alternatively convert string to char array and reverse
        //OR create new string and append characters from given string in reverse
    }
	
	public static void main(String[] args) {
		String str = "I am from Raipur.";
		System.out.println(reverseWord(str));
	}
}
