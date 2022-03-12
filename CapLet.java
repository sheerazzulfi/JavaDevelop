class CapLet
{
	public static void test(int a,int b)
	{
		int c= a+b;
		double x= a++ + ++b + --a;
		System.out.println(c);

		System.out.println(x);

	}



	public static void main(String[] args) 
	{
		int a='H';
		if (a>65 && a<90)
		{
			System.out.println("Its a capital Letter");
		}
		else
			System.out.println("its a other symbol");

		for (int i=20; i<=50 ; i=i+9 ) 
		{
			System.out.println("check for loop");
			
		}

		double t,b,c;
		t= 3;
		b= 0/4.0;
		c= 0/0.0;
		System.out.println(++t*8);
		System.out.println(b);
		System.out.println(c);

		test(1,4);

		test(2,8);
		

	}
}