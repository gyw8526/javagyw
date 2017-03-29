package pra2;

public class CheckingAccount extends Account{
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	public CheckingAccount(double balance,double credit_limit, double interest, double loan_interest){
		super(balance);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}
	public void debit(double money){
		if(credit_limit>money-super.getBalance()){
			super.debit(money);
		}
		else{
			System.out.println("Debit amount exceeded account balance");
		}
	}
	public void nextMonth(double interest, double loan_interest,double balance){
		if(balance>0){
			balance += balance * interest;
			setBalance(balance);
		}
		else{
			balance += balance * loan_interest;
			setBalance(balance);
			}
		}
}
