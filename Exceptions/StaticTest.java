import ExceptionTest.*;

class A
{
	int a=10;

	static void method(){
		System.out.println("This is Static method");
	}

	protected void finalize(){
	System.out.println("Destroyed!");
}
}

class B extends A
{
	static void method()
	{
		System.out.println("This is Overridding of Static Method");
	}
}

class StaticTest
{
	public static void main(String args[]) throws Throwable
	{
		try
		{
		int a=10;
		A b=new A();

		System.out.println(b.a);

		B b1=new B();

		b1.method();

		System.out.println(a);

		//b.finalize();
		//System.out.println(b.a);

		throw new MyException();}
		catch(Exception e)
		{
			System.out.println("Done");
		}
	}
}

