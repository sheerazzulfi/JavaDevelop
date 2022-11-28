class Chiran
{
	public static boolean test(String a,String b)
	{
		boolean res= false;
		for (int i=0;i<b.length() ;i++ ) 
		{
			res=a.contains(b.charAt(i));
			System.out.prinln("abcd");
		}
		return res;
	}
	public static void main(String[] args) 
	{
		String a="chiranjeevi";
		String b="rain";
		System.out.println(test(a,b));
		
	}
}
