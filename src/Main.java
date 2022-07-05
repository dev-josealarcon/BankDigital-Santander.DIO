
public class Main {
	public static void main(String[] args) {
		Client jose = new Client();
		jose.setNome("JOSE ALARCON");
		
		Client venilton = new Client();
		venilton.setNome("VENILTON SANTOS");
		
		
		IAccount ca = new CheckingAccount(jose);	
		
		IAccount sa = new SavingsAccount(venilton);
		
		ca.deposit(100);
		
		ca.tranfer(100, sa);
		
		ca.printExtract();
		sa.printExtract();
		
		
	}
}
