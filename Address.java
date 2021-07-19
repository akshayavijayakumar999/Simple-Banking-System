package bankpkg;

public class Address {

	String house;
	String district;
	String state;
	int pin;

	Address(String house,String district,String state,int pin) // Constructor using this object
	{
		this.house=house;
		this.district=district;
		this.state=state;
		this.pin=pin;
	}

	public String gethouse() {
		return house ;
	}

	public String getDistrict() {
		return district;
	}

	public String getState() {
		return state;
	}

	public int getPin() {
		return pin;
	}





}
