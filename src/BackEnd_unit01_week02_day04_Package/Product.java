package BackEnd_unit01_week02_day04_Package;

public class Product {

	// - - - - - - - - - - - - - - - attributes
	private long id;
	private String name;
	private String category;
	private double price;

	// - - - - - - - - - - - - - - - constructor
	public Product(long _id, String _name, String _category, double _price) {
		this.id = _id;
		this.name = _name;
		this.category = _category;
		this.price = _price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}

	// - - - - - - - - - - - - - - - methods
	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public double setPrice(double newPrice) {
		return this.price = newPrice;
	}

}
