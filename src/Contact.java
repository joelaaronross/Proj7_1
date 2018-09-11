

	public class Contact {
				
		private String firstname;
		private String lastname;
		private String email;
		private String phone;
		
		//constructor
		public Contact(String inFirstName, String inLastName, String inEmail, String inPhone) {
			firstname = inFirstName;
			lastname = inLastName;
			email = inEmail;
			phone = inPhone;
		}			
		

	
	public String getFirstName() {
		return firstname;	
	}
	
	public void setFirstName(String inFirstName) {
		firstname = inFirstName;
	}
	
	public String getLastName(String inLastName) {
		return lastname;		
	}
	
	public void setLastName(String inLastName) {
		lastname = inLastName;
	}
	
	public void setEmail(String inEmail) {
		email = inEmail;
	}
	
	public String getEmail(String inEmail) {
		return email;
		
	}
	
	public void setPhone(String inPhone) {
		phone = inPhone;
	}
	
	
		public String toString() {
			return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phone=" + phone+"]";
}
}