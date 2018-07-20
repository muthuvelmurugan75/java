
public class practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int ans=training(4);
//		System.out.println(ans);
		int sol=test(7);
		System.out.println(sol);

	}
	public static int training(int n)
	{
		int ans=1;
		while (ans!=0)
		{
			if(n%2==0&&n%3==0)
			{
				return n;
			}
			else
			{
				n=n+1;
			}
		}
		return -1;

	}
	public static int test(int n)
	{
		int a[]=new int[n];
		int i=1;
		int j=0;
		while(j<n)
		{
			a[j]=i;
			i++;
			j++;
		}
		i=0;
		while(i<a.length)
		{
			if(n%a[i]==0)
			{
				i++;
			}
			else
			{
				i=0;
				n++;
			}
			
		}
		return n;
	}

}
