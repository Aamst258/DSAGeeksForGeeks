package dsageeksforgeeks;

public class LongestString {
	public static String longest(String names[], int n)
    {
	 String longest   = names[0] ;
        for(int i = 0; i<n;i++){
            if(names[i].length() > longest.length()){
                longest = names[i]; 
            } 
            
        } 
       return longest ;
    }
	public static void main(String[] args) { 
		String[] args1 = {"Ameerahmad", "sabirahmad","shakirabanu"};
		String longest4 = LongestString.longest(args1, args1.length); 
		System.out.println(longest4);
	}

}
