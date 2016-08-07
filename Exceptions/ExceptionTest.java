//Exceptions
import java.io.DataInputStream; 



class ExceptionTest
{
	public static void main(String args[]) 
	{
	try
		{
			int a=5;
			int b=0;
			
			System.out.println("Before Error");
			int c=a/b;
			//System.out.println(c);

			if(a<6){
				throw new myException();
			}
			
			

			System.out.println(c);
		}

		catch(ArithmeticException e)
		{
			System.out.println("This is "+e);
		}

		catch(Exception e)
		{
			System.out.println("Catch Statement");
		}
		finally
		{
			System.out.println("This is the finally Statement");
		}
	}
}

class myException extends Exception
{
	myException(){
	System.out.println("This is my Exception created");}
}