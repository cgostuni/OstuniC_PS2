// Caroline Ostuni CISC181-010

package MainPackage;

public class MyInteger {

	// int data field named value
	private int value;
	
	// constructor that creates a "MyInteger" object
	public MyInteger(int value){
		this.value = value;
	}

	
	// get method that returns the int value
	public int getValue(){
		return value;
	}


	// methods that return true if the value is even, odd, or prime
	public boolean isEven(){
		if ((this.getValue() % 2) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isOdd(){
		if((this.getValue() % 2) != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isPrime(){
		int t = 0;
		if(t != this.getValue() && t != 1)
		{
			if((this.getValue() % t) != 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else{
			return false;
		}
	}	
	
	

	// Static methods that return true if the specified value is even, odd, or prime
	public static boolean isEven(int i){
		if ((i % 2) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean isOdd(int k){
		if((k % 2) != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	public static boolean isPrime(int n){
		int m = 0;
		if(m != n && m != 1)
		{
			if((n % m) != 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else{
			return false;
		}
	}


	
	// static methods that return true if specified value is even, odd, or prime
	public static boolean isEven(MyInteger red){
		if((red.getValue() % 2) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger blue){
		if((blue.getValue() % 2) != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean isPrime(MyInteger green){
		int b = 0;
		if(b != green.getValue() && b != 1)
		{
			if((green.getValue() % b) != 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else{
			return false;
		}
	}


	// methods that return true if the value in the object is equal to the specified value
	public boolean equals(int t){
		if (t == this.value)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean equals(MyInteger black){
		if (black.getValue() == this.value)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

	// static method that converts an array of numeric characters to an int value
	public static int parseInt(char[] array){
		int total = 0;
		for (int w = 0; w < array.length; w++){
			total += array[w];
		}
		return total;
	}

	// static method that converts a string into an int value
	public static int parseInt(String s){
		int a = Integer.parseInt(s);
				return a;
	}
}

