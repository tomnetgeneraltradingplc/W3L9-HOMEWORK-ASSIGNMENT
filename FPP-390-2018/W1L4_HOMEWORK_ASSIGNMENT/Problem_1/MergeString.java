package Problem_1;

public class MergeString {

	public static void main(String[] args) {
	merge("ace", "bdf");
	}
	private static void merge(String str1, String str2) {
		if(str1=="" && str2=="") 
		{
		System.out.println("Both are empty Strinsg.");
		}
	if(str1==""|| str1.length()==0)
		{
		System.out.print(str2);
		return ;
		}
	if(str2==""||str2.length()==0){
		System.out.print(str1);
		return ;
	}
		
	if(str1.charAt(0) <= str2.charAt(0)){
		System.out.print(str1.charAt(0));
		merge(str1.substring(1), str2);		
	}
		
	else 
	{
		System.out.print(str2.charAt(0));
		merge(str1, str2.substring(1));	
	}
}
}
/*Output
 * abcdef
 */
