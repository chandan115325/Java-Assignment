package session_01_assignment;

public class AddOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12,y=23;
		while (y != 0)
		    {
		        // carry now contains common set bits of x and y
		        int carry = x & y;  
		 
		        // Sum of bits of x and y where at least one of the bits is not set
		        x = x ^ y; 
		 
		        // Carry is shifted by one so that adding it to x gives the required sum
		        y = carry << 1;
		    }
		System.out.println("Sum of two integer without using \"+\" operator is"  +" "+ x);
	}

}
