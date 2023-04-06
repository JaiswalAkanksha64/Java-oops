package oops.programs;

class Calculate
{
	void sum (int a, int b)
	{
		System.out.println("Sum is: "+(a+b));
	}
	
	void sum (String Firstname, String Lastname)
	{
		System.out.println("Full name is: "+(Firstname+Lastname));
	}
}

public class PolymorphismMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c = new Calculate();
		c.sum(5, 5);
		c.sum("Anjali ", "Sharma");

	}

}
