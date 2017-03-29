package pra2;

public class Account {
	private double balance;
	
	public Account(double money){
		balance = money;
	}
	public void credit(double money){
		balance = balance + money;
	}
	public void debit(double money){
		balance = balance - money;
	}
	public double getBalance(){
		return balance;
	}
	protected void setBalance(double balance){
	      this.balance =    balance; // this¿« ¿«πÃ..
	      }
}
