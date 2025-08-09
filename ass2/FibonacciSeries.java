package week1.ass2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int series=5,n1=0,n2=1,n3;
		System.out.print(n1+", "+n2);
		for(int i=2;i<series;i++)
		{
			n3=n1+n2;
			System.out.print(", "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
