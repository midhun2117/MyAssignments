package week1.ass2;

public class Palindrome {

	public static void main(String[] args) {
		int number=34343,reverse = 0;
		int temp=number;
		while(temp>0)
		{
			int digit=temp%10;
			reverse=reverse*10+digit;
			temp/=10;
		}
		if(number==reverse)
		{
			System.out.println("palindrome number");
		}
		else 
		{
			System.out.println("not palindrome number");
		}
		

	}

}
