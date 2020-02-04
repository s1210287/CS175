import java.text.NumberFormat;

public class CashRegisterV2 {

	NumberFormat format = NumberFormat.getCurrencyInstance();
	private double purchase;
	private double payment;
	double discount;
	double lowerMoney;
	double newAmount;

	public CashRegisterV2()
	{
		purchase = 0;
		payment = 0;
	}
	public void recordPurchase(double amount) 
	{
		purchase = purchase + amount;
	}
	public void calcDiscount (final double THRESHOLD , final double DISCOUNT) {
		if(purchase >= THRESHOLD) {
			lowerMoney = DISCOUNT*purchase;
			newAmount = purchase-lowerMoney;
			System.out.println("Your total purchases were " + format.format(purchase) + " and because you spent over " + format.format(THRESHOLD) + 
			" , you are entitled to a " + (DISCOUNT * 100) + "% " + " discount of " + format.format(lowerMoney) + " reducing your balance to " + format.format(newAmount));
		}
	}
	public void receivePayment(double moneyGiven)
	{
		payment = payment + moneyGiven;
	}
	public double giveChange()
	{
		return (payment - newAmount);
	}
	public void printChange() {
		System.out.printf("Your change is: %.2f ", giveChange());
	}      
		
	}