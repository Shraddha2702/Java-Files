abstract class A
{
	abstract void method();

	void call(){
		System.out.println("Yes");
	}
}

class B extends A
{
	void method2(){
	System.out.println("This is Class B Method");
	}
	
}

class C extends B
{
	void method(){
		System.out.println("A Method");
	}
}

class AbstractTest
{
	public static void main(String args[])
	{
		B b=new B();


		b.call();
	}
}