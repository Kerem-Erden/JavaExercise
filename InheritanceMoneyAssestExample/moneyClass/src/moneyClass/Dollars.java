package moneyClass;

public class Dollars extends Assets	{
	
	private double dollarCurrency;
	private double dollarToTurkishLiras;
	//constructor
	public Dollars(double amount) {
		super(amount);
		this.dollarCurrency = 34;
		this.dollarToTurkishLiras = this.dollarCurrency * this.amount;
		// TODO Auto-generated constructor stub
	}
	
	//get method
		public double getDollarAmount() {
			return this.dollarToTurkishLiras;
		}
	
}
