public class ParseDouble {
    public static void main(String args[]){
    	
    	System.out.println(parse("3.42"));
}
    public static double parse(String str){
    	String s=str;
    	int i;
    	double result = 0.0f, result2 = 0.0f;
    	for (i = 0; i < s.length(); i++)
    	  if (s.charAt(i) == '.')
    	    break;
    	  else
    	    result = result * 10 + (s.charAt(i) - '0');

    	for (i = s.length()-1 ; i>=0 ; i--)
    	  if (s.charAt(i) == '.')
    	    break;
    	  else
    	    result2 = result2 / 10 + (s.charAt(i) - '0');

    	if (i>=0)
    	  result += result2/10;
		return result;
    }
    
}