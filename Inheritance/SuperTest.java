//Changing the Instance Variable of the Main class in the Parameterized Constructor?
//Using this Keyword

class A
{
	int a=5;
	A(){
		//Default Constructor of A
		System.out.println("Default A");
	}

	A(int a){
		System.out.println("Constructor A:"+a);
	}

	int ret(){
		System.out.println(a);
		return a;
	}
}

class B extends A
{
	B(){
		//Default Constructor of B
		System.out.println("Default B");
	}

	B(int a){
		super();
		System.out.println("Constructor B:"+a);
	}

	int add(int b){
		try{
		int c=super.ret()+b;
		super.finalize();
		return c;}
		catch(Throwable e){
			System.out.println("Error"+e);
		}
	}
}

class SuperTest
{
	public static void main(String args[]){
		try
		{
		B b=new B(10);
		A a=new A(5);

		int r=b.add(4); 
		System.out.println(r); //9 
	}
}