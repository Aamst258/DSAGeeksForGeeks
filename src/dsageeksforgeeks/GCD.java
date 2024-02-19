package dsageeksforgeeks;

public class GCD {
	public int gcd(int A , int B) 
    {  
        int  dividend ;
            int divisor ; 
        int remainder = 1 ;
       if (A>B){
            dividend = A ;
             divisor = B;
        } else{
            divisor = A ;
            dividend =B;
        }
       while(remainder != 0){
           remainder = dividend % divisor ;
           if(remainder != 0){
               dividend = divisor ;
               divisor =  remainder ;
           }
       }
       return divisor ;
    } 


}
