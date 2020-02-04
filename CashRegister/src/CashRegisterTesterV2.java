import java.util.Scanner;

public class CashRegisterTesterV2 {

	public static void main(String[] args) {

		CashRegisterV2 cash = new CashRegisterV2();

		final double SENTINEL = -1;
		final double DISCOUNT = .10;
		final double THRESHOLD = 50;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a purchase amount or - 1 to stop: ");

		while(in.hasNextDouble()) {
			double costPurchase = in.nextDouble();
			if(costPurchase == SENTINEL) {
				break;
			}
			System.out.print("Enter a purchase amount or - 1 to stop: ");
			cash.recordPurchase(costPurchase);
		}
		cash.calcDiscount(THRESHOLD, DISCOUNT);
		System.out.print("Enter payment: ");
		double amountPaid = in.nextDouble();
		cash.receivePayment(amountPaid);
		cash.giveChange();
		cash.printChange();
	}

}
