package moneyClass;

public class Euros extends Assets {

	private double euroCurrency;
	private double euroToTurkishLiras;
	
	//constructor
	public Euros(double amount) {
		super(amount);
		this.euroCurrency = 36;
		this.euroToTurkishLiras = this.amount * this.euroCurrency;
		// TODO Auto-generated constructor stub
	}

	//get method
		public double getEuroAmount() {
			return this.euroToTurkishLiras;
		}
}
