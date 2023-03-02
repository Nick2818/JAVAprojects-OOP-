package banking;

/**
 * Represents a customer of a bank.
 * @author musur
 *
 */
public class Customer {
	
	//instance vars
	/**
	 * Name of customer
	 */
	String name;
	
	/**
	 * Address of customer
	 */
	String address;
	
	//constructor
	
	/**
	 * Creates a customer with a given name.
	 * @param name of customer
	 */
	public Customer(String name) {
		//sets instance var name to given name
		this.name = name;
	}
	
	//methods
	
	/**
	 * Sets the address of customer to be given address.
	 * @param address for customer
	 */
	public void setAddres(String address) {
		this.address = address;
	}
	
	/**
	 * Returns customer's name.
	 * @return name of customer
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns customer's address.
	 * @return address of customer
	 */
	public String getAddress() {
		return this.address;
	}
	

}
