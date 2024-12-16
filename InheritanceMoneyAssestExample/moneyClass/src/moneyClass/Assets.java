package moneyClass;

public class Assets {
	//define the attributes
	public double amount;
	
	//create the constructor
	public Assets(double amount) {
		this.amount = amount;
	}
	
	//get-set methods
	public double getAmount() {
		return this.amount;
	}
	
	//increase method
	public void increaseAmount(double amount) {
		this.amount = this.amount + amount;
	}
	
	//decrease method
	public void decreaseAmount(double amount) {
		if (amount <= 0 ) {	
			
		}
		else if (amount > this.amount) {
			
		}
		else {
			this.amount = this.amount - amount;
		}
	}
	

}
