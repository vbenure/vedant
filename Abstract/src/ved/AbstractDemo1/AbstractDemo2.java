package ved.AbstractDemo1;

abstract class ATM{
	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
	public abstract void pinChange();
}
class SBIATM extends ATM{
	
	@Override
	public void withdraw(double amount) {
		System.out.println("making a withdraw of "+amount+" through SBI ATM");
	}
	
	@Override
	public void deposit(double amount) {
		System.out.println("making a deposit of "+amount+" through SBI ATM");
	}
	
	@Override
	public void pinChange() {
		System.out.println("PIN Changed Successfully!!!");
	}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		ATM a = new SBIATM();
		a.deposit(2000);
		a.withdraw(1200);
		a.pinChange();

	}

}
