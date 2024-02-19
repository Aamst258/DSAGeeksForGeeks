package dsageeksforgeeks;

public class PalindromeSum {  
//	Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
//	Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.
//	// Input:
//	N=56
//			Output:
//			1
//			Explanation:
//			The digit sum of 56 is 5+6=11.
//			Since, 11 is a palindrome number.Thus,
//			answer is 1
	 public static int isDigitSumPalindrome(int N) {
	     int original = N ;
	     int  sum  = 0 ; 
	    //   calculating the sum of digits
	     while(N!=0){
	         int remainder = N % 10 ;
	         System.out.println("remainder of input " +  remainder);
	         sum += remainder ;
	         N /= 10 ; 
	         System.out.println("N input value after division " + N);
	     }     
	     System.out.println("Sum of original num " + sum);
	    //   reversing the sum 
	     int originalSum =  sum ;
	     int reversed = 0 ; 
	     while(sum !=0){
	         int remainder = sum % 10 ;
	         System.out.println("remainder of sum " + remainder);
	         reversed = (reversed * 10) + remainder; 
	         System.out.println("reverse sum " +  reversed);
	         sum /= 10 ; 
	         System.out.println("sum number after division " + sum);
	     }   
	     System.out.println("reverse of sum "+ reversed);
	     if(reversed ==  originalSum){
	         return 1 ;
	     } 
	     return 0 ;
	    } 
	 public static void main(String[] args) {
		int result  = PalindromeSum.isDigitSumPalindrome(56);
		System.out.println(result);
	}

}
