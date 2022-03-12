import java.util.*;
public class Apples
{
	public static int test(String a,String b,String c)
	 {
	     int ans=0;
	     
	     String [] d=a.split("\\D+");
	     int [] e= new int[d.length];
	     for(int i=0;i<d.length;i++)
	     {
	    	 e[i]=Integer.parseInt(d[i]);
	     }
	     
	     String []f =b.split("\\D+");
	     int [] g= new int[e[0]];
	     for(int j=0;j<e[0];j++)
	     {
	    	 g[j]=Integer.parseInt(f[j]);
	     }
	     
	     String [] h=c.split("\\D+");
	     int [] k=new int[e[0]];
	     for(int l=0;l<e[0];l++)
	     {
	    	 k[l]=Integer.parseInt(h[l]);
	     }
	     
	     for(int m=0;m<e[0];m++)
	     {
	    	 if((e[1]-1)>0)
	    	 {
	    		 ans+=k[m];
	    		 e[1]=e[1]-1;
	    	 }
	    	 else
	    	 {
	    		 e[1]=e[1]+g[m];
	    	 }
	     }
	     
	     return ans;
	 }
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		int n=sc.nextInt();
		
		sc.nextLine();

		int [] ans= new int[n];
		for (int i=0;i<n ;i++ ) 
		{
	    	String a=sc.nextLine();
	    	
	    	
	    	String b=sc.nextLine();
	    	
	    	
	    	String c=sc.nextLine();
	    	
	    	ans[i]=test(a,b,c);
		}

		for (int q :ans ) 
		{
			System.out.println(q);
		}

	}
}