package dsageeksforgeeks;

public class ArmstrongNum {
       
	static String armstrongNumber(int n){ 
		System.out.println("number before calculating " + n);
	    int sum  = 0;
	    int originalNum = n ;
	    while(n!=0){
	        int digit = n% 10 ;
	        sum += (digit*digit*digit);
	        n /= 10 ;
	    }   
	    System.out.println("number after calculating " + n);
	    System.out.println("sum of cubes " + sum);
	    if(sum == originalNum){
	        return "Yes";
	    }  
	    return "No";
	    } 
	public static void main(String[] args) {
	String ans  =ArmstrongNum.armstrongNumber(153);
	System.out.println(ans);
	}

}
