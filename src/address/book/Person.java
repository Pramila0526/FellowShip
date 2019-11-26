package address.book;


public class Person {
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", addressObj=" + addressObj + ", mobile="
				+ mobile + "]";
	}

	private String firstname;
	private String lastname;
	private Address addressObj;
	private Long mobile;

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public Address getAddressObj() {
		return addressObj;
	}

	public void setAddressObj(Address addressObj) {
		this.addressObj = addressObj;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	

}
