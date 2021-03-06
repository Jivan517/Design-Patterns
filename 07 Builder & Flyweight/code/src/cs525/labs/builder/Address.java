package cs525.labs.builder;

public class Address {

	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;

	public Address() {

	}

	public Address(String street, String city, String state, String zip) {
		this.setStreetAddress(street);
		this.setCity(city);
		this.setState(state);
		this.setZipcode(zip);

	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public boolean isValid() {
		return !(streetAddress.isEmpty() || city.isEmpty() || state.isEmpty() || zipcode.isEmpty());
	}

	public String toString() {

		return "Address: \n\t\t\tStreet Address: " + streetAddress + "\n\t\t\tCity: " + city + "\n\t\t\tState: " + state
				+ "\n\t\t\tZipcode: " + zipcode;
	}

}
