import java.util.Scanner;

public class IT26102416Lab5Q3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double ROOM_CHARGE = 48000.00;
		final double DISCOUNT_10 = 0.10;
		final double DISCOUNT_20 = 0.20;
		
		System.out.print(" Enter Start Date (1-31): ");
		int startDate = input.nextInt();
		
		System.out.print(" Enter End Date (1-31): ");
		int endDate =input.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
			
			System.out.println( "Error : Dates must be between 1 and 31");
		} else if (startDate >= endDate) {
			System.out.println( " Error : start Date must be less than End Date");
			
		} else {
			
			int daysReserved = endDate - startDate;
			double totalAmount = daysReserved * ROOM_CHARGE;
			double discountRate = 0.0;
			
			if (daysReserved >= 3 && daysReserved <= 4) {
				discountRate = DISCOUNT_10;
			} else if  (daysReserved >=5) {
				discountRate = DISCOUNT_20;
			}
			
			totalAmount = totalAmount - ( totalAmount * discountRate);
			
			System.out.println( " Room Charge Per Day: Rs." + ROOM_CHARGE);
			System.out.println( " Number of Day Reserved: " + daysReserved);
			System.out.println( " Total Amount to be Paid:" + totalAmount);
			
		}
	}
}	