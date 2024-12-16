package moneyClass;

public class Gold extends Assets {
	
	private double goldCurrency;
	private double goldToTurkishLiras;
	//constructor
	public Gold(double amount) {
		super(amount);
		this.goldCurrency = 3050;
		this.goldToTurkishLiras = this.goldCurrency * this.amount ;
		// TODO Auto-generated constructor stub
	}
	
	//get method
	public double getGoldAmount() {
		return this.goldToTurkishLiras;
	}
	
	
	
	
}
