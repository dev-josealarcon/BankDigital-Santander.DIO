
public abstract class Account implements IAccount{

	private static final int AGENCY_STANDARD = 0001;
	private static int SEQUENTIAL = 1;
	
	protected int agency;
	protected int number;
	protected double  balance;
	protected Client client;
	
	

	public Account(Client client) {
		this.agency = AGENCY_STANDARD;
		this.number = SEQUENTIAL++;
		this.client = client;
	}
	
	
	@Override
	public void withdraw(double value) {
		this.balance -= value;
	}

	@Override
	public void deposit(double value) {
		this.balance += value;
	}

	@Override
	public void tranfer(double value, IAccount destinationAccount) {
		this.withdraw(value);
		destinationAccount.deposit(value);
	}
	
	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	protected void printCommonInfo() {
		System.out.println(String.format("Titular: %s",this.client.getNome()));
		System.out.println(String.format("Agency: %d",this.agency));
		System.out.println(String.format("Number: %d",this.number));
		System.out.println(String.format("Balance: %.2f",this.balance));
	}



	
}
