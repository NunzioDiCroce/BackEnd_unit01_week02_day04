package BackEnd_unit01_week02_day04_Package;

public class Customer {

	// - - - - - - - - - - - - - - - attributes
	private long id;
	private String name;
	private int tier;

	// - - - - - - - - - - - - - - - constructor
	public Customer(long _id, String _name, int _tier) {
		this.id = _id;
		this.name = _name;
		this.tier = _tier;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", tier=" + tier + "]";
	}
}
