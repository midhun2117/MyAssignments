package week1.ass2;

public class MissingElements {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=i+1)
			{
				System.out.println(1+i);
				break;
				
			}
		}

	}

}
