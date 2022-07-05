
public class SavingsAccount extends Account{

	public SavingsAccount(Client client) {
		super(client);
	}

	@Override
	public void printExtract() {

		System.out.println("=== Saving Account Extract ===");
		super.printCommonInfo();
	}
	
}
