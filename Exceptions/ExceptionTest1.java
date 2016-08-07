//Exception Handling

class ExceptionTest1
{
	public static void main(String args[])
	{
		int a=10;
		int b=0;
		try
		{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("Good");
		}
	}
		
		catch (NullPointerException e) {
			System.out.println("Null Pointer Exception here!");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception here !");
		}
		catch(Exception e)
		{
			System.out.println("Exception here!");
		}
		
	}
}