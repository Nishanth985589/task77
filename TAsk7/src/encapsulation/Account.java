package encapsulation;

public class Account {

	       private String Number;
	       private double Balance;
	       private String Name;

	       public Account(String Number) {
	       
	       this.Number = Number;
	       this.Balance = Balance;
	       this.Name = Name;
	       
	       
	       }
	    public void Depositmoney(double Deposited) {
	    	this.Balance+=Deposited;
	    	System.out.println("Money deposited succesfully, New balance is  "+this.Balance);
	    }
	    public void withdraw(double Withdraw) {
	    	if(this.Balance - Withdraw <0) {
	    		System.out.println("Insufficient funds");
	    	}
	    	else
	    		this.Balance=Withdraw;
	    	     System.out.println("Withdrawed succesfully "+this.Balance);
	    	     System.out.println("Current balance is "+this.Balance);
	    	
	    }
	    public String getNumber() {
			return Number;
		}
		public void setNumber(String number) {
			Number = number;
		}
		public double getBalance() {
			return Balance;
		}
		public void setBalance(double balance) {
			Balance = balance;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
	       
	       
	       
	        
			}
	

