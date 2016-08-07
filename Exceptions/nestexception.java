class nestexception
{
	static void nest(int a) {
	try {
	
		if(a==1) a=a/(a-a);
		if(a==2){ 
		int c[] = { 1 };
		c[42] = 99;
		}
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds " + e);
		}
	}

	 public static void main (String args[])
	 {
	 		try {
	 		String a1 = args[0];
	 		int a=Integer.parseInt(a1);
	 		int	b = 42/a;
	 		System.out.println("the value of a is " + a);
	 		nest(a);
	 		}
	 		catch(ArithmeticException e)
	 		{
	 			System.out.println(e+"Error is this !");
	 		}
	 }

}