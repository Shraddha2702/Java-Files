class throwdemo
{
	static void method()
	{
		try 
		{
			throw new NullPointerException();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught for the first time");
			throw e;
		}
		
	}

	public static void main(String args[])
	{
		try
		{
			method();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught for the second time");
		}
	}

}