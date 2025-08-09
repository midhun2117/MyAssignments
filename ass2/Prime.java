package week1.ass2;

public class Prime {
	public static void main(String args[]) {
		int number=13;
		boolean flag=false;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not a prime");
		}
	}

}
