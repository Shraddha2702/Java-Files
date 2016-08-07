//Inheritance

class a
{
	a(){System.out.println("Called a");}
	a(int r){
		System.out.println(r);
	}
}

class b extends a
{
	b(){ System.out.println("Called b");}
	b(int b)
	{
		System.out.println(b);
	}
}

class c extends b
{
	c(){
		System.out.println("Called c");
	}

	c(int a)
	{
		System.out.println(a);
	}
}

class InheritanceTest
{
	public static void main(String args[])
	{
		c c1=new c();
		c c2=new c(4);
		b b1=new b(3);
		a a1=new a(2);

	}
}