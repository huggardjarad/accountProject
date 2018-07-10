package accountapp;

public class Account {
		private String firstName;
		
		private String lastName;
		
		private String accountNumber;
		
		public Account() {
			this.firstName = "";
			this.lastName = "";
			this.accountNumber = "";
		}
		public Account(String firstName, String lastName, String accountNumber) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.accountNumber = accountNumber;
		}
		
		
		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public String getAccountNumber() {
			return accountNumber;
		}
		
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		@Override
		public String toString() {
			
			return "FirstName: " + getFirstName() + " LastName: " + getLastName() + " AccountNumber: " + getAccountNumber();
			
		}
		
}
