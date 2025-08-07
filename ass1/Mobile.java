package week1.ass1;

public class Mobile {
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is my mobile");
	}
	public void makeCall()
	{
		String mobileModel="Samsung Galaxy";
		float mobileWeight=200.56f;
		System.out.println("Mobile Model: " + mobileModel);
        System.out.println("Mobile Weight: " + mobileWeight + " grams");

	}
	public void sendMsg()
	{
		boolean isFullCharged = true;
        int mobileCost = 40000;
        System.out.println("Is Fully Charged: " + isFullCharged);
        System.out.println("Mobile Cost: " + mobileCost);
	}

}
