package oopsassignment4;

public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCard tc=new TravelCard();
		System.out.println("Reward points earned by you  are "+tc.getRewardPoints(100));
		System.out.println("Congratulations!,you have successfully recharged with "+tc.rechrgeCard(20000));
		System.out.println(tc.swipeCard(30));
		System.out.println(tc.travelSwipe(20));
		
		tc.setCardNo(1428578984);
		tc.setSwipeLimit(30000);
	
		System.out.println("Your Card Number is "+tc.getCardNo());
		System.out.println("Your Daily Swipe limit is "+tc.getSwipeLimit());

	}

}
